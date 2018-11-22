import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci number = new Fibonacci();

@Test
    void shouldBeFibonacci () {
    assertEquals(8, number.fibonacci(6));

}
}