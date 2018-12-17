package com.foxclub.foxclub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping(path = "/")
    public String index() {
        return "index";
    }
    @GetMapping(path = "/login")
    public String login() {
        return "login";
    }
}
