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
 */
public class AvionRenderer extends DefaultListCellRenderer {
    public Component getListCellRendererComponent(
                                   JList list,
                                   Object value,
                                   int index,
                                   boolean isSelected,
                                   boolean cellHasFocus) {
        if (value instanceof Avion) {
            value = ((Avion)value).getIdAvion() + " " + ((Avion)value).getModele().getModele() + " " + ((Avion)value).getModele().getSuperficie() + ((Avion)value).getModele().getType();
        }
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        return this;
    }
}
