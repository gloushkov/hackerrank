package sorting;

//  https://www.hackerrank.com/challenges/ctci-bubble-sort

class BubbleSort {

    static int countSwaps(int[] a) {
        int swaps = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j);
                    swaps++;
                }
            }
        }
        return swaps;
    }

    private static void swap(int[] arr, int i) {
        int temp = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = temp;
    }
}
