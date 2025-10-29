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
    char size;
    Clothing[] clothings = new Clothing[0];
    
    public void addClothings(Clothing clothing) {
    
       this.clothings = Arrays.copyOf(clothings, clothings.length + 1);
        clothings[clothings.length - 1] = clothing;
        
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
    
    public void setSize(int size) {
        
         switch (size) {
           case 1,2,3 : this.size = 'S';
                break;
           case 4,5,6 : this.size = 'M';
                break;
           case 7,8,9 : this.size = 'L';
                break;
           default : this.size = 'X';
       }
        
    
    }
    
    public String getName(){
        return this.name;
    
    }
    
    public void setName(String name) {
        this.name = name;
    
    }
    
    
    
}
