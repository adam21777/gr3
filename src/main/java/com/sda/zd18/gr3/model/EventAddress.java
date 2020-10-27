package com.sda.zd18.gr3.model;
import javax.persistence.*;

@Entity
@Table
public class EventAddress {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int numberOfHouseOrLocal;
    private String road;
    private String city;

    public EventAddress() {
    }

    public EventAddress(int numberOfHouseOrLocal, String road, String city) {
        this.numberOfHouseOrLocal = numberOfHouseOrLocal;
        this.road = road;
        this.city = city;
    }

    public int getNumberOfHouseOrLocal() {
        return numberOfHouseOrLocal;
    }

    public void setNumberOfHouseOrLocal(int numberOfHouseOrLocal) {
        this.numberOfHouseOrLocal = numberOfHouseOrLocal;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
