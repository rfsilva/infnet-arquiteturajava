package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appbiblioteca.model.domain.Cliente;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.service.ClienteService;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente/lista")
    public String listar(Model model) {
        model.addAttribute("listagem", clienteService.list());
        return "cliente/lista";
    }
    
    @GetMapping("/cliente/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        clienteService.remove(id);
        return "redirect:/cliente/lista";
    }

    @GetMapping("/cliente")
    public String cadastro(Model model) {
        return "cliente/cadastro";
    }
    
    @PostMapping("/cliente/incluir")
    public String incluir(Cliente cliente, @SessionAttribute("user") Usuario usuario) {
        cliente.setUsuario(usuario);
        clienteService.add(cliente);
        return "redirect:/cliente/lista";
    }
}
