package com.library

class Student {

String name

String email

String studentid

String course

String toString(){

"$name,$email,$studentid,$course"
}
    static constraints = {

name()

email()

studentid()

course()
    }
}
