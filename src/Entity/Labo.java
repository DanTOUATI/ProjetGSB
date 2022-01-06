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
public class Labo 
{
    private int idLabo;
    private String nomLabo;
    private String chefVenteLabo;
    
    public Labo(int unId,String unNom,String unChef)
    {
        idLabo = unId;
        nomLabo = unNom;
        chefVenteLabo = unChef;
    }

    Labo(String unNom) {
        nomLabo = unNom;
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
     * @return the chefVenteLabo
     */
    public String getChefVenteLabo() {
        return chefVenteLabo;
    }

    /**
     * @param chefVenteLabo the chefVenteLabo to set
     */
    public void setChefVenteLabo(String chefVenteLabo) {
        this.chefVenteLabo = chefVenteLabo;
    }
    
}
