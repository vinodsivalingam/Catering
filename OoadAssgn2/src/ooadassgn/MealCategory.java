/* OOAD Assignment 2 - Vinod Kumar Sivalingam
 * Meal Category Interface
 */  
package ooadassgn;

import java.io.IOException;
import java.util.ArrayList;

public interface MealCategory {
	public ArrayList<Recipe> showRecipes();
	public Recipe getARecipe();
	public void loadRecipes(String fileName) throws IOException;
}