/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ilan_
 */
public interface IMetier {
    
    
    public ArrayList<Visiteurs> getAllVisiteurs();
    public ArrayList<Regions> getAllRegions();
    public ArrayList<Secteurs> getAllSecteur();
    public ArrayList<Labo>getAllLabo();
    public void InsererVisiteurs(String nom,String Prenom,String adresse,String cp,String ville,String dateEmbauche,String secteur,String labo);
    public void InsererRegion(String nom,String libelle);
    public void InsererSecteur(String libelle);
    public void modifierRegion(int idReg,String nomReg);
    public void modifierSecteur(int id,String secteur);
    public void ModifierVisiteur(int id,String nom, String prenom, String adresse, int cp, String ville, String dateEmbauche, String secteur,String labo);
    public void InsererNum (String Prenom,String Nom,String numTel,String mail);
    public Responsable VerfierIdentifiants(String Prenom, String Mail);
   
    
}
