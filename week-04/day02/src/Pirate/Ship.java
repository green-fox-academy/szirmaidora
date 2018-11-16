package Pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> shipCrew = new ArrayList();
    public void fillShip () {

        Pirate captain = new Pirate();
        shipCrew.add(0, captain);
        int numberOfPirates = 0;
        for (int i = 0; i < Math.random() * (10 - 5) + 5; i++) {
            Pirate pirate = new Pirate();
            shipCrew.add(i + 1,pirate );
            numberOfPirates++;

        }
        System.out.println("Drunklevel: " + captain.intoxication + ", captain alive: " +  !shipCrew.get(0).dead + ", number of pirates alive: " + numberOfPirates);

    }
}
