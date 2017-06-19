/* OOAD Assignment 2 - Vinod Kumar Sivalingam
 *  Main Menu -
 *  This class acts as an user interface.  
 */
package ooadassgn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Mainmenu {
	public static void main(String[] args) throws IOException {
	
/*
 * The basic display of the catering portal and user response to the type of meal is accepted 
 * and correcting Meal Category is triggered.
 */
		if(args.length==0) return;
		String MainFilePath=args[0];
		System.out.println("Welcome to Omicron Catering Inc.");
		System.out.println("Choose a Diet plan of your choice :");
		System.out.println("1. Vegan    2. Low Carb   3. High Carb ");
		@SuppressWarnings("resource")
		int choice= (new Scanner(System.in)).nextInt();
		int i=0;
		String[] Paths= new String[3];
		BufferedReader br = new BufferedReader(new FileReader(MainFilePath));
	    try {
	        String line = br.readLine();
	        while (line != null) {
	        	Paths[i++] = line;
	        	line=br.readLine();
	        }
	    } finally {
	        br.close();
	    }
		
/*) Create an instance of a specific DietPlanOrder
 *  Pay the amount due to the diet plan order by Credit card
 *  Invoice generation  
 *  Various sceniors::
 */
		DietPlanOrder planOrder;
		try {
			switch(choice){
			case 1:
				planOrder = new DietPlanOrder("Vinod",Paths[1],MealType.VEGAN,1);
				planOrder.acceptPayment("Mastercard","5542156325624536",planOrder.getCost());
				planOrder.generateInvoice();
				break;
			case 2:
				planOrder = new DietPlanOrder("Vinod",Paths[2],MealType.LOW_CARB,4);
				planOrder.acceptPayment("Mastercard","5542156325624536",planOrder.getCost());
				planOrder.generateInvoice();
				break;
			case 3:
				planOrder = new DietPlanOrder("Vinod",Paths[2],MealType.HIGH_CARB,6);
				planOrder.acceptPayment("Visa","4542156325624536",planOrder.getCost());
				planOrder.generateInvoice();
				break;
			}
		
		} catch (IOException e) {
		}
	}
}