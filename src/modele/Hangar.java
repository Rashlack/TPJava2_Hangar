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
    private double superficieHangar;
    private String type;
    private boolean statut;
    private int idHangar;
    private ArrayList<Avion>mesAvions;

    public Hangar() {
    }
    
    public Hangar(int idHangar, String type, double superficie) {
        this.superficieHangar = superficie;
        this.type = type;
        this.idHangar = idHangar;
        mesAvions=new ArrayList();
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public ArrayList<Avion> getMesAvions() {
        return mesAvions;
    }

    public double getSuperficieHangar() {
        return superficieHangar;
    }

    @Override
    public String toString() {
        return "Hangar{" + "superficie=" + superficieHangar + ", type=" + type + ", statut=" + statut + ", idHangar=" + idHangar + ", mesAvions=" + mesAvions + '}';
    }
    
    public int calculerNbrAvion(){
        int nbrAvion = mesAvions.size();
        return nbrAvion;
    }
    
}
