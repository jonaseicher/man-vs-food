package man.vs.food

class FoodTag {

	String name
	
	static hasMany = [foods:Food]
	static belongsTo = Food
	
	static constraints = {
		name size:2..25, blank:false, unique:true, matches:"[a-zA-Z0-9_]+([ -][a-zA-Z0-9_\\(\\)]+)*"
	}
	
	String toString(){
		return name;
	}
	
}
