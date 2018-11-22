import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
    Apple apple;


    @BeforeEach
    void setUp() {
        apple = new Apple("apple");
    }

    @ Test
    void shouldbeApple () {
        assertEquals("apple", apple.getApple());

    }

    /*@Test
    void getApple() {
    }*/
}