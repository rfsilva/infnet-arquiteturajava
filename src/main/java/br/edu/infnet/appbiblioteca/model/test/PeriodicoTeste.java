package br.edu.infnet.appbiblioteca.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.service.PeriodicoService;
import br.edu.infnet.appbiblioteca.util.PeriodicoCollection;

@Order(4)
@Component
public class PeriodicoTeste implements ApplicationRunner {

    @Autowired
    private PeriodicoService service;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        PeriodicoCollection.get(1).stream().forEach(m -> {
            service.add(m);
            System.out.println("> " + m);
        });
    }

}
