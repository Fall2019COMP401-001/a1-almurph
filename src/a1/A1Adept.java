package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numItems = scan.nextInt();  // counts number of items in store
		
		String[] storeItems = new String[numItems]; // array of the names of items in the store
		Double[] storePrices = new Double[numItems]; // array of the price of each item in the store
	
		for (int i = 0; i<storeItems.length; i++) {
			storeItems[i] = scan.next(); 
			storePrices[i] = scan.nextDouble(); // for loop that cycles through the items in the store
		}
		
		int spendsMost = 0; 
		int spendsLeast = 0; 
		
		int numCustomers = scan.nextInt(); // counts the number of customers
		String[] firstName = new String[numCustomers]; // sets up customer first name
		String[] lastName = new String[numCustomers]; // sets up customer last name
		
		// String[] customers = new String[numCustomers]; 
		Double[] amountSpent = new Double[numCustomers]; 
		Double sumForAverage = 0.0; 
		
		// double cost = 0.0; 
		
		for (int i = 0; i < numCustomers; i++) {
			firstName[i] = scan.next(); 
			lastName[i] = scan.next(); 
			// System.out.println(firstName[i]);
			// System.out.println(lastName[i]);

			int numBought = scan.nextInt(); 
			double cost = 0.0; 			
			for (int j = 0; j < numBought; i++) {
				//System.out.println(amountSpent[j]);

				int quantityOfItems = scan.nextInt(); 
				String itemDescription = scan.next(); 
				
				for (int k = 0; k < storeItems.length; k++) {
					if (itemDescription.equals(storeItems[k])) {
						cost += storePrices[k] * quantityOfItems; 
					}
				}
			
			
		
		
		// Customers[] customer = new Customers[numCustomers];
		
//		for (int i=0; i<numCustomers; i++) {
//			Customers people = new Customers();
//			customer[i] = people;
//		}
//		
//		
//		for (int i = 0; i < numCustomers; i++) {
//			String firstName = scan.next();
//			String lastName = scan.next();
//			
//			// itemsBought[i] = scan.nextInt(); 
//			int itemCheck = scan.nextInt();
//			customer[i].firstName = firstName;
//			customer[i].lastName = lastName;
//			customer[i].itemsBought = itemCheck;
//			
//			customer[i].itemDescription = new String[itemCheck];
//			customer[i].quanitityOfItems = new int[itemCheck];
//			for(int j=0; j<itemCheck; j++) {
//				int quantityOfItems = scan.nextInt();
//				String itemDescription = scan.next(); 
//				customer[i].quanitityOfItems[j] = quantityOfItems; 
//				customer[i].itemDescription[j] = itemDescription; 
//				
			}
			
			amountSpent[i] = cost; 
			
			sumForAverage += cost; 
			
			if (cost > amountSpent[spendsMost]) {
				spendsMost = i;
			} else if (cost < amountSpent[spendsLeast]) {
				spendsLeast = i;
			}
			
			}
		
		System.out.println("Biggest: " + firstName[spendsMost] + " " + lastName[spendsMost] + " " + "(" + String.format("%.02f", amountSpent[spendsMost]) + ")"); 
			
		System.out.println("Smallest: " + firstName[spendsLeast] + " " + lastName[spendsMost] + " " + "(" + String.format("%.02f", amountSpent[spendsLeast]) + ")"); 
		
		System.out.println("Averaget: " + String.format("%.02f", sumForAverage/numCustomers)); 
		
		scan.close(); 
		
		}
		
		
		
		
		
		
		
	}
