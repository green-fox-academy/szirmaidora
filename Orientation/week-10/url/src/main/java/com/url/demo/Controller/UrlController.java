package com.url.demo.Controller;

import com.url.demo.Model.Url;
import com.url.demo.Service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/url")
public class UrlController {
    UrlService urlService;

    @Autowired
    public UrlController (UrlService urlService) {
        this.urlService = urlService;
    }
    @GetMapping ({"/", ""})
    public String showPage () {
        return "index";
    }
    @PostMapping ("/save-link")
    public String saveLink (Model model) {
        model.addAttribute("url",new Url());
        return "redirect:/";
    }
}
