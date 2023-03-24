package com.revature.springreform.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Entity
public @Data class Ticket {

    @Id // specifies a primary key should be made
    @GeneratedValue(strategy = GenerationType.AUTO) // specify this table will auto generate an ID
    @Column(name = "ticketid")
    private int id;

    // default value
    @Value("0")
    private double amount = 0;

    // default value
    @Value("...")
    private String description;

    // default value
    @Value("pending")
    private String status;

    @ManyToOne()
    @JoinColumn(name="empid", nullable=false)
    private Employee employee;

    // we point the List obj to a new ArrayList to make sure there's no null pointer
    // exceptions   
    //   public Ticket(Ticket tickets) {
    //       this.employees = new ArrayList<>();
    //   }

}
