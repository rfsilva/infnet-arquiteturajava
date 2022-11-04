package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appbiblioteca.model.domain.Material;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.service.MaterialService;

@Controller
public class MaterialController {

    @Autowired
    private MaterialService materialService;
    
    @GetMapping("/material/lista")
    public String listar(Model model) {
        model.addAttribute("listagem", materialService.list());
        return "material/lista";
    }
    
    @GetMapping("/material/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        materialService.remove(id);
        return "redirect:/material/lista";
    }

    @GetMapping("/material")
    public String cadastro(Model model) {
        return "material/cadastro";
    }
    
    @PostMapping("/material/incluir")
    public String incluir(Material material, @SessionAttribute("user") Usuario usuario) {
        material.setUsuario(usuario);
        materialService.add(material);
        return "redirect:/material/lista";
    }
}
