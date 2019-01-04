package com.foxclub.foxclub.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
@Entity
public class Fox {
    @Id
    private String name;
    //private List<Trick> tricks;
    private String trick;
    private String food;
    private String drink;

    public Fox() {
    }

    public Fox(String name) {
        this.name = name;
    }

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Trick> getTricks() {
//        return tricks;
//    }
//
//    public void setTricks(List<Trick> tricks) {
//        this.tricks = tricks;
//    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
