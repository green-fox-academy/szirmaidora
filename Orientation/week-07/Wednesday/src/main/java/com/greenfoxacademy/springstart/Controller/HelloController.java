package com.greenfoxacademy.springstart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/web/hellos")
    public String greeting(Model model) {
        HelloHola hello = new HelloHola();
        model.addAttribute("name", hello.getHello());
        model.addAttribute("randomColor", hello.getRandom());
        model.addAttribute("fontSize", hello.getRandom() +"px");
        model.addAttribute("randomColor2", hello.getRandom());
        return "hellos";
    }
}
