package hashmaps;

//  https://www.hackerrank.com/challenges/sherlock-and-anagrams

import java.util.Arrays;
import java.util.HashMap;

class SherlockAndAnagrams {

    static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> anagrams = new HashMap<>();

        int totalAnagrams = 0;

        //get all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                char[] chars = substring.toCharArray();
                Arrays.sort(chars);

                String key = String.valueOf(chars);

                int count = anagrams.getOrDefault(key, 0);
                if(count > 0) {
                    totalAnagrams+=count;
                    anagrams.put(key, ++count);
                } else {
                    anagrams.put(key, 1);
                }
            }
        }

        return totalAnagrams;
    }
}
