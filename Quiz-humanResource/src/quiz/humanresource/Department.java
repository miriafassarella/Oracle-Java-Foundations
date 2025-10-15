/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package quiz.humanresource;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author opc
 */
public class Department {
    
    private String name;
    private List<Employee> employees = new ArrayList<>();
    
    public void assignEmployee(Employee employee) {
    
        this.employees.add(employee);
    
    }
    
    public List<Employee> getEmployees() {
        
        return this.employees;
    
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void print() {
        for (Employee employee : this.employees) {
            System.out.println(employee.getName());
            
        }
    
    }
    
    
}
