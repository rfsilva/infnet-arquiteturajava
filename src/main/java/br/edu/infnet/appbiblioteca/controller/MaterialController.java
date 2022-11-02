package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appbiblioteca.model.service.MaterialService;

@Controller
public class MaterialController {

    @Autowired
    private MaterialService materialService;
    
    @GetMapping("/material/lista")
    public String list(Model model) {
        model.addAttribute("listagem", materialService.list());
        return "material/lista";
    }
    
    @GetMapping("/material/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        materialService.remove(id);
        return "redirect:/material/lista";
    }
}
