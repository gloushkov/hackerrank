package warmup_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-14.
 */
class CountingValleysTest {

    @Test
    void test1() {
        int result = CountingValleys.solution("UDDDUDUU");
        assertEquals(1, result);
    }

    @Test
    void test2() {
        int result = CountingValleys.solution("DDUUDDUDUUUD");
        assertEquals(2, result);
    }
}