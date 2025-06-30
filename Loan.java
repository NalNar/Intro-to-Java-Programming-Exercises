/* Replica of the code provided in the listing 10.2 */

public class Loan{
    private double annualInterestRate;
    private int numYears;
    private double loanAmount;
    private java.util.Date loanDate;    

    // default constructor
    public Loan() {
        this(2.5 , 1 , 1000);
    }

    // construct a loan with a specified annual interest rate, number of years, and loan amount
    public Loan(double annualInterestRate, int numYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numYears = numYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }
    // return annual interest rate
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public int getNumberOfYears(){
        return numYears;
    }


    public void setNumberOfYears(int numYears){
        this.numYears = numYears;
    }
    public double getLoanAmount(){
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate /1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - ( 1 / Math.pow(1 + monthlyInterestRate, numYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numYears * 12;
        return totalPayment;
    }
    public java.util.Date getLoanDate(){
        return loanDate;

    }
} 
