/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

import Business.Gene.Gene;
import java.util.List;

/**
 *
 * @author vgout
 */
public class Disease {
    private int diseaseId;
    private String diseaseName;
    private List<Gene> diseaseGene;

    public int getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(int diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public List<Gene> getDiseaseGene() {
        return diseaseGene;
    }

    public void setDiseaseGene(List<Gene> diseaseGene) {
        this.diseaseGene = diseaseGene;
    }
    
}
