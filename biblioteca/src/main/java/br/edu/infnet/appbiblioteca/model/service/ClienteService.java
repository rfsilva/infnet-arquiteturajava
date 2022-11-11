package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Cliente;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;
    
    public Collection<Cliente> findByUsuario(Usuario usuario) {
        return (Collection<Cliente>) repository.findByUsuario(usuario.getId());
    }

    public Cliente findById(Integer id) {
        Optional<Cliente> opt = repository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        }
        return null;
    }

    public void add(Cliente cliente) {
        repository.save(cliente);
    }
    
    public void remove(Integer id) {
        repository.deleteById(id);
    }
}
