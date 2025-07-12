/* Write a test program that creates an Account object with an account ID of 1122, a
balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw method
to withdraw $2,500, use the deposit method to deposit $3,000, and print the bal-
ance, the monthly interest, and the date when this account was created. */

public class TestAccount {
    public static void main(String[] args){
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.deposit(3000);
        account.withdraw(2500);

        double balance = account.getBalance();
        double IR = account.getMonthlyInterest();
        System.out.println("The account balance is: "+ balance + "\n" +
                            "The account was created on: " + "\n" +
                            account.getDateCreated() + "\n" +
                            "The monthly interest rate is: " + IR );
    }
    
}
