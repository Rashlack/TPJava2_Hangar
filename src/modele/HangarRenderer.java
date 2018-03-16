/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author Rashlack
 * Méthode pour gérer l'affichage d'objet de type hangar dans un JcomboBox
 */
public class HangarRenderer extends DefaultListCellRenderer {
    public Component getListCellRendererComponent(
                                   JList list,
                                   Object value,
                                   int index,
                                   boolean isSelected,
                                   boolean cellHasFocus) {
        if (value instanceof Hangar) {
            value = ((Hangar)value).getIdHangar() + " " + ((Hangar)value).getType();
        }
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        return this;
    }
    
}
