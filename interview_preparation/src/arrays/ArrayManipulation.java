package arrays;

//  https://www.hackerrank.com/challenges/crush

class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {
        
        // Solution cheated from discussion board.
        // Instead of modifying the array with values, we set the query increments as borders to the positions.
        
        long[] array = new long[n + 1];
        
        long maxValue = Long.MIN_VALUE;
        
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int start = query[0];
            int end = query[1];
            int incrementValue = query[2];
            
            array[start - 1] += incrementValue;
            array[end] -= incrementValue;
        }

        long temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp+=array[i];
            if(temp>maxValue) maxValue = temp;
        }

        return maxValue;
    }

    //Trivial, but too slow

//    static long arrayManipulation(int n, int[][] queries) {
//        long[] array = new long[n];
//        long maxValue = Long.MIN_VALUE;
//
//        for (int i = 0; i < queries.length; i++) {
//            int[] query = queries[i];
//            int start = query[0];
//            int end = query[1];
//            int incrementValue = query[2];
//            for(int j = start - 1; j < end; j++) {
//                array[j] += incrementValue;
//                if(array[j] > maxValue) maxValue = array[j];
//            }
//        }
//
//        return maxValue;
//    }
}
