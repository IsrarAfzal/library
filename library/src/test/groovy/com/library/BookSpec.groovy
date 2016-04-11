package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "toString"() {
when:"A book has title, author, isbn, dateBorrowed, dateReturned, student"

def book=new Book(title:'The Willow and The Wisp',

			author:'Patrick Rothfuss',

			isbn:'786542',

			dateBorrowed:new Date('09/10/2015'),

			dateReturned:new Date('12/11/2015'),

			student:'Jessica Jones')

then:"toString method will merge them."

book.toString()=='The Willow and The Wisp,Patrick Rothfuss,786542,Jessica Jones'
    }
}
