package com.sda.zd18.gr3.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Date date;
    private String name;
    //    private EventAddress address;
    private String access; //private or public
    @ManyToOne(targetEntity = User.class)
    private User organizer;
    @OneToMany(mappedBy = "event")
    private List<Comment> comments;



}