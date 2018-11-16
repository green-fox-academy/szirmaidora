package Pirate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pirate Captain = new Pirate();
        Captain.drinkSomeRum();
        System.out.println(Captain.intoxication);
        Pirate myPirate = new Pirate();
        myPirate.brawl(Captain);
        Ship myShip = new Ship();
        myShip.fillShip();




    }
}
