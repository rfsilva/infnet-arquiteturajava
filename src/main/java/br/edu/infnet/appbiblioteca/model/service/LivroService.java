package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Livro;
import br.edu.infnet.appbiblioteca.model.repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;
    
    public Collection<Livro> list() {
        return (Collection<Livro>) repository.findAll();
    }

    public Livro findById(Integer id) {
        Optional<Livro> opt = repository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        }
        return null;
    }

    public void add(Livro cliente) {
        repository.save(cliente);
    }
    
    public void remove(Integer id) {
        repository.deleteById(id);
    }
}
