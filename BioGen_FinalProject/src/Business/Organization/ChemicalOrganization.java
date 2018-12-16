/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.ChemicalInventory.ChemicalCompound;
import Business.MedicalInventory.MedicalInventory;
import Business.Role.ChemicalRole;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kasai
 */
public class ChemicalOrganization extends Organization{
    
    
     public ChemicalOrganization() {
        super(Organization.Type.Chemical.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ChemicalRole());
        return roles;
    }

    
}
