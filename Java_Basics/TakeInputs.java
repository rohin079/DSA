//take any input from user using scanner clas

import java.util.Scanner;

public class TakeInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next(); //only captures a single word

        System.out.println(input);

        String input2 = sc.nextLine(); // for taking input and storing an entire line 
        
        System.out.println(input2);

        int input3 = sc.nextInt(); // for taking input of an integer value 
    }  
}