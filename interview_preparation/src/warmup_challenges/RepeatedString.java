package warmup_challenges;

//  https://www.hackerrank.com/challenges/repeated-string

class RepeatedString {

    static long solution(String s, long n) {

        int[] occurrencesByPosition = new int[s.length()];

        int stringLength = s.length();
        int occurrencesInString = 0;
        for (int i = 0; i < stringLength; i++) {
            if (s.charAt(i) == 'a') {
                occurrencesInString++;
            }
            occurrencesByPosition[i] = occurrencesInString;
        }

        if (n % stringLength == 0) {
            return occurrencesInString * (n / stringLength);
        } else {
            return (occurrencesInString * (n / stringLength)) + occurrencesByPosition[(int) (n % stringLength - 1)];
        }
    }
}
