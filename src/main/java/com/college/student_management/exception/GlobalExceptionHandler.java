package com.college.student_management.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;
import java.util.Map;

@RestControllerAdvice 
public class GlobalExceptionHandler {
    @ExceptionHandler(StudentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> handleStudentNotFound(StudentNotFoundException exception) {
        return Map.of("error",exception.getMessage());
    }

}
