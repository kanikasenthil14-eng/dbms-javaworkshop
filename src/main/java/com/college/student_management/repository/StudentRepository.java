package com.college.student_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.college.student_management.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}

//extends-Its inhrits functionality from another interface.
//JpaRepository-Provides data access operations like findAll(),findById(),save(),deleteById()
//Student-Entity type that will be managed.
//Long-The type of the primary key of the Student entity.

//save()
//findAll()
//findById()
//deleteById()