package br.edu.infnet.appbiblioteca.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.service.MidiaService;
import br.edu.infnet.appbiblioteca.util.MidiaCollection;

@Order(3)
@Component
public class MidiaTeste implements ApplicationRunner {
    
    @Autowired
    private MidiaService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        MidiaCollection.get(1).stream().forEach(m -> {
            service.add(m);
            System.out.println("> " + m);
        });
    }

}
