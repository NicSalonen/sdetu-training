package OOP;

public class CDaccount extends bankAccount implements IRate {

	String interestRate;
	
	void compound() {
		System.out.println("Compounding interest");
	}
	
}
