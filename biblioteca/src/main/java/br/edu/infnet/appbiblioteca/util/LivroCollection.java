package br.edu.infnet.appbiblioteca.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.edu.infnet.appbiblioteca.model.domain.Livro;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;

public class LivroCollection {

    public static List<Livro> get(Integer id) {
        System.out.println("## Cadastramento de Livros ##");

        Usuario u = new Usuario();
        u.setId(1);

        Livro l1 = new Livro();
        l1.setId(id++);
        l1.setAutor("Robert C. Martin");
        l1.setDataPublicacao(LocalDate.of(2015, 4, 10));
        l1.setDescricao("Desenvolvimento Ágil Limpo");
        l1.setEditora("Alta Books");
        l1.setNome("Desenvolvimento Ágil Limpo");
        l1.setTotalPaginas(486);
        l1.setValor(Double.valueOf("4.99"));
        l1.setUsuario(u);
        System.out.println("> " + l1);

        Livro l2 = new Livro();
        l2.setId(id++);
        l2.setAutor("Pedro Waengertner");
        l2.setDataPublicacao(LocalDate.of(2017, 12, 21));
        l2.setDescricao("A Estratégia da Inovação Radical");
        l2.setEditora("Editora Gente");
        l2.setNome("A Estratégia da Inovação Radical");
        l2.setTotalPaginas(398);
        l2.setValor(Double.valueOf("4.99"));
        l2.setUsuario(u);
        System.out.println("> " + l2);

        Livro l3 = new Livro();
        l3.setId(id++);
        l3.setAutor("Kim Scott");
        l3.setDataPublicacao(LocalDate.of(2019, 1, 22));
        l3.setDescricao("Empatia Assertiva");
        l3.setEditora("Alta Books");
        l3.setNome("Empatia Assertiva");
        l3.setTotalPaginas(388);
        l3.setValor(Double.valueOf("6.99"));
        l3.setUsuario(u);
        System.out.println("> " + l3);
        
        return Arrays.asList(l1, l2, l3);
    }

}
