package br.edu.infnet.appbiblioteca.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.service.LocacaoService;
import br.edu.infnet.appbiblioteca.util.LocacaoCollection;

@Order(6)
@Component
public class LocacaoTeste implements ApplicationRunner {
    
    @Autowired
    private LocacaoService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LocacaoCollection.get(1).stream().forEach(m -> {
            service.add(m);
            System.out.println("> " + m);
        });
    }

}
