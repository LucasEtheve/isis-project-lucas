/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author letheve
 */
public class ChangerMessage extends Effet {

    public String message;

    public ChangerMessage(String message) {
        this.message = message;
    }

    @Override
    public void jouerEffet(Bandeau monBandeau) {
        monBandeau.setMessage(message);
    }
}
