/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import modele.Hangar;
import modele.ModeleAvion;
import persistance.ManipulationFichier;

/**
 *
 * @author 1795516
 */
public class InitialisationObjets {
    
    public static void initialisationHangars(String fichier, ArrayList<Hangar> listeHangar){
        ArrayList<String> mesAttributs = new ArrayList();
        mesAttributs = ManipulationFichier.lireFichier(fichier);
        for(int i = 0; i < mesAttributs.size(); i++){
             String[] liste = Utilitaire.ligneSplitXMots(mesAttributs.get(i));
             listeHangar.add(new Hangar(Integer.parseInt(liste[0]), liste[1], Double.parseDouble(liste[2])));                        
        }   
    }
    //
    public static void initialisationModeleAvion(String fichier, ArrayList<ModeleAvion> listeModele){
        ArrayList<String> mesAttributs = new ArrayList();
        mesAttributs = ManipulationFichier.lireFichier(fichier);
        for(int i = 0; i < mesAttributs.size(); i++){
            String[] liste = Utilitaire.ligneSplitXMots(mesAttributs.get(i));
            listeModele.add(new ModeleAvion(Integer.parseInt(liste[0]), liste[1], Double.parseDouble(liste[2]), liste[3]));            
            }       
    }
    
    public static void initialisationModeleAvion2(String fichier, ArrayList<ModeleAvion> mesObjets){
        
    }
}
