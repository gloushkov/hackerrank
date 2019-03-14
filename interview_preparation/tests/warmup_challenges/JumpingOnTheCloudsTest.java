package warmup_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-14.
 */
class JumpingOnTheCloudsTest {

    @Test
    void test1() {
        int result = JumpingOnTheClouds.solution(new int[]{0, 0, 1, 0, 0, 1, 0});
        assertEquals(4, result);
    }

    @Test
    void test2() {
        int result = JumpingOnTheClouds.solution(new int[]{0, 0, 0, 0, 1, 0});
        assertEquals(3, result);
    }
}