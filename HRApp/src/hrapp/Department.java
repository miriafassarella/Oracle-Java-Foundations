/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;




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
              newEmployee[i] = this.employees[i];
           }
          }
    
       return newEmployee;
    
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
