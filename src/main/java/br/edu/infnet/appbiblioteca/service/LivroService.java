package br.edu.infnet.appbiblioteca.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Livro;
import br.edu.infnet.appbiblioteca.util.LivroCollection;

@Service
public class LivroService {

    private static Integer id = 1;
    private static Map<Integer, Livro> livroMap = new HashMap<Integer, Livro>();
    
    public LivroService() {
        LivroCollection.get(id).stream().forEach(l -> {
            livroMap.put(l.getId(), l);
        });
    }
    
    public List<Livro> list() {
        return livroMap.values().stream().collect(Collectors.toList());
    }

    public void add(Livro livro) {
        livro.setId(id++);
        livroMap.put(livro.getId(), livro);
    }
    
    public void update(Livro livro) {
        livroMap.put(livro.getId(), livro);
    }
    
    public void remove(Integer id) {
        livroMap.remove(id);
    }
}
