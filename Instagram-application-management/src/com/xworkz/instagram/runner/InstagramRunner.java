package com.xworkz.instagram.runner;

import com.xworkz.instagram.repository.InstagramUserRepository;
import com.xworkz.instagram.repository.InstagramUserRepositoryImplementation;
import com.xworkz.instagram.things.InstagramUserDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstagramRunner {
    public static void main(String[] args) {
       InstagramUserDetails instagramUserDetails= new InstagramUserDetails();
       instagramUserDetails.setName("Shubha");
       instagramUserDetails.setEmail("shubha@gmail.com");
       instagramUserDetails.setDateOfBirth(LocalDate.of(2006,7,12));
       instagramUserDetails.setCreatedOn(LocalDateTime.now());
        System.out.println(instagramUserDetails.toString());
        InstagramUserDetails user1= new InstagramUserDetails();
        user1.setName("Monika");
        user1.setEmail("monika@gamil.com");
        user1.setDateOfBirth(LocalDate.of(2003,2,17));
        user1.setCreatedOn(LocalDateTime.now());
        System.out.println(user1.toString());
        InstagramUserDetails user2= new InstagramUserDetails();
        user2.setName("Keerthan");
        user2.setEmail("keerthan@gamil.com");
        user2.setDateOfBirth(LocalDate.of(2007,4,2));
        user2.setCreatedOn(LocalDateTime.now());
        System.out.println(user2.toString());
        System.out.println("...Welcome to Instagram...");
        //Create a instance of Repository
        InstagramUserRepository repo = new InstagramUserRepositoryImplementation();
        repo.saveUserDetails( instagramUserDetails);
        repo.saveUserDetails( user1);
        repo.saveUserDetails( user2);
        repo.raedInstagramUsers();
        repo.findUserDetails("Shubha","shubha@gmail.com");
    }
}
