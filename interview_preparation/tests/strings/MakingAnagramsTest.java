package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-20.
 */
class MakingAnagramsTest {

    @Test
    void test1() {
        String a = "cde";
        String b = "abc";
        int result = MakingAnagrams.makeAnagram(a, b);
        assertEquals(4, result);
    }

    @Test
    void test2() {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        int result = MakingAnagrams.makeAnagram(a, b);
        assertEquals(30, result);
    }

    @Test
    void test3() {
        String a = "showman";
        String b = "woman";
        int result = MakingAnagrams.makeAnagram(a, b);
        assertEquals(2, result);
    }

}