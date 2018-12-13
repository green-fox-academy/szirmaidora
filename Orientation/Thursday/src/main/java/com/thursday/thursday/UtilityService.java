package com.thursday.thursday;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }
    public String validateEmail (String email){
        String emailVal = "";
        if (email.contains("@") && email.contains(".")){
            emailVal = "is a valid e-mail address";
            return emailVal;
        }
        else {
            emailVal="is a valid e-mail address";
            return emailVal;
        }
    }
}