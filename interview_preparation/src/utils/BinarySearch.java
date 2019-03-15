package utils;

/**
 * Created by Ognian Gloushkov on 2019-03-15.
 */

public class BinarySearch {
    public static boolean find(int[] input, int target) {
        return findRecursive(input, target, 0, input.length - 1);
    }

    private static boolean findRecursive(int[] input, int target, int left, int right) {
        if (left > right) return false;

        int mid = (left + right) >>> 1;

        if (input[mid] == target) return true;

        if (target < input[mid]) {
            return findRecursive(input, target, left, mid - 1);
        } else {
            return findRecursive(input, target, mid + 1, right);
        }
    }

    public static int findIndex(int[] input, int target) {
        return findIndexRecursive(input, target, 0, input.length - 1);
    }

    private static int findIndexRecursive(int[] input, int target, int left, int right) {
        if (left > right) return -1;

        int mid = (left + right) >>> 1;

        if (input[mid] == target) return mid;

        if (target < input[mid]) {
            return findIndexRecursive(input, target, left, mid - 1);
        } else {
            return findIndexRecursive(input, target, mid + 1, right);
        }
    }
}
