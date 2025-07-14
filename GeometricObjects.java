public class GeometricObjects {
    
    // datafields
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated; 

    //  Default constructor
    public GeometricObjects(){
        dateCreated = new java.util.Date();
    }

    // Constuctor with specified color and filled value 
    public GeometricObjects(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    // return color
    public String getColor(){
        return color;
    }
    // return filled, as filled is a boolean type, its get filled would be 'is filled'
    public boolean isFilled(){
        return filled;
    }

    // setter / mutator method for color
    public void setColor(String color){
        this.color = color;
    }
    
    // mutator for filled
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    // Get date created
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    // to string method for representing the object
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

}
