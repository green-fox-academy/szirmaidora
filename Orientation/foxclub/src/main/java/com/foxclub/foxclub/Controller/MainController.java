package com.foxclub.foxclub.Controller;

import com.foxclub.foxclub.Model.Fox;
import com.foxclub.foxclub.Repository.FoxRepository;
import com.foxclub.foxclub.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
    FoxRepository foxRepository;
    FoxService foxService;

    @Autowired
    public MainController(FoxRepository foxRepository, FoxService foxService) {
        this.foxRepository = foxRepository;
        this.foxService = foxService;
    }

    @GetMapping({"/"})
    public String index(@RequestParam(name = "name", required = false) String name, Model model) {
        if (name == null) {
            return "redirect:/login";
        } else {
            model.addAttribute("fox", foxRepository.findByName(name));
            return "index";
        }
    }

    @GetMapping(path = "/login")
    public String login() {
        return "Login";
    }

    @PostMapping("/login")
    public String loging(@RequestParam(name = "name", required = true) String name, RedirectAttributes redirectAttributes) {
        foxRepository.save(new Fox(name));
        redirectAttributes.addAttribute("name", name);
        return "redirect:/";
    }

    @GetMapping("/nutritionstore")
    public String feed(Model model, @PathVariable String name) {
        model.addAttribute("foodlist", foxService.fillFoodList());
        model.addAttribute("drinklist", foxService.fillDrinkList());
        return "nutritionstore";
    }
}
