public class UnspecifiedSum{
    public static void main(String[]args){
        // scanner object
        java.util.Scanner scan = new java.util.Scanner(System.in);

        // reading in the input from the user
        System.out.print("Let's Start Summation, Enter an integer: ");
        int input = scan.nextInt();

        // sentinel value of 0, when user enters 0 it ends the loop and prints the sum
        int sum = 0; // initialize the sum

        do{
            System.out.print("Enter an integer (0 to exit): ");
            input = scan.nextInt();
            sum += input;

        } while(input!=0);

        System.out.printf("The sum is %d ",sum);
        
    }
}