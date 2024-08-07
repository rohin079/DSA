
public class subArray {
    public static void SubArray(int arr[]) {

        int target = 6;
        int maxsum = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;

                int sum = 0;

                for (int k = start; k <= end; k++) {
                    
                    sum += arr[k];
                }

                System.out.println();
                if (sum > maxsum) {
                    maxsum = sum;
                }

            }

        }
        if (maxsum == target) {
            System.out.print("true");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3 };

        SubArray(arr);
    }

}
