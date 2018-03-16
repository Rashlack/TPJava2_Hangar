/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modele.*;
import persistance.ManipulationFichier;
import utils.Utilitaire;
import vue.GuiPrincipal;

/**
 *
 * @author 1795511
 */
public class AppCtr {
//
    /**
     * @param args the command line arguments22
     * @throws Exception Pour lancer les exceptions
     */
    public static void main(String[] args) throws Exception{
        ArrayList<Baux> mesBaux = new ArrayList(ManipulationFichier.lireObjectInputStream("Baux.dat"));
        ArrayList<Avion> mesAvions = new ArrayList(ManipulationFichier.lireObjectInputStream("Avion.dat"));
        ArrayList<Hangar> mesHangars = new ArrayList(ManipulationFichier.lireObjectInputStream("Hangar.dat"));      
        ArrayList<ModeleAvion> mesModeleAvion = new ArrayList(ManipulationFichier.lireObjectInputStream("ModeleAvion.dat"));
        ArrayList<Client>mesClients = new ArrayList(ManipulationFichier.lireObjectInputStream("Client.dat"));
        double[]mesPrix = Utilitaire.convertirTableStringDouble(ManipulationFichier.lireFichier("ListePrix.txt").split(" "));

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPrincipal(mesHangars, mesBaux, mesAvions, mesModeleAvion, mesClients, mesPrix).setVisible(true);
                ;
            }
        });
    }
    
}
