/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author ilan_
 */
public class FonctionsMetier implements IMetier {
    
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection maCnx;

    @Override
    public ArrayList<Visiteurs> getAllVisiteurs() {
         ArrayList<Visiteurs>mesVisiteurs = new ArrayList <Visiteurs>();
          try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("SELECT visiteur.id_vis,visiteur.nom_vis,visiteur.prenom_vis,visiteur.adresse_vis,visiteur.CP_vis,visiteur.ville_vis,visiteur.dateEmbauche_vis,secteur.libelle_sec,labo.nom_labo,region.region_nom FROM region INNER join secteur on region.id_sec = secteur.id_sec INNER join visiteur on secteur.id_sec = visiteur.id_sec INNER join labo on visiteur.id_labo = labo.id_labo order by visiteur.id_vis;");
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Visiteurs vis =new Visiteurs(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)
                        ,rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getString(10));
                mesVisiteurs.add(vis);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesVisiteurs;
    
    }

    @Override
    public ArrayList<Regions> getAllRegions() {
         ArrayList<Regions>mesRegions = new ArrayList<Regions>();
         try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("SELECT region.id_region,secteur.libelle_sec,region.region_nom FROM region inner JOIN secteur ON region.id_sec = secteur.id_sec;");
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                //Regions reg =new Regions(rs.getInt(1),rs.getInt(2),rs.getString(3));
                Regions reg = new Regions(rs.getInt(1),rs.getString(2),rs.getString(3));
                mesRegions.add(reg);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesRegions;
         
    }
    
    @Override
    public ArrayList<Secteurs> getAllSecteur() {
        ArrayList <Secteurs>mesSecteurs = new ArrayList<Secteurs>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select secteur.id_sec,secteur.libelle_sec from secteur ");
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Secteurs sec =new Secteurs(rs.getInt(1),rs.getString(2));
                mesSecteurs.add(sec);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesSecteurs;
    }
    @Override
    public ArrayList<Labo> getAllLabo() {
         ArrayList <Labo>mesLabo = new ArrayList<Labo>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select labo.nom_labo from labo");
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Labo lab =new Labo(rs.getString("nom_labo"));
                mesLabo.add(lab);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesLabo;
        
    }
    
    @Override
    public void InsererVisiteurs(String nom, String Prenom,String adresse ,String cp, String ville,String dateEmbauche, String secteur, String labo,String region) {
        
        try {
           maCnx=ConnexionBdd.getCnx();
           
            ps= maCnx.prepareStatement("select id_labo from labo where nom_labo = '"+labo+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numLabo = rs.getInt(1);
            rs.close();
            
            ps= maCnx.prepareStatement("select id_sec from secteur where libelle_sec = '"+secteur+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numSecteur = rs.getInt(1);
            rs.close();
            
            ps= maCnx.prepareStatement("select id_region from region where region_nom = '"+region+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numRegion = rs.getInt(1);
            rs.close();
            
            ps= maCnx.prepareStatement("INSERT INTO visiteur VALUES (null,'"+nom+"','"+Prenom+"','"+adresse+"','"+cp+"','"+ville+"','"+dateEmbauche+"',"+numSecteur+","+numLabo+","+numRegion+")");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void InsererRegion(String nom,String libelle) 
    {
        try {
            maCnx=ConnexionBdd.getCnx();
           
            ps= maCnx.prepareStatement("select secteur.id_sec from secteur where secteur.libelle_sec = '"+libelle+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numSecteur = rs.getInt(1);
            rs.close();
            
            String maSQL= "INSERT INTO region(region.region_nom, region.id_sec) VALUES ('"+nom+"','"+numSecteur+"')";
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void InsererSecteur(String libelle) {
        try {
            maCnx=ConnexionBdd.getCnx();
            String maSQL= "INSERT INTO secteur(secteur.libelle_sec) VALUES ('"+libelle+"')";
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ModifierVisiteur(int id,String nom, String prenom, String adresse, int cp, String ville, String dateEmbauche, String secteur,String labo,String region) {
       try {
            maCnx=ConnexionBdd.getCnx();
            String maSQL="SELECT secteur.id_sec FROM secteur WHERE secteur.libelle_sec='"+secteur+"'";
            ps= maCnx.prepareStatement(maSQL);
            rs=ps.executeQuery();
            rs.next();
            int numSecteur = rs.getInt(1);
            rs.close();
            
            maCnx=ConnexionBdd.getCnx();
            maSQL="SELECT labo.id_labo FROM labo WHERE labo.nom_labo='"+labo+"'";
            ps= maCnx.prepareStatement(maSQL);
            rs=ps.executeQuery();
            rs.next();
            int numLabo = rs.getInt(1);
            rs.close();
            
            maCnx=ConnexionBdd.getCnx();
            maSQL="SELECT region.id_region FROM region WHERE region.region_nom='"+region+"'";
            ps= maCnx.prepareStatement(maSQL);
            rs=ps.executeQuery();
            rs.next();
            int numRegion = rs.getInt(1);
            rs.close();
            
            maCnx=ConnexionBdd.getCnx();
            maSQL= "UPDATE visiteur SET visiteur.nom_vis='"+nom+"',visiteur.prenom_vis='"+prenom+"',"
                    + "visiteur.adresse_vis='"+adresse+"',visiteur.CP_vis='"+cp+"',visiteur.ville_vis='"+ville+"',"
                    + "visiteur.dateEmbauche_vis='"+dateEmbauche+"',visiteur.id_sec='"+numSecteur+"',visiteur.id_labo='"+numLabo+"',"
                    + "visiteur.id_region='"+numRegion+"' WHERE visiteur.id_vis ="+id;
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }


    @Override
    public void modifierRegion(int idReg,String nomReg) {
        try {
            maCnx=ConnexionBdd.getCnx();
            String maSQL= "UPDATE region SET region.region_nom='"+nomReg+"' WHERE region.id_region ="+idReg;
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @Override
    public void modifierSecteur(int id,String secteur) {
        try {
            maCnx=ConnexionBdd.getCnx();
            String maSQL= "UPDATE secteur SET secteur.libelle_sec='"+secteur+"' WHERE secteur.id_sec ="+id;
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void InsererNum(String Nom,String Prenom, String numTel,String mail)
    {
        try {
            maCnx=ConnexionBdd.getCnx();
            String maSQL= "INSERT INTO responsable(responsable.nom_res,responsable.prenom_res,responsable.telephone,responsable.mail) VALUES ('"+Nom+"','"+Prenom+"','"+numTel+"','"+mail+"')";
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Responsable VerfierIdentifiants(String Prenom, String Mail) 
    {
        Responsable res = null;
        try {
            maCnx=ConnexionBdd.getCnx();
            
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("Select * from responsable where prenom_res = '"+Prenom+"' AND mail='"+Mail+"'");
            
            rs=ps.executeQuery();
            
            //rs.next retourne boolean donc si c'est vrai 
            if(rs.next())
            {
                res=new Responsable(rs.getString(1),rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}  