package com.revature.springreform.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.springreform.model.Employee;
import com.revature.springreform.model.Ticket;
import com.revature.springreform.service.EmployeeService;
import com.revature.springreform.service.TicketService;

@RestController
@RequestMapping()
public class Controller {
    
    private EmployeeService empServ;
    private TicketService tickServ;

    public Controller(EmployeeService empServ, TicketService tickServ) {
        this.empServ = empServ;
        this.tickServ = tickServ;
    }


    @RequestMapping(method = RequestMethod.POST, value = "/employee/register")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return empServ.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employee/all")
    public List<Employee> getEmployeeList()
    {
         return empServ.getEmployeeList();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employee/{id}")
    public Employee getEmployeeById(@PathVariable(name="id", required=true) int id)
    {
         return empServ.getEmployeeById(id);
    }

    //we pass email and pass as path variables
    @RequestMapping(method = RequestMethod.GET, value = "/employee/login/{email}&{pass}")
    public boolean getEmployeeById(@PathVariable String email, @PathVariable String pass)
    {
         return empServ.loginEmployee(email, pass);
    }

//-----------------------------------------------------------------------------------------------


@RequestMapping(method = RequestMethod.POST, value = "/ticket/submit")
    public Ticket submitTicket(@RequestBody Ticket ticket)
    {
         return tickServ.addTicket(ticket);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/ticket/all")
    public List<Ticket> getTicketList()
    {
         return tickServ.getTicketList();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/ticket/{id}")
    public Ticket getTicketById(@PathVariable(name="id", required=true) int id)
    {
         return tickServ.getTicketById(id);
    }
}