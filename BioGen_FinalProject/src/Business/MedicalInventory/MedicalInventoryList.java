/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalInventory;

import java.util.ArrayList;

/**
 *
 * @author venu0
 */
public class MedicalInventoryList {
    
     private ArrayList<MedicalInventory> medicineList;

    public MedicalInventoryList() {
        medicineList=new ArrayList<>();
        }

    public ArrayList<MedicalInventory> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<MedicalInventory> medicineList) {
        this.medicineList = medicineList;
    }
    
     public MedicalInventory addMedicine()
    {
        MedicalInventory mi = new MedicalInventory();
        medicineList.add(mi);
        return mi;
    }
    
    public void deleteMedicine(MedicalInventory mi){
     medicineList.remove(mi);
    }
}
