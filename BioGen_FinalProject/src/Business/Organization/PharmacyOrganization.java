/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.MedicalInventory.MedicalInventory;
import Business.Role.PharmacyRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kasai
 */
public class PharmacyOrganization extends Organization{

    private ArrayList<MedicalInventory> medList;
    public PharmacyOrganization() {
     
       super(Organization.Type.Pharmacy.getValue());
        medList=new ArrayList<MedicalInventory>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyRole());
        return roles;
    }

    public ArrayList<MedicalInventory> getMedList() {
        return medList;
    }

    public void setMedList(ArrayList<MedicalInventory> medList) {
        this.medList = medList;
    }
    
     public void addMedicine(MedicalInventory mi)
    {
       
        medList.add(mi);
        
    }
    
    
    
}
