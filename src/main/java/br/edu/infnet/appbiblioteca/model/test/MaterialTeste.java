package br.edu.infnet.appbiblioteca.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.service.MaterialService;
import br.edu.infnet.appbiblioteca.util.MaterialCollection;

@Order(3)
@Component
public class MaterialTeste implements ApplicationRunner {
    
    @Autowired
    private MaterialService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        MaterialCollection.get().stream().forEach(m -> {
            service.add(m);
            System.out.println("> " + m);
        });
    }

}
