/* OOAD Assignment 2 - Vinod Kumar Sivalingam
 *  VeganDietMeal class
 *  Based on the dayOfWeek passed in as an integer, the corresponding day of the week as a String is set.
 *  Creates an instance of VeganMeal and sets the data member.
 */
package ooadassgn;

import java.io.IOException;

public class VeganDietPlan implements DietPlan {
	private Meal lunch;
	private Meal dinner;
	private String filename;	
	private String dayOfWeek;
	private MealCategory veganMeal;
	
//Based on the dayOfWeek passed in as an integer, the corresponding day of the week as a String is set
	
	public VeganDietPlan(String filename, int dayOfWeek) throws IOException {	
		
		this.filename = filename;
		switch (dayOfWeek) 
		{
		case 1: this.dayOfWeek = "Monday";
			break;
		case 2: this.dayOfWeek = "Tuesday";
			break;
		case 3: this.dayOfWeek = "Wednesday";
			break;
		case 4: this.dayOfWeek = "Thursday";
			break;
		case 5: this.dayOfWeek = "Friday";
			break;
		case 6: this.dayOfWeek = "Saturday";
			break;
		case 7: this.dayOfWeek = "Sunday";
			break;
		}
/* Creates an instance of Lunch and sets the data member, lunch
 * Creates an instance of Dinner and sets the data member, dinner.
 */
		veganMeal = new VeganMeal();
		veganMeal.loadRecipes(this.filename);
		lunch = new Lunch(veganMeal);
		dinner = new Dinner(veganMeal);	 
	}
	public Meal getLunch() {
		return lunch;
	}

	public void setLunch(Meal lunch) {
		this.lunch = lunch;
	}
	
//Returns a String with description of lunch and dinner and day of week
	public String showPlan() {
		return "Vegan Diet plan for you !!"+"\n"+"Lunch  Details   "+" "+lunch.getDetails() +"\n"+ "Dinner Details   " + " "+dinner.getDetails() +"\n"+ "Happy "+ this.getDayOfWeek()+" !";
	}

//should return the total cost of lunch and dinner.	
	public double getTotalCost() {
		double cost = lunch.getCost() + dinner.getCost();
		return cost;
		}
	
	public Meal getDinner() {
		return dinner;
	}
	public void setDinner(Meal dinner) {
		this.dinner = dinner;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public MealCategory getVeganMeal() {
		return veganMeal;
	}
	public void setVeganMeal(MealCategory veganMeal) {
		this.veganMeal = veganMeal;
	}
}
