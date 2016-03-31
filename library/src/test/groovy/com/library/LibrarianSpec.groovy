package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString () {
	when:"A Librarian has a name, email, username, password and telephone"

	def librarian=new Librarian(name:'Yvonne Hirst',
				    
				    email:'yhi@appleburn.ac.uk',

				    username:'yhirst',

				    password:'ancient',

				    telephone:'01924436690')

then: "the to String method will merge them."

librarian.toString()=='Yvonne Hirst,yhi@appleburn.ac.uk,yhirst,ancient,01924436690'
    }
}
