/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author ilan_
 */
public class Secteurs
{
    private int idSecteur;
    private String libelleSecteur;
    
    public Secteurs(int unId,String unLibelle)
    {
        idSecteur = unId;
        libelleSecteur = unLibelle;
        
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
    
}
