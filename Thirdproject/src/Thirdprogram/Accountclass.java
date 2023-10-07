package Thirdprogram;

public class Accountclass {
    private double balance;

    // Constructor with no arguments, initializes balance to 0.0
    public Accountclass() {
        this.balance = 0.0;
    }

    // Constructor with two arguments to set the initial balance
    public Accountclass(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Creating instances of Account with different constructors
        Accountclass account1 = new Accountclass();          // Using the no-argument constructor
        Accountclass account2 = new Accountclass(1000.0);    // Using the constructor with an initial balance of 1000.0

        // Depositing and withdrawing from accounts
        account1.deposit(500.0);
        account2.withdraw(200.0);

        // Printing current balances
        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());
    }
}
