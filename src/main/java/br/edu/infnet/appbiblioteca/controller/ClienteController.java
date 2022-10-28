package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appbiblioteca.service.ClienteService;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente/lista")
    public String list(Model model) {
        model.addAttribute("listagem", clienteService.list());
        return "cliente/lista";
    }
    
    @GetMapping("/cliente/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        clienteService.remove(id);
        return "redirect:/cliente/lista";
    }
}