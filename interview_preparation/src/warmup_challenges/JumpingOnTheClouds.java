package warmup_challenges;

//  https://www.hackerrank.com/challenges/jumping-on-the-clouds

class JumpingOnTheClouds {

    static int solution(int[] clouds) {
        int jumps = 0;
        int currentPos = 0;

        int size = clouds.length;

        while (currentPos < size - 1) {
            boolean nextFree = currentPos < size - 1 && clouds[currentPos + 1] == 0;
            boolean afterNextFree = currentPos < size - 2 && clouds[currentPos + 2] == 0;


            if (afterNextFree) {
                currentPos += 2;
            } else if (nextFree) {
                currentPos++;
            }
            jumps++;
        }
        return jumps;

    }
}
