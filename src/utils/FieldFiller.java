/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modele.*;
import persistance.ManipulationFichier;

/**
 *
 * @author 1795511
 */
public class FieldFiller {
    
    /**
     *
     * @param <T> Paramètre générique
     * @param cb JComboBox contenant des Objets de type T
     * @param list ArrayList de type T
     */
    public static <T> void comboBoxFiller(JComboBox cb, ArrayList<T> list){
        cb.removeAllItems();
        cb.addItem(" ");
        for(int i = 0; i < list.size(); i++){
            cb.addItem(list.get(i));
        }      
        
    }
    
    /**
     *
     * @param model DefaltTableModel
     * @param list ArrayList de type Avion
     */
    public static void tableHangarFiller(DefaultTableModel model, ArrayList<Avion> list){
        model.setRowCount(0);
        for(Avion a: list){
        model.addRow(new Object[]{a.getIdAvion(), a.getModele().getModele(), a.getModele().getSuperficie(), a.getClient().getNom() + ", " + a.getClient().getPrenom()}); 
        }
    }
    
    /**
     * Méthode pour remplir les fenêtre de "Hangar"
     * @param h Hangar pour remplir le label
     * @param txtTotalLocation JTextField contenant le prix Total des locations
     * @param txtSuperficieDispo JTextField contenant la superficie disponible dans le hangar
     * @param txtNbAvion JTextField contenant le nombre d'avion dans le hangar
     * @param tableHangar JTable conenant les information sur les avions dans le hangar
     */
    public static void labelFiller(Hangar h, JTextField txtTotalLocation, JTextField txtSuperficieDispo, JTextField txtNbAvion, JTable tableHangar){
        txtTotalLocation.setText(String.valueOf(Utilitaire.calculerTarifLocationTotal(h)));
        txtSuperficieDispo.setText(String.valueOf(h.calculerSuperficieRestante()));
        txtNbAvion.setText(String.valueOf(h.getMesAvions().size()));
        FieldFiller.tableHangarFiller((DefaultTableModel) tableHangar.getModel(), h.getMesAvions());
    }

}
