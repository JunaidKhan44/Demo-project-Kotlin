package com.jk.services

import com.jk.entities.Student

interface StudentService {

    fun getAllStudent(): List<Student>
    fun getStudentByAge(age: Int): List<Student>
}