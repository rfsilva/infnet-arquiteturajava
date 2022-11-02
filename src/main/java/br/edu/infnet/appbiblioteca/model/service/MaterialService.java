package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Material;
import br.edu.infnet.appbiblioteca.model.repository.MaterialRepository;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository repository;
    
    public Collection<Material> list() {
        return (Collection<Material>) repository.findAll();
    }

    public Material findById(Integer id) {
        Optional<Material> opt = repository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        }
        return null;
    }

    public void add(Material cliente) {
        repository.save(cliente);
    }
    
    public void remove(Integer id) {
        repository.deleteById(id);
    }
}
