import java.util.Scanner;

public class Main {

    static double balance = 1000.00;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double amount;

        while (true) {
            // ATM menu
            System.out.println("\nATM Menu");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Balance: $" + balance);
            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                amount = input.nextDouble();
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposited: $" + amount);
                } else {
                    System.out.println("Invalid amount.");
                }
            } else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ");
                amount = input.nextDouble();
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawn: $" + amount);
                } else {
                    System.out.println("Insufficient balance or invalid amount.");
                }
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }

        input.close();
    }
}
