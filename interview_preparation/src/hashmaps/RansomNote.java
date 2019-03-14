package hashmaps;

//  https://www.hackerrank.com/challenges/ctci-ransom-note

import java.util.HashMap;

class RansomNote {

    static boolean checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> availableWords = new HashMap<>();

        for(String s: magazine) {
            if(availableWords.get(s) == null) {
                availableWords.put(s, 1);
            } else {
                int count = availableWords.get(s);
                availableWords.put(s, ++count);
            }
        }

        for(String s: note) {
            if(!availableWords.containsKey(s)) return false;

            int count = availableWords.get(s);
            if(count == 0) return false;
            availableWords.put(s, --count);

        }

        return true;
    }
}
