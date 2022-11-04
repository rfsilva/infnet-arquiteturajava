package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appbiblioteca.model.domain.Periodico;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.service.PeriodicoService;

@Controller
public class PeriodicoController {

    @Autowired
    private PeriodicoService periodicoService;

    @GetMapping("/periodico/lista")
    public String listar(Model model) {
        model.addAttribute("listagem", periodicoService.list());
        return "periodico/lista";
    }
    
    @GetMapping("/periodico/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        periodicoService.remove(id);
        return "redirect:/periodico/lista";
    }

    @GetMapping("/periodico")
    public String cadastro(Model model) {
        return "periodico/cadastro";
    }
    
    @PostMapping("/periodico/incluir")
    public String incluir(Periodico periodico, @SessionAttribute("user") Usuario usuario) {
        periodico.setUsuario(usuario);
        periodicoService.add(periodico);
        return "redirect:/periodico/lista";
    }
}
