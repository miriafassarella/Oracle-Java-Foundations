/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopapp.duke.choice;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author opc
 */
public class Customer {
    
    String name;
    char size;
     Clothing[] clothes = new Clothing[0];
    
    public void addClothings(Clothing clothing) {
    
       this.clothes = Arrays.copyOf(clothes, clothes.length + 1);
        clothes[clothes.length - 1] = clothing;
        
    }
    
    public Clothing[] list() {
    
        return this.clothes;
    }
    
    public double getTotalClothingCost() {
        double total = 0;
    
        for (Clothing item : this.clothes) {
            total += item.getPrice();
        }
    
        return total;
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
