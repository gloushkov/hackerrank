package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-20.
 */
class AlternatingCharactersTest {

    @Test
    void test1() {
        int result = AlternatingCharacters.alternatingCharacters("AAAA");
        assertEquals(3, result);
    }

    @Test
    void test2() {
        int result = AlternatingCharacters.alternatingCharacters("BBBBB");
        assertEquals(4, result);
    }

    @Test
    void test3() {
        int result = AlternatingCharacters.alternatingCharacters("ABABABAB");
        assertEquals(0, result);
    }

    @Test
    void test4() {
        int result = AlternatingCharacters.alternatingCharacters("BABABA");
        assertEquals(0, result);
    }

    @Test
    void test5() {
        int result = AlternatingCharacters.alternatingCharacters("AAABBB");
        assertEquals(4, result);
    }
}