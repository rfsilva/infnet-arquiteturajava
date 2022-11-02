package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appbiblioteca.model.service.PeriodicoService;

@Controller
public class PeriodicoController {

    @Autowired
    private PeriodicoService periodicoService;

    @GetMapping("/periodico/lista")
    public String list(Model model) {
        model.addAttribute("listagem", periodicoService.list());
        return "periodico/lista";
    }
    
    @GetMapping("/periodico/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        periodicoService.remove(id);
        return "redirect:/periodico/lista";
    }
}
