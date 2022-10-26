package br.edu.infnet.appbiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appbiblioteca.util.MidiaCollection;

@Controller
public class MidiaController {

    @GetMapping("/midia/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", MidiaCollection.get());
        return "midia/lista";
    }
}
