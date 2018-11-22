import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    String apple = "apple";
    String pair = "eplap";
    Anagram sd = new Anagram();


    @Test
    void shouldBeAnagram () {
        assertEquals(true, sd.isAnagram(apple,pair));
    }


}