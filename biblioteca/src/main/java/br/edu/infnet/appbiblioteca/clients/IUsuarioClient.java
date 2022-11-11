package br.edu.infnet.appbiblioteca.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.appbiblioteca.model.domain.Usuario;

@FeignClient(url = "http://localhost:8081/api/usuarios", name = "usuarioClient")
public interface IUsuarioClient {

    @PostMapping
    public void incluir(@RequestBody Usuario usuario);
    
    @PostMapping("/validar/{email}/{senha}")
    public Usuario validar(@PathVariable String email, @PathVariable String senha);
    
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id);
    
    @GetMapping
    public Collection<Usuario> listar();
    
    @GetMapping("/{id}")
    public Usuario obterUsuario(@PathVariable Integer id);
}
