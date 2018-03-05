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
public class Client {
    private int idClient;
    private String nom;
    private String prenom;
    private String compagnie;
    private int telephone;
    private ArrayList<Avion>mesAvions;//nice to have
    

    public Client() {
    }

    public Client(String nom, String prenom, String compagnie, int telephone,int idClient) {
        this.nom = nom;
        this.prenom = prenom;
        this.compagnie = compagnie;
        this.telephone = telephone;
        mesAvions = new ArrayList();
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", prenom=" + prenom + ", compagnie=" + compagnie + ", telephone=" + telephone + ", idClient=" + idClient + '}';
    }
    
    
}
