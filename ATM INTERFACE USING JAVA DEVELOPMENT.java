import java.util.Scanner;

class BankAccount {
    // Instance variable to store the balance
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);  
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount); 
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    // Method to check the current balance
    public void checkBalance() {
        System.out.println("Your current balance is: " + balance); 
    }
}

class ATM {
    private BankAccount account;

    // Constructor to initialize the ATM with a BankAccount
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Method to show the ATM options
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw:");  
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit:");  
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you for using our service.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}

public class Dharmendra_task3_questions {
    public static void main(String[] args) {
        // Initialize the bank account with an initial balance
        BankAccount account = new BankAccount(500);  // Just kept balance ₹1000 in the Back account
        ATM atm = new ATM(account);  // Initialize the ATM with the user's bank account

        // Display the ATM menu and allow the user to interact with it
        atm.showMenu();
    }
}
