import man.vs.food.Food
import man.vs.food.FoodTag
import man.vs.food.User
import man.vs.food.UserTag

class BootStrap {

    def init = { servletContext ->
		
		def list = new ArrayList()
		list << new User(name:'Jonas', email:'bart@lol.de')
		list << new User(name:'Tommy', email:'bus@crash.de')
		
		getClass().getResourceAsStream("usertags.txt").eachLine { list << new UserTag(name:it) }
		getClass().getResourceAsStream("foodtags.txt").eachLine { list << new FoodTag(name:it) }
		list << new Food(name:'Cashews',description:'Raw Cashew nuts', fat:52f, carbs:21f, protein:12f, kcal:580f )
		
		list.each {
		if (!it.save()){
			log.error "Could not save!!"
			log.error "${it.errors}"
		  }
		}
		
		
    }
    def destroy = {
    }
}
