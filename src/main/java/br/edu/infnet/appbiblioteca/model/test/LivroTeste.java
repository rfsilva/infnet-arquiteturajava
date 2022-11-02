package br.edu.infnet.appbiblioteca.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.service.LivroService;
import br.edu.infnet.appbiblioteca.util.LivroCollection;

@Order(2)
@Component
public class LivroTeste implements ApplicationRunner {
    
    @Autowired
    private LivroService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LivroCollection.get(1).stream().forEach(m -> {
            service.add(m);
            System.out.println("> " + m);
        });
    }

}
