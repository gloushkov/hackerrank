package warmup_challenges;

//  https://www.hackerrank.com/challenges/counting-valleys

class CountingValleys {

    static int solution(String s) {
        int currentLevel = 0;
        int numberOfValleys = 0;
        boolean inAValley = false;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'U':
                    currentLevel++;
                    if (currentLevel == 0) inAValley = false;
                    break;
                case 'D':
                    currentLevel--;
                    if (currentLevel < 0 && !inAValley) {
                        numberOfValleys++;
                        inAValley = true;
                    }
            }
        }
        return numberOfValleys;
    }
}
