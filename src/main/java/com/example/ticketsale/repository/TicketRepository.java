package com.example.ticketsale.repository;

import com.example.ticketsale.model.Event;
import com.example.ticketsale.model.Ticket;
import com.example.ticketsale.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByEvent(Event event);
    List<Ticket> findByBuyer(User buyer);
    List<Ticket> findByEventId(Long eventId);
}
