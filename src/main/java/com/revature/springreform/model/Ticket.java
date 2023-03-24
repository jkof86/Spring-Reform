// package com.revature.springreform.model;
// import javax.persistence.*;
// import lombok.Data;

// @Entity
// public @Data class Ticket {

//     @Id //specifies a primary key should be made
//     @GeneratedValue(strategy= GenerationType.AUTO) //specify this table will auto generate an ID
//     private int id;
    
//     private double amount = 0;
//     private String desc;
//     private String status = "pending";
//     private int empId;

//     @OneToMany(mappedBy = "tickets")
//     private List<Ticket> tickets;

//     public Ticket() {
//         this.tickets = new ArrayList<>();
//     }

// }
