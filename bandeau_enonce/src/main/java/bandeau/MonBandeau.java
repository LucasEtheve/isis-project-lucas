/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import static java.awt.Color.*;

/**
 *
 * @author letheve
 */
public class MonBandeau {

    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
        Zoom zoom = new Zoom();
        Effet_rotation rotation = new Effet_rotation();
        Couleur_de_fond fondRouge = new Couleur_de_fond(RED);
        Couleur_de_fond fondBlanc = new Couleur_de_fond(BLACK);
        Couleur_de_fond fondMagenta = new Couleur_de_fond(MAGENTA);
        Couleur_de_fond fondCyan = new Couleur_de_fond(CYAN);
        Couleur_texte texteBlanc = new Couleur_texte(WHITE);
        Couleur_texte texteCyan = new Couleur_texte(CYAN);
        Couleur_texte texteBleu = new Couleur_texte(BLUE);
        ChangerMessage messageA = new ChangerMessage("Bienvenu à tous");
        ChangerMessage messagB = new ChangerMessage("Et c'est partie pour lépilepsie");
        ChangerMessage messageC = new ChangerMessage("FIN");
        Scenario scenario = new Scenario("Scenario1", monBandeau);
        scenario.ajouteffet(messageA, 1);
        scenario.ajouteffet(rotation, 2);
        scenario.ajouteffet(messagB, 1);
        scenario.ajouteffet(zoom, 1);
        scenario.ajouteffet(fondMagenta, 1);
        scenario.ajouteffet(texteBlanc, 1);
        scenario.ajouteffet(fondBlanc, 1);
        scenario.ajouteffet(texteCyan, 1);
        scenario.ajouteffet(texteBleu, 1);
        scenario.ajouteffet(fondCyan, 1);
        scenario.ajouteffet(fondMagenta, 1);
        scenario.ajouteffet(texteBlanc, 1);
        scenario.ajouteffet(texteBlanc, 1);
        scenario.ajouteffet(fondBlanc, 1);
        scenario.ajouteffet(texteCyan, 1);
        scenario.ajouteffet(texteBleu, 1);
        scenario.ajouteffet(fondMagenta, 1);
        scenario.ajouteffet(texteBlanc, 1);
        scenario.ajouteffet(fondCyan, 1);
        scenario.ajouteffet(fondBlanc, 1);
        scenario.ajouteffet(texteCyan, 1);
        scenario.ajouteffet(texteBleu, 1);
        scenario.ajouteffet(fondMagenta, 1);
        scenario.ajouteffet(texteBlanc, 1);
        scenario.ajouteffet(fondCyan, 1);
        scenario.ajouteffet(fondBlanc, 1);
        scenario.ajouteffet(texteCyan, 1);
        scenario.ajouteffet(texteBleu, 1);
        scenario.ajouteffet(fondMagenta, 1);
        scenario.ajouteffet(texteBlanc, 1);
        scenario.ajouteffet(fondCyan, 1);
        scenario.ajouteffet(fondBlanc, 1);
        scenario.ajouteffet(texteCyan, 1);
        scenario.ajouteffet(texteBleu, 1);
        scenario.ajouteffet(messageC, 1);
        scenario.ajouteffet(fondRouge, 1);
        scenario.enchainement(monBandeau);
    }

}
