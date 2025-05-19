package com.xworkz.ipl.runner;

import com.xworkz.ipl.things.IplDetails;

import java.util.Scanner;

public class IplDetailsRunner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the details");
        System.out.println("Enter the team name");
        String teamName=scanner.next();
        System.out.println("Enter the captain name");
        String captainName=scanner.next();
        System.out.println("Enter the number of Players");
        int numberOfPlayers=scanner.nextInt();
        System.out.println("Enter the number of Matches");
        int numberOfMatches=scanner.nextInt();
        IplDetails iplDetails = new IplDetails();
        iplDetails.teamNme=teamName;
        iplDetails.captainName=captainName;
        iplDetails.numberOfPlayers=numberOfPlayers;
        iplDetails.numberOfMatches=numberOfMatches;
        System.out.println("Team Details!!!");
        System.out.println("Team Name is:"+teamName);
        System.out.println("Captain Name is:"+captainName);
        System.out.println("Number of Players:"+numberOfPlayers);
        System.out.println("Number of Matches:"+numberOfMatches);
    }
}
