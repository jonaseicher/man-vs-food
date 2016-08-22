package man.vs.food

class Food {

	String name
	String description

	float fat
	float carbs
	float protein
	float kcal

	static hasMany = [foodTags:FoodTag]
	
	static constraints = {
		name blank:false, nullable:false, unique:true, size:3..30, matches:"[a-zA-Z0-9_]+( [a-zA-Z0-9_]+)*"
		fat min:0f, max:100f
		carbs min:0f, max:100f
		protein min:0f, max:100f
		kcal min:0f, max:900f
	}
	
	String toString(){
		return name;
	}
}
