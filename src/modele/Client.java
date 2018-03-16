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
public class Client implements Serializable {
    private int idClient;
    private String nom;
    private String prenom;
    private String compagnie;
    private String telephone;
    private ArrayList<Avion>mesAvions;//nice to have
    
    /**
     *
     */
    public Client() {
    }

    /**
     *
     * @param idClient ID du client
     * @param nom Nom du client
     * @param prenom Prénom du client
     * @param compagnie Compagnie du client
     * @param telephone Numéro de téléphone du client
     */
    public Client(int idClient, String nom, String prenom, String compagnie, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.compagnie = compagnie;
        this.telephone = telephone;
        this.idClient = idClient;
        mesAvions = new ArrayList();
    }

    /**
     *
     * @return Retourne le ID du client
     */
    public int getIdClient() {
        return idClient;
    }


    /**
     *
     * @return Retourne le nom du client
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom Nom du client
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return Retourle le prénom du client
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @param prenom Prénom du client
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *
     * @return Retourne le nom de la compagnie du client
     */
    public String getCompagnie() {
        return compagnie;
    }

    /**
     *
     * @param compagnie Nom de la compagnie du client
     */
    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    /**
     *
     * @return Retourne le numéro de téléphone du client
     */
    public String getTelephone() {
        return telephone;
    }

    public void ajouterAvion(Avion monAvion) {
        this.mesAvions.add(monAvion);
    }

    public ArrayList<Avion> getMesAvions() {
        return mesAvions;
    }

    /**
     *
     * @param telephone Numéro de téléphone du client
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", prenom=" + prenom + ", compagnie=" + compagnie + ", telephone=" + telephone + ", idClient=" + idClient + '}';
    }
    
    
}
