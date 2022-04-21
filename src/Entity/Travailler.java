/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author Dan
 * création de la class Travailler
 */
public class Travailler 
{

    /**
     * @return the nomVisiteur
     */
    public String getNomVisiteur() {
        return nomVisiteur;
    }

    /**
     * @param nomVisiteur the nomVisiteur to set
     */
    public void setNomVisiteur(String nomVisiteur) {
        this.nomVisiteur = nomVisiteur;
    }

    /**
     * @return the prenomVis
     */
    public String getPrenomVis() {
        return prenomVis;
    }

    /**
     * @param prenomVis the prenomVis to set
     */
    public void setPrenomVis(String prenomVis) {
        this.prenomVis = prenomVis;
    }

    /**
     * @return the nomRegion
     */
    public String getNomRegion() {
        return nomRegion;
    }

    /**
     * @param nomRegion the nomRegion to set
     */
    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }
    private int idVisiteur;
    private Date DateTravailler;
    private int idRegion;
    private String roleTravailler;
    private String nomVisiteur;
    private String prenomVis;
    private String nomRegion;
/**
 * 
 * constructeur
 */
    public Travailler(int unIdVis,Date uneDateTravailler,int unIdReg,String unRole)
    {
        idVisiteur = unIdVis;
        DateTravailler = uneDateTravailler;
        idRegion = unIdReg;
        roleTravailler = unRole;
    }
  public Travailler(String unNomVis,String unPrenom,Date uneDateTravailler,String unNomReg,String unRole)
    {
        nomVisiteur=unNomVis;
        prenomVis=unPrenom;
        DateTravailler = uneDateTravailler;
        nomRegion = unNomReg;
        roleTravailler = unRole;
    }
  
    public int getIdVisiteur() {
        return idVisiteur;
    }

    
    public void setIdVisiteur(int idVisiteur) {
        this.idVisiteur = idVisiteur;
    }

    public Date getDateTravailler() {
        return DateTravailler;
    }

    public void setDateTravailler(Date DateTravailler) {
        this.DateTravailler = DateTravailler;
    }

   
    public int getIdRegion() {
        return idRegion;
    }

   
    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    
    public String getRoleTravailler() {
        return roleTravailler;
    }

   
    public void setRoleTravailler(String roleTravailler) {
        this.roleTravailler = roleTravailler;
    }
    
}
