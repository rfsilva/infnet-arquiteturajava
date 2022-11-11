package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.clients.IClienteClient;
import br.edu.infnet.appbiblioteca.model.domain.Cliente;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;

@Service
public class ClienteService {

    @Autowired
    private IClienteClient clienteClient;
    
    public Collection<Cliente> findByUsuario(Usuario usuario) {
        return (Collection<Cliente>) clienteClient.findByUsuario(usuario.getId());
    }

    public Cliente findById(Integer id) {
        return clienteClient.obter(id);
    }

    public void add(Cliente cliente) {
        clienteClient.incluir(cliente);
    }
    
    public void remove(Integer id) {
        clienteClient.excluir(id);
    }
}
