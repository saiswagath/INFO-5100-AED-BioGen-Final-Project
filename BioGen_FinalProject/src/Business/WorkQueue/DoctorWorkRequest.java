/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author vgout
 */
public class DoctorWorkRequest extends WorkRequest{
    private UserAccount reciver;
    private UserAccount sender;
    private String medicationname;
    private Date requestDate;
    private String status;
    private String hospitalName;
    private String paitentName;
    private String test;
    private int quantity;
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public UserAccount getReciver() {
        return reciver;
    }

    public void setReciver(UserAccount reciver) {
        this.reciver = reciver;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public String getMedicationname() {
        return medicationname;
    }

    public void setMedicationname(String medicationname) {
        this.medicationname = medicationname;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getPaitentName() {
        return paitentName;
    }

    public void setPaitentName(String paitentName) {
        this.paitentName = paitentName;
    }
    
    
    
}
