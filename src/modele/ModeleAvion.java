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

    public ModeleAvion() {
    }

    @Override
    public String toString() {
        return "ModeleAvion{" + "modele=" + modele + ", superficieAvion=" + superficieAvion + ", type=" + type + ", idModeleAvion=" + idModeleAvion + '}';
    }

    public ModeleAvion(int idModeleAvion, String modele, double superficie, String type) {
        this.idModeleAvion = idModeleAvion;
        this.modele = modele;
        this.superficieAvion = superficie;
        this.type = type;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getSuperficie() {
        return superficieAvion;
    }

    public void setSuperficie(double superficie) {
        this.superficieAvion = superficie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    
    
}
