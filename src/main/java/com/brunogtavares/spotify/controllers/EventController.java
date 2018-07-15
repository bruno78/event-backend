package com.brunogtavares.spotify.controllers;

import com.brunogtavares.spotify.models.Event;
import com.brunogtavares.spotify.respositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/events")
    public Iterable<Event> findAllEvents() {
        return eventRepository.findAll();
    }

    @PostMapping("/events")
    public Event createNewEvent(@RequestBody Event newEvent) {
        return eventRepository.save(newEvent);
    }

    @PutMapping("/events/{eventId}")
    public Event updateEventById(@PathVariable Long eventId, @RequestBody Event eventRequest) {

       Event eventFromDb = eventRepository.findById(eventId).get();
       eventFromDb.setEventDescription(eventRequest.getEventDescription());
       eventFromDb.setStartTime(eventRequest.getStartTime());
       eventFromDb.setEndTime(eventRequest.getEndTime());

       return eventRepository.save(eventFromDb);
    }


    @DeleteMapping("/events/{eventId}")
    public HttpStatus deleteEventById(@PathVariable Long eventId) {
        eventRepository.deleteById(eventId);
        return HttpStatus.OK;
    }

}
