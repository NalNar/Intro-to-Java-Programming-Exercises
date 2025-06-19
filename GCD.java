/* program is for find the greatest common divisor amongst two intgers*/
public class GCD{
// main method
    public static void main(String[]args){
        // user input for dividend and divisor
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter your dividend: ");
        int dividend = input.nextInt();
        System.out.print("Enter your divisor: ");
        int divisor = input.nextInt();

        System.out.println("The Greatest Common Divisor is: " + gcd(dividend, divisor));
        
    } 

    public static int gcd(int dividend, int divisor) {
        // logic behind finding the greatest common divisor, comes from listing 6.6
        int gCd = 1;
        int k = 2;

        while (k <= dividend && k<= divisor){
            if (dividend % k == 0 && divisor % k == 0){
                gCd = k;
            }
            k++;
        }


        return (gCd);

    } 
}