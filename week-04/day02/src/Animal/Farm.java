package Animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private ArrayList<Animal> farmAnimals = new ArrayList<Animal>();
    int slots;
    public void add (Animal newAn) {
        farmAnimals.add(newAn);
    }

    public void breed (int slots) {
        this.slots = slots;
        if (slots > 0) {
            Animal horse = new Animal();
            farmAnimals.add(horse);
        }

    }
    public void slaughter () {
        int toSlautgher = 0;
        int toSlautgherindex = 0;
        for (int i = 0; i < farmAnimals.size(); i++) {
            if (toSlautgher < farmAnimals.get(i).hunger) {
                toSlautgher = farmAnimals.get(i).hunger;
                toSlautgherindex = i;
            }

        }
        farmAnimals.remove(toSlautgherindex);
    }

}
