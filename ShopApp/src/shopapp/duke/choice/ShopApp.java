/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shopapp.duke.choice;
import java.util.Arrays;
/**
 *
 * @author opc
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double total = 0;
        
       
        Clothing item1; 
        Clothing item2;
        
        
        
        Customer client = new Customer();
        client.name = "Aline";
        client.setSize(3);
        
        
        item1 = new Clothing();
        item2 = new Clothing();
        
        
        
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = 'M';
        
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = 'S';
        
        
        
        
        //System.out.println("Item 1 : ");
        //System.out.printf("Description: %s, Price: %f, Size: %c%n", item1.description, item1.price, item1.size);
        //System.out.println("Item 2 : ");

        //System.out.printf("Description: %s, Price: %f, Size: %c%n", item2.description, item2.price, item2.size);
        
       client.addClothings(item1);
       client.addClothings(item2);
       client.addClothings(item2);
       
      Clothing[] items = {item1, item2, new Clothing(), new Clothing()};
      
      
        items[2].description = "Greem Scarf";
        items[2].price = 5;
        items[2].size = 'S';
        
        items[3].description = "Blue T-Shirt";
        items[3].price = 10.5;
        items[3].size = 'S';
       
       for (int i = 0; i < client.clothes.length; i++) {
           
           System.out.println(client.clothes[i].description);
           
           
           
         // total += client.clothings[i].price + (client.clothings[i].price * tax);
       
       }
       
       for (Clothing item : items ) {
           
           
           if (client.getSize() == item.size) {
               
               total += item.getPrice();
               System.out.println(item.description);
               
               if (total > 15) {
                   break;
               }
           }
           
           
       
       }
        
       System.out.printf("Total da compra do client 1 : %.2f%n", total);
       
       
      
    
    }
    
    
}
