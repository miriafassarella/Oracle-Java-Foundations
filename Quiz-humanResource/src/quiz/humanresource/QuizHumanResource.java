/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.humanresource;

/**
 *
 * @author opc
 */
public class QuizHumanResource {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee newEmployee = new Employee();
       newEmployee.setName("Luana");
       
       
       Department aDept = DepartmentFinder.find("products");
       
       aDept.assignEmployee(newEmployee);
       aDept.print();
    }
    
}
