package search;

//  https://www.hackerrank.com/challenges/ctci-ice-cream-parlor

import java.util.Arrays;

import utils.BinarySearch;

class IceCreamParlor {

    static void whatFlavors(int[] cost, int money) {
        int[] copy = Arrays.copyOf(cost, cost.length);
        Arrays.sort(copy);

        for (int i = 0; i < cost.length; i++) {
            int remainingMoney = money - cost[i];
            if(BinarySearch.find(copy, remainingMoney)){
                for (int j = i + 1; j < cost.length; j++) {
                    if(cost[j] == remainingMoney){
                        System.out.print((i + 1) + " " + (j + 1));
                        return;
                    }
                }
            }
        }
    }
}
