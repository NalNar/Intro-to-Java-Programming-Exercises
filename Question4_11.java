/* Writing a program to get input a binary and ouput the equivalent decimal value */
public class Question4_11 {
    public static void main(String[] args) {
        // scanner to get input from user
        java.util.Scanner scan = new java.util.Scanner(System.in);

        // binary input from the user 
        System.out.print("Enter binary digits (0000 to 1111): ");
        String binaryNumber = scan.nextLine();

        // extracting the digits from the binary number
        char n1 = binaryNumber.charAt(0);
        char n2 = binaryNumber.charAt(1);
        char n3 = binaryNumber.charAt(2);
        char n4 = binaryNumber.charAt(3);

        /*  getting the integer value of from char
        by subtracting the '0' which has the ASCII value of 48, this would give the value of the said integer
        */

        int i1 = n1 - '0';
        int i2 = n2 - '0';
        int i3 = n3 - '0';
        int i4 = n4 - '0';

        // as for binary is 2^3,2^2,2^1,2^0 
        int decimal = i1 * 8 + i2 * 4 + i3 * 2 + i4 * 1; 

        System.out.printf("The decimal value is: %d  ", decimal );

        

        
    }
}
