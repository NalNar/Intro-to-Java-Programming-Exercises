/* listing 12.1, Exception handling */

public class Quotient{
    public static void main(String[]args){
        
        // taking input of two integers and display their quotient
        java.util.Scanner input = new java.util.Scanner (System.in);
        
    
        System.out.print("Enter First Integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        int number2 = input.nextInt();

        System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));

    }
}