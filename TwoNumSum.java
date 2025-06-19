public class TwoNumSum{
    // main method
    public static void main(String[] args){
        // making a method to sum number , from initial to final num
        // test program would be twoSum(int1, int2) for eg twoSum(1,3) = 1+2+3 = 6
        java.util.Scanner scan = new java.util.Scanner(System.in);
        // reading in the input from the user
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        // closing the scanner to avoid resource leak
        scan.close();
        // calling the method   
        int result = twoSum(num1,num2);
        System.out.printf("The sum from %d to %d is %d ",num1,num2,result);
    }
    // two sum - method definition
    public static int twoSum(int num1, int num2){
        int result = 0;
        for (int i = num1; i <=  num2; i++){
            result = i+result;
        }
        return result; // return the result of the sum
    }





}

