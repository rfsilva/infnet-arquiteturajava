package br.edu.infnet.appbiblioteca.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.appbiblioteca.model.domain.Cliente;

@FeignClient(url = "http://localhost:8082/api/clientes", name = "clienteClient")
public interface IClienteClient {

    @PostMapping
    public void incluir(@RequestBody Cliente usuario);
    
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id);
    
    @GetMapping
    public Collection<Cliente> listar();

    @GetMapping("/usuario/{idUsuario}")
    public Collection<Cliente> findByUsuario(@PathVariable Integer idUsuario);

    @GetMapping("/{id}")
    public Cliente obter(@PathVariable Integer id);
}
