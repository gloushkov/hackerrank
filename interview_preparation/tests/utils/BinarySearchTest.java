package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-15.
 */
class BinarySearchTest {

    @Test
    void test1() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        boolean result = BinarySearch.find(input, 4);
        assertEquals(true, result);
    }

    @Test
    void test2() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        boolean result = BinarySearch.find(input, 8);
        assertEquals(false, result);
    }

    @Test
    void test3() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int result = BinarySearch.findIndex(input, 4);
        assertEquals(3, result);
    }

    @Test
    void test4() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int result = BinarySearch.findIndex(input, 8);
        assertEquals(-1, result);
    }
}