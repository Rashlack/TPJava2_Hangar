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
public class ModeleAvion implements Serializable  {
    private String modele;
    private double superficieAvion;
    private String type;
    private int idModeleAvion;

    /**
     *
     */
    public ModeleAvion() {
    }

    @Override
    public String toString() {
        return "ModeleAvion{" + "modele=" + modele + ", superficieAvion=" + superficieAvion + ", type=" + type + ", idModeleAvion=" + idModeleAvion + '}';
    }

    /**
     *
     * @param idModeleAvion ID du modele d'avion
     * @param modele Modele d'avion
     * @param superficie Superficie du modèle
     * @param type Type de modèle
     */
    public ModeleAvion(int idModeleAvion, String modele, double superficie, String type) {
        this.idModeleAvion = idModeleAvion;
        this.modele = modele;
        this.superficieAvion = superficie;
        this.type = type;
    }

    /**
     *
     * @return Retourne le modele.
     */
    public String getModele() {
        return modele;
    }

    /**
     *
     * @param modele modele de l'avion
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     *
     * @return Retourne la superficie du modele
     */
    public double getSuperficie() {
        return superficieAvion;
    }

    /**
     *
     * @param superficie Superficie du modèle.
     */
    public void setSuperficie(double superficie) {
        this.superficieAvion = superficie;
    }

    /**
     *
     * @return Retourne le type de modèle
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type Type du modèle.
     */
    public void setType(String type) {
        this.type = type;
    }

    
    
    
}
