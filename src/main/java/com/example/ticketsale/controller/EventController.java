package com.example.ticketsale.controller;

import com.example.ticketsale.model.Event;
import com.example.ticketsale.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    @GetMapping
    public String listEvents(Model model) {
        model.addAttribute("event", eventService.findAll());
        return "event/list";
    }

    @GetMapping("/add")
    public String showEventForm(Model model) {
        model.addAttribute("event", new Event());
        return "event/add";
    }

    @PostMapping("/add")
    public String addEvent(@ModelAttribute Event event) {
        eventService.save(event);
        return "redirect:/events";
    }
}
