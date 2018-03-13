/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.io.Serializable;

/**
 *
 * @author 1795511
 */
public class Avion implements Serializable {
    private ModeleAvion modele;
    private boolean statut;
    private int idAvion;
    private Client client;
    private Hangar hangar;
    private Baux monBail;
    
    public Avion() {
    }

    public Avion( int idAvion, ModeleAvion modele, Client client, Hangar hangar) {
        this.modele = modele;
        this.idAvion = idAvion;
        this.client = client;
        this.hangar = hangar;
        //this.monBail = monBail;
    }

    
    public Avion(boolean statut, Client client){ 
        
        this.statut = statut;
        this.client=client;
    }

    public ModeleAvion getModele() {
        return modele;
    }

    public Hangar getHangar() {
        return hangar;
    }

    public void setHangar(Hangar hangar) {
        this.hangar = hangar;
    }

    public Baux getMonBail() {
        return monBail;
    }

    public void setMonBail(Baux monBail) {
        this.monBail = monBail;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public Client getClient() {
        return client;
    }

    public int getIdAvion() {
        return idAvion;
    }

    @Override
    public String toString() {
        return "Avion{" + "modele=" + modele + ", statut=" + statut + ", idAvion=" + idAvion + ", client=" + client + ", hangar=" + hangar.getIdHangar() + ", monBail=" + monBail + '}';
    }

    
    
    
    
    
}
