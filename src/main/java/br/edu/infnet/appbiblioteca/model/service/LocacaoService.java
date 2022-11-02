package br.edu.infnet.appbiblioteca.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Locacao;
import br.edu.infnet.appbiblioteca.util.LocacaoCollection;

@Service
public class LocacaoService {

    private static Integer id = 1;
    private static Map<Integer, Locacao> map = new HashMap<Integer, Locacao>();
    
    public LocacaoService() {
        LocacaoCollection.get(id).stream().forEach(l -> {
            map.put(l.getId(), l);
        });
    }
    
    public List<Locacao> list() {
        return map.values().stream().collect(Collectors.toList());
    }

    public Locacao findById(Integer id) {
        return map.get(id);
    }

    public void add(Locacao locacao) {
        locacao.setId(id++);
        map.put(locacao.getId(), locacao);
    }
    
    public void update(Locacao locacao) {
        map.put(locacao.getId(), locacao);
    }
    
    public void remove(Integer id) {
        map.remove(id);
    }
}
