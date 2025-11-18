/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;

import java.util.Arrays;



/**
 *
 * @author opc
 */
public class Department {
    
    private String name;
    
    private final Employee[] employees = new Employee[10];
   
    
    public Department(String name){
        this.name = name;
    }
    
    public void addEmployee(Employee employee){
        
        for (int i = 0; i < this.employees.length; i++) {
            
            if (this.employees[i] == null) {
                this.employees[i] = employee;
                
                break;
            }
        
        }
      
    }
    
    public Employee[] printEmployees(){
        
        Employee[] newEmployee = new Employee[0];
        
       for (int i = 0; i < this.employees.length; i++) {
           
           if (this.employees[i] != null) {
              newEmployee = Arrays.copyOf(newEmployee, newEmployee.length + 1);
              newEmployee[i] = this.employees[i];
           }
          }
    
       return newEmployee;
    
    }
    
    public Employee findId(int id) {
       
        Employee emp = new Employee();
    
        for (Employee employee : this.employees) {
            
            if (employee != null && employee.getId() == id) {
            emp = employee;
            }
            }
        
            return emp;
         }
    
    public int numberEmployee() {
        int number = 0;
    
        for (Employee employee : this.employees) {
            if (employee != null) {
                number++;
            }
        }
        return number;
    }
    
    public double averageSalary(){
        double average = 0;
        int count = 0;      
        for (Employee employee : this.employees) {
            if (employee != null) {
            average += employee.getSalary();
            count++;
         }
          
               }
        
        return average /count;
        }
        
    
    public double totalSalary(){
        
        double total = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
            total += employee.getSalary();
            
            }
            
        
        }
        return total;
    }
    
    @Override
    public String toString() {
    
        return "Department Name: " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
