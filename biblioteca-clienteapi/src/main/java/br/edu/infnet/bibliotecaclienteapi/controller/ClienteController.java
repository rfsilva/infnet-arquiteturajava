package br.edu.infnet.bibliotecaclienteapi.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.bibliotecaclienteapi.model.domain.Cliente;
import br.edu.infnet.bibliotecaclienteapi.model.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    
    @PostMapping
    public void incluir(@RequestBody Cliente usuario) {
        System.out.println("Incluir = " + usuario);
        clienteService.add(usuario);
    }
    
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id) {
        System.out.println("Remover = " + id);
        clienteService.remove(id);
    }
    
    @GetMapping
    public Collection<Cliente> listar() {
        System.out.println("Listar");
        return clienteService.list();
    }
    
    @GetMapping("/usuario/{id}")
    public Collection<Cliente> listar(@PathVariable Integer id) {
        System.out.println("Listar por Usuario = " + id);
        return clienteService.findByUsuario(id);
    }
    
    @GetMapping("/{id}")
    public Cliente obter(@PathVariable Integer id) {
        System.out.println("Obter = " + id);
        return clienteService.findById(id);
    }
}
