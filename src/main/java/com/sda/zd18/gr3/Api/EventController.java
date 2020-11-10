package com.sda.zd18.gr3.Api;

import com.sda.zd18.gr3.dto.EventDto;
import com.sda.zd18.gr3.services.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class EventController {

    private EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/events")
    public ResponseEntity<List<EventDto>> listAllEvents(){

         return ResponseEntity.ok(eventService.findAllEvents());
    }

    @PostMapping("/events")
    public ResponseEntity<Boolean> createNewEvent(@RequestBody EventDto eventDto){
       Long eventId=eventService.saveNewEvent(eventDto);
       return ResponseEntity.created(URI.create("/events/"+eventId)).build();
    }
}
