/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package product;

/**
 *
 * @author HOPEWELL
 */
abstract class Product {
    private String name;
    private double price;
    
    
    public Product(String pName) {
    this.name = pName;

}
   
     public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
  
    @Override
    public String toString() {
        return name;
    }
   
}
