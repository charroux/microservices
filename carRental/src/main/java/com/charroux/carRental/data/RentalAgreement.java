package com.charroux.carRental.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class RentalAgreement {

    long id;
    String firstName;
    String lastName;
    String email;
    String beginDate;
    String endDate;
    Car car;

    public enum State{
        PENDING,
        CREDIT_RESERVED,
        CREDIT_REJECTED
    }

    State state;

    public RentalAgreement(String firstName, String lastName, String email, String beginDate, String endDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.state = state;
    }

    public RentalAgreement() { }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @ManyToOne
    @JsonIgnore
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
