/* Creating a program to display character's ASCII code */

import java.util.Scanner;

public class Question4_8{
    public static void main(String[] args) {
        // creating the scanner object 
        Scanner scan = new Scanner(System.in);
        
        // inputting the character from the user
        System.out.print("Enter a Character: ");
        
        // As there is not direct method for inputting a char, need to use string then .charAt
        String letter = scan.nextLine();

        // extracting the char from the string
        char cLetter = letter.charAt(0);

        // explicitly casting the integer value of the character
        int numLetter = (int) cLetter;

        System.out.printf("The ASCII code for the character is: %d ", numLetter);

        // to negate the resource leak
        scan.close();

    }
}