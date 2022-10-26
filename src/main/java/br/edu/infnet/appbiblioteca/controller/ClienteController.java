package br.edu.infnet.appbiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appbiblioteca.util.ClienteCollection;

@Controller
public class ClienteController {

    @GetMapping("/cliente/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", ClienteCollection.get());
        return "cliente/lista";
    }
}
