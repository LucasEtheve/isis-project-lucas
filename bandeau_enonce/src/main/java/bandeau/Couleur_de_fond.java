/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

/**
 *
 * @author letheve
 */
public class Couleur_de_fond extends Effet {
    public Color color;

    public Couleur_de_fond(Color color) {
        this.color = color;
    }
    
    @Override
    public void jouerEffet(Bandeau monBandeau) {
        monBandeau.setBackground(this.color);
        monBandeau.sleep(80);
    }

}
