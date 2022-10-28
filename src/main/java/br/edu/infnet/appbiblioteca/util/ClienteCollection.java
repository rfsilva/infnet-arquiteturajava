package br.edu.infnet.appbiblioteca.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.edu.infnet.appbiblioteca.model.domain.Cliente;

public class ClienteCollection {

    public static List<Cliente> get(Integer id) {

        Cliente c1 = new Cliente();
        c1.setId(id++);
        c1.setAtivo(true);
        c1.setCpf("12345678909");
        c1.setDataNascimento(LocalDate.of(1980, 2, 10));
        c1.setEmail("nobrega@nobrega.com.br");
        c1.setEndereco("Rua dos Tupinambás, 330, São Paulo-SP");
        c1.setNome("Carlos Alberto de Nóbrega");
        System.out.println("> " + c1);

        Cliente c2 = new Cliente();
        c2.setId(id++);
        c2.setAtivo(true);
        c2.setCpf("23456789010");
        c2.setDataNascimento(LocalDate.of(1992, 10, 21));
        c2.setEmail("edson@pele.com.br");
        c2.setEndereco("Avenida Rio Branco, 183, Varginha-MG");
        c2.setNome("Edson Arantes do Nascimento");
        System.out.println("> " + c2);

        Cliente c3 = new Cliente();
        c3.setId(id++);
        c3.setAtivo(false);
        c3.setCpf("34567890121");
        c3.setDataNascimento(LocalDate.of(2001, 3, 17));
        c3.setEmail("zagallo@zagallo.com.br");
        c3.setEndereco("Travessa Monsenhor Ramalho, 4115, Guarapari-ES");
        c3.setNome("Mario Jorge Lobo Zagallo");
        System.out.println("> " + c3);

        return Arrays.asList(c1, c2, c3);
    }

}
