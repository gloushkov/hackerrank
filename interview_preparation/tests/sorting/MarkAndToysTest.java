package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-14.
 */
class MarkAndToysTest {

    @Test
    private void test1() {
        int budget = 50;
        int[] toyPrices = new int[] {1, 12, 5, 111, 200, 1000, 10};

        int result = MarkAndToys.maximumToys(toyPrices, budget);
        assertEquals(4, result);
    }

}