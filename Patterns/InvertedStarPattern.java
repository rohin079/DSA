package Patterns;

public class InvertedStarPattern {
    public static void main(String[] args) {
        int num = 40;

        for(int i = num; i>= 1; i--){
            for (int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
