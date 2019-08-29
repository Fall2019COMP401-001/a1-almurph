package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// creating customers
		int totalCustomers;
		totalCustomers = scan.nextInt(); 
		
	
		// for loop to cycle through the customers
		for (int i=0; i<totalCustomers; i++) {
			char firstName = scan.next().charAt(0); //first initial
			String lastName = scan.next(); //last name
			
			int numItems = scan.nextInt(); 
			Double totalCost = 0.0; //initializing total cost of items to be 0
			
			for (int j=0; j<numItems; j++) {
				int totalItems = scan.nextInt(); 
				scan.next(); //looking up the name of the item
				double price = scan.nextDouble(); //declaring the price variable as a decimal
				totalCost += totalItems * price; // 
				
			}
		System.out.println(firstName + ". " + lastName + ": " + String.format("%.2f", totalCost));
		
	}
	
	scan.close(); 


	}
}
