package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Periodico;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.repository.PeriodicoRepository;

@Service
public class PeriodicoService {

    @Autowired
    private PeriodicoRepository repository;
    
    public Collection<Periodico> findByUsuario(Usuario usuario) {
        return (Collection<Periodico>) repository.findByUsuario(usuario.getId());
    }

    public Periodico findById(Integer id) {
        Optional<Periodico> opt = repository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        }
        return null;
    }

    public void add(Periodico cliente) {
        repository.save(cliente);
    }
    
    public void remove(Integer id) {
        repository.deleteById(id);
    }
}
