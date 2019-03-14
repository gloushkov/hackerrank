package sorting;

//  https://www.hackerrank.com/challenges/mark-and-toys

import java.util.Arrays;

class MarkAndToys {

    static int maximumToys(int[] prices, int k) {
        //todo implement sorting yourself!
        Arrays.sort(prices);
        int toysBought = 0;
        int totalPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            totalPrice += prices[i];
            if(totalPrice > k) break;
            toysBought++;
        }

        return toysBought;
    }
}
