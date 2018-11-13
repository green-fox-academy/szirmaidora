package FleetOfThings;

import java.util.ArrayList;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();


        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
        String milk = "Get milk";
        String obstacles = "Remove the obstacles";
        String stand = "Stand up";
        String lunch = "Eat lunch";

        Thing milkk = new Thing(milk);
        Thing obs = new Thing(obstacles);
        Thing standUp = new Thing(stand);
        Thing eatLunch = new Thing(lunch);
        standUp.complete();
        eatLunch.complete();



        fleet.add(milkk);
        fleet.add(obs);
        fleet.add(standUp);
        fleet.add(eatLunch);




        System.out.println(fleet);
    }
}
