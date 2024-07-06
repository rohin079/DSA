package Arrays;

//BruteForce Method
public class MaxSubArraySum {

    // BruteForce
    // public static int maxSubArraySum(int arr[]) {
    // int currsum = 0;
    // int maxsum = Integer.MIN_VALUE;

    // for (int i = 0; i < arr.length; i++) {
    // int start = i;
    // for (int j = i; j < arr.length; j++) {
    // int end = j;
    // currsum = 0;
    // for (int k = start; k <= end; k++) {
    // currsum = currsum + arr[k];
    // }
    // if (currsum > maxsum) {
    // maxsum = currsum;
    // }
    // }
    // }
    // return maxsum;

    // }

    // Better approach
    // public static int maxSubArraySum(int arr[]) {
    // int currsum = 0;
    // int maxsum = Integer.MIN_VALUE;

    // for (int i = 0; i < arr.length; i++) {
    // currsum = 0;
    // for (int j = i; j < arr.length; j++) {
    // currsum = currsum + arr[j];

    // if (currsum > maxsum) {
    // maxsum = currsum;
    // }
    // }
    // }
    // return maxsum;
    // }

    // optimal - using KADAN's Algorithm
    public static int maxSubArraySum(int arr[]) {

        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currsum = currsum + arr[i];

            if (currsum < 0) {
                currsum = 0;
            }

            maxsum = Math.max(currsum, maxsum);

        }

        return maxsum;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 4, 5, 7, 54 };

        System.out.print(maxSubArraySum(arr));

    }
}
