package DiceSet;

import java.util.Arrays;

public class DiceSet {
    // You have a `DiceSet` class which has a list for 6 dices
// You can roll all of them with roll()
// Check the current rolled numbers with getCurrent()
// You can reroll with reroll()
// Your task is to roll the dices until all of the dices are 6
    int[] dice = new int[6];


    public int[] roll() {
        for (int i = 0; i < dice.length; i++) {
            dice[i] = (int) (Math.random() * 6) + 1;
        }
        return dice;
    }

    public int[] getCurrent() {
        return dice;
    }

    public int getCurrent(int i) {
        return dice[i];
    }


    public void reroll() {
        for (int i = 0; i < dice.length; i++) {
            dice[i] = (int) (Math.random() * 6) + 1;
        }
    }

    public void reroll(int k) {
        dice[k] = (int) (Math.random() * 6) + 1;
    }



    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
      /*  diceSet.getCurrent();
        diceSet.roll();
        diceSet.getCurrent();
        diceSet.getCurrent(5);
        diceSet.reroll();
        diceSet.getCurrent();
        diceSet.reroll(4);
        diceSet.getCurrent(); */
        diceSet.roll();
        for (int i = 0; i < diceSet.dice.length; i++) {
            while (diceSet.dice[i] != 6) {
                diceSet.reroll(i);
            }

        }


    }
}