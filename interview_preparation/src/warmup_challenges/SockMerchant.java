package warmup_challenges;

//  https://www.hackerrank.com/challenges/sock-merchant

import java.util.HashMap;
import java.util.Map;

class SockMerchant {

    static int solution(int[] ar) {
        HashMap<Integer, Integer> socks = new HashMap<>();

        for (int color : ar) {
            if (socks.get(color) == null) {
                socks.put(color, 1);
            } else {
                int count = socks.get(color);
                count++;
                socks.put(color, count);
            }
        }

        int pairs = 0;
        for (Map.Entry<Integer, Integer> sockColors : socks.entrySet()) {
            pairs += sockColors.getValue() / 2;
        }

        return pairs;
    }
}
