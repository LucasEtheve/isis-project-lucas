/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.Calendar;

/**
 *
 * @author letheve
 */
public class Liste_effet {

    private final Scenario scenario;

    private final Effet effet;
    
    private int repetition;

    public Liste_effet(Scenario scenario, Effet effet, int repetition) {
        this.scenario = scenario;
        this.effet = effet;
        this.repetition = repetition;
    }

    public Scenario getScenario() {
        return scenario;
    }

    public Effet getEffet() {
        return effet;
    }

    public int getRepetition() {
        return repetition;
    }
    
    
    
}
