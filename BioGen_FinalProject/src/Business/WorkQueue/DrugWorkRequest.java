/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Chemical.Chemical;
import Business.Doctor.Patient;
import Business.Drug.Drug;
import Business.Drug.DrugList;
import Business.Gene.Gene;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vgout
 */
public class DrugWorkRequest extends WorkRequest{
    
    private String drugName;
    private int Quantity;
    private String deliveryTime;
    private Patient patient;
    private Map<Gene,Chemical>geneChemical;
    private Map<Drug,List<Chemical>>drugChemical;
   
    
   
   
    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Map<Gene, Chemical> getGeneChemical() {
        return geneChemical;
    }

    public void setGeneChemical(Map<Gene, Chemical> geneChemical) {
        this.geneChemical = geneChemical;
    }

    public Map<Drug, List<Chemical>> getDrugChemical() {
        return drugChemical;
    }

    public void setDrugChemical(Map<Drug, List<Chemical>> drugChemical) {
        this.drugChemical = drugChemical;
    }

    
    @Override
     public String toString(){
       return this.drugName;
        }  
    

    
    
    
    
}
