package hashmaps;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Created by Ognian Gloushkov on 2019-03-14.
 */
class CountTripletsTest {

    @Test
    void test1() {
        ArrayList<Long> input = new ArrayList<>();
        input.add(1L);
        input.add(2L);
        input.add(2L);
        input.add(4L);

        int r = 2;
        long result = CountTriplets.countTriplets(input, r);

        assertEquals(2, result);
    }

    @Test
    void test2() {
        ArrayList<Long> input = new ArrayList<>();
        input.add(1L);
        input.add(3L);
        input.add(9L);
        input.add(9L);
        input.add(27L);
        input.add(81L);

        int r = 3;
        long result = CountTriplets.countTriplets(input, r);

        assertEquals(6, result);
    }

    @Test
    void test3() {
        ArrayList<Long> input = new ArrayList<>();
        input.add(1L);
        input.add(5L);
        input.add(5L);
        input.add(25L);
        input.add(125L);

        int r = 5;
        long result = CountTriplets.countTriplets(input, r);

        assertEquals(4, result);
    }

}