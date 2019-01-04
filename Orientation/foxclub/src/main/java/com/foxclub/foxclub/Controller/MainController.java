package com.foxclub.foxclub.Controller;

import com.foxclub.foxclub.Model.Fox;
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
    FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping({"/"})
    public String index(@RequestParam(name = "name", required = false) String name, Model model) {
        if(name == null){
            return "Login";
        }
        model.addAttribute("fox", foxService.findFox(name));
        return "index";
    }

    @GetMapping(path = "/login")
    public String login(Model model, String name) {
        model.addAttribute("name", name);
        return "Login";
    }

    @PostMapping("/login")
    public String loging(@RequestParam(name = "name", required = true) String name, RedirectAttributes redirectAttributes) {
        foxService.saveFox(new Fox(name));
        redirectAttributes.addAttribute("name", name);
        if (foxService.findFox(name) == null){
            foxService.addFox(name);
        }
        return "redirect:/";
    }
    @GetMapping("/nutritionstore")
    public String feed (Model model){
        model.addAttribute("foodlist",foxService.fillFoodList());
        model.addAttribute("drinklist",foxService.fillDrinkList());
        return "nutritionstore";
    }
}
