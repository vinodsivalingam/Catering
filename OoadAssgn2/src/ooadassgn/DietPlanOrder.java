/* OOAD Assignment 2 - Vinod Kumar Sivalingam
 *  DietPlanOrder class
 *  Creates the appropriate plan on the choice of Meal and Credit Card Validation
 */
package ooadassgn;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DietPlanOrder {
	private String customerName; 
	public DietPlan plan;
	private boolean paymentStatus;

	public DietPlanOrder(String customerName, String filename, MealType mealType, int DayOfWeek) throws IOException {
		this.customerName = customerName;
		
/*
 * switch statement, creates the appropriate diet plan.
 * For example, if mealType is VEGAN, creates an instance of VeganDietPlan
 */
		switch(mealType){
		//	
		case VEGAN: VeganDietPlan newVeganDiet= new VeganDietPlan(filename,DayOfWeek); 
					plan = newVeganDiet;
					break;
		//
		case LOW_CARB: LowCarbonDietPlan newLowCarb = new LowCarbonDietPlan(filename,DayOfWeek);
						plan = newLowCarb;
						break;
		//
		case HIGH_CARB: HighCarbonDietPlan newHighCarb = new HighCarbonDietPlan(filename,DayOfWeek);
					plan = newHighCarb;
					break;
		
	}
		}
/*
 * Credit card Validation
 */
	public boolean acceptPayment(String cardName, String cardNumber, double amount) {
/*
 * A length of 16 digits. 
 * First digit is a 5 and second digit is in the range 1 through 5 inclusive
 */
		if (cardName.equalsIgnoreCase("MASTER")) {
			if (cardNumber.length() == 16) {
				if (cardNumber.startsWith("5")) {
						this.paymentStatus = true;
					}
			}
		} else if (cardName.equalsIgnoreCase("VISA")) {
/*
 * Length is either 13 or 16 digits with a first digit of 4
 */
			if (cardNumber.length() == 16 || cardNumber.length() == 13) {
				if (cardNumber.startsWith("5")) {
					this.paymentStatus = true;
				}
			}
		}
		return this.paymentStatus;
	}
	
/*Invoice Generation */
	public void generateInvoice() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Date: " +dateFormat.format(date)+"\n");
		System.out.println("Hello " + this.customerName);
		System.out.println(plan.showPlan());
		}

	public double getCost() {
		return plan.getTotalCost();
	}
}