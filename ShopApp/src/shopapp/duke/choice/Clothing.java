/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopapp.duke.choice;

/**
 *
 * @author opc
 */
public class Clothing {
    
    String description;
    double price;
    char size = 'M';
    
    final double PRICE_MINIMUM = 10;
    final double TAX_RATE = 0.2;

    public Clothing(String description, double price) {
        this.description = description;
        this.price = price;
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        price += price * TAX_RATE; 
        return price;
    }

    public void setPrice(double price) {
        
        if (price > PRICE_MINIMUM) {
            this.price = price;
        
        }else {
            throw new RuntimeException("O preço não pode ser menor que 10");
        
        }
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
    
    
    
    
    
    
}
