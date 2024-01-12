/**
 * Account Class stores customer account number, user name, and balance.
 *
 * @author Md. Zubayer Ahmed
 * @version 2023-11-16
 */
import java.util.Random;

abstract class Account {
    protected int accountNumber;
    protected String userName;
    protected double balance;

    //Constructor-1
    public Account() {
        Random rand = new Random();
        accountNumber = rand.nextInt(10000);
        userName = "Default";
        balance = 0.00d;
    }

    //Constructor-2
    public Account(String userName) {
        Random rand = new Random();
        accountNumber = rand.nextInt(10000);
        this.userName = userName;
        balance = 0.00d;
    }

    //Display details
    public void display() {
        System.out.println("Account Information:");
        System.out.println("User Name: " + userName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited. Current balance " + balance);
    }

    // Abstract Withdraw function
    abstract void withdraw(double amount);

    // Get Balance
    public double getBalance() {
        return balance;
    }

    // Get Username
    public String getUserName() {
        return userName;
    }
}
