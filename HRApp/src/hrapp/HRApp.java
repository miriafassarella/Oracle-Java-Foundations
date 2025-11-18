/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hrapp;

/**
 *
 * @author opc
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Employee employee1 = new Employee(1, "Luc", 2.500);
        Employee employee2 = new Employee(2, "Olivier", 3.100);
        Employee employee3 = new Employee(3, "Marc", 3.300);
        Employee employee4 = new Employee(4, "François", 4.000);
        Employee employee5 = new Employee(5, "Xavier", 2.000);
        Employee employee6 = new Employee(6, "Louis", 1.500);
        
       
        
        Department department1 = new Department("Information");
        
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        
        for (Employee employee : department1.printEmployees()) {
            System.out.println("[] " + employee);
        }
        
        System.out.println("number "+ department1.findId(2));
        System.out.println("Quantidade de funcionarios : " + department1.numberEmployee());
        System.out.printf("Average salary : %.2f%n",department1.averageSalary());
        System.out.printf("Total salary: %.2f%n", department1.totalSalary());
       
    }
    
}
