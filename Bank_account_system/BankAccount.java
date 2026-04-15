import java.util.Scanner;

// BankAccount class
public class BankAccount {

    // Private balance variable
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal failed: Insufficient balance");
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking initial balance input
        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        // Creating object
        BankAccount account = new BankAccount(initialBalance);

        // Simulating transactions
        account.deposit(500);
        account.withdraw(300);

        // Display final balance
        System.out.println("Final Balance: " + account.getBalance());

        
    }
}