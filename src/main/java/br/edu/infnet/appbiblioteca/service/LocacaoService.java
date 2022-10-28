package br.edu.infnet.appbiblioteca.service;

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
    private static Map<Integer, Locacao> locacaoMap = new HashMap<Integer, Locacao>();
    
    public LocacaoService() {
        LocacaoCollection.get(id).stream().forEach(l -> {
            locacaoMap.put(l.getId(), l);
        });
    }
    
    public List<Locacao> list() {
        return locacaoMap.values().stream().collect(Collectors.toList());
    }

    public void add(Locacao locacao) {
        locacao.setId(id++);
        locacaoMap.put(locacao.getId(), locacao);
    }
    
    public void update(Locacao locacao) {
        locacaoMap.put(locacao.getId(), locacao);
    }
    
    public void remove(Integer id) {
        locacaoMap.remove(id);
    }
}
