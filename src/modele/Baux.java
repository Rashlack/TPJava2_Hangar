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
public class Baux implements Serializable {
    private int duree;
    //private String dateDebut;
    //private String dateFin;
    private double tarifBaux;
    private int idBaux;
    private Client leClient;
    private Avion monAvion;

    /**
     *
     */
    public Baux() {
    }

    /**
     *
     * @param idBaux ID du bail
     * @param duree Durée du bail
     * @param leClient Client associé au bail
     * @param monAvion Avion associé au bail
     * @param tarifBaux Tarif du bail
     */
    public Baux(int idBaux, int duree, Client leClient, Avion monAvion, double tarifBaux) {
        this.duree = duree;
        this.idBaux = idBaux;
        this.leClient = leClient;
        this.monAvion = monAvion;
        this.tarifBaux = tarifBaux;
    }

    /**
     *
     * @return Retourne la durée du bail
     */
    public int getDuree() {
        return duree;
    }

    /**
     *
     * @return Retourne le ID du bail
     */
    public int getIdBaux() {
        return idBaux;
    }

    /**
     *
     * @return Retourne le client associé bail
     */
    public Client getLeClient() {
        return leClient;
    }

    /**
     *
     * @return Retourne l'avion du associé au bail
     */
    public Avion getMonAvion() {
        return monAvion;
    }

    /**
     *
     * @return Retourne le tarif du bail
     */
    public double getTarifBaux() {
        return tarifBaux;
    }

    @Override
    public String toString() {
        return "Baux{" + "duree=" + duree + ", tarifBaux=" + tarifBaux + ", idBaux=" + idBaux + ", leClient=" + leClient + ", monAvionID=" + monAvion.getIdAvion() + '}';
    }


    
    
}
