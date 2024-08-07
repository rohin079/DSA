import java.util.*;

public class nextgreaterOptimized {
    public static void main(String[] args) {

        int arr[] = { 1, 5, -3, 7, 1 };

        Stack<Integer> st = new Stack<>();

        int newarr[] = new int[arr.length];

        Arrays.fill(newarr, -1);

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                newarr[st.pop()] = arr[i];
            }

            st.push(i);

        }

        for (int k = 0; k < newarr.length; k++) {
            System.out.print(newarr[k] + " ");
        }

    }
}
