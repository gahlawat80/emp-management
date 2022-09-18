package org.luv2code.empapp;

import java.util.Scanner;

public class MenuOptions {
    private Scanner scan;

    public MenuOptions(){
        this.scan = new Scanner(System.in);
    }

    private void showMenuOptions(){
        System.out.println("Welcome to Employee Management App");
        System.out.println("1-Show All Employees\n" +
                "2-Add an Employee\n" +
                "3-Update an Employee\n" +
                "4-Delete an Employee\n" +
                "5-Show All Employees matching a name\n" +
                "6-Show an Employee for a given employee id\n" +
                "7-Exit application");
    }

    public void startApplication() {
        boolean isExit = false;

        do {
            showMenuOptions();
            System.out.println("Please enter your choice...");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("View all employees");
                    break;
                case 2:
                    System.out.println("Add employees");
                    break;
                case 3:
                    System.out.println("Update employees");
                    break;
                case 4:
                    System.out.println("Delete employees");
                    break;
                case 5:
                    System.out.println("Show employees based on name");
                    break;
                case 6:
                    System.out.println("Show employee based on id");
                    break;
                case 7:
                    System.out.println("Exit");
                    isExit=true;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
        } while (!isExit);
    }
}
