package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
when:"A name, email, studentid, course"

def student=new Student(name:'Saiba Javed',

			email:'s-j-crazy@yahoo.com',

			studentid:'06sjaved',

			course:'Hotel Management').save()

then:"The toString method will merge them together."

student.toString()=='Saiba Javed,s-j-crazy@yahoo.com,06sjaved,Hotel Management'
    }
}
