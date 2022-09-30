import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void testArrayLength() {
        Fibonacci fib = new Fibonacci();
        assertEquals(100, fib.getFibonacci().length);
    }

    @Test
    void testFibonacciSequence() {
        Fibonacci fib = new Fibonacci();
        int[] seq = fib.berechne();
        for(int i = 2; i < seq.length; i++) {
            assertEquals(seq[i-1] + seq[i-2], seq[i]);
        }
    }
}