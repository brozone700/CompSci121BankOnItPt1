/**
 * A bank customer with one checking and one savings account.
 */
public class Customer extends User {

    private CheckingAccount checking;
    private SavingsAccount savings;

    public Customer() {
        // TODO: create the accounts; default to user "Alice" with PIN "0000"
    }

    public Customer(String userName, String PIN) {
        // TODO: create the accounts and set userName and PIN
    }

    public static void main(String[] args) {
        // TODO: create a Customer, call login(), then start() if it succeeds
    }

    @Override
    public String menu() {
        // TODO: print the Customer Menu (0 Exit, 1 Checking, 2 Savings, 3 change PIN)
        return "";
    }

    @Override
    public void start() {
        // TODO: loop on menu(); route to checking.start(), savings.start(), changePIN()
    }

    public void changePIN() {
        // TODO: prompt for a new PIN and call setPIN
    }

    @Override
    public String getReport() {
        // TODO: return the user name and both balances as a string
        return "";
    }
}
