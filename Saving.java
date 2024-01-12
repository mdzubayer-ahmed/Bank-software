/**
 * Saving Class maintains the withdrwal from Chequing Account.
 *
 * @author Md. Zubayer Ahmed
 * @version 2023-11-16
 */
public class Saving extends Account {
    private static final double eachTimeCharge = 3.90d;

    // Constructors
    public Saving() {
        super();
    }

    public Saving(String userName) {
        super(userName);
    }

    //Saving account withdrawal
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
            balance -= eachTimeCharge;
            System.out.println("Service charge applied: $" + eachTimeCharge);
        } 
        else {
            System.out.println("Insufficient funds!");
            System.out.println("Failed to withdraw. Current balance: $" + balance);
        }
    }
}