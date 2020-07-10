package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Create variable to define career
	
		// Declare variable
		String career;
		System.out.println("Program is starting");
		
		//Define a variable
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		//Declare and Define
		
		int hoursperweek = 40;
		int weeksperyear = 50;
		double rate = 42.50;
		
		double salary = hoursperweek*weeksperyear*rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
		
		// Compute annual salary
		// rate*hoursperweek*weeksperyear
	}
}