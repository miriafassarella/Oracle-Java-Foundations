/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shopapp.duke.choice;
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
        
        
        
        Customer client = new Customer("Pinky", 3);
        client.setSize(3);
        
        
        item1 = new Clothing("Blue Jacket", 20.9, 'M');
        item2 = new Clothing("Orange T-Shirt", 10.5, 'S');
      
          
        //System.out.println("Item 1 : ");
        //System.out.printf("Description: %s, Price: %f, Size: %c%n", item1.description, item1.price, item1.size);
        //System.out.println("Item 2 : ");

        //System.out.printf("Description: %s, Price: %f, Size: %c%n", item2.description, item2.price, item2.size);
        
       client.addClothings(item1);
       client.addClothings(item2);
       client.addClothings(item2);
       
      Clothing[] items = {item1, item2, new Clothing("Greem Scarf", 5, 'S'), new Clothing("Blue T-Shirt", 10.5, 'S')};
      
     
       
       for (int i = 0; i < client.clothes.length; i++) {
           
           System.out.println(client.clothes[i].description);
           
           
           
         // total += client.clothings[i].price + (client.clothings[i].price * tax);
       
       }
       
      
        
       System.out.printf("Total da compra do client 1 : %.2f%n", client.getTotalClothingCost());
       
       
      
    
    }
    
    
}
