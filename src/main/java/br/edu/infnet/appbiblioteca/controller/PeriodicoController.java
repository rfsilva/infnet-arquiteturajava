package br.edu.infnet.appbiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appbiblioteca.util.PeriodicoCollection;

@Controller
public class PeriodicoController {

    @GetMapping("/periodico/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", PeriodicoCollection.get());
        return "periodico/lista";
    }
}
