/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;


import java.util.ArrayList;
import modele.Avion;
import modele.Hangar;
import modele.ModeleAvion;
import modele.ListeAvion;
/**
 *
 * @author 1795511
 */
public class Utilitaire {
    public static void creerNouveauClient(){
        
    }
    
    public static void creerNouveauBail(){
    
    }
    
    public static void ajouterAvionHangar(){
    
    }
    
    public static void enleverAvionHangar(){
    
    }
    
    public static void calculerTotalLocationAvion(){
    
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
    
    public static String ligneSplitPremierMot(String ligne){
        String[]liste = ligne.split(" ");
        String nom = liste[0];
        return nom;
    }
    
    public static String ligneSplitXMots(String ligne, ArrayList<Integer> mesPositions){
        String mesMots = "";
        String[] liste = ligne.split(" ");
        for(int i = 0; i < mesPositions.size(); i++){
           mesMots = mesMots + liste[mesPositions.get(i)] + " "; 
        }
        return mesMots;
    }
    
    public static String[] ligneSplitXMots(String ligne){
        String[] liste = ligne.split(" ");
        return liste;
    }
      
    public static int compterMotsLigne(String ligne){
        String[] liste = ligne.split(" ");
        return liste.length;
    }
      
    public static int comparerID(String stringID){
            
        return 0;
    }

}

    


