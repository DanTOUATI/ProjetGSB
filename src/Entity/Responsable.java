/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Dell
 */
public class Responsable 
{
    private int idResponsable;
    private String nomResponsable;
    private String prenomResponsable;
    private String numTel;
    private String mailResponsable;
    
    public Responsable(int unId, String unNom,String unPrenom,String unNum,String unMail)
    {
        idResponsable = unId;
        nomResponsable = unNom;
        prenomResponsable = unPrenom;
        numTel = unNum;
        mailResponsable = unMail;
    }

    public Responsable(String unPrenom, String unMail) 
    {
      prenomResponsable = unPrenom;
      mailResponsable = unMail;
    }

    /**
     * @return the idResponsable
     */
    public int getIdResponsable() {
        return idResponsable;
    }

    /**
     * @param idResponsable the idResponsable to set
     */
    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    /**
     * @return the nomResponsable
     */
    public String getNomResponsable() {
        return nomResponsable;
    }

    /**
     * @param nomResponsable the nomResponsable to set
     */
    public void setNomResponsable(String nomResponsable) {
        this.nomResponsable = nomResponsable;
    }

    /**
     * @return the prenomResponsable
     */
    public String getPrenomResponsable() {
        return prenomResponsable;
    }

    /**
     * @param prenomResponsable the prenomResponsable to set
     */
    public void setPrenomResponsable(String prenomResponsable) {
        this.prenomResponsable = prenomResponsable;
    }

    /**
     * @return the numTel
     */
    public String getNumTel() {
        return numTel;
    }

    /**
     * @param numTel the numTel to set
     */
    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    /**
     * @return the mailResponsable
     */
    public String getMailResponsable() {
        return mailResponsable;
    }

    /**
     * @param mailResponsable the mailResponsable to set
     */
    public void setMailResponsable(String mailResponsable) {
        this.mailResponsable = mailResponsable;
    }
    
}
