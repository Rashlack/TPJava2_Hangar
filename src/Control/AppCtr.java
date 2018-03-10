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
//
    /**
     * @param args the command line arguments22
     */
    public static void main(String[] args) throws Exception{
        ArrayList<Baux> mesBaux = new ArrayList(ManipulationFichier.lireObjectInputStream("Baux.dat"));
        ArrayList<Avion> mesAvions = new ArrayList(ManipulationFichier.lireObjectInputStream("Avion.dat"));
        ArrayList<Hangar> mesHangars = new ArrayList(ManipulationFichier.lireObjectInputStream("Hangar.dat"));
        ArrayList<ModeleAvion> mesModeleAvion = new ArrayList(ManipulationFichier.lireObjectInputStream("ModeleAvion.dat"));
        ArrayList<Client>mesClients = new ArrayList(ManipulationFichier.lireObjectInputStream("Client.dat"));
        //InitialisationObjets.initialisationHangars("Hangar.txt", mesHangars);
        //InitialisationObjets.initialisationModeleAvion("ModeleAvion.txt", mesModeleAvion);
        //ManipulationFichier.sauvegardeListeObjet("hangar.dat", mesHangars);
//        ManipulationFichier.lireObjectInputStream("Client.dat", mesClients);
//        ManipulationFichier.lireObjectInputStream("ModeleAvion.dat", mesModeleAvion);
//        ManipulationFichier.lireObjectInputStream("Baux.dat", mesBaux);
//        ManipulationFichier.lireObjectInputStream("Avion.dat", mesAvions);
        //ManipulationFichier.lireObjectInputStream("hangar.dat", mesHangars);
        
//        for(ModeleAvion m: mesModeleAvion){
//            System.out.println(m);
//        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPrincipal(mesHangars, mesBaux, mesAvions, mesModeleAvion, mesClients).setVisible(true);
                ;
            }
        });
    }
    
}
