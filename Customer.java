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
	    Customer customer = new Customer();     // Alice, PIN 0000
	    if (customer.login()) {
	        System.out.println("Login Successful");
	        customer.start();
	    } else {
	        System.out.println("Login Failed");
	    }
	}
 
    @Override
    public String menu() {
		System.out.println("Customer Menu\n");
		System.out.println("0) Exit\n1) Manage Checking Account\n2) Manage Savings Account\n3) Change PIN");
		System.out.print("Please enter a number 0-3: ");
        return input.nextLine().trim();
    }
 
    @Override
    public void start() {
		boolean KeepGoing = true;
		while (KeepGoing){
			string choice = menu();
			switch (choice) {
                case "0" -> KeepGoing = false;
	            case "1" -> {
	                System.out.println("Checking Account");
	                checking.start();
	            }
	            case "2" -> {
	                System.out.println("Savings Account");
	                savings.start();
	            }
	            case "3" -> changePIN();
	            default -> System.out.println("Invalid choice.");
            }
		}
    }
 
    public void changePIN() {
	    System.out.print("Enter new PIN: ");
	    String newPIN = CheckingAccount.input.nextLine().trim();
	    setPIN(newPIN);
	    System.out.println("PIN changed.");
	}
 
    @Override
    public String getReport() {
        return getUserName() + " - Checking: " + checking.getBalanceString()
                + ", Savings: " + savings.getBalanceString();
    }
}
