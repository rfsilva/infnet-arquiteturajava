package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.clients.IUsuarioClient;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;

@Service
public class UsuarioService {
    
    @Autowired
    private IUsuarioClient usuarioClient;
    
    public Collection<Usuario> list() {
        return usuarioClient.listar();
    }

    public Usuario findById(Integer id) {
        return usuarioClient.obterUsuario(id);
    }

    public void add(Usuario usuario) {
        usuarioClient.incluir(usuario);
    }
    
    public void remove(Integer id) {
        usuarioClient.excluir(id);
    }
    
    public Usuario validar(String email, String senha) {
        return usuarioClient.validar(email, senha);
    }
}
