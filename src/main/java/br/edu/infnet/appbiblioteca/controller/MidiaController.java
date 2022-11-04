package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appbiblioteca.model.domain.Midia;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.service.MidiaService;

@Controller
public class MidiaController {

    @Autowired
    private MidiaService midiaService;

    @GetMapping("/midia/lista")
    public String listar(Model model) {
        model.addAttribute("listagem", midiaService.list());
        return "midia/lista";
    }
    
    @GetMapping("/midia/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        midiaService.remove(id);
        return "redirect:/midia/lista";
    }

    @GetMapping("/midia")
    public String cadastro(Model model) {
        return "midia/cadastro";
    }
    
    @PostMapping("/midia/incluir")
    public String incluir(Midia midia, @SessionAttribute("user") Usuario usuario) {
        midia.setUsuario(usuario);
        midiaService.add(midia);
        return "redirect:/midia/lista";
    }
}
