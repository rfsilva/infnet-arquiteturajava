package br.edu.infnet.applocadora.model.test;

import java.util.Calendar;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocadora.model.domain.CD;

@Component
public class CDTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //TODO Ajustar os conteúdos
        Calendar cal1 = Calendar.getInstance();
        cal1.set(1996, Calendar.FEBRUARY, 10);
        CD c1 = CD.builder()
                .duplo(false)
                .dataLancamento(cal1.getTime())
                .gravadora(null)
                .interprete("Paralamas do Sucesso")
                .titulo("Vamo Batê Lata").build();
        System.out.println("CD 1: " + c1);
        
        Calendar cal2 = Calendar.getInstance();
        cal2.set(1999, Calendar.MARCH, 17);
        CD c2 = CD.builder()
                .duplo(false)
                .dataLancamento(cal1.getTime())
                .gravadora(null)
                .interprete("Lulu Santos")
                .titulo("Vamo Batê Lata").build();
        System.out.println("CD 2: " + c2);
        
        Calendar cal3 = Calendar.getInstance();
        cal3.set(1999, Calendar.MARCH, 17);
        CD c3 = CD.builder()
                .duplo(false)
                .dataLancamento(cal1.getTime())
                .gravadora(null)
                .interprete("Roberto Carlos")
                .titulo("Vamo Batê Lata").build();
        System.out.println("CD 3: " + c3);
    }
}
