package Lab_1;

import java.util.Random;

public class arrayCalc {

	public static void main(String[] args) {
		// Specify length of array 
		int arrayLength = 10;
		
		// Generate random array
		Random rd = new Random(); // creating Random object
	    int[] rdArray = new int[arrayLength];
	    for (int i = 0; i < rdArray.length; i++) {
	       rdArray[i] = rd.nextInt(10); // storing random integers in an array
	       System.out.print(rdArray[i] + "; "); // printing each array element
	      }
	    System.out.println(minValue(rdArray) + " is the minimum value of the array.");
	    System.out.println(maxValue(rdArray) + " is the maximum value of the array.");
	    System.out.println(avgArray(rdArray) + " is the average value of the array.");
	   }
	
	public static int minValue(int[] inArray) {
		int minVal = inArray[0];
		for (int i = 0; i < inArray.length; i++) {
			if (inArray[i] < minVal) {
				minVal = inArray[i];
			}
		}
		return minVal;
		
	}
	public static int maxValue(int[] inArray) {
		int maxVal = inArray[0];
		for (int i = 0; i < inArray.length; i++) {
			if (inArray[i] > maxVal) {
				maxVal = inArray[i];
			}
		}
		return maxVal;
	}
	
	public static double avgArray(int[] inArray) {
		double SUM = 0;
		for (int i : inArray) {
			SUM += i;
			System.out.println(SUM);
		}
		return SUM/inArray.length;	
	}
}


