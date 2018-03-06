/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 1795511
 */
public class Hangar implements Serializable {
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
    
    public double calculerSuperficieRestante(){
        double superficieTotalAvion = 0.0;
        for(int i = 0; i < mesAvions.size(); i++){
            superficieTotalAvion = superficieTotalAvion + mesAvions.get(i).getModele().getSuperficie();
        }
        Double superficieRestante = superficieHangar - superficieTotalAvion;     
        return superficieRestante;
    }
    
    public void ajouterAvion(Avion a){
        double superficieRestante = calculerSuperficieRestante();
        if(superficieRestante < a.getModele().getSuperficie()){
            return;
        }
        mesAvions.add(a);
    }
}
