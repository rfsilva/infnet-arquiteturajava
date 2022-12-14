package br.edu.infnet.appbiblioteca.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.edu.infnet.appbiblioteca.model.domain.Livro;
import br.edu.infnet.appbiblioteca.model.domain.Material;
import br.edu.infnet.appbiblioteca.model.domain.Midia;
import br.edu.infnet.appbiblioteca.model.domain.Periodico;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;

public class MaterialCollection {

    public static List<Material> get() {
        System.out.println("## Cadastramento de Materiais ##");

        Usuario u = new Usuario();
        u.setId(1);

        Midia m1 = new Midia();
        m1.setId(1);
        m1.setAnoFabricacao(2001);
        m1.setDataPublicacao(LocalDate.of(2000, 1, 11));
        m1.setDescricao("Mapa Político Mundo");
        m1.setFabricante("Editora Abril");
        m1.setNome("Mapa Político Mundo 2000");
        m1.setRaro(false);
        m1.setTipo("MAPA");
        m1.setValor(Double.valueOf("32.99"));
        m1.setUsuario(u);
        System.out.println("> " + m1);

        Livro l1 = new Livro();
        l1.setId(1);
        l1.setAutor("Robert C. Martin");
        l1.setDataPublicacao(LocalDate.of(2015, 2, 10));
        l1.setDescricao("Desenvolvimento Ágil Limpo");
        l1.setEditora("Alta Books");
        l1.setNome("Desenvolvimento Ágil Limpo");
        l1.setTotalPaginas(486);
        l1.setValor(Double.valueOf("4.99"));
        l1.setUsuario(u);
        System.out.println("> " + l1);

        Periodico p1 = new Periodico();
        p1.setId(1);
        p1.setAbrangencia("NACIONAL");
        p1.setDataPublicacao(LocalDate.of(2014, 7, 1));
        p1.setDescricao("Edição 01/04/2014");
        p1.setEditora("FOLHA DE SÃO PAULO");
        p1.setNome("Jornal Folha de S. Paulo");
        p1.setTotalPaginas(32);
        p1.setValor(Double.valueOf("3.99"));
        p1.setUsuario(u);
        System.out.println("> " + p1);
        
        return Arrays.asList(m1, l1, p1);
    }

}
