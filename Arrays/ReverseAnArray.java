package Arrays;

public class ReverseAnArray {
    public static int BinarySearching(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] > key) {
                end = mid - 1;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 4, 5, 7 };
        int key = 7;

        System.out.println(BinarySearching(arr, key));

    }
    
}
