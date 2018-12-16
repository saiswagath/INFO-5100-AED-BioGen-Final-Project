/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

/**
 *
 * @author vgout
 */
public class Physician {
    private String docotrName;
      private PrescriptionList prescriptionList;

      
    public Physician(){
        prescriptionList= new PrescriptionList();
    }  
      
    public String getDocotrName() {
        return docotrName;
    }

    public void setDocotrName(String docotrName) {
        this.docotrName = docotrName;
    }

    public PrescriptionList getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(PrescriptionList prescriptionList) {
        this.prescriptionList = prescriptionList;
    }
      
      
    
    
}
