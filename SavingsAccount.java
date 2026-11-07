public class SavingsAccount extends CheckingAccount {
 
    private double interestRate = 0.02;
 
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.start();
    }
 
    public void calcInterest() {
        setBalance(getBalance() + getBalance() * interestRate);
    }
 
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
 
    public double getInterestRate() {
        return interestRate;
    }
}
