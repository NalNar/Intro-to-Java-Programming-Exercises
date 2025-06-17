public class UnspecifiedSum{
    public static void main(String[]args){
        // scanner object
        java.util.Scanner scan = new java.util.Scanner(System.in);

        // reading in the input from the user
        System.out.print("Let's Start Summation, Enter an integer: ");
        int input = scan.nextInt();

        // sentinel value of 0, when user enters 0 it ends the loop and prints the sum
        int sum = 0; // intinilize the sum

        while(input!= 0){
            sum += input;
            // read the integer
            System.out.print("Enter an integer (0 to exit): ");
            input = scan.nextInt();

        }
        System.out.printf("The sum is %d.0 ",sum);
        
    }
}