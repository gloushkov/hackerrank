package arrays;

//  https://www.hackerrank.com/challenges/new-year-chaos

class NewYearChaos {

    static void minimumBribes(int[] q) {

        int bribes = 0;

        for (int i = q.length - 1; i >= 0; i--) {
            int originalPosition = q[i];

            if (originalPosition - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }

            //cheated for that part!
            for (int j = Math.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i]) bribes++;

        }

        System.out.println(bribes);
    }
}
