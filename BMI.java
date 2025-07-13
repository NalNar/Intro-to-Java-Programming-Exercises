/** Construct a BMI with the specified name, age, weight,feet,
    and inches public BMI(String name, int age, double weight, double feet,
double inches) */
public class BMI {
    private int age;
    private String name;
    private double feet;
    private double weight;
    private double height;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    // constructor
    public BMI(String name, int age, double weight, double feet,double inches){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.height = height;
    }
    
    // constuctor with height

    public BMI(String name, double weight, double height){
        this(name, 20 , weight , height);
    }

    public double getBMI(){
        double bmi = weight * KILOGRAMS_PER_POUND / 22 ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }
}
