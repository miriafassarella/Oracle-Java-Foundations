/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package quiz.humanresource;

/**
 *
 * @author opc
 */
public class Employee {
    
   private String name;
   private Department department;
   
   public String getName() {
       return name;
   }
    
   public void getName(String name) {
       this.name = name;
   }
   
   public Department getDepartment() {
       return department;
   }
   public void setDepartment(Department department) {
       this.department = department;
   }
    
    
}
