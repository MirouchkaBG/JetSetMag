/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author draemplus
 */
public class Commentaire {

  
    private int IdCommentaire ;
    private String Description;
    private String Datepublication;
    
      public Commentaire(int IdCommentaire, String Descrption) {
        this.IdCommentaire = IdCommentaire;
        this.Description = Descrption;
    }

    public Commentaire() {
    }

    public int getIdCommentaire() {
        return IdCommentaire;
    }

    public void setIdCommentaire(int IdCommentaire) {
        this.IdCommentaire = IdCommentaire;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Descrption) {
        this.Description = Descrption;
    }

    public String getDatepublication() {
        return Datepublication;
    }

    public void setDatepublication(String Datepublication) {
        this.Datepublication = Datepublication;
    }

    @Override
    public String toString() {
        return "Commentaire{" + "IdCommentaire=" + IdCommentaire + ", Description=" + Description + ", Datepublication=" + Datepublication + '}';
    }
      
      
    
}
