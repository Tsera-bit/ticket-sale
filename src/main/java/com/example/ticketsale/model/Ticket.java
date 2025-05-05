package com.example.ticketsale.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tickets")
@Getter
@Setter
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // билеты - событие
    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    // кто купил, null если не покупали
    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private User buyer;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int quantity;
}
