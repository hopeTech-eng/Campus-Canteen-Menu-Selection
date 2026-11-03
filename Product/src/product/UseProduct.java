/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

/**
 *
 * @author HOPEWELL
 */
public class UseProduct {
    
    public static void main(String[] args){
    Perishable perish = new Perishable("Joghurt 500ml");
    NonPerishable nonPerish = new NonPerishable("Swivel mop");
    
          perish.setPrice(11.99);
          nonPerish.setPrice(19.99);
          
        System.out.println("Perishable product " + perish + " costs R" + perish.getPrice() );
        System.out.println("NonPersihable product " + nonPerish + " costs R" + nonPerish.getPrice());
        
  
    }

    
}
