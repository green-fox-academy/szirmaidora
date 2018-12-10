package com.webshop.webshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    ShopItemList myList = new ShopItemList();
    @RequestMapping("/webshop")
    public String home (Model model) {
        model.addAttribute("shopItems", myList.shopItemm);
        return "webshop";
    }
    @RequestMapping("/onlyavailable")
    public String onlyAvailable (Model model) {
        model.addAttribute("shopItems",myList.available(myList.shopItemm));
    return "webshop";}
}
