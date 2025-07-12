public class Fan{
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST =3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    /*  The accessor and mutator methods for all four data fields. */
    
    // get method for speed
    public int getSpeed(){
        return speed;
    }
    // set method for speed
    public void setSpeed(int speed){
        this.speed = speed;
    }

    // get method for on
    public boolean getOn(){
        return on;
    }
    
    // set method for speed
    public void setOn(boolean on){
        this.on = on;
    }


    // get method for radius
    public double getRadius(){
        return radius;
    }
    
    // set method for radius
    public void setRadius(int radius){
        this.radius = radius;
    }
    
    // get method for color
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
 
 
    // A no-arg constructor that creates a default fan
    public Fan(){

    }

/*  A method named toString() that returns a string description for the fan. If
    the fan is on, the method returns the fan speed, color, and radius in one com-
    bined string. If the fan is not on, the method returns the fan color and radius
    along with the string “fan is off” in one combined string. 
*/

    public String toString(){
        
        if (on) {
        return "Fan is on\nSpeed: " + speed + "\nColor: " + color + "\nRadius: " + radius;
    
    } else {
        return "Fan is off\nColor: " + color + "\nRadius: " + radius;
    }

    }

}