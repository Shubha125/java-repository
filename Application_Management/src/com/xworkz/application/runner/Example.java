package com.xworkz.application.runner;

public class Example {
    public static void main(String[] args) {
        int[] numbers={69,42,54,92,10};
        System.out.println("Length of the number"+numbers.length);
        System.out.println("reverse of numbers");
        for(int i=numbers.length-1; i>=0; i--){
            System.out.print(numbers[i]);
            System.out.print(" ");
            int evennumbers=0;
            int oddnumbers=0;
            if(i%2==0) {
                evennumbers++;
            }
                else{
                   oddnumbers++;
                }
            }
        }
    }
}
