/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopapp.duke.choice;

/**
 *
 * @author opc
 */
public class Clothing implements Comparable<Clothing>{
    
    String description;
    double price;
    String size = "M";
    
    static final double PRICE_MINIMUM = 10;
    static final double TAX_RATE = 0.2;

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }
    
    @Override
    public String toString(){
        
        return getDescription() + ", " + getSize() + ", " + getPrice();
        
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    

    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }
        
    
    
    
    
}
