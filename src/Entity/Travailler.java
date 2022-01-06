/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Travailler 
{
    private int idVisiteur;
    private Date DateTravailler;
    private int idRegion;
    private String roleTravailler;
    
    public Travailler(int unIdVis,Date uneDateTravailler,int unIdReg,String unRole)
    {
        idVisiteur = unIdVis;
        DateTravailler = uneDateTravailler;
        idRegion = unIdReg;
        roleTravailler = unRole;
    }

    /**
     * @return the idVisiteur
     */
    public int getIdVisiteur() {
        return idVisiteur;
    }

    /**
     * @param idVisiteur the idVisiteur to set
     */
    public void setIdVisiteur(int idVisiteur) {
        this.idVisiteur = idVisiteur;
    }

    /**
     * @return the DateTravailler
     */
    public Date getDateTravailler() {
        return DateTravailler;
    }

    /**
     * @param DateTravailler the DateTravailler to set
     */
    public void setDateTravailler(Date DateTravailler) {
        this.DateTravailler = DateTravailler;
    }

    /**
     * @return the idRegion
     */
    public int getIdRegion() {
        return idRegion;
    }

    /**
     * @param idRegion the idRegion to set
     */
    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    /**
     * @return the roleTravailler
     */
    public String getRoleTravailler() {
        return roleTravailler;
    }

    /**
     * @param roleTravailler the roleTravailler to set
     */
    public void setRoleTravailler(String roleTravailler) {
        this.roleTravailler = roleTravailler;
    }
    
}
