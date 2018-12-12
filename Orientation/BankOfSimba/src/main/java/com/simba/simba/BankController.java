package com.simba.simba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {
    List<BankAccount> bankAccounts;

    public BankController() {
        bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("Simba", 2000, "lion", true));
        bankAccounts.add(new BankAccount("Timon", 4000, "meerkat", false));
        bankAccounts.add(new BankAccount("Pumba", 1000, "warthog", false));
        bankAccounts.add(new BankAccount("Nala", 3000, "lioness", false));
    }


    @GetMapping(path = "/show")
    public String showPage(Model model) {
        model.addAttribute("bankAccounts", bankAccounts);
        return "bankAccountFields";
    }

    @GetMapping(path = "/bankexception")
    public String html(Model model) {
        model.addAttribute("html1", " <em>HTML</em> ");
        model.addAttribute("html2", "<b>Enjoy yourself!</b>");
        return "html";
    }
}
