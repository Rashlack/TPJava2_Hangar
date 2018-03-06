/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.util.ArrayList;
import modele.*;
import persistance.ManipulationFichier;
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
    public static void main(String[] args) throws IOException {
        ArrayList<Baux> mesBaux = new ArrayList();
        ArrayList<Avion> mesAvions = new ArrayList();
        ArrayList<Hangar> mesHangars = new ArrayList();
        ArrayList<ModeleAvion> mesModeleAvion = new ArrayList();
        InitialisationObjets.initialisationHangars("Hangar.txt", mesHangars);
        InitialisationObjets.initialisationModeleAvion("ModeleAvion.txt", mesModeleAvion);
        ManipulationFichier.sauvegardeListeObjet("test.txt", mesHangars);
        ManipulationFichier.lireOutputStream("test.txt");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPrincipal(mesHangars, mesBaux, mesAvions, mesModeleAvion).setVisible(true);
                ;
            }
        });
    }
    
}
