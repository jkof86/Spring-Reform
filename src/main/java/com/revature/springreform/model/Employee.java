package com.revature.springreform.model;
import javax.persistence.*;
import lombok.Data;

//we use @Entity to define this class as a table
@Entity
public @Data class Employee {

    @Id //specifies a primary key should be made
    @GeneratedValue(strategy = GenerationType.AUTO) //specify this table will auto generate an ID
    @Column(name = "empid")
    private int empId;

    private String fname;
    private String lname;
    private String address;
    private String email;
    private String password;
    private int role;

}