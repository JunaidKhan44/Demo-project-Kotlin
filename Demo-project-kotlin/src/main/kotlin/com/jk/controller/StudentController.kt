package com.jk.controller

import com.jk.entities.Student
import com.jk.services.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student")
class StudentController @Autowired constructor(private val studentService: StudentService) {

    @GetMapping("/")
    fun index():String {
        return "This is index Controller"
    }

    @GetMapping("/all")
    fun getAllStudent():List<Student>{
        return studentService.getAllStudent();
    }


    @GetMapping("/studentsByAge")
    fun getStudentsByAge(@RequestParam age: Int): List<Student> {
        return studentService.getStudentByAge(age);
    }

}