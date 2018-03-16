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


/**
 *
 * @author 1795511
 */
public class ManipulationFichier {
    
    // Méthode pour lire un fichier txt
    public static String lireFichier(String fichier){
        File file = new File(fichier);
        FileReader fr = null;
        BufferedReader br = null;
        String mots ="";
        try {
            fr = new FileReader(file);
            br =  new BufferedReader(fr);
            String ligne;
            
            while((ligne = br.readLine()) != null){
                mots = ligne;
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
    
    // Méthode pour sauvegarder des objet sur fichier binaire
    public static void sauvegardeListeObjet(String fichier, ArrayList maListe) throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichier));
        for(int i = 0; i < maListe.size(); i++){
            
            out.writeObject(maListe.get(i));
        }     
    }
    
    //Méthode pour lire des objet sur fichier binaire
    public static <T> ArrayList<T> lireObjectInputStream(String fichier) throws Exception{
        System.out.println("Maintenant la lecture du fichier " + fichier );
        ArrayList<T> mesObjets = new ArrayList();
        T monObjet;
        ObjectInputStream in;
        try{
            FileInputStream file = new FileInputStream(fichier); 
            in = new ObjectInputStream(file);
            boolean eof = false;
            while(!eof){
            try{
                monObjet = (T) in.readObject();
                mesObjets.add(monObjet);
            } catch(EOFException e){
                eof = true;
            }
        } in.close();
       
        
    } catch (IOException ex) {
            System.out.println("fichier non disponible: " + fichier);

        }
    return mesObjets;
    }
    

}
