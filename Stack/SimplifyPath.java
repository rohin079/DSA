package Stack;

public class SimplifyPath {
    public static void main(String[] args) {

        String str = "/home/user/Documents/../Pictures";

        String arr[] = str.split("/");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ":" + arr[i]);
        }
        System.out.println(" ");
    }
}
