package Patterns;

public class HollowRectangle {
    public static void main(String[] args) {
        int totalrow = 4;
        int totalcols = 4;

        for(int i = 1; i<= totalrow; i++){
            for (int j=1; j<=totalcols; j++){
                if( i == 1 || i == totalrow || j == 1 || j == totalcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
