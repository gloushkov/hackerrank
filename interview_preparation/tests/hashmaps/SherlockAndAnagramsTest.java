package hashmaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-14.
 */
class SherlockAndAnagramsTest {

    @Test
    void test1(){
        int result = SherlockAndAnagrams.sherlockAndAnagrams("abba");
        assertEquals(4, result);
    }

    @Test
    void test2(){
        int result = SherlockAndAnagrams.sherlockAndAnagrams("abcd");
        assertEquals(0, result);
    }

    @Test
    void test3(){
        int result = SherlockAndAnagrams.sherlockAndAnagrams("ifailuhkqq");
        assertEquals(3, result);
    }

    @Test
    void test4(){
        int result = SherlockAndAnagrams.sherlockAndAnagrams("kkkk");
        assertEquals(10, result);
    }

    @Test
    void test5(){
        int result = SherlockAndAnagrams.sherlockAndAnagrams("cdcd");
        assertEquals(5, result);
    }
}