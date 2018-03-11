/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JComboBox;
import modele.*;
import persistance.ManipulationFichier;

/**
 *
 * @author 1795511
 */
public class ComboBoxFiller {
    
    public static <T> JComboBox comboBoxFiller(JComboBox cb, ArrayList<T> list){
        cb.removeAllItems();
        cb.addItem("");
        for(int i = 0; i < list.size(); i++){
            cb.addItem(list.get(i));
        }      
        return cb;
    }    
//    public static JComboBox comboBoxFillerHangar(JComboBox cb, ArrayList<Hangar> list){
//        String laLigne;
//        cb.removeAllItems();
//        for(int i = 0; i < list.size(); i++){
//            laLigne = String.valueOf(list.get(i).getIdHangar());
//            laLigne = laLigne + " " + list.get(i).getType();
//            cb.addItem(laLigne);
//        }      
//        return cb;
//    }


    
//    public static JComboBox comboBoxFillerModeleAvion(JComboBox cb, ArrayList<ModeleAvion> list){
//        String laLigne;
//        ArrayList<String> mesLignes = new ArrayList();
//        cb.removeAllItems();
//        for(int i = 0; i < list.size(); i++){
//            laLigne = list.get(i).getModele();
//            laLigne = laLigne + " " + list.get(i).getType();
//            laLigne = laLigne + " " + list.get(i).getSuperficie();
//            mesLignes.add(laLigne);
//        } 
//        System.out.println("--------------------------------------------------");
//        for(int i = 0; i < mesLignes.size(); i++){
//            System.out.println(mesLignes.get(i));
//        }
//        System.out.println("----------------------------------------------------");
//        Collections.sort(mesLignes);
//        for(int i = 0; i < mesLignes.size(); i++){
//            cb.addItem(mesLignes.get(i));
//            System.out.println(mesLignes.get(i));
//        }
//        
//        
////        for(int i = 0; i < list.size(); i++){
////            laLigne = list.get(i).getModele();
////            laLigne = laLigne + " " + list.get(i).getType();
////            laLigne = laLigne + " " + list.get(i).getSuperficie();
////            
////            cb.addItem(laLigne);
////        }      
//        return cb;
//    }
}
