public class TestLoan {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // input the annual interest rate
        System.out.print(
            "Enter Annual Interest: ");
        double annualInterestRate = input.nextDouble();

        // enter the number of years
        System.out.print(
            "Enter Nmbers of Years "
        );
        int numYears = input.nextInt();

        // enter the loan amount 
        System.out.print("Enter Your Loan Amount: ");
        double loanAmount = input.nextDouble();

        // create a loan object
        Loan loan = new Loan(annualInterestRate , numYears , loanAmount);

        // output the loan date, monthly payment, and total payment
        System.out.printf(
            "The loan was created on %s\n" + 
            "The monthly payment is %.2f\n The total payment is %.2f\n", 
            loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());


    }

}

