/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Diagnostics;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;

/**
 *
 * @author rahul-bhiwande
 */
public class PharmacyInventory {
    ArrayList<PharmacyMedicine> itemList = new ArrayList<PharmacyMedicine>();

    public ArrayList<PharmacyMedicine> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<PharmacyMedicine> itemList) {
        this.itemList = itemList;
    }
    
    public void addItem(PharmacyMedicine item){
        itemList.add(item);
    }
    
    public void removeItem(PharmacyMedicine item){
        itemList.remove(item);
    }
}
