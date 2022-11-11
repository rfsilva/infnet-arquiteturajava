package br.edu.infnet.appbiblioteca.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.clients.IEnderecoClient;
import br.edu.infnet.appbiblioteca.model.domain.Endereco;

@Service
public class CorreioService {

    @Autowired
    private IEnderecoClient enderecoClient;
    
    public Endereco buscarEndereco(String cep) {
        return enderecoClient.buscarEndereco(cep);
    }
}
