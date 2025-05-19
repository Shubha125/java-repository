package com.xworkz.application.runner;

public class Degree {
    public static void main(String[] args) {
        String degreeNames[]={"BCA","BE","Btech","MCA","MSc"};
        System.out.println("accessing the array element using index number");

        // length of the array
        System.out.println("length of the array element:"+degreeNames.length);
        System.out.println("accessing array element ");
        for(int i=degreeNames.length-1; i>=0; i--){
            System.out.println(degreeNames[i]);
        }
    }
}
