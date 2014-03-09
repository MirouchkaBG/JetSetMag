/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

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
public class ElementCulturelDAO {
    
     public void insertElementCulturel(ElementCulturel e){

        String requete = "insert into elementculturel (id,titre,datepublication,contenu) values (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
             ps.setInt(1, e.getId());
             ps.setString(2, e.getTitre());
             ps.setString(3, e.getDatepublication());
             ps.setString(4, e.getContenu());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

    public void updateElementCulturel(ElementCulturel e){
        String requete = "update elementculturel set Titre=?, Datepublication=?, Contenu=? where Id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, e.getTitre());
            ps.setString(2, e.getDatepublication());
            ps.setString(3, e.getContenu());
            ps.setInt(4, e.getId());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteElementCulturel(int id){
        String requete = "delete from elementculturel where id=?";
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


    public ElementCulturel findElementCulturelById(int id){
    ElementCulturel e = new ElementCulturel();
     String requete = "select * from elementculturel where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                e.setId(resultat.getInt(1));
                e.setTitre(resultat.getString(2));
                e.setDatepublication(resultat.getString(3));
                e.setContenu(resultat.getString(4));
            }
            return e;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'élément "+ex.getMessage());
            return null;
        }
    }

    public ElementCulturel findElementByTitre(String titre){
    ElementCulturel e = new ElementCulturel();
     String requete = "select * from elementculturel where titre = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, titre);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                e.setId(resultat.getInt(1));
                System.out.println("testttttttt"+e.getId());
                e.setTitre(resultat.getString(2));
                System.out.println(resultat.getString(2));
                e.setDatepublication(resultat.getString(3));
                System.out.println(resultat.getString(3));
                e.setContenu(resultat.getString(4));
                System.out.println(resultat.getString(4));
            }
            return e;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'élément "+ex.getMessage());
            return null;
        }
    }

    public List<ElementCulturel> DisplayAllElements (){


        List<ElementCulturel> listeelements = new ArrayList<ElementCulturel>();

        String requete = "select * from elementculturel";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                ElementCulturel e =new ElementCulturel();
                e.setId(resultat.getInt(1));
                e.setTitre(resultat.getString(2));
                e.setDatepublication(resultat.getString(3));
                e.setContenu(resultat.getString(4));
                
                listeelements.add(e);
            }
            return listeelements;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des éléments "+ex.getMessage());
            return null;
        }
    }

   
    
}
