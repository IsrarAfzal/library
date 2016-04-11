package com.library

class Book {

String title

String author

String isbn

Date dateBorrowed

Date dateReturned

String student

String toString(){

"$title,$author,$isbn,$student"
}

    static constraints = {

title()

author()

isbn()

dateBorrowed()

dateReturned()

student()
    }
}
