package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appbiblioteca.model.service.MidiaService;

@Controller
public class MidiaController {

    @Autowired
    private MidiaService midiaService;

    @GetMapping("/midia/lista")
    public String list(Model model) {
        model.addAttribute("listagem", midiaService.list());
        return "midia/lista";
    }
    
    @GetMapping("/midia/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        midiaService.remove(id);
        return "redirect:/midia/lista";
    }
}
