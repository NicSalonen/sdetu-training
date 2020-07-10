package Lab_1;

public class BankAccountApp {

	public static void main(String[] args) {
		bankAccount acc1 = new bankAccount("469329874", 1000.50);
		//bankAccount acc2 = new bankAccount("469327574", 1300);
		//bankAccount acc3 = new bankAccount("875329874", 2600);
		
		acc1.setName("Jimbo");
		System.out.println(acc1.getName());
		acc1.makeDeposit(550);
		acc1.payBill(1200);
		acc1.makeDeposit(2399);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class bankAccount implements iInterest {
	// Properties of bank account
	private static int ID = 1000; // Internal ID
	private String accountNumber; // ID + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "0045400657";
	private String name;
	private String SSN;
	private double balance;
	
	// Constructors
	public bankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0,2);
		System.out.println("You account number is: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
		}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill of $" + amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit made of $" + amount);
		showBalance();
	}
	public void showBalance() {
		System.out.println("Your balance is $" + balance);
	}
	public void accrueInterest() {
		
	}

	@Override
	public void accrue() {
		balance = balance*(1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n[Balance: $" + balance + "]";
	}
}


