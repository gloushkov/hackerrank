package sorting;

//  https://www.hackerrank.com/challenges/fraudulent-activity-notifications

class FraudulentActivityNotifications {

    static int activityNotifications(int[] expenditure, int d) {

        int notifications = 0;

        int[] frequencyTable = new int[201];

        for (int i = 0; i < d; i++) {
            frequencyTable[expenditure[i]]++;
        }

        for (int i = d; i < expenditure.length; i++) {
            if (expenditure[i] >= findMedian(frequencyTable, d) * 2) notifications++;
            frequencyTable[expenditure[i - d]]--;
            frequencyTable[expenditure[i]]++;
        }

        return notifications;
    }

    /*
        Finds the median of the values in the frequency table.
        If the number of items is odd the median is the value at position (n+1)/2.
        Else if the number of items is even the median is the average of the values at positions n/2 and (n+1)/2.
     */

    private static double findMedian(int[] frequencyTable, int items) {

        int itemCount = 0;
        int median1 = -1;
        int median2 = 0;
        for (int i = 0; i < frequencyTable.length; i++) {
            itemCount += frequencyTable[i];
                if (median1 == -1 && itemCount >= items / 2) {
                    median1 = i;
                }
                if (itemCount >= (items / 2 + 1)) {
                    median2 = i;
                    return (items % 2 == 0) ? (median1 + median2) / 2D : median2;
                }
        }
        return -1;
    }

    //Too slow!

//    static int activityNotifications(int[] expenditure, int d) {
//
//        int notifications = 0;
//
//        for (int i = d; i < expenditure.length; i++) {
//            int[] pastInfo = new int[d];
//            for (int j = 0; j < d; j++) {
//                pastInfo[j] = expenditure[i - d + j];
//            }
//            Arrays.sort(pastInfo);
//            double median;
//            if(d % 2 == 0) {
//                median = (pastInfo[d/2] + pastInfo[d/2 -1]) / 2D;
//            } else {
//                median = pastInfo[d/2];
//            }
//            if(expenditure[i] >= median * 2) notifications++;
//        }
//
//        return notifications;
//    }


}
