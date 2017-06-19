/* OOAD Assignment 2 - Vinod Kumar Sivalingam
 *  Lunch class
 *  Creates the appropriate plan on the choice of Meal(Lunch) and Credit Card Validation
 */package ooadassgn;

public class Lunch implements Meal {
	private Recipe recipe;
	private MealCategory mealCategory;

	public Lunch(MealCategory mealCategory) {
		this.mealCategory = mealCategory;
		recipe = mealCategory.getARecipe();
	}

		public Recipe getARecipe() {
	        return recipe;
	    } 
	    public Integer getCalories() {
	        return recipe.getCalories();
	    }
	    public void setRecipe(Recipe recipe) {
			this.recipe = recipe;
		}
	    public double getCost() {
	        return recipe.getCost();
	    }
/*
* Should return a String with the recipe name, description, calories and 
* cost of recipe and the delivery fee
*/
	    public String getDetails() {
	        return recipe.getName() + " " + recipe.getDescription() + " " + recipe.getCalories() +"cal"+" "+"$" + recipe.getCost();
	     }

		public MealCategory getMealCategory() {
			return mealCategory;
		}

		public void setMealCategory(MealCategory mealCategory) {
			this.mealCategory = mealCategory;
		}
	}
