package br.edu.infnet.appbiblioteca.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Periodico;
import br.edu.infnet.appbiblioteca.util.PeriodicoCollection;

@Service
public class PeriodicoService {

    private static Integer id = 1;
    private static Map<Integer, Periodico> periodicoMap = new HashMap<Integer, Periodico>();
    
    public PeriodicoService() {
        PeriodicoCollection.get(id).stream().forEach(l -> {
            periodicoMap.put(l.getId(), l);
        });
    }
    
    public List<Periodico> list() {
        return periodicoMap.values().stream().collect(Collectors.toList());
    }

    public void add(Periodico periodico) {
        periodico.setId(id++);
        periodicoMap.put(periodico.getId(), periodico);
    }
    
    public void update(Periodico periodico) {
        periodicoMap.put(periodico.getId(), periodico);
    }
    
    public void remove(Integer id) {
        periodicoMap.remove(id);
    }
}
