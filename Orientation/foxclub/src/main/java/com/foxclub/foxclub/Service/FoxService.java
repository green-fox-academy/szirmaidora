package com.foxclub.foxclub.Service;

import com.foxclub.foxclub.Model.Fox;
import com.foxclub.foxclub.Repository.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoxService {
    FoxRepository foxRepository;
    private List<Fox> foxes;

    @Autowired
    public FoxService(FoxRepository foxRepository) {
        this.foxRepository = foxRepository;
    }

    public void saveFox(Fox fox) {
        foxRepository.save(fox);
    }

    public List<String> fillFoodList() {
        List<String> foodlist = new ArrayList<>();
        foodlist.add("pizza");
        foodlist.add("orange");
        foodlist.add("aranygaluska");
        return foodlist;
    }

    public List<String> fillDrinkList() {
        List<String> drinklist = new ArrayList<>();
        drinklist.add("water");
        drinklist.add("beer");
        drinklist.add("blood");
        return drinklist;
    }

    public void addFox(String name) {
        foxes.add(new Fox(name));
    }

/*    public Fox findFox(String name) {
        Fox fox = foxes.stream().filter(x -> x.getName()
                .equals(name))
                .findFirst()
                .orElse(null);
        return fox;
    }*/
    public Optional<Fox> findFox(String name) {
        for (Fox fox : foxes) {
            if (fox.getName().equals(name)) {
                return Optional.of(fox);
            }
        }
        return Optional.empty();
    }
}
