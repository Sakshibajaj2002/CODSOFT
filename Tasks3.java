import java.util.Scanner;

// BankAccount class representing user's bank account
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit amount into account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    // Method to withdraw amount from account and minimum ammount should be 500$
    public void withdraw(double amount) {
        if ((balance-500) >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient balance. Minimum balance in account should be of 500$. Withdrawal failed.");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }
}

// ATM class representing the ATM machine
public class Tasks3 {
    private BankAccount bankAccount;  

    // Constructor
    public Tasks3(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Method to display options and perform actions based on user input
    public void displayOptions() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    bankAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Your current balance is: $" + bankAccount.checkBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Main method to test the ATM functionality
    public static void main(String[] args) {
        // Create a bank account with initial balance
    	
// assuming the initial opening account balance is 1000$ and also assuming minimum account balance should be 500$. 
        BankAccount account = new BankAccount(1000.0);
        // Create an ATM instance
        Tasks3 atm = new Tasks3(account);
        // Display ATM options
        atm.displayOptions();
    }
}
