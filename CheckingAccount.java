import java.io.Serializable;
import java.util.Scanner;

/**
 * A checking account: a wrapper around a balance with a menu.
 */
public class CheckingAccount implements HasMenu, Serializable {

    private double balance;

    // TODO: decide how to read input (Scanner field, or create one where needed)

    public CheckingAccount() {
        // TODO: set a starting balance of 0
    }

    public CheckingAccount(double balance) {
        // TODO: set the starting balance
    }

    public static void main(String[] args) {
        // TODO: create a CheckingAccount and call start() to test it
    }

    @Override
    public String menu() {
        // TODO: print the account menu, read the choice, return it
        return "";
    }

    @Override
    public void start() {
        // TODO: loop on menu(), call checkBalance/makeDeposit/makeWithdrawal, quit on 0
    }

    public double getBalance() {
        // TODO
        return 0.0;
    }

    public String getBalanceString() {
        // TODO: return balance formatted with String.format, e.g. "$987.66"
        return "";
    }

    public void setBalance(double balance) {
        // TODO
    }

    public void checkBalance() {
        // TODO: print "Checking balance..." and "Current balance: $..."
    }

    private double getDouble() {
        // TODO: read a double from the user; return 0 on bad input (try/catch)
        return 0.0;
    }

    public void makeDeposit() {
        // TODO: print "Making a deposit...", prompt, update balance, show new balance
    }

    public void makeWithdrawal() {
        // TODO: print "Making a withdrawal...", prompt, update balance, show new balance
    }
}
