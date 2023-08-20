package com.jk.services

import com.jk.entities.Student
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl : StudentService {

   //intialize Student
    val list = listOf(
        Student("John",22,'B'),
        Student("Heli",21,'D'),
        Student("Robart",25,'A'),
        Student("Kile",20,'C'),
        Student("Loran",26,'A'),
        Student("James",29,'B'),
        Student("Joseph",27,'C')

    )


    override fun getAllStudent(): List<Student> {

        return list;
    }

    override fun getStudentByAge(age: Int): List<Student> {

       return findStudentsByAge(list,age);
    }

    fun findStudentsByAge(studentList: List<Student>, targetAge: Int): List<Student> {
        return studentList.filter { it.age == targetAge }
    }

}