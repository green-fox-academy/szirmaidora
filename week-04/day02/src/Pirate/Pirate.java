package Pirate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pirate {
    private static final Random RANDOM = new Random();
    boolean dead = false;
    int intoxication = 0;


    public void drinkSomeRum() {
        if (dead) {
            System.out.println("He is dead.");
        }
        intoxication++;
    }

    public String howsItGoingMate() {
        String reply = "Pour me anudder!";
        if (intoxication > 4) {
            reply = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
            intoxication = 0;
        } else if (dead) {
            reply = "He is dead.";
        }
        return reply;
    }

    public void die() {
        dead = true;
    }


    public void brawl(Pirate opponent) {
        int chance = 0;
        if (!opponent.dead && !this.dead) {
            chance = RANDOM.nextInt(3) + 1;
            if (chance == 1) {
                opponent.die();
            } else if (chance == 2) {
                die();
            } else {
                this.die();
                opponent.die();
            }

        }


    }

}
