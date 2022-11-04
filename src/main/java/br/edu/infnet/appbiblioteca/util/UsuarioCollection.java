package br.edu.infnet.appbiblioteca.util;

import java.util.Arrays;
import java.util.List;

import br.edu.infnet.appbiblioteca.model.domain.Usuario;

public class UsuarioCollection {

    public static List<Usuario> get() {

        Usuario u1 = new Usuario();
        u1.setId(1);
        u1.setEmail("admin@admin.com.br");
        u1.setNome("Administrador");
        u1.setSenha("sistema123");
        System.out.println("> " + u1);

        return Arrays.asList(u1);
    }
}
