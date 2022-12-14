package br.edu.infnet.appbiblioteca.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.edu.infnet.appbiblioteca.model.domain.Periodico;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;

public class PeriodicoCollection {

    public static List<Periodico> get(Integer id) {
        System.out.println("## Cadastramento de Periódicos ##");

        Usuario u = new Usuario();
        u.setId(1);

        Periodico p1 = new Periodico();
        p1.setId(id++);
        p1.setAbrangencia("NACIONAL");
        p1.setDataPublicacao(LocalDate.of(2014, 4, 1));
        p1.setDescricao("Edição 01/04/2014");
        p1.setEditora("FOLHA DE SÃO PAULO");
        p1.setNome("Jornal Folha de S. Paulo");
        p1.setTotalPaginas(32);
        p1.setValor(Double.valueOf("3.99"));
        p1.setUsuario(u);
        System.out.println("> " + p1);

        Periodico p2 = new Periodico();
        p2.setId(id++);
        p2.setAbrangencia("RIO DE JANEIRO");
        p2.setDataPublicacao(LocalDate.of(1997, 12, 24));
        p2.setDescricao("Edição 24/12/1997");
        p2.setEditora("O GLOBO");
        p2.setNome("Jornal O Globo");
        p2.setTotalPaginas(26);
        p2.setValor(Double.valueOf("3.99"));
        p2.setUsuario(u);
        System.out.println("> " + p2);

        Periodico p3 = new Periodico();
        p3.setId(id++);
        p3.setAbrangencia("PERNAMBUCO");
        p3.setDataPublicacao(LocalDate.of(2004, 5, 2));
        p3.setDescricao("Edição 02/05/2004");
        p3.setEditora("JORNAL DO COMMERCIO");
        p3.setNome("Jornal Do Commercio");
        p3.setTotalPaginas(14);
        p3.setValor(Double.valueOf("2.99"));
        p3.setUsuario(u);
        System.out.println("> " + p3);
        
        return Arrays.asList(p1, p2, p3);
    }

}
