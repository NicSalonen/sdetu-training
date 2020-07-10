package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the two previous Fibonnaci numbers
		// Fib(0) = 0
		// Fib(1) = 1
		// Fib(2) = Fib(1) + Fib(0) = 1
		System.out.println(fib(6));
		
	}
	
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		
		else if (n == 1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}
}
