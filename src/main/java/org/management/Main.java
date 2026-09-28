package org.management;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Student Management App");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("Press 1 for Add Student");
            System.out.println("Press 2 for Delete Student");
            System.out.println("Press 3 for Display Student");
            System.out.println("Press 4 for Exit Application");

            int c = Integer.parseInt(br.readLine());

            if(c == 1){
                System.out.print("Enter user name : ");
                String name = br.readLine();

                System.out.println("Enter user phone : ");
                String phone = br.readLine();

                System.out.println("Enter user city : ");
                String city = br.readLine();

                Student st = new Student(phone , city , name);
                boolean b = DB.insert(st);
                if(b){
                    System.out.println("Student added");
                }else{
                    System.out.println("Exception occured");
                }
            }else if(c == 2){
                System.out.println("Enter the user Name : ");
            }else if(c == 3){

            }else{
                break;
            }
        }

        System.out.println("Thanks for using this Application...");
    }
}