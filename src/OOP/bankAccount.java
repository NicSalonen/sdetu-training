package OOP;

public class bankAccount implements IRate {

	// Define variables
	String accountNum;
	
	// static >> belongs to CLASS not OBJECT instance
	// final >> constant, cannot change (often as static final)
	
	private static final String routingNum = "013456"; // belongs to class, cannot be changed and only accessed within private field within class
	
	// Instance variables 
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions - unique methods
		// 1. Used to define or setup or initialize properties of an object
		// 2. Constructors are IMPLICITLY called upon INSTANTIATION
		// 3. The same name as the class itself
		// 4. Constructors have NO return type
	bankAccount() {
		System.out.println("New account created");
		}
	// Overloading: call same method name with different arguments
	bankAccount(String accountType) {
		System.out.println("New account: " + accountType);
	}
	
	bankAccount(String accountType, double initDeposit) {
		// initDeposit, accountType, Msg, are all local variables, exist within the block
		System.out.println("New account: " + accountType);
		System.out.println("Intial deposit of $: " + initDeposit);
		String Msg = null; // or "";
		if (initDeposit < 1000) {
			Msg = "ERROR: minimum deposit must be at least $1000";
			System.out.println(Msg);
		} else {
			Msg = "Thank you for your initial deposit of $" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;

	}
	
	// Getters / Setters
	
	// Allow user to define name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// Interface methods
	public void setRate() {
		
	}
	
	public void increaseRate() {
		
	}
	// Define methods
	public void deposit(double amount) { // Available to client
		balance = balance + amount;
		showActivity("DEPOSIT of $" + amount);
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAWAL of $" + amount);
	}
	
	 // Private: Can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your new balance is: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance is $" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "; Account # " + accountNum + "; Routing # " + routingNum + "; Current balance: $" + balance + "]"; 
	}
}

