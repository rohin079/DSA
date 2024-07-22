package Stack;

import java.util.*;

public class NextGreaterElement {

    public static void main(String[] args) {

        int arr[] = {6, 8, 0, 1, 3};

        Stack<Integer> s = new Stack<>();
        int nextGreaterElement[] = new int[arr.length];

        for(int i = arr.length -1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextGreaterElement[i] = -1;
            }

            else{
                nextGreaterElement[i] = arr[s.peek()];
        }

            s.push(i);

    }

    for(int i=0; i<nextGreaterElement.length; i++){
        System.out.print(nextGreaterElement[i] + " ");
    }
}
}
