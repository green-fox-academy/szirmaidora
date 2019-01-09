package com.url.demo.Controller;

import com.url.demo.Model.Url;
import com.url.demo.Service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UrlController {
    UrlService urlService;

    @Autowired
    public UrlController (UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping ({"/", ""})
    public String showPage (@ModelAttribute (value = "error") String error, @ModelAttribute (value = "url") Url url, @ModelAttribute (value = "message")String message, Model model) {
        model.addAttribute("error", error);
        model.addAttribute("message", message);
        model.addAttribute("url", url);

        return "index";
    }

    @PostMapping ("/save-link")
    public String saveLink (@ModelAttribute (value = "url") @Valid Url url, RedirectAttributes redirectAttribute, BindingResult result) {
        if (result.hasErrors()){
            redirectAttribute.addFlashAttribute("error","Sorry");
            return "redirect:/";
            }
        else {if (urlService.isIdUsed(url.getInputAlias())){
            redirectAttribute.addFlashAttribute("url", url);
            redirectAttribute.addFlashAttribute("message","Your alias is used");
        } else {
            url.setSecretCode((int) (Math.random() * 10) + "" + (int) (Math.random() * 10) + "" + (int) (Math.random() * 10) + "" + (int) (Math.random() * 10));
            redirectAttribute.addFlashAttribute("message", "Your URL is aliased to " + url.getInputAlias() + "  and your secret code is " + url.getSecretCode());
            redirectAttribute.addFlashAttribute("url", url);
            urlService.updateLink(url);
        }
        } return "redirect:/";
    }
    @GetMapping("a/{alias}")
    public String hitCount (@PathVariable String alias){
        if (urlService.isIdUsed(alias)) {
            urlService.increaseHitCount(alias);
            urlService.updateLink(urlService.findUrlByInputAlias(alias));
        return "redirect:" + urlService.findUrlByInputAlias(alias).getIntputUrl();}
    return "404";}
}
