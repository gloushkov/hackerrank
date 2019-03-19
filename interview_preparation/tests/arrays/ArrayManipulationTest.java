package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-20.
 */
class ArrayManipulationTest {

    @Test
    void test1() {

        int[][] queries = {
                {1, 2, 100},
                {2, 5, 100},
                {3, 4, 100}
        };
        long result = ArrayManipulation.arrayManipulation(5, queries);
        assertEquals(200, result);
    }

    @Test
    void test2() {

        int[][] queries = {
                {1, 5, 3},
                {4, 8, 7},
                {6, 9, 1}
        };
        long result = ArrayManipulation.arrayManipulation(10, queries);
        assertEquals(10, result);
    }

}