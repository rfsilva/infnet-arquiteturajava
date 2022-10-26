package br.edu.infnet.appbiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appbiblioteca.util.MaterialCollection;

@Controller
public class MaterialController {

    @GetMapping("/material/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", MaterialCollection.get());
        return "material/lista";
    }
}
