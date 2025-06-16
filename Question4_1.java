import java.util.Scanner;

public class Question4_1{
    public static void main(String[] args){
        // writing a program to find area of a pentagon

        Scanner input = new Scanner(System.in);
        
        // Input -> length from the center of the pentagon to vertex, which is the radius
        System.out.print("Enter the length from the center to a vertex: ");
        double radius = input.nextDouble();

        // declaring pi, also can use Math.PI
        final double PI = 3.14159265;

        // first need to find the side (s) using the formula 2r*sin(pi/5)
        double s = ((2*radius) * Math.sin(PI/5));

        // calculating the area of the pentagon, from the formula 5s^2 / 4*TAN(pi/5)
        double area = (5 * Math.pow(s,2)) / (4 * Math.tan(PI/5));
        System.out.printf("The area of the pentagon is %.2f " , area);
        

    }
}