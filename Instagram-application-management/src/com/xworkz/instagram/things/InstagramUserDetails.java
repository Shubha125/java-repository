package com.xworkz.instagram.things;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstagramUserDetails extends Object {
    //properties
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private LocalDateTime createdOn;

    public InstagramUserDetails(){
        System.out.println("No Args constructors");
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setCreatedOn(LocalDateTime createdOn){
    this.createdOn=createdOn;
    }

    //getter methods
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public LocalDateTime getCreatedOn(){
        return createdOn;
    }
     //override toString
    @Override
    public String toString(){
        return "Name:"+name+", "+"Email:"+email+", "+"Date Of Birth:"+dateOfBirth+", "+"Created on:"+createdOn;
    }
}
