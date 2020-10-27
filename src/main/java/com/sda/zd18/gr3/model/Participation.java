package com.sda.zd18.gr3.model;
import javax.persistence.*;

@Entity
public class Participation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @ManyToOne(targetEntity = Event.class)
    private Event event;
    @ManyToOne(targetEntity = User.class)
    private User user;
    private Boolean isConfirmByEventOrganizer;
    private Boolean isConfirmByGuest;

}

