package com.sda.zd18.gr3.dto;

import java.time.LocalDate;

public class EventDto {
    private Long id;
    private String date;
    private String name;
    private String access;

    public EventDto() {
    }

    public EventDto(Long id, String name, String date, String access) {
        this.date = date;
        this.name = name;
        this.access = access;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public Long getId() {
        return id;
    }
}
