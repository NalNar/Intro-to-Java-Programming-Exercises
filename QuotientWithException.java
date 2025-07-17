public class QuotientWithException {
    public static int quotient(int num1,int num2){
        if (num2==0){
            throw new ArithmeticException("Divisor cannot be 0");
        }
        return num1/num2;
    }

    public static void main(String[]args){
        java.util.Scanner scanner = new java.util.Scanner (System.in);

        // user input 
        System.out.print("1st Integer ");
        int num1 = scanner.nextInt();

        System.out.print("2nd Integer ");
        int num2 = scanner.nextInt();

        try{
            int output = quotient(num1, num2);
            System.out.println(num1 + " / " + num2 + " = " + output);
        }
        catch(ArithmeticException ex){
            System.out.println("\"Exception: an integer \" +\n" + "cannot be divided by zero \"); ");
        }
        System.out.println("Execution continues ...");
    }
    
}
