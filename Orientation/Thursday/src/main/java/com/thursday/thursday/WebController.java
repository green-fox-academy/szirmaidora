package com.thursday.thursday;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @Autowired
    UtilityService utilityService;

    @GetMapping(path = "/useful")
    public String html (){
        return "useful";
    }
    @GetMapping(path = "/useful/colored")
    public String colored(Model model){
        model.addAttribute("randomColor",utilityService.randomColor());
        return "colored";
    }
    @GetMapping(path = "/useful/email")
    public String email(Model model, @RequestParam String email){
        model.addAttribute("emailVal",utilityService.validateEmail(email));
        return "email";
    }
}
