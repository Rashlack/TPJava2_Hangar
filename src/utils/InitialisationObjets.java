/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import modele.Hangar;
import persistance.ManipulationFichier;

/**
 *
 * @author 1795516
 */
public class InitialisationObjets {
    
    public static void initialisationDonnees(String fichier, ArrayList<Hangar> listeHangar){
        int nbAttribut = ManipulationFichier.lirePremiereLigne(fichier);
        ArrayList<Integer> mesPosition = new ArrayList();
        for(int i = 0; i < nbAttribut; i++){
            mesPosition.add(i);
        }
        ArrayList<String> mesAttributs = new ArrayList();
        mesAttributs = ManipulationFichier.lireMotsLigne(fichier, mesPosition);
        for(int i = 1; i < mesAttributs.size(); i++){
             String[] liste = Utilitaire.ligneSplitXMots(mesAttributs.get(i));
             listeHangar.add(new Hangar(Integer.parseInt(liste[0]), liste[1], Double.parseDouble(liste[2])));            
            
        }
        
        
        
    }
}
