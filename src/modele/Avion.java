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
    private ModeleAvion modele;
    private boolean statut;
    private int idAvion;
    private Client client;
    private Hangar hangar;
    private Baux monBail;
    
    public Avion() {
    }

    public Avion(ModeleAvion modele, int idAvion, Client client, Baux monBail) {
        this.modele = modele;
        this.idAvion = idAvion;
        this.client = client;
        this.monBail = monBail;
    }

    
    public Avion(boolean statut, Client client){ 
        
        this.statut = statut;
        this.client=client;
    }

    public ModeleAvion getModele() {
        return modele;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    
    
    
    
    
}
