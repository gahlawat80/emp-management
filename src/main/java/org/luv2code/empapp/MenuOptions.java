package org.luv2code.empapp;

import java.util.List;
import java.util.Scanner;

public class MenuOptions {
    private static Scanner scan;
    private static EmployeeService employeeService;

    public MenuOptions(){
        employeeService = new EmployeeService();
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
                    List<Employee> employees = employeeService.showAllEmployees();
                    System.out.println(employees);
                    break;
                case 2:
                    Employee e = employeeService.addEmployee(userEmployee());
                    System.out.println(e);
                    break;
                case 3:
                    Employee updateEmp = employeeService.updateEmployee(userEmployee());
                    System.out.println(updateEmp);
                    break;
                case 4:
                    System.out.println("Please enter existing employee id for removal from the list");
                    employeeService.deleteEmployee(scan.nextInt());
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

    private static Employee userEmployee(){
        Employee emp = new Employee();
        System.out.println("Please enter employee ID: ");
        emp.setEmpId(scan.nextInt());
        System.out.println("Please enter employee name: ");
        emp.setEmpName(scan.next());
        System.out.println("Please enter department: ");
        emp.setDept(scan.next());
        System.out.println("Please enter salary: ");
        emp.setSalary(scan.nextDouble());
        System.out.println("Please enter manager name: ");
        emp.setManager(scan.next());
        return emp;
    }
}
