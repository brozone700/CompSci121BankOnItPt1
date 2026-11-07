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
        boolean Keepgoing = true;
        while (Keepgoing){
            string choice = menu();
            switch (choice) {
                case "0" -> Keepgoing = false;
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
        return input.nextDouble();
    }

    public void makeDeposit() {
        System.out.println("Making a deposit...");
        System.out.print("How much to deposit? ");
        double amount = getDouble();
        setBalance(getBalance() + amount);
        System.out.println("New balance: " + getBalanceString());
    }

    public void makeWithdrawal() {
        System.out.println("Making a withdrawal...");
        System.out.print("How much to withdraw? ");
        double amount = getDouble();
        setBalance(getBalance() - amount);
        System.out.println("New balance: " + getBalanceString());
    }
}
