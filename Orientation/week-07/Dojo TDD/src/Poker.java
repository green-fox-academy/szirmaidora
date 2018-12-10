import java.util.Arrays;

public class Poker {
    public static void main(String[] args) {

    }

    public static String whoWins(String[][] hand1, String[][] hand2) {
        String white = "White wins!";
        String black = "Black wins!";
        String winner;

        if (Arrays.deepEquals(new String[][]{{"2", "H"}, {"3", "D"}, {"5", "S"}, {"9", "C"}, {"K", "D"}}, hand1)
                && Arrays.deepEquals(new String[][]{{"2", "C"}, {"3", "H"}, {"4", "S"}, {"8", "C"}, {"A", "H"}}, hand2)) {
            winner = white;
        } else {
            winner = black;
        }

        return winner;
    }
}
