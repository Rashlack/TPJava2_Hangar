/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;


import java.util.ArrayList;
import modele.Avion;
import modele.Client;
import modele.Hangar;
import modele.ModeleAvion;
/**
 *
 * @author 1795511
 */
public class Utilitaire {

    public static double calculerTarifLocationTotal(Hangar h){
        double prixLocationTotal = 0;
        ArrayList<Avion> lesAvions = h.getMesAvions();
        for(Avion a: lesAvions){
//            System.out.println(a.getMonBail().getTarifBaux());
            prixLocationTotal += a.getMonBail().getTarifBaux();
        }
        return prixLocationTotal;
    }
    
    public static double calculerTarifLocation(double superficieAvion, int duree, double[] mesPrix){
        double prixLocationAvion;
        double prixPiCarre = mesPrix[0];
        if(duree>mesPrix[3]){
            prixLocationAvion = (prixPiCarre*superficieAvion)*mesPrix[4] * duree;
        }
        if(duree>mesPrix[1]){
            prixLocationAvion = (prixPiCarre*superficieAvion)*mesPrix[2] * duree;
         }else{
            prixLocationAvion = prixPiCarre*superficieAvion * duree;
        }
        return prixLocationAvion;
    }
    
    public static double calculerSuperficie(ModeleAvion a, Hangar h){
        ArrayList<Avion> mesAvions = h.getMesAvions();
        double superficieTotalAvion = 0.0;
        for(int i = 0; i < mesAvions.size(); i++){
            superficieTotalAvion = superficieTotalAvion + mesAvions.get(i).getModele().getSuperficie();
        }
        Double superficieRestante = h.getSuperficieHangar() - superficieTotalAvion;     
        return superficieRestante;
    }
    
//    public static String ligneSplitPremierMot(String ligne){
//        String[]liste = ligne.split(" ");
//        String nom = liste[0];
//        return nom;
//    }
    
//    public static String ligneSplitXMots(String ligne, ArrayList<Integer> mesPositions){
//        String mesMots = "";
//        String[] liste = ligne.split(" ");
//        for(int i = 0; i < mesPositions.size(); i++){
//           mesMots = mesMots + liste[mesPositions.get(i)] + " "; 
//        }
//        return mesMots;
//    }
    
//    public static String[] ligneSplitXMots(String ligne){
//        String[] liste = ligne.split(" ");
//        return liste;
//    }
    
//    public static String ligneSplitMotPositionX(String ligne, int x){
//        String[] liste = ligne.split(" ");
//        String monMot = liste[x];
//        return monMot;
//    }
      
//    public static int compterMotsLigne(String ligne){
//        String[] liste = ligne.split(" ");
//        return liste.length;
//    }
      
    
//    public static int nouveauID(String idTexte){ 
//        if("ID".equals(idTexte)== true){
//            return 1;
//        }
//        int nouveauID = Integer.parseInt(idTexte) + 1;
//        return nouveauID;
//    }
    
//    public static ModeleAvion trouverModeleAvion(String s, ArrayList<ModeleAvion> list){
//        int i = 0;
//        while(!list.get(i).getModele().equalsIgnoreCase(s)){
//            i++;
//        }
//        return list.get(i);
//    }
    
//    public static Client trouverClient(int id, ArrayList<Client> list){
//        int i = 0;
//        while(id != list.get(i).getIdClient()){
//            i++;
//        }
//        list.get(id).getIdClient();
//        return list.get(i);
//    }
    public static double[] convertirTableStringDouble(String[]ligne){
        double[] mesDoubles = new double[ligne.length];
        for(int i = 0;i<ligne.length;i++){
            
            mesDoubles[i] = Double.parseDouble(ligne[i]);
        }
        return mesDoubles;
    }
}

    


