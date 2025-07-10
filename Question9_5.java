import java.util.GregorianCalendar;

public class Question9_5 {
    public static void main(String[]args){
    GregorianCalendar calendar = new GregorianCalendar();
    
    // displaying the current year, month and day
    System.out.println(calendar.get(GregorianCalendar.MONTH) + "/" 
                        + calendar.get(GregorianCalendar.DAY_OF_MONTH) + "/" 
                        + calendar.get(GregorianCalendar.YEAR));
    
    
    // set the time to 1234567898765L
    
    calendar.setTimeInMillis(1234567898765L);
    
    // after the setting the time
        System.out.println(calendar.get(GregorianCalendar.MONTH) + "/" 
                        + calendar.get(GregorianCalendar.DAY_OF_MONTH) + "/" 
                        + calendar.get(GregorianCalendar.YEAR));

    }
}
