public class Factors{
    
    // data fields
    private int number;
    private int[] factors;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    // no arg constructor
    public Factors(){

    }

    // constructor 
    public Factors(int number){
        factors = new int[DEFAULT_CAPACITY];
        this.number = number;
        computeFactor();
    }


    /* Logic for computing the factor 
    First handles the easy case: factors of 2 120 → 60 → 30 → 15 (now not divisible by 2 anymore) 
    Then starts checking odd numbers (i = 3, 5, 7)
    If 15 % 3 = 0 --> 3 is a factor Then pushes. 
    Stops when no more division is possible. Each time it finds a factor, it pushes it into the factors array */


    public void computeFactor(){
        while(number % 2 == 0){
            push(2);
            number = number/2;
        }
        // i += 2 means incrementing in odd number 2n+1
        for (int i = 3; i < number; i+= 2){
            while (number % i == 0) {
                push(i);
                number = number/i;
            }
        }
    }

    // method for pushing from listing 10.8
    private void push(int value) {
        if (size >= factors.length) {
            int[] temp = new int[factors.length * 2];
            System.arraycopy(factors, 0, temp, 0, factors.length);
            factors = temp;
        }
            factors[size++] = value;
    }

    // method for printing in descending order
    public void printFactorsDescending() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }
    
}