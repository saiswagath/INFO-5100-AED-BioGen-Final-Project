/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Gene.Gene;
import Business.Gene.GeneHistory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vgout
 */
public class Patient {
    
    private int patientId;
    private String patientName;
    private int age;
    private String Gender;
    private String Test;
    private GeneHistory geneHistory;
    private String sex;
    private String newDrug;
    private String clinicalStatus;
    
    public Patient() {
    
        geneHistory = new GeneHistory();
    }

    public String getClinicalStatus() {
        return clinicalStatus;
    }

    public void setClinicalStatus(String clinicalStatus) {
        this.clinicalStatus = clinicalStatus;
    }
    
    public String getNewDrug() {
        return newDrug;
    }

    public void setNewDrug(String newDrug) {
        this.newDrug = newDrug;
    }
    
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    
    public String getTest() {
        return Test;
    }

    public void setTest(String Test) {
        this.Test = Test;
    }
    
    
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public GeneHistory getGeneHistory() {
        return geneHistory;
    }

    public void setGeneHistory(GeneHistory geneHistory) {
        this.geneHistory = geneHistory;
    }
    
    
   
    
      @Override
     public String toString(){
       return this.patientName;
        }  
    

}
