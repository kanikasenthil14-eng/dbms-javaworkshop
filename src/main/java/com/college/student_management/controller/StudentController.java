/*package com.college.student_management.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController 
public class StudentController {
    @GetMapping("/students")
    public String getStudents() {
        return "List of students";
    }
    @PostMapping("/hello")
    public String hello() {
        return "student created succesfully";
    
    

    } 
}
    */
/*
import com.college.student_management.service.StudentService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController 

public class StudentController {
    private final StudentService studentService;//final = no change after initialisation

    public StudentController(StudentService studentService){//dependency injection
        this.studentService = studentService;
    }
    @GetMapping("/hello")
    public String hello() {
        return "successful";
    }
    @PostMapping("/students")
    public String createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
    @PostMapping("/add")
    public int add(int a) {
        return a+10;
    }  
        */
package com.college.student_management.controller;

import com.college.student_management.entity.Student;
import com.college.student_management.service.StudentService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;



@RestController 

public class StudentController {
    private final StudentService studentService;//final = no change after initialisation

    public StudentController(StudentService studentService){//dependency injection
        this.studentService = studentService;
    }
    
    @PostMapping("/students")
    //@requestBody helps Spring convert the incoming JSON into a Student object.
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }


    //Get all students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    
    //Get student by ID
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/students/{id}")
    public Student deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }

}