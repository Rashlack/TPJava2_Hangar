/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;


import java.util.ArrayList;
import modele.Avion;
import modele.Client;
import modele.Hangar;
import modele.ModeleAvion;
/**
 *
 * @author 1795511
 */
public class Utilitaire {

    public static double calculerTarifLocationTotal(Hangar h){
        double prixLocationTotal = 0;
        ArrayList<Avion> lesAvions = h.getMesAvions();
        for(Avion a: lesAvions){
            prixLocationTotal += a.getMonBail().getTarifBaux();
        }
        return prixLocationTotal;
    }
    
    public static double calculerTarifLocation(double superficieAvion, int duree, double[] mesPrix){
        double prixLocationAvion;
        double prixPiCarre = mesPrix[0];
        if(duree>mesPrix[3]){
            prixLocationAvion = (prixPiCarre*superficieAvion)*mesPrix[4] * duree;
        }
        if(duree>mesPrix[1]){
            prixLocationAvion = (prixPiCarre*superficieAvion)*mesPrix[2] * duree;
         }else{
            prixLocationAvion = prixPiCarre*superficieAvion * duree;
        }
        return prixLocationAvion;
    }
    
    public static double calculerSuperficie(ModeleAvion a, Hangar h){
        ArrayList<Avion> mesAvions = h.getMesAvions();
        double superficieTotalAvion = 0.0;
        for(int i = 0; i < mesAvions.size(); i++){
            superficieTotalAvion = superficieTotalAvion + mesAvions.get(i).getModele().getSuperficie();
        }
        Double superficieRestante = h.getSuperficieHangar() - superficieTotalAvion;     
        return superficieRestante;
    }
    
    public static double[] convertirTableStringDouble(String[]ligne){
        double[] mesDoubles = new double[ligne.length];
        for(int i = 0;i<ligne.length;i++){
            
            mesDoubles[i] = Double.parseDouble(ligne[i]);
        }
        return mesDoubles;
    }
    
    public static Boolean trouverAvion(Hangar h, int idAvion){
        ArrayList<Avion> mesAvions = h.getMesAvions();
        Boolean retirer = false;
        int i = 0;
        while(!(mesAvions.get(i).getIdAvion() == idAvion)){
            i++; 
            }
        mesAvions.remove(i);
        retirer = true;
        return retirer;     
    }
}

    


