package com.example.ticketsale.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

    @Entity
    @Table(name = "users")
    @Getter
    @Setter
    @NoArgsConstructor
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true)
        private String username;

        @Column(nullable = false)
        private String password;

        @Column(nullable = false)
        private String role;

        // продавец - события
        @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
        private List<Event> events;

        // покупатель - билеты
        @OneToMany(mappedBy = "buyer", cascade = CascadeType.ALL)
        private List<Ticket> ticketsPurchased;
    }
