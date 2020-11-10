package com.sda.zd18.gr3.dao;

import com.sda.zd18.gr3.model.Event;
import com.sda.zd18.gr3.model.EventAccess;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EventRepositoryTest {

    @Autowired
    private EventRepository eventRepository;

    @Test
    public void test(){
        Event event1 = new Event();
        event1.setName("Pierwsze Wydarzenie");
        event1.setDate(LocalDate.now());
        event1.setAccess(EventAccess.PUBLIC);

        Event savedEvent = eventRepository.save(event1);

        List<Event> eventList = eventRepository.findAll();
        assertEquals(1,eventList.size());
        assertNotNull(eventList.get(0).getId());
    }

}