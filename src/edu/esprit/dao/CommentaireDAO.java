/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entities.Commentaire;
import edu.esprit.entities.ElementCulturel;
import edu.esprit.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author draemplus
 */
public class CommentaireDAO {
    
    public void deleteCommentaire(int id){
        String requete = "delete from commentaire where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Elément supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
    public List<Commentaire> DisplayAllCommentaires (){


        List<Commentaire> listecom = new ArrayList<Commentaire>();

        String requete = "select * from commentaire";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Commentaire c =new Commentaire();
                c.setIdCommentaire(resultat.getInt(1));
                c.setDescription(resultat.getString(2));
                c.setDatepublication(resultat.getString(3));
  
                
                listecom.add(c);
            }
            
            return listecom;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des éléments "+ex.getMessage());
            return null;
        }
    }

    
    
}
