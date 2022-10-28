package br.edu.infnet.appbiblioteca.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Cliente;
import br.edu.infnet.appbiblioteca.util.ClienteCollection;

@Service
public class ClienteService {

    private static Integer id = 1;
    private static Map<Integer, Cliente> clienteMap = new HashMap<Integer, Cliente>();
    
    public ClienteService() {
        ClienteCollection.get(id).stream().forEach(l -> {
            clienteMap.put(l.getId(), l);
        });
    }
    
    public List<Cliente> list() {
        return clienteMap.values().stream().collect(Collectors.toList());
    }

    public void add(Cliente cliente) {
        cliente.setId(id++);
        clienteMap.put(cliente.getId(), cliente);
    }
    
    public void update(Cliente cliente) {
        clienteMap.put(cliente.getId(), cliente);
    }
    
    public void remove(Integer id) {
        clienteMap.remove(id);
    }
}
