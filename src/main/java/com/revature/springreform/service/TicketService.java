package com.revature.springreform.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.revature.springreform.model.Employee;
import com.revature.springreform.model.Ticket;
import com.revature.springreform.repository.EmployeeRepository;
import com.revature.springreform.repository.TicketRepository;

@Service
public class TicketService {

    private TicketRepository tickRepo;

    public TicketService(TicketRepository tickRepo) {
        this.tickRepo = tickRepo;
    }

    public Ticket addTicket(Ticket ticket) {
        tickRepo.findById(ticket.getId());
        return tickRepo.save(ticket);
    }

    public List<Ticket> getTicketList() {
        return tickRepo.findAll();
    }

    public Ticket getTicketById(int id) {
        // we generate a list of all tickets
        List<Ticket> tickList = tickRepo.findAll();

        // we iterate through the list and find the correct id
        // **not optimized for efficiency** O(n)
        for (int i = 0; i < tickList.size(); i++) {
            if (tickList.get(i).getId() == id) {
                return tickList.get(i);
            }
        }
        // if the ticket id isn't found, we return null
        return null;
    }

}
