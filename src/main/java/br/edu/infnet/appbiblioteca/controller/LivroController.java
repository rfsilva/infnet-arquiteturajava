package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appbiblioteca.model.domain.Livro;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.service.LivroService;

@Controller
public class LivroController {

    @Autowired
    private LivroService livroService;
    
    @GetMapping("/livro/lista")
    public String listar(Model model) {
        model.addAttribute("listagem", livroService.list());
        return "livro/lista";
    }
    
    @GetMapping("/livro/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        livroService.remove(id);
        return "redirect:/livro/lista";
    }

    @GetMapping("/livro")
    public String cadastro(Model model) {
        return "livro/cadastro";
    }
    
    @PostMapping("/livro/incluir")
    public String incluir(Livro livro, @SessionAttribute("user") Usuario usuario) {
        livro.setUsuario(usuario);
        livroService.add(livro);
        return "redirect:/livro/lista";
    }
}
