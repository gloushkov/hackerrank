package hashmaps;

//  https://www.hackerrank.com/challenges/two-strings

import java.util.HashSet;
import java.util.Set;

class TwoStrings {

    static String twoStrings(String s1, String s2) {
        Set<Character> letters = new HashSet<>();

        for(char c : s1.toCharArray()){
            letters.add(c);
        }

        for(char c: s2.toCharArray()){
            if(letters.contains(c)) return "YES";
        }

        return "NO";
    }

}
