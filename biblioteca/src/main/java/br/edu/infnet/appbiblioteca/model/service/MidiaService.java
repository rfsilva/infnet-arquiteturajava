package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Midia;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.repository.MidiaRepository;

@Service
public class MidiaService {

    @Autowired
    private MidiaRepository repository;
    
    public Collection<Midia> findByUsuario(Usuario usuario) {
        return (Collection<Midia>) repository.findByUsuario(usuario.getId());
    }

    public Midia findById(Integer id) {
        Optional<Midia> opt = repository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        }
        return null;
    }

    public void add(Midia cliente) {
        repository.save(cliente);
    }
    
    public void remove(Integer id) {
        repository.deleteById(id);
    }
}
