package man.vs.food

class User {

	String name
	String email
	Date dateCreated
	Date lastUpdated
	
	static hasMany = [userTags:UserTag]
	
    static constraints = {
		name blank:false, nullable:false, unique:true, size:3..30, matches:"[a-zA-Z1-9_]+"
		email email:true, unique:true
    }
	
	String toString(){
		return name;
	}
}
