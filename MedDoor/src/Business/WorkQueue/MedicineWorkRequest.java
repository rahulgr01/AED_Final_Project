/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Pharmacy.MedicineInventory;

/**
 *
 * @author ashikakalmady
 */
public class MedicineWorkRequest extends WorkRequest{
     public MedicineInventory medicines;

    public MedicineInventory getMedicines() {
        return medicines;
    }

    public void setMedicines(MedicineInventory medicines) {
        this.medicines = medicines;
    }
}
