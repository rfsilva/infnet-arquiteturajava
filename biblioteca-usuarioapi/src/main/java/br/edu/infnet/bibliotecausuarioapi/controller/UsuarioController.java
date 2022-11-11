package br.edu.infnet.bibliotecausuarioapi.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.bibliotecausuarioapi.model.domain.Usuario;
import br.edu.infnet.bibliotecausuarioapi.model.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    
    @PostMapping
    public void incluir(@RequestBody Usuario usuario) {
        System.out.println("Incluir = " + usuario);
        usuarioService.add(usuario);
    }
    
    @PostMapping("/validar/{email}/{senha}")
    public Usuario validar(@PathVariable String email, @PathVariable String senha) {
        System.out.println("Validar = " + email + ", " + senha);
        return usuarioService.validar(email, senha);
    }
    
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id) {
        System.out.println("Remover = " + id);
        usuarioService.remove(id);
    }
    
    @GetMapping
    public Collection<Usuario> listar() {
        System.out.println("Listar");
        return usuarioService.list();
    }
    
    @GetMapping("/{id}")
    public Usuario obterUsuario(@PathVariable Integer id) {
        System.out.println("Obter = " + id);
        return usuarioService.findById(id);
    }
}
