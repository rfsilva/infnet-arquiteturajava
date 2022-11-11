package br.edu.infnet.appbiblioteca.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appbiblioteca.model.domain.Endereco;

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoClient")
public interface IEnderecoClient {

    @GetMapping("/{cep}/json")
    public Endereco buscarEndereco(@PathVariable String cep);
}
