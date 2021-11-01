package com.jeremy.dojosandninjas.controllers;

import java.util.List;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jeremy.dojosandninjas.models.Dojo;
import com.jeremy.dojosandninjas.models.Ninja;
import com.jeremy.dojosandninjas.services.DojoService;
import com.jeremy.dojosandninjas.services.NinjaService;

@Controller
public class NinjaController {
    private final NinjaService ninjaService;
    private final DojoService dojoService;
    
    public NinjaController(NinjaService ninjaService, DojoService dojoService){
        this.ninjaService = ninjaService;
        this.dojoService = dojoService;
    }

    @GetMapping("/ninjas")
    public String index(Model model, @ModelAttribute("ninja") Ninja ninja) {
        List<Ninja> ninjas = ninjaService.allNinjas();
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("ninjas", ninjas);
        model.addAttribute("dojos", dojos);
        return "ninjas.jsp";
    }
    
    @GetMapping("/ninjas/{id}/edit")
    public String edit(Model model, @PathVariable("id") Long id) {
        List<Dojo> dojos = dojoService.allDojos();
        Ninja ninja = ninjaService.findNinja(id);
        model.addAttribute("dojos", dojos);
        model.addAttribute("ninja", ninja);
        return "ninjaEdit.jsp";
    }

    @PostMapping("/ninjas/{id}/update")
    public String editNinja(@PathVariable("id") Long id, @Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
        if (result.hasErrors()) {
            return "ninjaEdit.jsp";
        } else {
            System.out.println(ninja.getId());
            System.out.println(ninja.getFirstName());
            this.ninjaService.updateNinja(ninja);
            return "redirect:/ninjas";
        }
    }

    @PostMapping("/ninjas/create")
    public String createNinja(Model model, @Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result){
        if(result.hasErrors()){
            List<Ninja> ninjas = ninjaService.allNinjas();
            List<Dojo> dojos = dojoService.allDojos();
            model.addAttribute("ninjas", ninjas);
            model.addAttribute("dojos", dojos);
            return "ninjas.jsp";
        }
        System.out.println("created ninja");
        this.ninjaService.createNinja(ninja);
        return "redirect:/ninjas";
    }

    @GetMapping("/ninjas/{id}/delete")
    public String deleteNinja(@PathVariable("id") Long id){
        this.ninjaService.deleteNinja(id);
        return"redirect:/ninjas";
    }

}