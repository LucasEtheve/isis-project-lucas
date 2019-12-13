/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.*;

/**
 *
 * @author letheve
 */
public class Scenario {

    public String nom;
    private final List<Liste_effet> effets = new LinkedList<>();
    public Bandeau bandeau;

    public Scenario(String nom, Bandeau bandeau) {
        this.nom = nom;
        this.bandeau = bandeau;
    }
    
    public void ajouteffet(Effet effet, int repetition) {
        Liste_effet nouvelleListeEffet= new Liste_effet(this, effet, repetition);
        effets.add(nouvelleListeEffet);
    }
    
    public void enchainement(Bandeau monBandeau){
        for (Liste_effet e : effets){
            for (int i=0; i < e.getRepetition();i++){
                e.getEffet().jouerEffet(monBandeau);
            }
        }
    }

    public String getNom() {
        return nom;
    }

    public List<Liste_effet> getEffets() {
        return effets;
    }
}
