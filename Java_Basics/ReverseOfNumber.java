//calcuate reverse of a given number

//Any number divided by 10 will give its last digit as the remainder

// to remove the last digit of any number, divide it by 10.

// public class ReverseOfNumber {
//     public static void main(String[] args) {

//     int num = 102432;

//     while(num > 0){

//         System.out.print(num%10); 
//         num = num / 10;
//     }
        
//     }
    
// }

// reverse the given number: 

public class ReverseOfNumber {
    public static void main(String[] args) {

    int num = 102432;
    int reverse = 0;

    while(num > 0){
        
        int lastdigit = (num%10);
        
        reverse = (reverse * 10) + lastdigit;
        num = num / 10;

    }

    num = reverse;
    System.out.println(num);
        
    }
    
}