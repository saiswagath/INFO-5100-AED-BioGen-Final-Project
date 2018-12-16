/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import Business.Chemical.ChemicalList;
import Business.Gene.GeneHistory;

/**
 *
 * @author vgout
 */
public class Drug {
   
    private int drugId;
    private String drugName;
    private ChemicalList chemicalList;
    private GeneHistory geneHistory;
    private static int counter=0;
    
    public Drug(){
        chemicalList = new ChemicalList();
        geneHistory = new GeneHistory();
        drugId = counter;
        ++counter;
         
    }

    public int getDrugId() {
        return drugId;
    }
    
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public ChemicalList getChemicalList() {
        return chemicalList;
    }

    public void setChemicalList(ChemicalList chemicalList) {
        this.chemicalList = chemicalList;
    }

    public GeneHistory getGeneHistory() {
        return geneHistory;
    }

    public void setGeneHistory(GeneHistory geneHistory) {
        this.geneHistory = geneHistory;
    }
    
    
    
    @Override
     public String toString(){
       return this.drugName;
        }  
    
}
