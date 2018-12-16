/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Chemical.ChemicalList;
import Business.ChemicalInventory.ChemicalCompound;
import Business.Drug.DrugList;
import Business.Gene.GeneHistory;
import Business.Role.DrugRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kasai
 */
public class DrugOrganization extends Organization{
    
  private ArrayList<ChemicalCompound> chemList;

    public DrugOrganization() {
        
        super(Organization.Type.Drug.getValue());
        chemList =  new ArrayList<ChemicalCompound>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DrugRole());
        return roles;
    }

    
    public ArrayList<ChemicalCompound> getChemList() {
        return chemList;
    }

    public void setChemList(ArrayList<ChemicalCompound> chemList) {
        this.chemList = chemList;
    }

    
    
    public void addChemical(ChemicalCompound cdi)
    {
       
        chemList.add(cdi);
        
    }
    
   
    
}
