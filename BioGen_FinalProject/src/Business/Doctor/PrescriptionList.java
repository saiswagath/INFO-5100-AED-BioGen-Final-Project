/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import java.util.ArrayList;

/**
 *
 * @author vgout
 */
public class PrescriptionList {
      private ArrayList<Prescription> prescriptionList;
    
    public PrescriptionList(){
        prescriptionList=new ArrayList<Prescription>();
    }

    public ArrayList<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(ArrayList<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }
    
    public Prescription addPrescription(){
        Prescription prescription=new Prescription();
         prescriptionList.add(prescription);
         return prescription;
        
    }
}
