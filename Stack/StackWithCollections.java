package Stack;

import java.util.Stack;

public class StackWithCollections {
    public static class StackB {
        public static void main(String[] args) {

            Stack s = new Stack<>();

            s.push(5);
            s.push(7);
            s.push(8);

            while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
        }

    }
}
