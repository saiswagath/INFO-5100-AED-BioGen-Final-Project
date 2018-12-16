/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import java.util.ArrayList;

/**
 *
 * @author venu0
 */
public class DrugList {
    
    private ArrayList<Drug> drugList;

    public DrugList() {
        this.drugList = new ArrayList<Drug>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }
    
     public Drug addDrugList()
   {
       Drug drug = new Drug();
       drugList.add(drug);
       return drug;
       
   }
    
}
