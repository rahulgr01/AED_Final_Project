/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Diagnostics;

/**
 *
 * @author Dell
 */
public class PharmacyMedicine {
    private String name;
    private PharmacyCategory category;
    private double price;
    private int qty;

    public PharmacyCategory getCategory() {
        return category;
    }

    public void setCategory(PharmacyCategory category) {
        this.category = category;
    }
    
   
    public PharmacyMedicine(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
}