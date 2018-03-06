/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JComboBox;
import persistance.ManipulationFichier;

/**
 *
 * @author 1795511
 */
public class ComboBoxFiller {
    public static JComboBox comboBoxClientFiller(JComboBox cb){
        String fichier = "Client.txt";
        ArrayList<Integer> mesPositions = new ArrayList();
        mesPositions.add(1);
        mesPositions.add(2);
        mesPositions.add(4);
        mesPositions.add(0);
        ArrayList<String> maListe = new ArrayList();
        maListe = ManipulationFichier.lireMotsLigne(fichier, mesPositions);
        cb.removeAllItems();
        Collections.sort(maListe.subList(1, maListe.size()));
        for(int i = 0; i < maListe.size(); i++){
            cb.addItem(maListe.get(i));
        }
        return cb;
    }
    
    public static JComboBox comboBoxModeleAvionFiller(JComboBox cb){
        String fichier = "ModeleAvion.txt";
        ArrayList<Integer> mesPositions = new ArrayList();
        mesPositions.add(1);
        mesPositions.add(2);
        mesPositions.add(3);
        ArrayList<String> maListe = new ArrayList();
        maListe = ManipulationFichier.lireMotsLigne(fichier, mesPositions);
        cb.removeAllItems();
        Collections.sort(maListe.subList(1, maListe.size()));
        for(int i = 0; i < maListe.size(); i++){
            cb.addItem(maListe.get(i));     
        }
        return cb;
    }
    
    public static JComboBox comboBoxHangarFiller(JComboBox cb){
        String fichier = "Hangar.txt";
        ArrayList<Integer> mesPositions = new ArrayList();
        mesPositions.add(0);
        mesPositions.add(1);
        ArrayList<String> maListe = new ArrayList();
        maListe = ManipulationFichier.lireMotsLigne(fichier, mesPositions);
        cb.removeAllItems();
        Collections.sort(maListe.subList(1, maListe.size()));

        for(int i = 0; i < maListe.size(); i++){
            cb.addItem(maListe.get(i));     
        }
        return cb;
    }
    
}
