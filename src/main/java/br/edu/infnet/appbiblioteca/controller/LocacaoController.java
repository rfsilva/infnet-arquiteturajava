package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appbiblioteca.service.LocacaoService;

@Controller
public class LocacaoController {
    
    @Autowired
    private LocacaoService locacaoService;

    @GetMapping("/locacao/lista")
    public String list(Model model) {
        model.addAttribute("listagem", locacaoService.list());
        return "locacao/lista";
    }
    
    @GetMapping("/locacao/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        locacaoService.remove(id);
        return "redirect:/locacao/lista";
    }
}
