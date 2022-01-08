/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author ilan_
 */
public class Visiteurs 
{
    private int idVisiteur;
    private String nomVisiteur;
    private String prenomVisiteur;
    private String adresseVisiteur;
    private int cpVisiteur;
    private String villeVisiteur;
    private Date dateEmbaucheVisiteur;
    private int idSecteur;
    private int idLabo;
    private String libelleSecteur;
    private String nomLabo;
    private int idRegion;
    private String nomRegion;
    
    public Visiteurs(int unId,String unNom,String unPrenom,String uneAdresse,int unCP,String uneVille,Date uneDate,int unIdSec,int unIdLabo)
    {
        idVisiteur = unId;
        nomVisiteur = unNom;
        prenomVisiteur = unPrenom;
        adresseVisiteur = uneAdresse;
        cpVisiteur = unCP;
        villeVisiteur = uneVille;
        dateEmbaucheVisiteur = uneDate;
        idSecteur = unIdSec;
        idLabo = unIdLabo;
    }

    public Visiteurs(int unId,String unNom,String unPrenom,String uneAdresse,int unCP,String uneVille,Date uneDate,String unLibelle,String UnNomLabo,String unNomRegion)
    {
        idVisiteur = unId;
        nomVisiteur = unNom;
        prenomVisiteur = unPrenom;
        adresseVisiteur = uneAdresse;
        cpVisiteur = unCP;
        villeVisiteur = uneVille;
        dateEmbaucheVisiteur = uneDate;
        libelleSecteur = unLibelle;
        nomLabo = UnNomLabo;
        nomRegion = unNomRegion;
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
     * @return the prenomVisiteur
     */
    public String getPrenomVisiteur() {
        return prenomVisiteur;
    }

    /**
     * @param prenomVisiteur the prenomVisiteur to set
     */
    public void setPrenomVisiteur(String prenomVisiteur) {
        this.prenomVisiteur = prenomVisiteur;
    }

    /**
     * @return the adresseVisiteur
     */
    public String getAdresseVisiteur() {
        return adresseVisiteur;
    }

    /**
     * @param adresseVisiteur the adresseVisiteur to set
     */
    public void setAdresseVisiteur(String adresseVisiteur) {
        this.adresseVisiteur = adresseVisiteur;
    }

    /**
     * @return the cpVisiteur
     */
    public int getCpVisiteur() {
        return cpVisiteur;
    }

    /**
     * @param cpVisiteur the cpVisiteur to set
     */
    public void setCpVisiteur(int cpVisiteur) {
        this.cpVisiteur = cpVisiteur;
    }

    /**
     * @return the villeVisiteur
     */
    public String getVilleVisiteur() {
        return villeVisiteur;
    }

    /**
     * @param villeVisiteur the villeVisiteur to set
     */
    public void setVilleVisiteur(String villeVisiteur) {
        this.villeVisiteur = villeVisiteur;
    }

    /**
     * @return the dateEmbaucheVisiteur
     */
    public Date getDateEmbaucheVisiteur() {
        return dateEmbaucheVisiteur;
    }

    /**
     * @param dateEmbaucheVisiteur the dateEmbaucheVisiteur to set
     */
    public void setDateEmbaucheVisiteur(Date dateEmbaucheVisiteur) {
        this.dateEmbaucheVisiteur = dateEmbaucheVisiteur;
    }

    /**
     * @return the idSecteur
     */
    public int getIdSecteur() {
        return idSecteur;
    }

    /**
     * @param idSecteur the idSecteur to set
     */
    public void setIdSecteur(int idSecteur) {
        this.idSecteur = idSecteur;
    }

    /**
     * @return the idLabo
     */
    public int getIdLabo() {
        return idLabo;
    }

    /**
     * @param idLabo the idLabo to set
     */
    public void setIdLabo(int idLabo) {
        this.idLabo = idLabo;
    }

    /**
     * @return the libelleSecteur
     */
    public String getLibelleSecteur() {
        return libelleSecteur;
    }

    /**
     * @param libelleSecteur the libelleSecteur to set
     */
    public void setLibelleSecteur(String libelleSecteur) {
        this.libelleSecteur = libelleSecteur;
    }

    /**
     * @return the nomLabo
     */
    public String getNomLabo() {
        return nomLabo;
    }

    /**
     * @param nomLabo the nomLabo to set
     */
    public void setNomLabo(String nomLabo) {
        this.nomLabo = nomLabo;
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
    
    
}
