/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Pharmacy;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;
public class MedicineInventory {
    ArrayList<Medicine> medicineList = new ArrayList<Medicine>();
     

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    public void addItem(Medicine item){
        medicineList.add(item);
    }
    
    public void removeItem(Medicine item){
        medicineList.remove(item);
    }
  
}
