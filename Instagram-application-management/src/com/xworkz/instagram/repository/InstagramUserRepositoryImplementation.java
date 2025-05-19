package com.xworkz.instagram.repository;

import com.xworkz.instagram.things.InstagramUserDetails;

public class InstagramUserRepositoryImplementation implements InstagramUserRepository {
    //Array
    private InstagramUserDetails[] ListOfUsers = new InstagramUserDetails[3];
    private int index=0;
    @Override
    public void saveUserDetails(InstagramUserDetails details){
        System.out.println("Details:"+details);
        if(this.index<ListOfUsers.length){
            System.out.println("We can save the details");
            ListOfUsers[this.index]=details;
            this.index++;
            System.out.println("Saved Successfully.");
        }
        else {
            System.err.println("Array is full we can't save the data..");
        }
    }
    @Override
    public void raedInstagramUsers(){
        System.out.println("Reading Instagram user details.");
        for(InstagramUserDetails details : ListOfUsers){
            System.out.println("User Details:"+details);
        }
    }
    @Override
    public void findUserDetails(String name){
        System.out.println("Find user detail method invoked");
        for (int i = 0; i < ListOfUsers.length; i++) {
            if(ListOfUsers[i].getName().equalsIgnoreCase(name)){
                System.out.println("User is Present");
                System.out.println("Datails are:"+ListOfUsers[i]);
            }

        }
    }
    @Override
    public void findUserDetails(String name,String email){
        System.out.println("Find user details Method invoked"+name+" , "+email);
        for (int i = 0; i < ListOfUsers.length; i++) {
            if(ListOfUsers[i].getName().equalsIgnoreCase(name)&&ListOfUsers[i].getEmail().equalsIgnoreCase(email)){
                System.out.println("User is present");
                System.out.println("User detail are:"+ListOfUsers[i]);
            }
//            else{
//                System.out.println("User is not found");
//            }

        }
    }
}
