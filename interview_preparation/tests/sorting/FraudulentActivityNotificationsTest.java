package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-17.
 */
class FraudulentActivityNotificationsTest {

    @Test
    void test1() {
        int[] input = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        int result = FraudulentActivityNotifications.activityNotifications(input, 5);
        assertEquals(2, result);
    }

    @Test
    void test2() {
        int[] input = {1, 2, 3, 4, 4};
        int result = FraudulentActivityNotifications.activityNotifications(input, 4);
        assertEquals(0, result);
    }

    @Test
    void test3() {
        int[] input = {10, 20, 30, 40, 50};
        int result = FraudulentActivityNotifications.activityNotifications(input, 3);
        assertEquals(1, result);
    }

}
