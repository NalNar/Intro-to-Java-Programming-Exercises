public class QuotientWithMethod {

    public static int Quotient(int num1, int num2){
        if (num2 == 0){
            System.out.println("Divisor cannot be 0");
            System.exit(1);
        }
        return num1/num2;
    }

    public static void main(String[]args){
        // Invoking the method
        System.out.println(Quotient(1,0));

    }
}
