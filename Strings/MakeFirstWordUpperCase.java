package Strings;

public class MakeFirstWordUpperCase {
    public static String toUpperCase(String str) {

        char ch = Character.toUpperCase(str.charAt(0));
        StringBuilder sb = new StringBuilder();
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, my name is rohin";

        System.out.println(toUpperCase(str));

    }

}
