/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author vgout
 */
public class ChemicalWorkRequest extends WorkRequest{
    
   
    private String status;
    private String chemicalName;
    private int Quantity;
    private String deliveryTime;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getChemicalName() {
        return chemicalName;
    }

    public void setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
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
     @Override
    public String toString() {
        return chemicalName;
    }
    
    
    
}
