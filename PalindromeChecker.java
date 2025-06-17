public class PalindromeChecker {
    public static void main(String[] args) {
        // goal is to check first and last character, then second and second last, and so on match

        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();

        // goal is to have a while loop until string exists
        
        int low = 0;
        int high = input.length()-1;

        // assume entered string is a palindrome
        boolean isPalindrome = true;

        // loop until low is less than high
        while(low<high){
            if (input.charAt(low) != input.charAt(high)){
                isPalindrome = false;
                break;
            }
        low ++; // increment low pointer
        high --; // decrement high pointer

        }

        if (isPalindrome){
            System.out.printf("The %s is a palindrome.",input);
        } else {
            System.out.printf("The %s is not a palindrome.",input);
        }


    scan.close();
    }
    
}
