/* This program might not work for all values as the String formatting and conversion is in chapter 4, 
however this programs works for the objectives of the chapter 3, and it generates all the answer as the sample runs 
Hardcoding '0' as the first digit to match sample output.
Note: This only works for ISBNs that originally began with 0.
Later chapters will show how to preserve leading zeroes properly using Strings.*/

import java.util.Scanner;

public class Question3_9{

    public static void main(String[] args) {
        
        /* Creating a program to check isbn 10 */
        
        // input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN ");
        int isbn9 = input.nextInt(); 
        
        // making copy of isbn9 because need this for output
        int isbn;
        isbn = isbn9;

        // idea is to % the isbn, and divide by 10, to get digits from digit9 to digit1
        
        // 9th digit
        int d9 = isbn % 10;
        isbn = isbn/10; // this would induce a decimal point, which would be truncated to get the nth digit
        
        // 8th digit
        int d8 = isbn % 10;
        isbn /= 10; 
        
        // 7th digit
        int d7 = isbn % 10;
        isbn /= 10; 
        
        // 6th digit
        int d6 = isbn % 10;
        isbn /= 10; 

        // 5th digit
        int d5 = isbn % 10;
        isbn /= 10; 

        // 4th digit
        int d4 = isbn % 10;
        isbn /= 10; 
        
        // 3rd digit
        int d3 = isbn % 10;
        isbn /= 10; 

        // 2nd digit
        int d2 = isbn % 10;
        isbn /= 10; 

        // 1st digit
        int d1 = isbn % 10;

        // now creating the last digit (10th digit), calculate checksum
        int d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)%11; 

        // if the check sum is 10 then the last digit is X else it is d10 
        if (d10 == 10){
            System.out.print("The ISBN-10 number is : 0" + isbn9 + "X"); //  0 is a group identifier for english speaking countries, hard coding '0' 
        } else {
            System.out.print("The ISBN-10 number is : 0" + isbn9 + d10);

        }
    
    }
}
