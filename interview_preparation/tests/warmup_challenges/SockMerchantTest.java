package warmup_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SockMerchantTest {

    @Test
    void test1() {
        int[] socks = new int[] {10,20, 20, 10, 10, 30, 50, 10, 20};
        int pairs = SockMerchant.solution(socks);
        assertEquals(3, pairs);
    }

    @Test
    void test2() {
        int[] socks = new int[] {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int pairs = SockMerchant.solution(socks);
        assertEquals(4, pairs);
    }
}