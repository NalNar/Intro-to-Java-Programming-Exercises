/* listing 12.2, Exception handling with if*/

public class QuotientWithIf{
    public static void main(String[]args){
        
        // taking input of two integers and display their quotient
        java.util.Scanner input = new java.util.Scanner (System.in);
        
    
        System.out.print("Enter First Integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        int number2 = input.nextInt();

        // simple exception handling with a if statement
        if (number2!=0)
        System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
        else
            System.out.println("Divisor can't be ZERO(0)");
    }
}