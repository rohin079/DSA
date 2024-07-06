package Arrays;
public class BinarySearch{
    public static int BinarySearching(int arr[], int key){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid]> key){
                return 
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        
    }

}