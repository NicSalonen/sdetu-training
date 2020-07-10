package OOP;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creates new bank account >> think instantiate an object
		
		bankAccount acc1 = new bankAccount();
		acc1.accountNum = "123456";
		// acc1.routingNum = "123";
		
		// acc1.name = "Raf Bloch"; poor practice, too many different ways to define name
		// With encapsulation
		acc1.setName("Raf Bloch");
		System.out.println(acc1.getName());
		
		acc1.setSsn("420");
		System.out.println("SSN: " + acc1.getSsn());
		acc1.balance = 10000;
		acc1.deposit(1500);
		acc1.withdraw(-6000);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		acc1.setRate();
		acc1.increaseRate();
		
		// Polymorphism through overloading		
		bankAccount acc2 = new bankAccount("Checking account");
		acc2.accountNum = "234567";
		acc2.checkBalance();
		
		bankAccount acc3 = new bankAccount("Savings Account", 5000);
		acc3.accountNum = "345678";
		acc3.checkBalance();
/*
		// Demo for inheritance
		CDaccount cd1 = new CDaccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juli";
		cd1.accountType = "CD account";
		System.out.println(cd1.toString());
		cd1.compound();
		
		//System.out.println(acc1.routingNum); // Will be the same due to static final
		//System.out.println(acc2.routingNum);
		//System.out.println(acc3.routingNum);
*/	}

}
