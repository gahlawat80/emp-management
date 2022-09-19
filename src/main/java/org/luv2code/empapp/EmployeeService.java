package org.luv2code.empapp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employeeList;

    public EmployeeService(){
        employeeList = new ArrayList<>();
    }

    public List<Employee> showAllEmployees(){
        System.out.println("Showing list of employees....");
        return this.employeeList;
    }

    public Employee addEmployee(Employee emp){
        System.out.println("Adding employee to the list.");
        try {
            this.employeeList.add(emp);
            return emp;
        } catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        return null;
    }

}
