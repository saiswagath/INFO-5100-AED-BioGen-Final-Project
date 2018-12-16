/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Chemical;

import java.util.ArrayList;

/**
 *
 * @author venu0
 */
public class ChemicalList {
     private ArrayList<Chemical> chemList;

    public ChemicalList() {
        this.chemList = new ArrayList<Chemical>();
    }

    public ArrayList<Chemical> getChemList() {
        return chemList;
    }

    public void setChemList(ArrayList<Chemical> chemList) {
        this.chemList = chemList;
    }
   
    
   
    
     public Chemical addChemicalList()
   {
       Chemical c = new Chemical();
       chemList.add(c);
       return c;
       
   }
}
