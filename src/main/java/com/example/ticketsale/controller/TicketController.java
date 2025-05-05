package com.example.ticketsale.controller;

import com.example.ticketsale.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    @GetMapping("/event/{eventId}")
    public String listTicketsByEvent(@PathVariable Long eventId, Model model) {
        model.addAttribute("tickets", ticketService.findByEventId(eventId));
        return "ticket/list";
    }

    @PostMapping("/buy/{ticketId}")
    public String buyTicket(@PathVariable Long ticketId) {
        return "redirect:/my-tickets";
    }
}
