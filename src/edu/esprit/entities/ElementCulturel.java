/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author draemplus
 */
public class ElementCulturel {
    
    private int id ;
    private String titre ;
    private String datepublication;
    private String contenu;

    public ElementCulturel() {
    }
    
    
     public ElementCulturel(int id, String titre, String datepublication, String contenu) {
        this.id = id;
        this.titre = titre;
        this.datepublication = datepublication;
        this.contenu = contenu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDatepublication() {
        return datepublication;
    }

    public void setDatepublication(String datepublication) {
        this.datepublication = datepublication;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ElementCulturel other = (ElementCulturel) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "ElementCulturel{" + "id=" + id + ", titre=" + titre + ", datepublication=" + datepublication + ", contenu=" + contenu + '}';
    }
     
     
    
    
}
