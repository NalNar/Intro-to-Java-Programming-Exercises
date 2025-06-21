public class LinearSearch {
    public static void main(String[] args) {
        // implementing linear search

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random()*100);
        }
        System.out.print("Enter the number you want to find(1 to 100): ");
        
        // using input to find the number
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int find = scanner.nextInt();

        
        boolean found = false;
   
        for (int i = 0; i < numbers.length; i++) {
            if (find == numbers[i]) {
                System.out.println("Found " + find + " at index " + i);
                found = true;
                break;
            }
        }
        // if found is false then output
        if (found == false) {
            System.out.println(find + " not found.");
        }
    scanner.close();
    }
}
