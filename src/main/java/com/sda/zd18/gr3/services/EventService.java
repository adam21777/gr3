package com.sda.zd18.gr3.services;

import com.sda.zd18.gr3.dao.EventRepository;
import com.sda.zd18.gr3.dto.EventDto;
import com.sda.zd18.gr3.model.Event;
import com.sda.zd18.gr3.model.EventAccess;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<EventDto> findAllEvents(){
        return eventRepository.findAll().stream().map(e->new EventDto(e.getId(), e.getName(), e.getDate().toString(), e.getAccess().toString()))
                .collect(Collectors.toList()) ;
    }

    public Long saveNewEvent(EventDto eventDto){
        Event event1 = new Event();
        event1.setName(eventDto.getName());
        event1.setDate(LocalDate.parse(eventDto.getDate()));
        event1.setAccess(EventAccess.valueOf(eventDto.getAccess()));

        eventRepository.save(event1);

        return event1.getId();
    }
}
