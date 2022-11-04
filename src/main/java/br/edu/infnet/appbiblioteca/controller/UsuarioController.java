package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.service.UsuarioService;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario")
    public String telaCadastro() {
        return "usuario/cadastro";
    }

    @GetMapping("/usuario/lista")
    public String listar(Model model) {
        model.addAttribute("listagem", usuarioService.list());
        return "usuario/lista";
    }

    @PostMapping("/usuario/incluir")
    public String incluir(Usuario usuario) {
        usuarioService.add(usuario);
        return "redirect:/usuario/lista";
    }
    
    @GetMapping("/usuario/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        usuarioService.remove(id);
        return "redirect:/usuario/lista";
    }
}
