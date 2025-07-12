/* from programming exercises -- 9.7 */

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private java.util.Date dateCreated = new Date();

    // no arg constuctor 
    public Account(){

    }
    // constructor creates Account with id and intial balance
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    
    // accessor method for reading id 
    public int getId (){
        return id;
    }
    
    // accessor method for reading balance
    public double getBalance(){
        return balance;
    }

    // accessor method for reading annual interest rate
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    // accessor method for reading date
    public java.util.Date getDateCreated(){
        return dateCreated;
    }  
    
    // mutator method for id
    public void setId(int id){
        this.id = id;
    }
    
    // mutator method for balance
    public void setBalance(double balance){
        this.balance = balance;
    }

    // mutator method for annual interest rate
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    // method for returning monthly interest rates
    public double getMonthlyInterest(){
        double MonthlyInterest = annualInterestRate/12;
        return MonthlyInterest;

    }

    // method for withdrawing from the balance
    public void withdraw(double amount){
        balance -= amount;
    }

    // method for depositing to the balance
    public void deposit(double amount){
        balance += amount; 
    }


}

