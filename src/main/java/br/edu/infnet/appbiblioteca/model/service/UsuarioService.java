package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;
    
    public Collection<Usuario> list() {
        return (Collection<Usuario>) repository.findAll();
    }

    public Usuario findById(Integer id) {
        Optional<Usuario> opt = repository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        }
        return null;
    }

    public void add(Usuario usuario) {
        repository.save(usuario);
    }
    
    public void remove(Integer id) {
        repository.deleteById(id);
    }
    
    public Usuario validar(String email, String senha) {
        Usuario usuario = repository.findByEmail(email);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        }
        return null;
    }
}
