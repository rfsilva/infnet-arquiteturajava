package br.edu.infnet.appbiblioteca.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Midia;
import br.edu.infnet.appbiblioteca.util.MidiaCollection;

@Service
public class MidiaService {

    private static Integer id = 1;
    private static Map<Integer, Midia> midiaMap = new HashMap<Integer, Midia>();
    
    public MidiaService() {
        MidiaCollection.get(id).stream().forEach(l -> {
            midiaMap.put(l.getId(), l);
        });
    }
    
    public List<Midia> list() {
        return midiaMap.values().stream().collect(Collectors.toList());
    }

    public void add(Midia midia) {
        midia.setId(id++);
        midiaMap.put(midia.getId(), midia);
    }
    
    public void update(Midia midia) {
        midiaMap.put(midia.getId(), midia);
    }
    
    public void remove(Integer id) {
        midiaMap.remove(id);
    }
}
