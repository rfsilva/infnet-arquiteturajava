package br.edu.infnet.appbiblioteca.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.util.LivroCollection;

@Order(2)
@Component
public class LivroTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LivroCollection.get(1).stream().forEach(m -> {
            System.out.println("> " + m);
        });
    }

}
