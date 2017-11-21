/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UPMC.SAC;

import java.util.ArrayList;

/**
 *
 * @author licence
 */
public class View {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        ArrayList<Object> liste = new ArrayList<>();
        
        Sac sac1 = new Sac("Rouge", "Rectangulaire","Feuilles");
        Sac sac2 = new Sac("Vert", "Carree","Stylos");
        sac1.addList("Trousse");
        liste.add(1, "Stylos");
           }
    
}
