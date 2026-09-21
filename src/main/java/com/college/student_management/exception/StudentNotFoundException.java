package com.college.student_management.exception;
//custom exception
public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(Long id) {
        super("Student not found with id: "+id);
    }

}
