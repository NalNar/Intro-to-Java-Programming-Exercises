/* Write a program that displays all the prime num-
bers less than 120 in decreasing order. Use the StackOfIntegers class to
store the prime numbers (e.g., 2, 3, 5, . . . ) and retrieve and display them in
reverse order. */

public class DisplayPrimeNumbers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        // Push prime numbers less than 120 into the stack
        for (int i = 2; i < 120; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }

        // Pop and print in reverse (decreasing order)
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
