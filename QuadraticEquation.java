public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // getter method for a
    public double getA(){
        return a;
    }

    // method for getting b
    public double getB(){
        return b;
    }
    
    // method for getting c
    public double getC(){
        return c;
    }
    
    // method for calculating the discriminant
    public double getDiscriminant(){
        return b * b - 4 * a * c;

    }
    // method for getting the first root
    public double getRoot1(){
        double discriminant = getDiscriminant();
        if (discriminant>=0){
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            return r1;
        } else {
            return 0;
        }
    }

    // method for getting the second root
    public double getRoot2(){
        double discriminant = getDiscriminant();
        if (discriminant>=0){
            double r2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            return r2;
        } else {
            return 0;
        }
    }
}
