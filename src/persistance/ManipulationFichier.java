/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import java.io.BufferedReader;
import java.io.EOFException;
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

        try {
            fr = new FileReader(file);
            br =  new BufferedReader(fr);
            String ligne;
            
            while((ligne = br.readLine()) != null){
                mots = (Utilitaire.ligneSplitPremierMot(ligne));
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
           int nouveauID = Utilitaire.nouveauID(mots);
           return nouveauID; 
        }
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
            out.writeObject(maListe.get(i));
        }
        
    }
    //
    public static <T> ArrayList<T> lireObjectInputStream2(String fichier){
        System.out.println("Maintenant la lecture du fichier " + fichier );
        ArrayList<T> mesObjets = new ArrayList();
        ObjectInputStream in;
        try {
            FileInputStream file = new FileInputStream(fichier);
            in = new ObjectInputStream(file);
            try {
                
                mesObjets.add((T) in.readObject());
                //mesObjets = (ArrayList) in.readObject();
            } catch (ClassNotFoundException ex) {
                //Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            System.out.println("fichier non disponible: " + fichier);
            //Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<T> monTest = new ArrayList();
 
        for(int i = 0; i < monTest.size(); i++){
            System.out.println(monTest.get(i));
        }
        return mesObjets;
    }
    
    public static <T> ArrayList<Hangar> lireObjectInputStream(String fichier) throws Exception{
        System.out.println("Maintenant la lecture du fichier " + fichier );
        ArrayList<Hangar> mesObjets = new ArrayList();
        Hangar monObjet;
        ObjectInputStream in;
        try{
            FileInputStream file = new FileInputStream(fichier); 
            in = new ObjectInputStream(file);
            boolean eof = false;
            while(!eof){
            try{
                monObjet = (Hangar) in.readObject();
                mesObjets.add(monObjet);
                System.out.println(monObjet);
            } catch(EOFException e){
                eof = true;
            }
        } in.close();
       
        
    } catch (IOException ex) {
            System.out.println("fichier non disponible: " + fichier);
            //Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        }
    return mesObjets;
    }
}
