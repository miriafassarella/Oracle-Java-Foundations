/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.humanresource;

/**
 *
 * @author opc
 */
public class DepartmentFinder {
    
    public static Department find(String name) {
        Department dep = new Department();
        dep.setName(name);
        
        return dep;
        
    }
    
}
