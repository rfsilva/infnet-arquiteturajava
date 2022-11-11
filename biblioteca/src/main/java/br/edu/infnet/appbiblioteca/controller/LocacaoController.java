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
import br.edu.infnet.appbiblioteca.model.service.ClienteService;
import br.edu.infnet.appbiblioteca.model.service.LocacaoService;
import br.edu.infnet.appbiblioteca.model.service.MaterialService;

@Controller
public class LocacaoController {
    
    @Autowired
    private LocacaoService locacaoService;
    
    @Autowired
    private ClienteService clienteService;
    
    @Autowired
    private MaterialService materialService;

    @GetMapping("/locacao/lista")
    public String listar(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listagem", locacaoService.findByUsuario(usuario));
        return "locacao/lista";
    }
    
    @GetMapping("/locacao/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        locacaoService.remove(id);
        return "redirect:/locacao/lista";
    }

    @GetMapping("/locacao")
    public String cadastro(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("materiais", materialService.findByUsuario(usuario));
        model.addAttribute("clientes", clienteService.findByUsuario(usuario));
        return "locacao/cadastro";
    }
    
    @PostMapping("/locacao/incluir")
    public String incluir(Locacao locacao, @SessionAttribute("user") Usuario usuario) {
        System.out.println("Cliente: " + locacao.getCliente());
        System.out.println("Materiais: " + locacao.getMateriais());
        locacao.setUsuario(usuario);
        locacaoService.add(locacao);
        return "redirect:/locacao/lista";
    }
}
