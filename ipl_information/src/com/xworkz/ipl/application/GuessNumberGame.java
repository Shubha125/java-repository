package com.xworkz.ipl.application;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random=new Random();
        int systemNumber=random.nextInt(10);
        System.out.println("Welcome TO number Guessing Game");
        System.out.println("Enter the  number of your choice between 1 to 100");
        Scanner scanner=new Scanner(System.in);
        int userNumber= scanner.nextInt();
        if(systemNumber==userNumber)
        {
            System.out.println("Number is Matches...");
            System.out.println("System Number is:"+systemNumber);
            System.out.println("User Number is:"+userNumber);
        }
        else{
            System.out.println("Number is Not Matches...");
            System.out.println("System Number is:"+systemNumber);
            System.out.println("User Number is:"+userNumber);

        }
    }
}
