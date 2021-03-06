package org.mew.domain;

import org.optaplanner.core.api.domain.solution.drools.ProblemFactProperty;

public class FoodItem {
	
	public enum FoodType {
		// Higher values are of higher importance/difficulty in matching
		OTHERS(0), BEVERAGE(1), MAIN(2), SIDE(3), BREAKFAST_MAIN(4), BREAKFAST_SIDE(5), SNACK(6);
		
		
		private final int value;
		private FoodType(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
	}	
	
	@ProblemFactProperty
	public FoodType type;

	public float calories;
	public float sodium;
	public float sugar_g;
	public float carbohydrates_kcal;
	public float protein_kcal;
	public float fat_kcal;
	public String serving;
	
	int id;
//	public int type; // 1- Beverage, 2- Main, 3- Desserts/Sides, 4- Breakfast Main, 5 - Breakfast Side
	public String name;
	public int recency;	// how recent was this introduced (99 - never, 1 - just yesterday)
	
	// Extra fields
	public String place; // eg. If it is a fast-food, we should not mix with non-fast food
	public boolean hasFish;
	public boolean hasVeg;
	public boolean hasFruits;
	public boolean hasCaffeine;
	public boolean hasBeef;
	public String cuisine;
	 
	
	public FoodItem() {
		
	}
	
	public FoodItem(int id, FoodType type, String name, float calories, float sodium, float sugar, float c, float f, float p, int recency) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.calories = calories;
		this.sugar_g = sugar;
		this.sodium = sodium;
		this.carbohydrates_kcal = c;
		this.protein_kcal = p;
		this.fat_kcal = f;
		this.recency = recency;
		
		this.place = "";
		this.cuisine = "";
		
		hasVeg = false;
		hasFruits = false;
		hasCaffeine = false;
		hasBeef = false;
	}
	
	public String getDetails() {
		return ("Item: " + id + ". Type: " + type + ". Name: " + name + ". Recency: " + recency);
	}
	
}
