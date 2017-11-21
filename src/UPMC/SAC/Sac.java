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
public class Sac {
    String coul = "Noir";
    String form;
    String contener;
    ArrayList<Object> liste;
    
    //Constructeur
    public Sac(String couleur, String forme, String contenu) {
        this.coul=couleur;
        this.form=forme;
        this.contener=contenu;
        this.liste = new ArrayList<Object>();
    }
    
    public void addContenu(String addContenu) {
        this.contener = this.contener + " , " + addContenu;
    }
    
    
    public void addList(Object o) {
       this.liste.add(o);
    }
    
    public void afficherList(ArrayList<Sac> liste)
    {
        for (int i=0; i<liste.size(); i++) {
            System.out.println(liste.get(i));
        }
    }
    
    public String toString() {
        return "C'est un sac "+coul+ " avec des " + contener + " et avec la forme "+form;
    }   
}
