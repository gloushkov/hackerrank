package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-14.
 */
class LeftRotationTest {

    @Test
    void test1(){
        int[] input = new int[] {1, 2, 3, 4, 5,};
        int[] result = LeftRotation.rotLeft(input, 4);
        int[] expected = new int[] {5, 1, 2, 3, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    void test2(){
        int[] input = new int[] {1, 2, 3, 4, 5,};
        int[] result = LeftRotation.rotLeft(input, 4);
        int[] expected = new int[] {5, 1, 2, 3, 4};
        assertArrayEquals(expected, result);
    }
}