/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import javax.swing.JComboBox;
import persistance.ManipulationFichier;

/**
 *
 * @author 1795511
 */
public class ComboBoxFiller {
    public static JComboBox comboBoxClientFiller(JComboBox client){
        String fichier = "Client.txt";
        ArrayList<Integer> mesPositions = new ArrayList();
        mesPositions.add(1);
        mesPositions.add(2);
        mesPositions.add(4);
        ArrayList<String> listeClient = new ArrayList();
        listeClient = ManipulationFichier.lirePourComboBox(fichier, mesPositions);
        client.removeAllItems();
        for(int i = 0; i < listeClient.size(); i++){
            client.addItem(listeClient.get(i));
        }
        return client;
    }

}
