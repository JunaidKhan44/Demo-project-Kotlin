package com.jk.entities

data class Student(val studentName: String, val age: Int, val grade: Char) {


        override fun toString(): String {
                return "Student(name=$studentName, age=$age, grade=$grade)"
        }


}