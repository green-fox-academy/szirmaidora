package com.webshop.webshop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShopItemList {
    List<ShopItem> shopItemm;
    public ShopItemList() {
        shopItemm = new ArrayList<>();
        fillDefault();

    }

    public void fillDefault() {
        ShopItem item1 = new ShopItem("shoes", "to wear on your feet", 50, 55);
        ShopItem item2 = new ShopItem("jewellery", "to decorate yourself", 100, 2);
        ShopItem item3 = new ShopItem("pc", "to play", 120, 5);
        ShopItem item4 = new ShopItem("pc", "to play", 120, 0);
        shopItemm.add(item1);
        shopItemm.add(item2);
        shopItemm.add(item3);
        shopItemm.add(item4);
    }

    private List<ShopItem> shopItemList;

    public List<ShopItem> getShopItemList() {
        return shopItemList;
    }


    public List available(List<ShopItem> shopItems) {
        return shopItems.stream().filter(item -> item.getQuantityOfStock() != 0).collect(Collectors.toList());
    }

    public List cheapestFirst(List<ShopItem> shopItems) {
        shopItems.sort(Comparator.comparing(ShopItem::getPrice));
        return shopItems;
    }

    public List containsNike(List<ShopItem> shopItems) {
        String nike = "Nike";
        shopItems = shopItems.stream().filter(item -> item.getDescription().contains(nike)).collect(Collectors.toList());
        shopItems = shopItems.stream().filter(item -> item.getName().contains(nike)).collect(Collectors.toList());
        return shopItems;
    }
}
