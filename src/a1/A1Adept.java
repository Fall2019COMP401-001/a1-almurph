package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numItems = scan.nextInt();  // counts number of items in store
		
		String[] storeItems = new String[numItems]; // array of the names of items in the store
		Double[] storePrices = new Double[numItems]; // array of the price of each item in the store
	
		for (int i = 0; i<numItems; i++) {
			storeItems[i] = scan.next(); 
			storePrices[i] = scan.nextDouble(); // for loop that cycles through the items in the store
		}
		
		
		
	}
}
