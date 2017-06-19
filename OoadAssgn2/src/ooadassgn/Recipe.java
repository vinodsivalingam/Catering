/* OOAD Assignment 2 - Vinod Kumar Sivalingam
 *  Class Recipe
 *  
 */
package ooadassgn;

public class Recipe {
		private String name;
		private String  description;
		private double cost;
		private int calories;
		
		public Recipe(String name, String description, double cost,
				int calories) {
			super();
			this.name = name;
			this.description = description;
			this.cost = cost;
			this.calories = calories;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}

		public Integer getCalories() {
			return calories;
		}

		public void setCalories(Integer calories) {
			this.calories = calories;
		}

	}
