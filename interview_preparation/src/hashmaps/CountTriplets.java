package hashmaps;

//  https://www.hackerrank.com/challenges/count-triplets-1

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CountTriplets {

    static long countTriplets(List<Long> arr, long r) {
        //todo fix wrong results. Test case 10 in hacker rank

        HashMap<Long, Long> items = new HashMap<>();

        int triplets = 0;
        for (long number : arr) {

            long count = items.getOrDefault(number, 0L);
            if (count > 0L) {
                items.put(number, ++count);
            } else {
                items.put(number, 1L);
            }
        }

        for (Map.Entry<Long, Long> entry : items.entrySet()) {
            long i = entry.getKey();
            long js = items.getOrDefault(i * r, 0L);
            long ks = items.getOrDefault(i * r * r, 0L);

            triplets += entry.getValue() * js * ks;
        }

        return triplets;
    }

    //Too slow

//    static long countTriplets(List<Long> arr, long r) {
//
//        int triplets = 0;
//        for (int i = 0; i < arr.size() - 2; i++) {
//            for (int j = i + 1; j < arr.size() - 1; j++) {
//                for (int k = j + 1; k < arr.size(); k++) {
//                    if(arr.get(i) * r == arr.get(j) && arr.get(j) * r == arr.get(k)) triplets++;
//                }
//            }
//        }
//
//        return triplets;
//    }
}
