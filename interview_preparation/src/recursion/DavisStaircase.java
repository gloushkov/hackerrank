package recursion;

//  https://www.hackerrank.com/challenges/ctci-recursive-staircase

class DavisStaircase {

    static int stepPerms(int n) {
        return countStepsMemo(n);
    }

    static int countStepsRecursively(int n) {
        if (n == 1 || n == 0) return 1;
        if (n < 0) return 0;

        return countStepsRecursively(n - 1) + countStepsRecursively(n - 2) + countStepsRecursively(n - 3);
    }

    static int countStepsMemo(int n) {
        return countStepsMemo(n, new int[n + 1]);
    }

    static int countStepsMemo(int n, int[] memo) {
        if (n < 0) return 0;
        if (n == 0 || n == 1) return 1;

        if (memo[n] == 0) {
            memo[n] = countStepsMemo(n - 1, memo) + countStepsMemo(n - 2, memo) + countStepsMemo(n - 3, memo);
        }

        return memo[n];

    }
}
