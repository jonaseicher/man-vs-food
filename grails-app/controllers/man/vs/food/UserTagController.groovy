package man.vs.food

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class UserTagController {

	def scaffold = UserTag

}
