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
public class Hangar implements Serializable {
    private double superficieHangar;
    private String type;
    private int idHangar;
    private ArrayList<Avion>mesAvions;

    /**
     *
     */
    public Hangar() {
    }
    
    /**
     *
     * @param idHangar ID du hangar
     * @param type Type de hangar
     * @param superficie Superficie total du hangar
     */
    public Hangar(int idHangar, String type, double superficie) {
        this.superficieHangar = superficie;
        this.type = type;
        this.idHangar = idHangar;
        mesAvions=new ArrayList();
    }

    /**
     *
     * @return retourne la liste d'avion du Hangar
     */
    public ArrayList<Avion> getMesAvions() {
        return mesAvions;
    }

    /**
     *
     * @return retourne la supperficie(int) du hangar
     */
    public double getSuperficieHangar() {
        return superficieHangar;
    }
    
    /**
     *
     * @return retourne le type de hangar
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @return retourne le ID du hangar
     */
    public int getIdHangar() {
        return idHangar;
    }

    @Override
    public String toString() {
        String maString = "";
        maString = maString + "HangarID = " + idHangar;
        maString = maString         + "\nSuperficie = " + superficieHangar;
        maString = maString         + "\nAvion = " + mesAvions;
        return maString;
    }

    /**
     *
     * @return Retourne le nombre d'avion dans le hangar
     */
    public int calculerNbrAvion(){
        int nbrAvion = mesAvions.size();
        return nbrAvion;
    }
    
    /**
     * 
     * @return retourn la superficie restante dans le hangar
     */
    public double calculerSuperficieRestante(){
        double superficieTotalAvion = 0.0;
        for(int i = 0; i < mesAvions.size(); i++){
            superficieTotalAvion = superficieTotalAvion + mesAvions.get(i).getModele().getSuperficie();
        }
        Double superficieRestante = superficieHangar - superficieTotalAvion;     
        return superficieRestante;
    }
    
    /**
     * Ajoute un Objet de type avion dans la arrayList mesAvions de Hangar
     * @param a Type Avion
     */
    public void ajouterAvion(Avion a){
        mesAvions.add(a);
    }
}
