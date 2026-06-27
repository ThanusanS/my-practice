// Task: Java Encapsulation - BankAccount class

public class BankAccount {

    // Private attributes (Encapsulation)
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Getter and Setter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money (only if sufficient balance)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Balance             : " + balance);
    }

    // Main method
    public static void main(String[] args) {

        // Create BankAccount object
        BankAccount account = new BankAccount();

        // Set account details using setter methods
        account.setAccountNumber("ACC-1001");
        account.setAccountHolderName("Thanu");
        account.setBalance(0);

        // Deposit 5000
        account.deposit(5000);

        // Withdraw 2000
        account.withdraw(2000);

        // Display updated account details
        System.out.println("\nUpdated Account Details:");
        account.displayAccountDetails();
    }
}
