package hashmaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-14.
 */
class RansomNoteTest {

    @Test
    void test1() {
        String[] magazine = new String[] {"give", "me", "one", "grand", "today", "night"};
        String[] note = new String[] {"give", "one", "grand", "today"};
        boolean result = RansomNote.checkMagazine(magazine, note);

        assertEquals(true, result);
    }

    @Test
    void test2() {
        String[] magazine = new String[] {"two", "times", "three", "is", "not", "four"};
        String[] note = new String[] {"two", "times", "two", "is", "four"};
        boolean result = RansomNote.checkMagazine(magazine, note);

        assertEquals(false, result);
    }

}