package Arrays;

public class SubArray {
    public static void PrintSubArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for(int k=start; k<end; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
          System.out.println();
        }

    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 4, 5, 7, 54 };
 
        PrintSubArray(arr);

    }
    
}
