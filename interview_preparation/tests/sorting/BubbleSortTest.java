package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-14.
 */
class BubbleSortTest {

    @Test
    void test1() {
        int[] input = new int[] {6, 4, 1};
        int result = BubbleSort.countSwaps(input);
        assertEquals(3, result);
    }

    @Test
    void test2() {
        int[] input = new int[] {1, 2, 3};
        int result = BubbleSort.countSwaps(input);
        assertEquals(0, result);
    }
}