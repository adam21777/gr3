package com.sda.zd18.gr3.services;

import com.sda.zd18.gr3.dto.EventDto;
import com.sda.zd18.gr3.model.Event;
import com.sda.zd18.gr3.model.EventAccess;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EventServiceTest {

    @Autowired
    private EventService eventService;

    @BeforeEach
    public void setUp(){
        EventDto event1 = new EventDto(null, "event1",LocalDate.now().toString(), EventAccess.PUBLIC.toString());

        assertTrue(eventService.saveNewEvent(event1));
    }

    @Test
    void findAllEvents() {
        assertEquals(1,eventService.findAllEvents().size());
    }
}