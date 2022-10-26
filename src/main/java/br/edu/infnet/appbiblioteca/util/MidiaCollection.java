package br.edu.infnet.appbiblioteca.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.edu.infnet.appbiblioteca.model.domain.Midia;

public class MidiaCollection {

    public static List<Midia> get() {
        System.out.println("## Cadastramento de Mídias ##");

        Midia m1 = new Midia();
        m1.setAnoFabricacao(2001);
        m1.setDataPublicacao(LocalDate.of(2000, 4, 11));
        m1.setDescricao("Mapa Político Mundo");
        m1.setFabricante("Editora Abril");
        m1.setNome("Mapa Político Mundo 2000");
        m1.setRaro(false);
        m1.setTipo("MAPA");
        m1.setValor(Double.valueOf("32.99"));
        System.out.println("> " + m1);

        Midia m2 = new Midia();
        m2.setAnoFabricacao(1998);
        m2.setDataPublicacao(LocalDate.of(1998, 6, 9));
        m2.setDescricao("CD Acústico Duplo de Lulu Santos");
        m2.setFabricante("Som Livre");
        m2.setNome("Lulu Acústico");
        m2.setRaro(false);
        m2.setTipo("CD");
        m2.setValor(Double.valueOf("44.90"));
        System.out.println("> " + m2);

        Midia m3 = new Midia();
        m3.setAnoFabricacao(2005);
        m3.setDataPublicacao(LocalDate.of(2005, 9, 28));
        m3.setDescricao("Trajetória do São Paulo na Libertadores de 2005");
        m3.setFabricante("Placar");
        m3.setNome("Libertadores 2005 São Paulo Campeão");
        m3.setRaro(true);
        m3.setTipo("DVD");
        m3.setValor(Double.valueOf("149.99"));
        System.out.println("> " + m3);
        
        return Arrays.asList(m1, m2, m3);
    }

}
