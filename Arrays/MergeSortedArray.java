package Arrays;

import java.util.*;

class MergeSortedArray {
    
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i <= nums2.length - 1; i++) {

            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
        return nums1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 0, 0, 0 };

        int arr2[] = { 2, 5, 6 };

        int finalarr[] = merge(arr, 3, arr2, 3);
        
        for (int i = 0; i < finalarr.length; i++) {
            System.out.print(finalarr[i]);
        }

    }

}