package com.mandavya.ticketbooking.runner;

import com.mandavya.ticketbooking.things.TicketBookingDetails;
public class TicketBookingRunner {
    public static void main(String[] args) {
        TicketBookingDetails bookingDetails= new TicketBookingDetails();
        bookingDetails.name="XYZ";
        bookingDetails.contactNumber=9561237890L;
        bookingDetails.email="XYZ12@gmail.com";
        bookingDetails.ticketPrice=120;
        bookingDetails.numberOfSeats=49;
        System.out.println("Name is:"+bookingDetails.name);
        System.out.println("Contact Number is:"+bookingDetails.contactNumber);
        System.out.println("Email :"+bookingDetails.email);
        System.out.println("Ticket Price :"+bookingDetails.ticketPrice);
        System.out.println("Number of Seats:"+bookingDetails.numberOfSeats);
    }
}
