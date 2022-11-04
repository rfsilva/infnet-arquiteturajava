package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appbiblioteca.model.domain.Locacao;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.service.LocacaoService;

@Controller
public class LocacaoController {
    
    @Autowired
    private LocacaoService locacaoService;

    @GetMapping("/locacao/lista")
    public String listar(Model model) {
        model.addAttribute("listagem", locacaoService.list());
        return "locacao/lista";
    }
    
    @GetMapping("/locacao/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        locacaoService.remove(id);
        return "redirect:/locacao/lista";
    }

    @GetMapping("/locacao")
    public String cadastro(Model model) {
        return "locacao/cadastro";
    }
    
    @PostMapping("/locacao/incluir")
    public String incluir(Locacao locacao, @SessionAttribute("user") Usuario usuario) {
        locacaoService.add(locacao);
        return "redirect:/locacao/lista";
    }
}
