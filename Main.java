//Note: This is intended for beginners who are learning arrays for the first time.


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    
	    Scanner input = new Scanner(System.in);
	    Scanner input1 = new Scanner(System.in);

		String products [] = new String[2];
		boolean exit = true;
		
		while (exit) {
		    
	
		System.out.println("\n========== MENU =========");
		System.out.println("\n1.Check Inventory\n2.Add Products\n3.Remove Products\n4.Exit");
		int answer = input.nextInt();
		 
		switch(answer) {
		
		case 1: 
		System.out.println("--------------------------------------");
	    System.out.println("\n [  Inventory List  ]");
		for (int i = 0; i < products.length; i++) 
		{
		System.out.println("\n" + products[i]);

		}
		System.out.println("\n-------------------------------------");

		break;
	        
		case 2: 
		
		String name = "none";
		for (int x = 0; x < products.length; x++) {
		    
		System.out.println("Enter the product name: ");  
		name = input1.nextLine();
		 
		products[x] = name;
		}  
		System.out.println("New item : " + name + " Added");
		break;

		
		case 3: 
		  
		System.out.println("How many to remove : ");  
		int amount = input.nextInt();

		
		for (int y = 0; y < amount; y++ ) {
				
		System.out.println("Enter the Product name to remove: ");  
		String remove = input1.nextLine();
		
		if (remove.equals(products[y])) {
		System.out.println("Product Removed : " + products[y]);

		products[y] = null;
		
		}
		else {
		System.out.println("Item not found");  
	    
		}
		}
		break;

        case 4: 
 		System.out.println("-------------------------------------");
        System.out.println("exiting................");
		System.out.println("-------------------------------------");

		exit = false;
		break;


		}
	}
		
	}
}