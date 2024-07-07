package Sorting;

//insertion sort works by inserting the current element from unsorted part in thwir correct position in the sorted part. Shifts the number greater than the current number to right

//Best video: https://www.youtube.com/watch?v=0lOnnd50cGI

//time complexity = O(n^2)

public class InsertionSort {
    public static void sortArray(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            //finding out the current position to insert the element from the unsorted array
            while( prev>=0 && arr[prev]> curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 4, 2, 7, 3 };

        sortArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
