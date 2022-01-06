/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ilan_
 */
public class Regions 
{
    private int idRegion;
    private int idSecteur;
    private String nomRegion;
    private String libelleSec;
    
    public Regions(int unId,int unIdSec,String unNom)
    {
        idRegion = unId;
        idSecteur = unIdSec ;
        nomRegion = unNom;
    }

    Regions(int unId, String unLibelleSec, String unNom) 
    {
        idRegion = unId;
        libelleSec = unLibelleSec;
        nomRegion = unNom;
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
     * @return the libelleSec
     */
    public String getLibelleSec() {
        return libelleSec;
    }

    /**
     * @param libelleSec the libelleSec to set
     */
    public void setLibelleSec(String libelleSec) {
        this.libelleSec = libelleSec;
    }
    
}
