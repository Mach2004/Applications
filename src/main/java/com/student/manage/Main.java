package com.student.manage;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        while(true) {
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to delete student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to exit app");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(br.readLine());
            Scanner in = new Scanner(System.in);
            Student St = null;
            if (input == 1) {
                // add student
                System.out.println("Enter user name :");
                String name = br.readLine();
                System.out.println("Enter user Phone");
                String phone = br.readLine();
                System.out.println("Enter user age");
                int age = in.nextInt();
                St = new Student(name, phone, age);
                boolean answer = StudentDao.insertStudentToDB(St);
                if (answer == true) {
                    System.out.println("The student is added successfully...");

                } else {
                    System.out.println("Something went wrong...");
                }

                System.out.println(St);


            } else if (input == 2) {
                //delete student
                System.out.println("Enter Student ID to delete");
                int userID = Integer.parseInt(br.readLine());
                boolean answer = StudentDao.deleteStudentFromDB(userID);
                if (answer == true) {
                    System.out.println("Student is Deleted Successfully");


                } else {
                    System.out.println("Something went wrong while deleting...");
                }
            } else if (input == 3) {
                System.out.println(StudentDao.DisplayStudentFromDB());
                //display student

            } else if (input == 4) {
                //exit app
                break;
            } else {

            }
        }
        System.out.println("Thank you for using my app");
        System.out.println("See you soon ");
    }
}