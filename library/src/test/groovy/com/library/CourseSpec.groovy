package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
when:"A title, code, tutor, department, description"

def course=new Course(title:'Computer Engineering',
			
			code:'CE451',

			tutor:'Tonderai Masawera',

			department:'Computing',

			description:'Studying Code and writing it')

then:"The toString method will merge them together."

course.toString()=='Computer Engineering,CE451,Tonderai Masawera,Computing,Studying Code and writing it'
    }
}
