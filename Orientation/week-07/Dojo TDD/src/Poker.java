import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Poker {
    public static void main(String[] args) {

    }

    public static String whoWins(String[][] hand1, String[][] hand2) {
        String white = "White wins!";
        String black = "Black wins!";
        String winner;

        for (int i = 0; i < hand1.length; i++) {
            for (int j = 0; j < hand2.length ; j++) {
                if (hand1[i][0].equals("A") || hand2[j][0].equals("A")) {
                    if (hand1[i][0].equals("A")) {
                        return black;
                    }
                    return white;
                } else if (hand1[i][0].equals("K") || hand2[j][0].equals("K")) {
                    if (hand1[i][0].equals("K")) {
                        return black;
                    }
                    return white;
                } else if (hand1[i][0].equals("Q") || hand2[j][0].equals("Q")) {
                    if (hand1[i][0].equals("Q")) {
                        return black;
                    }
                    return white;
                } else if (hand1[i][0].equals("J") || hand2[j][0].equals("J")) {
                    if (hand1[i][0].equals("J")) {
                        return black;
                    }
                    return white;
                } else if (Integer.parseInt(hand1[i][0]) > Integer.parseInt(hand2[j][0])) {
                    return black;
                }
            }
        }
        return white;
    }

    public static String highCard(List<Card> hand) {
        List<String> values = hand.stream().map(card -> card.value).collect(Collectors.toList());
        String[] letters = {"A", "K", "Q", "J"};
        for (int i = 0; i < letters.length; i++) {
            if (values.contains(letters[i])) {
                return letters[i];
            }
        }
     return null;
    }
}
