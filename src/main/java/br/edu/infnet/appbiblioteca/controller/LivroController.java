package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appbiblioteca.service.LivroService;

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
}
