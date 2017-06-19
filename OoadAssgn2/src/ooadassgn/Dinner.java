/* OOAD Assignment 2 - Vinod Kumar Sivalingam
 *  Dinner class
 *  Creates the appropriate plan on the choice of Meal(Dinner) and Credit Card Validation
 */
package ooadassgn;

public class Dinner implements Meal {
	private Recipe recipe;
	private MealCategory mealCategory;
	private Boolean delivery;
	private double deliveryFee;

/*
 * Sets the value of mealCategory, with the parameter value
 * Calls the method, getARecipe() on mealCategory
 */
	Dinner(MealCategory mealCategory) {
		this.setMealCategory(mealCategory);
		this.recipe = mealCategory.getARecipe();
	}
	
	private void setMealCategory(MealCategory mealCategory) {
		this.mealCategory = mealCategory;
	}

	public void setDeliveryFee(double deliveryFee) {
		this.deliveryFee = deliveryFee;
	}
	
	public Recipe getARecipe() {
		return recipe;
	}

	public Integer getCalories() {
		return this.recipe.getCalories();
	}

	public double getCost() {
		return this.recipe.getCost();
	}

/*
 * Should return a String with the recipe name, description, calories and 
 * cost of recipe and the delivery fee
 */
	public String getDetails() {
		return recipe.getName()+" " + recipe.getDescription()+" "+ recipe.getCalories()+"cal"+" "+"$"+ (recipe.getCost()+ deliveryFee);
	}
	public MealCategory getMealCategory() {
		return mealCategory;
	}
	public Boolean getDelivery() {
		return delivery;
	}
	public void setDelivery(Boolean delivery) {
		this.delivery = delivery;
	}
	public double getDeliveryFee() {
		return deliveryFee;
	}
}