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
public class Couleur_texte extends Effet {

    public Color color;

    public Couleur_texte(Color color) {
        this.color = color;
    }

    @Override
    public void jouerEffet(Bandeau monBandeau) {
        monBandeau.setForeground(this.color);
        monBandeau.sleep(1000);
    }

}
