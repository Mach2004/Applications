package com.company;

import java.util.Scanner;

public class Percentagecalci {

    public static void main(String[] args) {
        int total = 1;
        System.out.println("This code is for Calculating percentage");
        Scanner perc = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {

            System.out.println("Enter Marks");
            i = perc.nextInt();

             total = total + i;


        }
        int percentage = total/500;
        System.out.println(percentage);
    }

}

