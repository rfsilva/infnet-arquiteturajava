package br.edu.infnet.appbiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appbiblioteca.util.LivroCollection;

@Controller
public class LivroController {

    @GetMapping("/livro/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", LivroCollection.get());
        return "livro/lista";
    }
}
