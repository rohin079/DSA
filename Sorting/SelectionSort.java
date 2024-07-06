package Sorting;

//Take out unsorted part and put it on sorted part by taking out the smallest number each time
//Time complexity = O(n^2)

public class SelectionSort {

    public static void sortArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }

                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
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
