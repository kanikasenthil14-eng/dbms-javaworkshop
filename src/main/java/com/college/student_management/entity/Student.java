package com.college.student_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
//tell JPA that Student is a database entity.
@Table(name="students")
//specify that the database table should be called students.
public class Student {
    @Id 
    //Marks id as the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Tells JPA/database to generate the ID automatically
    private Long id;
    private String name;
    private String email;
    private String department;

    //JPA needs a no-argument constructor to create entity objects.
    public Student(){        
    }
    //This makes it convenient for our application to create a new student object.
    public Student(String name,String email,String department){
        this.name=name;
        this.email=email;
        this.department=department;
    }

        //Why getters and setters?

        //They allow other parts of the application to access and modify the private fields.
        //A getter (accessor) retrieves a field's value,while a setter (mutator) updates it.
        //often with validation logic to maintain object integrity.
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
}
