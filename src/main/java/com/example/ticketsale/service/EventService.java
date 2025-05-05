package com.example.ticketsale.service;

import com.example.ticketsale.model.Event;
import com.example.ticketsale.model.User;
import com.example.ticketsale.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository eventRepository;

    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    public List<Event> findBySeller(User seller) {
        return eventRepository.findBySeller(seller);
    }

    public Event save(Event event) {
        return eventRepository.save(event);
    }

    public Optional<Event> findById(Long id) {
        return eventRepository.findById(id);
    }
}
