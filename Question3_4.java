
public class Question3_4{
    public static void main (String[] args){

        // Creating a program to generate and display months at random, from using math.random

        // creating 1 to 12 random number
        int numMonth = (int) (Math.random() * (12) + 1) ; // * using the general formula math.random() * (max - min + 1) + min
        String month = "";
    
        // now assigning each month to the number
        switch (numMonth) {
            case 1: 
                month = "January";
                break;
            case 2: 
                month = "February";
                break;
            case 3: 
                month = "March";
                break;
            case 4: 
                month = "April";
                break;
            case 5: 
                month = "May";
                break;
            case 6: 
                month = "June";
                break;
            case 7: 
                month = "July";
                break;
            case 8: 
                month = "August";
                break;
            case 9: 
                month = "September";
                break;
            case 10: 
                month = "October";
                break;
            case 11: 
                month = "November";
                break;
            case 12: 
                month = "December";
                break;


        }
        System.out.println(numMonth + " Month is "+ month);


    }
}
