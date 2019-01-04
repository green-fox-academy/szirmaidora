package com.foxclub.foxclub.Controller;

import com.foxclub.foxclub.Model.Fox;
import com.foxclub.foxclub.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping(path = "/")
    public String index() {
        return "index";
    }

    @GetMapping(path = "/login")
    public String login(Model model, String name) {
        model.addAttribute("name", name);
        return "Login";
    }

    @PostMapping("/login")
    public String loging(@RequestParam(name = "name", required = true) String name, Model model) {
        foxService.saveFox(new Fox(name));
        model.addAttribute("name", name);
        return "index";
    }
    @GetMapping("/nutritionstore")
    public String feed (){
        return "nutritionstore";
    }
}
