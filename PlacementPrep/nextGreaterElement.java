import java.util.Arrays;

public class nextGreaterElement {

    public static void main(String[] args) {

        int arr[] = { 1, 5, -3, 7, 1 };

        int newarr[] = new int[arr.length];

        Arrays.fill(newarr, -1);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    newarr[i] = arr[j];
                    break;
                }

            }

        }

        for (int k = 0; k < newarr.length; k++) {
            System.out.print(newarr[k] + " ");
        }

    }
}
