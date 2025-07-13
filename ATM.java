import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating accounts with IDs 0–9 and balance $100
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        while (true) {
            System.out.print("Enter an ID (0–9): ");
            int id = scanner.nextInt();

            if (id < 0 || id >= accounts.length) {
                System.out.println("Invalid ID. Try again.");
                continue;
            }

            Account current = accounts[id];

            // Main menu
            while (true) {
                System.out.println("\nMain menu:");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance: $" + current.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = scanner.nextDouble();
                        current.withdraw(withdraw);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double deposit = scanner.nextDouble();
                        current.deposit(deposit);
                        break;
                    case 4:
                        System.out.println("Logged out.\n");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }

                if (choice == 4) break;
            }
        }
    }
}
