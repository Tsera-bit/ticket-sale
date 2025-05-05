package com.example.ticketsale.service;

import com.example.ticketsale.model.Event;
import com.example.ticketsale.model.Ticket;
import com.example.ticketsale.model.User;
import com.example.ticketsale.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TicketService {
    private final TicketRepository ticketRepository;

    public List<Ticket> findByEvent(Event event) {
        return ticketRepository.findByEvent(event);
    }

    public List<Ticket> findByEventId(Long eventId) {
        return ticketRepository.findByEventId(eventId);
    }

    public List<Ticket> findByBuyer(User buyer) {
        return ticketRepository.findByBuyer(buyer);
    }

    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Optional<Ticket> findById(Long id) {
        return ticketRepository.findById(id);
    }
}
