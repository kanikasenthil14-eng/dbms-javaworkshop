/*package com.college.student_management.service;

import org.springframework.stereotype.Service;

@Service 
public class StudentService {
    public String createStudent(){
        return "Student created successfully";
    }
}*/

package com.college.student_management.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.college.student_management.repository.StudentRepository;
import com.college.student_management.entity.Student;

@Service 
public class StudentService {
    private final StudentRepository studentRepository;
    //This means our Service needs the Repository.
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    //Read - Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    //Read - Get student by ID
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student updateStudent(Long id, Student student) {
        
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if (existingStudent == null) {
            return null;
        }

        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setDepartment(student.getDepartment());
        return studentRepository.save(existingStudent);
    }
    public Student deleteStudent(Long id){
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            studentRepository.deleteById(id);
        }
        return student;
    }
}
