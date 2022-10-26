package br.edu.infnet.appbiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appbiblioteca.util.LocacaoCollection;

@Controller
public class LocacaoController {

    @GetMapping("/locacao/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", LocacaoCollection.get());
        return "locacao/lista";
    }
}
