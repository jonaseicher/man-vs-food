package man.vs.food

class UserTag {

	String name
	
	static hasMany = [users:User]
	static belongsTo = User
	
    static constraints = {
		name size:2..25, blank:false, unique:true, matches:"[a-zA-Z0-9_]+([ -:][a-zA-Z0-9_()+]+)*"
    }
	
	String toString(){
		return name;
	}
	
}
