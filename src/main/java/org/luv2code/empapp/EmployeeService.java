package org.luv2code.empapp;

import java.util.ArrayList;
import java.util.Iterator;
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
        for(Employee e:employeeList){
            if(emp.getEmpId() == emp.getEmpId()){
                System.out.println("Employee already added to the list");
                return null;
            }
        }
        try {
            this.employeeList.add(emp);
            return emp;
        } catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public Employee updateEmployee(Employee employee){
        boolean isEmployeeFound=false;
        System.out.println("Updating employee in the list");
        if(employee !=null){
            for(Employee e:employeeList){
                if(e.getEmpId() == employee.getEmpId()){
                    System.out.println("Updating employee details");
                    if(employee.getEmpName()!=null && employee.getEmpName() !=""){
                        e.setEmpName(employee.getEmpName());
                    } else {
                        System.out.println("Employee name is invalid. So name is not changed!");
                    }
                    if(employee.getDept()!=null && employee.getDept() !=""){
                        e.setDept(employee.getDept());
                    }else {
                        System.out.println("Department is invalid. So department is not changed!");
                    }
                    if(employee.getManager()!=null && employee.getManager() !=""){
                        e.setManager(employee.getManager());
                    }else {
                        System.out.println("Manager is invalid. So name is not changed!");
                    }
                    if(employee.getSalary()!=0.0){
                        e.setSalary(employee.getSalary());
                    }else {
                        System.out.println("Salary value is invalid. Salary not changed!");
                    }
                    isEmployeeFound = true;
                    return e;
                }
            }
            if(!isEmployeeFound){
                System.out.println("No Employee found for ID="+employee.getEmpId());
            }
        }
        return null;
    }

    public void deleteEmployee(int empId){
        boolean isEmployeeFound = false;
        System.out.println("Trying to delete employee from the list");

        Iterator itr = this.employeeList.iterator();

        while(itr.hasNext()){
            Employee emp = (Employee) itr.next();
            if(emp.getEmpId() == empId){
                isEmployeeFound=true;
                itr.remove();
                System.out.println(emp.getEmpName()+" is removed from the list!");
            }
        }

        if(!isEmployeeFound){
            System.out.println("Employee with ID: "+empId+" NOT found in the list!");
        }
    }
}
