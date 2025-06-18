public class Question5_1 {
    public static void main(String[] args) {
        // Program for checking whether the user has passed the course
        java.util.Scanner input = new java.util.Scanner(System.in);
        
    

        while(true) {
            System.out.print("Enter your score: ");
            int score = input.nextInt(); // input
            
            if (score >= 60) {
                System.out.println("YOU PASSED!!");
            } else {
                System.out.println("You Did'nt Passed!");
            }

            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
                break; // Exit the loop if the score is invalid
            }

        } 
        input.close();

    }
}