public class PrintMax {
    public static void main(String[] args) {
        printMax(new double [] {32.1,3.2,3.33,4.3});
    }
    public static void printMax(double... numbers){
        if (numbers.length ==0){
            System.out.println("No Argument Passed!");
        }
        //// if the said number is larger than the first number in the array then result = numbers 
        double results = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if(numbers[i] > results){ 
                results = numbers[i];
            }

        }
    System.out.print("the largest number is " + results);
    }

}
