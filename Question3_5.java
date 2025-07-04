import java.util.Scanner;

public class Question3_5{

    public static void main(String[] args) {
        
        // creating an object for inputting 
        Scanner input = new Scanner(System.in);

        //today is 0 for Sunday... 6 for Saturday 
        System.out.print(
        "Enter today's day of the week, for Sunday it is 0 and for Saturday it is 6: ");
        
        int todayDay = input.nextInt();

        //Enter the number of days you want the day for, eg 3, 6.
        System.out.print("Enter the day elapsed since today: ");
        int elapsedDay = input.nextInt();

        // future day would generate the day it is (todayday + afterday) remainder after dividing by 7
        int futureDay = (todayDay + elapsedDay) % 7;
        
        // output string fDay 
        String fDay = "";


        // having a switch statement for printing the future days
        switch(futureDay){
            case 0:
                
                fDay = "Sunday";
                break;

            case 1: 
                fDay = "Monday";
                break;
            
            case 2:
                fDay = "Tuesday";
                break;
            
            case 3:
                fDay = "Wednesday";
                break;

            case 4:
                fDay = "Thursday";
                break;

            case 5:
                fDay = "Friday"; 
                break;

            case 6:
                fDay = "Saturday";
                break;
            
        }

        // having a similar days for today, to print in the same format as the book

        String tDay = "";

        switch(todayDay){
            case 0:
                
                tDay = "Sunday";
                break;

            case 1: 
                tDay = "Monday";
                break;
            
            case 2:
                tDay = "Tuesday";
                break;
            
            case 3:
                tDay = "Wednesday";
                break;

            case 4:
                tDay = "Thursday";
                break;

            case 5:
                tDay = "Friday"; 
                break;

            case 6:
                tDay = "Saturday";
                break;
            
        }




        // output
        System.out.println("Today is " + tDay + " and future day is " + fDay);





    }
}
