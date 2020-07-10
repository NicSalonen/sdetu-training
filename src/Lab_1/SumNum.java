package Lab_1;

public class SumNum {

	public static void main(String[] args) {
		
		// Print sum of numbers 1 to n
		int n = 10;
		System.out.println("The sum of numbers 1 to " + n + " is " + numSum(n));
				
	}
		
	public static int numSum(int value) {
		int[] temp = new int[value];
		for (int x = 0; x < value; x++) {
			temp[x] = x + 1;
			//System.out.print(temp[x] + "; ");
		}
		int SUM = 0;
		for (int i : temp) {
			SUM += i;
		}
		return SUM;	
	}

}
