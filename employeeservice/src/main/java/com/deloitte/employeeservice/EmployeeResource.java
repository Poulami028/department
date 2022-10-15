package com.deloitte.employeeservice;

import java.util.ArrayList;
import java.util.List;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/employeeservice")//link for server
public class EmployeeResource {



   Employees employees = new Employees();
    
    @GetMapping("/employees/{employeeid}")
    public List<Employees> emp() {
        
        List<Employees> employeeList = new ArrayList<Employees>();
        
        employeeList.add(new Employees(001,"Harry",1000.00));
        employeeList.add(new Employees(002,"Ron",2000.00));
        employeeList.add(new Employees(003,"Hermione",3000.00));
        
        return employeeList;
    }
}
