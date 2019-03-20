package strings;

//  https://www.hackerrank.com/challenges/sherlock-and-valid-string

class SherlockAndTheValidString {

    static String isValid(String s) {
        int[] charFrequency = new int[26];


        //[row] holds the number of characters in the frequency group
        // [col] holds the number of groups of such char length
        int[][] frequencyGroups = new int[2][2];

        for (char c : s.toCharArray()) {
            charFrequency[c - 'a']++;
        }

        for (int frequency : charFrequency) {
            if (frequency > 0) {
                if (frequencyGroups[0][0] == 0) {
                    frequencyGroups[0][0] = frequency;
                } else if (frequency != frequencyGroups[0][0] && frequencyGroups[1][0] == 0) {
                    frequencyGroups[1][0] = frequency;
                }

                if (frequency == frequencyGroups[0][0]) {
                    frequencyGroups[0][1]++;
                } else if (frequency == frequencyGroups[1][0]) {
                    frequencyGroups[1][1]++;
                } else {
                    return "NO";
                }
            }
        }

        if (frequencyGroups[0][0] == 0 || frequencyGroups[1][0] == 0) return "YES";

        if ((Math.abs(frequencyGroups[0][0] - frequencyGroups[1][0]) == 1
                && (frequencyGroups[0][1] == 1 || frequencyGroups[1][1] == 1))

                || (frequencyGroups[0][0] == 1 && frequencyGroups[0][1] == 1)
                || (frequencyGroups[1][0] == 1 && frequencyGroups[1][1] == 1)) {
            return "YES";
        }

        return "NO";
    }
}
