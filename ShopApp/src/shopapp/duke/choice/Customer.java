/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopapp.duke.choice;
import java.util.Arrays;
/**
 *
 * @author opc
 */
public class Customer {
    
    String name;
    String size;
    Clothing[] clothings = new Clothing[0];
    
    public void addClothings(Clothing clothing) {
    
       this.clothings = Arrays.copyOf(clothings, clothings.length + 1);
        clothings[clothings.length - 1] = clothing;
        
    }
    
    public String getName(){
        return this.name;
    
    }
    
    public void setName(String name) {
        this.name = name;
    
    }
    
    
    
}
