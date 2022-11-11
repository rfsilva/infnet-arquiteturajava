package br.edu.infnet.appbiblioteca.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.service.UsuarioService;
import br.edu.infnet.appbiblioteca.util.UsuarioCollection;

@Order(1)
@Component
public class UsuarioTeste implements ApplicationRunner {
    
    @Autowired
    private UsuarioService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        UsuarioCollection.get().stream().forEach(m -> {
            service.add(m);
            System.out.println("> " + m);
        });
    }

}
