/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author venu0
 */
public class ChemicalEnterprise extends Enterprise{
    
     public ChemicalEnterprise(String name){
        super(name,EnterpriseType.Chemical);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
