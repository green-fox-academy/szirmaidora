import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokerTest {

    @Test
    void whoWins1() {
    assertEquals("White wins!", Poker.whoWins(new String[][]{{"2", "H"}, {"3", "D"}, {"5", "S"}, {"9", "C"}, {"K", "D"}},
            new String[][]{{"2", "C"}, {"3", "H"}, {"4", "S"}, {"8", "C"}, {"A", "H"}}));
    }

    @Test
    void whoWins2() {
        assertEquals("Black wins!", Poker.whoWins(new String[][]{{"2", "H"}, {"4", "S"}, {"4", "C"}, {"2", "D"}, {"4", "H"}},
                new String[][]{{"2", "S"}, {"8", "S"}, {"A", "S"}, {"Q", "S"}, {"3", "S"}}));
    }
}