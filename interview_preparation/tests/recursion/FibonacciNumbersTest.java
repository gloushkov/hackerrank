package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-20.
 */
class FibonacciNumbersTest {
    @Test
    public void test1() {
        int result = FibonacciNumbers.fibonacci(3);
        assertEquals(2, result);
    }

    @Test
    public void test2() {
        int result = FibonacciNumbers.fibonacci(17);
        assertEquals(1597, result);
    }

}