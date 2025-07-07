public class Rectangle{
    double width = 1.0;
    double height = 1.0;

    // default constructor 
    public Rectangle(){

    }
    
    // constuct the rectangle object
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    // the method for get area using the Instance variables 
    public double getArea(){
        return width*height;

    }
    
    // the method for get perimeter using the Instance variables 

    public double getPerimeter(){
        return 2*(width+height);
        
    }
}