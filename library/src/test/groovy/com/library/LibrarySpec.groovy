package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "toString"() {
when:"A library has a location, openingHours, book, student, librarian"

def library=new Library(location:'Campus',
			
			openingHours:'08.00',

			book:'The Battle of 1066',

			student:'Kvothe Simmone',

			librarian:'Mrs Jackson')

then: "the toString method will merge them."

library.toString()=='Campus,08.00,The Battle of 1066,Kvothe Simmone,Mrs Jackson'


    }
}
