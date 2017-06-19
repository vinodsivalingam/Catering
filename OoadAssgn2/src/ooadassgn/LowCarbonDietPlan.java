/* OOAD Assignment 2 - Vinod Kumar Sivalingam
 *  LowCarbonDietMeal class
 *  Based on the dayOfWeek passed in as an integer, the corresponding day of the week as a String is set.
 *  Creates an instance of LowCarbonMeal and sets the data member.
 */
package ooadassgn;

import java.io.IOException;

public class LowCarbonDietPlan implements DietPlan {
	private Meal lunch;
	private Meal dinner;
	private String filename;	
	private String dayOfWeek;
	private MealCategory lowCarbMeal;
	
	//Based on the dayOfWeek passed in as an integer, the corresponding day of the week as a String is set	
	public LowCarbonDietPlan(String filename, int dayOfWeek) throws IOException {	
		
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
		lowCarbMeal = new LowCarbMeal();
		lowCarbMeal.loadRecipes(this.filename);
		lunch = new Lunch(lowCarbMeal);
		dinner = new Dinner(lowCarbMeal);	 
	}
	public Meal getLunch() {
		return lunch;
	}

	public void setLunch(Meal lunch) {
		this.lunch = lunch;
	}
	
//Returns a String with description of lunch and dinner and day of week
	public String showPlan() {
		return "Low Carbon plan for you !!"+"\n"+"Lunch  Details   "+" "+lunch.getDetails() +"\n"+ "Dinner Details   " + " "+dinner.getDetails() +"\n"+ "Happy "+ this.getDayOfWeek()+" !";
	}

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
	public MealCategory lowCarbMeal() {
		return lowCarbMeal;
	}
	public void setVeganMeal(MealCategory lowCarbMeal) {
		this.lowCarbMeal = lowCarbMeal;
	}
}