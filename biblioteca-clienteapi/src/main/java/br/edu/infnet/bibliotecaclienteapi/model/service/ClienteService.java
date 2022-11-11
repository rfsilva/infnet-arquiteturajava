package br.edu.infnet.bibliotecaclienteapi.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.bibliotecaclienteapi.model.domain.Cliente;
import br.edu.infnet.bibliotecaclienteapi.model.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;
    
    public Collection<Cliente> list() {
        return (Collection<Cliente>) repository.findAll();
    }
    
    public Collection<Cliente> findByUsuario(Integer idUsuario) {
        return (Collection<Cliente>) repository.findByUsuario(idUsuario);
    }

    public Cliente findById(Integer id) {
        Optional<Cliente> opt = repository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        }
        return null;
    }

    public void add(Cliente usuario) {
        repository.save(usuario);
    }
    
    public void remove(Integer id) {
        repository.deleteById(id);
    }
}
