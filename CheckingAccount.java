import java.io.Serializable;
import java.util.Scanner;

public class CheckingAccount implements HasMenu, Serializable {
    
    private double balance;
    static Scanner input = new Scanner(System.in);
    
    public CheckingAccount() {
        this.balance = 0;
    }
 
    public CheckingAccount(double balance) {
        this.balance = balance;
    }
 
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.start();
    }
 
    @Override
    public String menu() {
        System.out.println("Account Menu");
        System.out.println("0) quit\n1) check balance\n2) make a deposit\n3) make a withdrawal");
        System.out.print("Please enter a number 0-3: ");
        return input.nextLine().trim();
    }
 
    @Override
    public void start() {
        string choice = ""
        while ( choice != "0" ){
            choice = menu()
            switch (choice) {
                case "1" -> checkBalance();
                case "2" -> makeDeposit();
                case "3" -> makeWithdrawal();
                default -> System.out.println("Invalid choice.");
            }
        }
    }
 
    public double getBalance() {
        return balance;
    }
 
    public String getBalanceString() {
        return String.format("$%.2f", balance);
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }
 
    public void checkBalance() {
        System.out.println("Checking balance...");
        System.out.println("Current balance: " + getBalanceString());
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
