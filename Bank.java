/**
 * Bank Class maintains Bank name, Account name, account numbers,and display all/specific user details
 *
 * @author Md. Zubayer Ahmed
 * @version 2023-11-16
 */
import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Account> accounts;

    // Constructor-1
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Constructor-2
    public Bank(String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }

    // Add account
    public void add(Account a) {
        accounts.add(a);
    }

    // Display full list of accounts
    public void display() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Accounts:");
        for (Account account : accounts) {
            System.out.println("User Name: " + account.getUserName());
            System.out.println("Balance: $" + account.getBalance());
            if (account instanceof Saving) {
                System.out.println("Account Type: Saving");
            } 
            else if (account instanceof Cheque) {
                System.out.println("Account Type: Cheque");
            }
            System.out.println("------------");
        }
    }

    // Display account list and details of specific user
    public void display(String userName) {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Accounts for user: " + userName);
        for (Account account : accounts) {
            if (account.getUserName().equals(userName)) {
                System.out.println("User Name: " + account.getUserName());
                System.out.println("Balance: $" + account.getBalance());
                if (account instanceof Saving) {
                    System.out.println("Account Type: Saving");
                } 
                else if (account instanceof Cheque) {
                    System.out.println("Account Type: Cheque");
                }
                System.out.println("------------");
            }
        }
    }
}