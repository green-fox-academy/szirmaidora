import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    List<Integer> listNumbers;
    Sum sum = new Sum();

    @BeforeEach
    void setUp() {
        Sum sum = new Sum();

    }

    @Test
    void shouldSum () {
        listNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(15,  sum.sumOfElements(listNumbers));
    }
    @Test
    void shouldSumEmptyList () {
        listNumbers = new ArrayList<>(Arrays.asList());
        assertEquals(0,  sum.sumOfElements(listNumbers));
    }
    @Test
    void shouldsumOne () {
        listNumbers = new ArrayList<>(Arrays.asList(1));
        assertEquals(1,  sum.sumOfElements(listNumbers));
    }
    @Test
    void shouldsumNull () {
        //listNumbers = new ArrayList<>(Arrays.asList(null));
        assertThrows(NullPointerException.class, () -> {sum.sumOfElements(null);});
    }

}