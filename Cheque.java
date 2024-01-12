/**
 * Cheque Class maintains the withdrwal from Chequing Account
 *
 * @author Md. Zubayer Ahmed
 * @version 2023-11-16
 */
public class Cheque extends Account {
    private static final double minBalance = 1000;
    private static final double overLimitCharge = 5;

    // Constructors
    public Cheque() {
        super();
    }

    public Cheque(String userName) {
        super(userName);
    }

    // Chequing account withdrawal
    public void withdraw(double amount) {
        double withdrawLimit = balance - minBalance;
        if (withdrawLimit >= amount) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn. No fees Charged. Remaining Balance " + balance);
        } 
        else {
            System.out.println("Insufficient funds!");
            if (balance < minBalance) {
                System.out.println("Applying over-limit charge: $" + overLimitCharge);
                balance -= overLimitCharge;
            }
            System.out.println("Failed to withdraw. Current balance: $" + balance);
        }
    }
}