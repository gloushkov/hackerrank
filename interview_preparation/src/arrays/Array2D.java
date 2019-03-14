package arrays;

//  https://www.hackerrank.com/challenges/2d-array

class Array2D {

    static int solution(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length - 2; row++) {
            for (int col = 0; col < arr[row].length - 2; col++) {
                int hourglasssSum =
                        arr[row][col] + arr[row][col + 1] + arr[row][col + 2] +
                                arr[row + 1][col + 1] +
                                arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
                if (hourglasssSum > maxSum) maxSum = hourglasssSum;
            }
        }
        return maxSum;
    }
}
