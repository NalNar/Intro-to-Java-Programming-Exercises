// From listing 13.1
public abstract class GeometricObject{
    private String color = "white";
    private boolean filled; 
    private java.util.Date dateCreated;
    
    /* Construct default geometric object */
    protected GeometricObject(){
        dateCreated = new java.util.Date();
    }

    /* Construct a filled geometric object */
    protected GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    /* Return color */
    public String getColor(){
        return color;
    }

    /* Set a new color */
    public void setColor(String color){
        this.color = color;
    }

    /* Set a new filled */
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    /* Get date created */
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString(){
        return "Created on" + dateCreated + "\ncolor: " + color + "and filled: " + filled;
    }

    /** Abstract method get area */
    public abstract double getArea();

    /** Abstract method get perimeter */
    public abstract double getPerimeter();

}