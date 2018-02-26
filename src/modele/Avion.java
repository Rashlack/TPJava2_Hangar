/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author 1795511
 */
public class Avion {
    private String modele;
    private int superficie;
    private String type;
    private boolean statut;
    private int idAvion;
    
    public Avion() {
    }

    public Avion(String modele, int superficie, String type, boolean statut) {
        this.modele = modele;
        this.superficie = superficie;
        this.type = type;
        this.statut = statut;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Avion{" + "modele=" + modele + ", superficie=" + superficie + ", type=" + type + ", statut=" + statut + ", idAvion=" + idAvion + '}';
    }
    
    
    
    
}
