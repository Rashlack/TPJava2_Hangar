/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.Hangar;
import utils.Utilitaire;


/**
 *
 * @author 1795511
 */
public class ManipulationFichier {
    public static ArrayList<String> lireMotsLigne(String fichier, ArrayList mesPositions){
        File file = new File(fichier);
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<String> mots = new ArrayList();
        try {
            fr = new FileReader(file);
            br =  new BufferedReader(fr);
            String ligne;
            
            while((ligne = br.readLine()) != null){
                mots.add(Utilitaire.ligneSplitXMots(ligne, mesPositions));
            }
        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fr != null){
                try {
                        fr.close();
                        br.close();
                } catch (IOException ex) {
                    Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           return mots; 
        }
    }

    public static int lirePremiereLigne(String fichier){
        File file = new File(fichier);
        FileReader fr = null;
        BufferedReader br = null;
        int inventaire = 0;
        try {
            fr = new FileReader(file);
            br =  new BufferedReader(fr);
            String ligne;
            
            ligne = br.readLine();
                inventaire = Utilitaire.compterMotsLigne(ligne);
            
        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fr != null){
                try {

                        fr.close();
                        br.close();
                } catch (IOException ex) {
                    Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           return inventaire; 
        }
    }
    
    public static int lireID(String fichier){
        File file = new File(fichier);
        FileReader fr = null;
        BufferedReader br = null;
        String mots = "";
        ArrayList<Integer> mesPositions = new ArrayList();
        mesPositions.add(0);
        try {
            fr = new FileReader(file);
            br =  new BufferedReader(fr);
            String ligne;
            
            while((ligne = br.readLine()) != null){
                mots = (Utilitaire.ligneSplitXMots(ligne, mesPositions));
            }
        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fr != null){
                try {
                        fr.close();
                        br.close();
                } catch (IOException ex) {
                    Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           int nouveauID = ManipulationFichier.nouveauID(mots);
           return nouveauID; 
        }
    }
    
    public static int nouveauID(String idTexte){ 
        if("ID".equalsIgnoreCase(idTexte)){
            return 1;
        }
        int nouveauID = Integer.parseInt(idTexte) + 1;
        return nouveauID;
    }
    
        public static ArrayList<String> lireFichier(String fichier){
        File file = new File(fichier);
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<String> mots = new ArrayList();
        try {
            fr = new FileReader(file);
            br =  new BufferedReader(fr);
            String ligne;
            
            while((ligne = br.readLine()) != null){
                mots.add(ligne);
            }
        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fr != null){
                try {
                        fr.close();
                        br.close();
                } catch (IOException ex) {
                    Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           return mots; 
        }
    }
        
    public static void sauvegardeListeObjet(String fichier, ArrayList maListe) throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichier));
        for(int i = 0; i < maListe.size(); i++){
            System.out.println(maListe.get(i));
        }
        out.writeObject(maListe);
    }
    
    public static void lireOutputStream(String fichier) throws IOException{
        System.out.println("Maintenant la lecture!!!");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fichier));
        ArrayList monTest = new ArrayList();
        try {
            monTest = (ArrayList) in.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i = 0; i < monTest.size(); i++){
            System.out.println(monTest.get(i));
        }
    }

}
