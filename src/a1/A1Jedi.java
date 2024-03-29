package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numItems = scan.nextInt();  // counts number of items in store
		
		String[] storeItems = new String[numItems]; // array of the names of items in the store
		Double[] storePrices = new Double[numItems]; // array of the price of each item in the store
	
		for (int i = 0; i<numItems; i++) {
			storeItems[i] = scan.next(); 
			storePrices[i] = scan.nextDouble();	 // same as adept
		
		}
		
		int numCustomers = scan.nextInt(); // counts the number of customers
		String[] firstName = new String[numCustomers]; // sets up customer first name
		String[] lastName = new String[numCustomers]; // sets up customer last name
		
		int[] itemQuantity = new int[numItems]; // sets up the total quantity of item bought
		int[] peopleQuantity = new int[numItems]; // sets up number of customers that bought that item
		
		
		for (int i = 0; i < numCustomers; i++) {
			firstName[i] = scan.next(); 
			lastName[i] = scan.next(); //creates first and last name

			int numBought = scan.nextInt(); // same as adept
			
			boolean[] wasItBought = new boolean[numItems]; // establishes if the item was bought
			for (int j = 0; j < numBought; j++) {
				int quantity = scan.nextInt(); 
				String nameOfItem = scan.next(); 
				
				for (int k = 0; k < numItems; k++) {
					if (storeItems[k].equals(nameOfItem)) {
						itemQuantity[k] += quantity; // adds how many times an item was bought
						
						if (!wasItBought[k]) {
							wasItBought[k] = true; 
							peopleQuantity[k]++; // adds the amount of people that bought that item
						}
					}
				}
			}
			
		}
		for (int l = 0; l < numItems; l++) {
			if (peopleQuantity[l] == 0) { // distinguishes if an item wasn't bought
				System.out.println("No customers bought " + storeItems[l]); 
				
			} else {
				System.out.println(peopleQuantity[l] + " customers bought " + itemQuantity[l] + " " + storeItems[l]); 
				
			}
		}
		scan.close();
		
	}
}

	


		
