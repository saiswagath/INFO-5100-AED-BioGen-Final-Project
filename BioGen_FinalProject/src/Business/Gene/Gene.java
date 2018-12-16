/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Gene;

/**
 *
 * @author vgout
 */
public class Gene {
    private String geneName;
    private int id;
    private static int count = 1;

    public Gene() {
         id = count;
         count++;
    }
    
    public int getId() {
        return id;
    }

    public String getGeneName() {
        return geneName;
    }

    public void setGeneName(String geneName) {
        this.geneName = geneName;
    }

    @Override
    public String toString() {
        return "Gene{" + "geneName=" + geneName + ", id=" + id + '}';
    }

    
    
    
}
