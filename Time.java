public class Time{
    private int hour;
    private int minute;
    private int second;

    // no arg construtor that creates the time object for the current time, using the system current time in milliseconds, the current time since epoch.
    public Time(){
        setTime(System.currentTimeMillis());
    }
    
    // constructor for Time object with a specified elapsed time
    public Time(long elapsedTime){
        setTime(elapsedTime);
    }
    
    // constructor for Time object with a specified hour, minute,and second
    public Time(long hour, long minute, long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    // accesor method for getting hour, minute,and seconds
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    //  sets a new time for the object using the elapsed time
    public void setTime(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        this.second = (int)(totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;
        this.minute = (int)(totalMinutes % 60);

        long totalHours = totalMinutes / 60;
        this.hour = (int)(totalHours % 24);  // 24-hour format
    }

     @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}