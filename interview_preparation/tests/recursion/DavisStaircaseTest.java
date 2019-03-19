package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-20.
 */
class DavisStaircaseTest {

    @Test
    public void test1() {
        int result = DavisStaircase.countStepsRecursively(1);
        assertEquals(1, result);
    }

    @Test
    public void test2() {
        int result = DavisStaircase.countStepsRecursively(3);
        assertEquals(4, result);
    }

    @Test
    public void test3() {
        int result = DavisStaircase.countStepsRecursively(5);
        assertEquals(13, result);
    }

    @Test
    public void test4() {
        int result = DavisStaircase.countStepsRecursively(7);
        assertEquals(44, result);
    }

    @Test
    public void test5() {
        int result = DavisStaircase.countStepsMemo(1);
        assertEquals(1, result);
    }

    @Test
    public void test6() {
        int result = DavisStaircase.countStepsMemo(3);
        assertEquals(4, result);
    }

    @Test
    public void test7() {
        int result = DavisStaircase.countStepsMemo(5);
        assertEquals(13, result);
    }

    @Test
    public void test8() {
        int result = DavisStaircase.countStepsMemo(7);
        assertEquals(44, result);
    }

}