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
    
    public static void initialisationDonnees(String fichier){
        int nbAttribut = ManipulationFichier.lirePremiereLigne(fichier);
        ArrayList<Integer> mesPosition = new ArrayList();
        for(int i = 0; i < nbAttribut; i++){
            mesPosition.add(i);
        }
        ArrayList<String> mesAttributs = new ArrayList();
        mesAttributs = ManipulationFichier.lireMotsLigne(fichier, mesPosition);
        for(int i = 1; i < mesAttributs.size(); i++){
            System.out.println(mesAttributs.get(i)); 
            
        }
        
        
        
    }
}
