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
public class Baux {
    private int duree;
    private String type;
    private String dateDebut;
    private String dateFin;
    private double tarifBaux;
    private int idBaux;

    public Baux() {
    }

    public Baux(int duree, String type, String dateDebut, String dateFin) {
        this.duree = duree;
        this.type = type;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
       
    }

    public double getTarifBaux() {
        return tarifBaux;
    }

    @Override
    public String toString() {
        return "Baux{" + "duree=" + duree + ", type=" + type + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", tarifBaux=" + tarifBaux + ", idBaux=" + idBaux + '}';
    }
    
    
}
