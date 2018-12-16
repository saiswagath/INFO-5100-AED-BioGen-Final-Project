/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Doctor.Prescription;
import Business.Organization.AdminOrganization;
import Business.WorkQueue.DoctorWorkRequest;
import java.util.Random;

/**
 *
 * @author venu0
 */
public class DataGenerator {
    
    private static Random rand = new Random();
    private static String[] network = {"Boston", "California", "Dallas"};

    private static String[] beginning = {"kr", "ca", "Ra", "Ho", "Lj", "pg", "kre", "lop", "mat"};
    private static String[] middle = {"air", "cal", "Pla", "ghdo", "kal", "hkg", "pokre", "lojop", "mploat"};

    private static String[] hospitalName = {"Mass general","New England Baptist Hospital","Harvard PMR","Boston Lying In Hospital"};

    private static String[] organisationName = {"Doctor", "Lab", "Pharmacy", "Drug", "Chemical"};

    private static String[] medicineName = {"Galafold", "Onpattro", "Revcovi", "Tegsedi", "Haegarda", "Brineura", "Mepsevii", "Spinraza"};
    
    private static String[] diseaseName = {"Achondroplasia","Marfan syndrome","Cystic fibrosis","Tay-Sachs disease","Haemophilia","Mosaicism","Down syndrome","Turner syndrome"};
    
    private static String[] geneName = {"A2M","BAX","CAT","DLL3","EGF","FOS","GH1","HSF1","IGF1","LEP"};
    
    public static String generateNetwork() {
        return network[rand.nextInt(network.length)];
    }
    
     public static String generateHospitalName() {
        return hospitalName[rand.nextInt(hospitalName.length)];
    }
     
      public static String generationOrganisationName() {
        return organisationName[rand.nextInt(organisationName.length)];
    }
      
    public static String generateMedicine() {

        return medicineName[rand.nextInt(medicineName.length)];

    }
    
     public static String generateDisease() {

        return diseaseName[rand.nextInt(diseaseName.length)];

    }
     
    public static String generateGenes() {

        return geneName[rand.nextInt(geneName.length)];

    }
     
     public static Prescription InitMedicineName() {

        Prescription pres = new Prescription();
        pres.setMedicineName(generateMedicine());
        pres.setNetworkName(generateNetwork());
        
        return pres;

    }
     
     public static AdminOrganization InitOrgName() {

        AdminOrganization admin = new AdminOrganization();

        admin.setOrganisationName(generationOrganisationName());
        return admin;

    }
    
     public static Prescription InitdiseaseName() {

        Prescription pres = new Prescription();
        pres.setNetworkName(generateNetwork());
        pres.setDaignosis(generateDisease());
        return pres;

    }
    
    
}
