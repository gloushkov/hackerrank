package strings;

//  https://www.hackerrank.com/challenges/ctci-making-anagrams

class MakingAnagrams {

    static int makeAnagram(String a, String b) {
        int[] frequencyArray = new int[26];

        for (char c : a.toCharArray()) {
            frequencyArray[c - 'a']++;
        }

        for (char c : b.toCharArray()) {
            frequencyArray[c - 'a']--;
        }

        int deletions = 0;
        for (int charFrequency : frequencyArray) {
            deletions += Math.abs(charFrequency);
        }

        return deletions;
    }

    //Working but HashMap is an overkill

//    static int makeAnagram(String a, String b) {
//        HashMap<Character, Integer> charMapA = getCharMap(a);
//        HashMap<Character, Integer> charMapB = getCharMap(b);
//        int deletions = 0;
//
//        for(Map.Entry<Character, Integer> charEntry : charMapA.entrySet()){
//            char key = charEntry.getKey();
//            deletions += Math.max(0, charEntry.getValue() - charMapB.getOrDefault(key, 0));
//        }
//        for(Map.Entry<Character, Integer> charEntry : charMapB.entrySet()){
//            char key = charEntry.getKey();
//            deletions += Math.max(0, charEntry.getValue() - charMapA.getOrDefault(key, 0));
//        }
//
//        return deletions;
//    }
//
//    private static HashMap<Character, Integer> getCharMap(String input) {
//        HashMap<Character, Integer> charMap = new HashMap<>();
//        for (int i = 0; i < input.length(); i++) {
//            char currentChar = input.charAt(i);
//            charMap.putIfAbsent(currentChar, 0);
//            Integer charCount = charMap.get(currentChar);
//            charMap.put(currentChar, ++charCount);
//        }
//        return charMap;
//    }
}
