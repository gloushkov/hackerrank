package warmup_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-14.
 */
class RepeatedStringTest {

    @Test
    void test1() {
        long result = RepeatedString.solution("aba", 10L);
        assertEquals(7, result);
    }

    @Test
    void test2() {
        long result = RepeatedString.solution("a", 1000000000000L);
        assertEquals(1000000000000L, result);
    }

    @Test
    void test3() {
        long result = RepeatedString.solution("cfimaakj", 554045874191L);
        assertEquals(138511468548L, result);
    }
}