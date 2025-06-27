public class Question5_29 {
        public static void main(String[] args) {        
/*  logic: to generate the caldendar, need to check whether the year is a leap year or not
    * if it is a leap year, then February has 29 days, otherwise it has 28 days
    * then need to check the first day of the year, and based on that, need to print the calendar
    * 
    * the calendar will be printed in a 7x6 grid, where each cell represents a day of the month
    if the first day is tuesday then it will start from tuesday and then print the rest of the days accordingly
    * the row would have 7-firsday columns, and the column would have 6 rows

 */

        // making a program to generate calender based on year and which day is first tuesday of the year
        
        // input 
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // year input
        System.out.println("Welcome to the Calendar Program!");
        System.out.print("Enter the year: ");
        int year= input.nextInt();

        // day input for the first day of the year
        System.out.print("Enter the first day of the year, 0 for Sunday .. 6 for Saturday: ");
        int firstDay = input.nextInt();

        
        // validating both of the inputs for generating the calender
        if (year > 0 && firstDay >= 0){
                
                // creating a row and column for the calendar
                for (int month = 1 ; month<=12; month++){
                    int numDays = 0;

                // using switch and month as the case for printing the months
                switch(month){
                    case 1: System.out.printf("\nJanuary %d\n",year);
                            numDays = 31;
                             break;

                    case 2: System.out.printf("\nFebuary %d\n",year);
                        // leap year check using ternary operator
                        numDays = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28);
                         break;

                    case 3: System.out.printf("\nMarch %d\n",year); 
                            numDays = 30;
                             break;

                    case 4: System.out.printf("\nApril %d\n",year); 
                            numDays = 31;
                            break;

                    case 5: System.out.printf("\nMay %d\n",year); 
                            numDays = 30;
                            break;

                    case 6: System.out.printf("\nJune %d\n",year);
                            numDays = 31;
                            break;

                    case 7: System.out.printf("\nJuly %d\n",year); 
                            numDays = 31;
                            break;

                    case 8: System.out.printf("\nAugust %d\n",year);
                            numDays = 31;
                            break;
                    case 9: System.out.printf("\nSeptember %d\n",year); 
                            numDays = 30;
                            break;

                    case 10: System.out.printf("\nOctober %d\n",year); 
                            numDays = 31;
                            break;

                    case 11: System.out.printf("\nNovember %d\n",year); 
                            numDays = 30;
                            break;

                    case 12: System.out.printf("\nDecember %d\n",year); 
                            numDays = 31;
                            break;

                }
                
                // Print calendar header
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");

                for (int days = 1; days <= numDays; days++) {
                    System.out.printf("%4d", days);
                    if ((days + firstDay) % 7 == 0) {
                        System.out.println(); // new week
                    } 
                }


                System.out.println(); // spacing between months

                // Update the first day for next month
                firstDay = (firstDay + numDays) % 7;

            
            }
            
                            



        } else {
            // error message if inputs are invalid
            System.out.println("Invalid input. Please enter a valid year and first day of the year");
        }


    }
    
}


