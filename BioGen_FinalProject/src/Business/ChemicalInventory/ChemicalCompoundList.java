/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ChemicalInventory;
import Business.MedicalInventory.MedicalInventory;
import java.util.ArrayList;

/**
 *
 * @author kasai
 */
public class ChemicalCompoundList {
    
    private ArrayList<ChemicalCompound> chemicalList;

    public ChemicalCompoundList() {
        chemicalList =  new ArrayList<ChemicalCompound>();
    }

    public ArrayList<ChemicalCompound> getChemicalList() {
        return chemicalList;
    }

    public void setChemicalList(ArrayList<ChemicalCompound> chemicalList) {
        this.chemicalList = chemicalList;
    }
    
    public ChemicalCompound addChemial()
    {
        ChemicalCompound ci = new ChemicalCompound();
        chemicalList.add(ci);
        return ci;
    }
    
    public void deleteChemical(ChemicalCompound cid){
     chemicalList.remove(cid);
    }
    
    
    
}
