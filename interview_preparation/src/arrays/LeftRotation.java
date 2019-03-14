package arrays;

//  https://www.hackerrank.com/challenges/ctci-array-left-rotation

class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        int[] rotated = new int[a.length];

        for(int i = d; i < a.length; i++) {
            rotated[i-d] = a[i];
        }

        for (int i = 0; i < d; i++) {
            rotated[a.length - d + i] = a[i];
        }

        return rotated;
    }
}
