package br.edu.infnet.appbiblioteca.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.edu.infnet.appbiblioteca.model.domain.Cliente;
import br.edu.infnet.appbiblioteca.model.domain.Livro;
import br.edu.infnet.appbiblioteca.model.domain.Locacao;
import br.edu.infnet.appbiblioteca.model.domain.Midia;
import br.edu.infnet.appbiblioteca.model.domain.Periodico;

public class LocacaoCollection {

    public static List<Locacao> get(Integer id) {
        System.out.println("## Cadastramento de Locações ##");

        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setAtivo(true);
        cliente.setCpf("12345678909");
        cliente.setDataNascimento(LocalDate.of(1980, 2, 10));
        cliente.setEmail("nobrega@nobrega.com.br");
        cliente.setEndereco("Rua dos Tupinambás, 330, São Paulo-SP");
        cliente.setNome("Carlos Alberto de Nóbrega");

        Midia midia = new Midia();
        midia.setId(1);
        midia.setAnoFabricacao(2001);
        midia.setDataPublicacao(LocalDate.of(2000, 1, 11));
        midia.setDescricao("Mapa Político Mundo");
        midia.setFabricante("Editora Abril");
        midia.setNome("Mapa Político Mundo 2000");
        midia.setRaro(false);
        midia.setTipo("MAPA");
        midia.setValor(Double.valueOf("32.99"));

        Livro livro = new Livro();
        livro.setId(1);
        livro.setAutor("Robert C. Martin");
        livro.setDataPublicacao(LocalDate.of(2015, 2, 10));
        livro.setDescricao("Desenvolvimento Ágil Limpo");
        livro.setEditora("Alta Books");
        livro.setNome("Desenvolvimento Ágil Limpo");
        livro.setTotalPaginas(486);
        livro.setValor(Double.valueOf("4.99"));

        Periodico periodico = new Periodico();
        periodico.setId(1);
        periodico.setAbrangencia("NACIONAL");
        periodico.setDataPublicacao(LocalDate.of(2014, 7, 1));
        periodico.setDescricao("Edição 01/04/2014");
        periodico.setEditora("FOLHA DE SÃO PAULO");
        periodico.setNome("Jornal Folha de S. Paulo");
        periodico.setTotalPaginas(32);
        periodico.setValor(Double.valueOf("3.99"));
        
        Locacao l1 = new Locacao();
        l1.setId(id++);
        l1.setCliente(cliente);
        l1.setDescricao("Locação de Livros");
        l1.setWeb(false);
        l1.setMateriais(Arrays.asList(midia, livro));
        System.out.println("> " + l1);

        Locacao l2 = new Locacao();
        l2.setId(id++);
        l2.setCliente(cliente);
        l2.setDescricao("Locação de Mídias");
        l2.setWeb(true);
        l2.setMateriais(Arrays.asList(midia, periodico));
        System.out.println("> " + l2);

        Locacao l3 = new Locacao();
        l3.setId(id++);
        l3.setCliente(cliente);
        l3.setDescricao("Locação de Periódicos");
        l3.setWeb(true);
        l3.setMateriais(Arrays.asList(livro, periodico));
        System.out.println("> " + l3);
        
        return Arrays.asList(l1, l2, l3);
    }

}
