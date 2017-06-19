/* OOAD Assignment 2 - Vinod Kumar Sivalingam
 *  HighCarbMeal
 *  Creates the appropriate plan on the choice of Meal in HighCarb category and Credit Card Validation
 */	
package ooadassgn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class HighCarbMeal implements MealCategory {
	private ArrayList<Recipe> recipeList = new ArrayList<Recipe>();	
	
/*
 * Opens the file with the filename, read the contents, line by line
 * Each line, contains the Recipe name, description, calories and cost
 * and an instance of a Recipe is created
 */
	public void loadRecipes(String fileName) throws IOException{
		try (BufferedReader br = new BufferedReader(
								 new FileReader(fileName))) 
			{
				String line = br.readLine();
				 while(line != null){
					 if (line.length() == 0)
                     {
                         continue;
                     }
					 String[] columns = line.split(":");
					 recipeList.add(new Recipe(columns[0], columns[1], Double.parseDouble(columns[2]), Integer.parseInt(columns[3])));
                     line = br.readLine();
				 }
		}
		finally {
		}
	}	
	public ArrayList<Recipe> showRecipes(){
		return recipeList;
	}
	
/*
 * randomly pick a recipe from recipeList and return it
 */
	public Recipe getARecipe(){
		Random rn = new Random();
		int answer = rn.nextInt(10) + 1;
		return recipeList.get(answer);
	}
}
