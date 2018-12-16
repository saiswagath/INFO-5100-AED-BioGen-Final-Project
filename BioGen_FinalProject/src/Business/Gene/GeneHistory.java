/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Gene;

import java.util.ArrayList;

/**
 *
 * @author vgout
 */
public class GeneHistory {
    
      private ArrayList<Gene> geneHistory;

    public GeneHistory() {
        
        geneHistory = new ArrayList<Gene>();
        
    }

    public ArrayList<Gene> getGeneHistory() {
        return geneHistory;
    }

    public void setGeneHistory(ArrayList<Gene> geneHistory) {
        this.geneHistory = geneHistory;
    }
    
    public Gene addGeneList()
   {
       Gene gen = new Gene();
       geneHistory.add(gen);
       return  gen;
       
   }
      
      
    
}
