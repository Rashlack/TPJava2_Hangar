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
    private String dateDebut;
    private String dateFin;
    private double tarifBaux;
    private int idBaux;
    private Client leClient;
    private Avion monAvion;

    public Baux() {
    }

    public Baux(int idBaux, int duree, Client leClient, Avion monAvion, double tarifBaux) {
        this.duree = duree;
        this.idBaux = idBaux;
        this.leClient = leClient;
        this.monAvion = monAvion;
        this.tarifBaux = tarifBaux;
    }

    public double getTarifBaux() {
        return tarifBaux;
    }

    @Override
    public String toString() {
        return "Baux{" + "duree=" + duree + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", tarifBaux=" + tarifBaux + ", idBaux=" + idBaux + ", leClient=" + leClient + ", monAvionID=" + monAvion.getIdAvion() + '}';
    }


    
    
}
