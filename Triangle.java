public class Triangle extends GeometricObjects{
    /* Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of a triangle. */

    // datafields
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // A no-arg constructor that creates a default triangle
    public Triangle(){

    }
     
    /* A constructor that creates a triangle with the specified side1, side2, and side3. */

    public Triangle(double side1, double side2, double side3, String color, boolean filled ){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    /* The accessor methods for all three data fields.*/
    
    // get method for side1
    public double getSide1(){
        return side1;
        
    }
    
    // get method for side2
    public double getSide2(){
        return side2;
    }
    
    // get method for side3
    public double getSide3(){
        return side3;
    }
    
    // set method for side 1
    public void setSide1(double side1){
        this.side1 = side1;
    }

    // set method for side 2
    public void setSide2(double side2){
        this.side2 = side2;

    }

    // set method for side 3
    public void setSide3(double side3){
        this.side3 = side3;
    }

    /* A method named getArea() that returns the area of this triangle.*/

    // area = √(s(s - side1)(s - side2)(s - side3)
    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        double innerCal = s*((s-side1)*(s-side2)*(s-side3));
        return Math.sqrt(innerCal);

    }
    
    // A method named getPerimeter() that returns the perimeter of this triangle.
    public double getPerimeter(){
        return side1+side2+side3;
    }
    
    @Override
    // A method named toString() that returns a string description for the triangle.
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}