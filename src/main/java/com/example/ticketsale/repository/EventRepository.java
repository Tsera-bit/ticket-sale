package com.example.ticketsale.repository;

import com.example.ticketsale.model.Event;
import com.example.ticketsale.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findBySeller(User seller);
}
