/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author 1795511
 */
public class Hangar {
    private String superficie;
    private String type;
    private boolean statut;
    private int idHangar;
    private ArrayList<Avion>mesAvions;

    public Hangar() {
    }

    public Hangar(String superficie, String type, boolean statut) {
        this.superficie = superficie;
        this.type = type;
        this.statut = statut;
        mesAvions=new ArrayList();
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Hangar{" + "superficie=" + superficie + ", type=" + type + ", statut=" + statut + ", idHangar=" + idHangar + ", mesAvions=" + mesAvions + '}';
    }
    
    
}
