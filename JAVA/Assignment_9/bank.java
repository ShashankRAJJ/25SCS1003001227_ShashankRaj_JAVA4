class BankAccount {
    // Instance variables
    int accountNumber;
    String accountHolderName;
    double balance;
    // Static variable
    static double interestRate = 5.0;
    // Constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    // Method to display account details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("----------------------------");
    }
}
public class bank{
    public static void main(String[] args) {
        // Creating three bank accounts
        BankAccount a1 = new BankAccount(101, "Rahul", 50000);
        BankAccount a2 = new BankAccount(102, "Priya", 75000);
        BankAccount a3 = new BankAccount(103, "Amit", 60000);
        System.out.println("Before Changing Interest Rate:");
        a1.displayDetails();
        a2.displayDetails();
        a3.displayDetails();
        // Changing static interest rate using class name
        BankAccount.interestRate = 6.5;
        System.out.println("\nAfter Changing Interest Rate:");
        a1.displayDetails();
        a2.displayDetails();
        a3.displayDetails();
    }
}