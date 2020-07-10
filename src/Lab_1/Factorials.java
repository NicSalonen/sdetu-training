package Lab_1;

public class Factorials {

	public static void main(String[] args) {
		
		int n = 5;
		System.out.println("The factorial of " + n + " is " + fac(n));

	}
	
	public static int fac(int value) {
		if (value == 0 || value == 1) {
			return 1;
		}
		else if (value == 2) {
			return 2;	
		}
		else {
			return value*fac(value-1);
		}
	}
}
