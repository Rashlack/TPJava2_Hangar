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
    private int idAvion;
    private Client client;
    private Hangar hangar;
    private Baux monBail;
    private String immatriculation;
    
    /**
     *
     */
    public Avion() {
    }

    /**
     *
     * @param idAvion ID de l'avion
     * @param modele Modele de l'avion
     * @param client Client de l'avion
     * @param hangar Hangar de l'avion
     */
    public Avion( int idAvion, ModeleAvion modele, Client client, Hangar hangar, String immatriculation) {
        this.modele = modele;
        this.idAvion = idAvion;
        this.client = client;
        this.hangar = hangar;
        this.immatriculation = immatriculation;
    }

    /**
     *
     * @return Retourne le modele d'avion
     */
    public ModeleAvion getModele() {
        return modele;
    }

    /**
     *
     * @return Retourne le Hangar de l'avion
     */
    public Hangar getHangar() {
        return hangar;
    }

    /**
     *
     * @param hangar Assigne un hangar à l'avion
     */
    public void setHangar(Hangar hangar) {
        this.hangar = hangar;
    }

    /**
     *
     * @return Retourne le bail(type baux) de l'avion
     */
    public Baux getMonBail() {
        return monBail;
    }

    /**
     *
     * @param monBail Assigne un bail (type baux) à l'avion
     */
    public void setMonBail(Baux monBail) {
        this.monBail = monBail;
    }

    /**
     *
     * @return Retourne le client associé à l'avion
     */
    public Client getClient() {
        return client;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    /**
     *
     * @return Retourne le ID de l'avion
     */
    public int getIdAvion() {
        return idAvion;
    }

    @Override
    public String toString() {
        return "Avion{" + "modele=" + modele + ", idAvion=" + idAvion + ", client=" + client + ", hangar=" + hangar.getIdHangar() + ", monBailID=" + monBail.getIdBaux()+ '}';
    }

    
    
    
    
    
}
