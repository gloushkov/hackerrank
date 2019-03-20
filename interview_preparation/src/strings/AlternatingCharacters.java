package strings;

//  https://www.hackerrank.com/challenges/alternating-characters

class AlternatingCharacters {

    static int alternatingCharacters(String s) {
        int deletions = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(i + 1 < s.length()) {
                if(s.charAt(i+1) == c) deletions++;
            }
        }

        return deletions;
    }
}
