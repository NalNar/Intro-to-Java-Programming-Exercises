public class test{
    public static void main(String[]args){
        // creating a class of circle with input parameter as radius
        double radius = 10;
        Circle circle = new Circle(radius);
        System.out.print("The area of the circle is " + circle.getArea() + " and radius is " + circle.radius);
    }
}

class Circle{
    double radius;
    
    //  constructor with default radius of 1 
    Circle(){
        radius = 1;
    }
    //  constructor with specified radius 
    Circle(double radius){
        radius = newRadius;
    }

    // return the area of the circle
    double getArea(){
        return radius * radius * Math.PI;
    }

    // return the perimeter of the circle 
    double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    void setRadius (double radius){
        radius = newRadius;
    }

}