public class MultiplicationTables{
    
    public static void main(String[] args) {

        // welcome message
        System.out.println("Welcome to the Multiplication Tables Program!");
        System.out.println("This program will display multiplication tables from 1 to your chosen value.");

        // enter last value for the table
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the final value you want the tables for: ");
        int endValue = input.nextInt();

        // print header row
        System.out.printf("%4s", ""); // empty corner
        for (int j = 1; j <= endValue; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println();

        // print separator line
        System.out.print("    "); // align with header
        for (int j = 1; j <= endValue; j++) {
            System.out.print("----");
        }
        System.out.println();

        // print table rows
        for (int i = 1; i <= endValue; i++) {
            System.out.printf("%3d|", i); // row label
            for (int j = 1; j <= endValue; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        input.close();
    }
}