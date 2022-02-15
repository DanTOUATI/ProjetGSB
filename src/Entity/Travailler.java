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
    private int idVisiteur;
    private Date DateTravailler;
    private int idRegion;
    private String roleTravailler;
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
