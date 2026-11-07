public class Customer extends User {
 
    private CheckingAccount checking;
    private SavingsAccount savings;
 
    public Customer() {
        this("Alice", "0000");
    }
 
    public Customer(String userName, String PIN) {
        setUserName(userName);
        setPIN(PIN);
        checking = new CheckingAccount();
        savings = new SavingsAccount();
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
        return getUserName() + " - Checking: " + checking.getBalanceString()
                + ", Savings: " + savings.getBalanceString();
    }
}
