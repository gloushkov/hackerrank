package hashmaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-14.
 */
class TwoStringsTest {

    @Test
    void test1() {
        String s1 = "hello";
        String s2 = "world";

        String result = TwoStrings.twoStrings(s1,s2);
        assertEquals("YES", result);
    }

    @Test
    void test2() {
        String s1 = "hi";
        String s2 = "world";

        String result = TwoStrings.twoStrings(s1,s2);
        assertEquals("NO", result);
    }

}