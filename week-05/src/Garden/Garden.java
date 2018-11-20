package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> plants = new ArrayList<>();
    public void addPlants (Plant plant) {
        plants.add(plant);
    }
    public void status () {
        for (Plant p : plants) {
            System.out.println(p.introduce());
        }
    }


    public void water(int water) {
        List<Plant> toWater = new ArrayList<>();
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).needsWater()) {
                toWater.add(plants.get(i));
            }

        }
        for (Plant p : toWater) {
            p.watered(water / toWater.size());
            System.out.println(p.introduce());
        }

    }

}

