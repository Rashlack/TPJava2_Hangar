/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;
import modele.Hangar;
import utils.InitialisationObjets;
import vue.GuiPrincipal;

/**
 *
 * @author 1795511
 */
public class AppCtr {

    /**
     * @param args the command line arguments22
     */
    public static void main(String[] args) {
        ArrayList<Hangar> mesHangar = new ArrayList();
        InitialisationObjets.initialisationDonnees("Hangar.txt", mesHangar);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPrincipal().setVisible(true);
                ;
            }
        });
    }
    
}
