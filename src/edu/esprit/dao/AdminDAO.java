/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entities.Admin;
import edu.esprit.entities.Client;
import edu.esprit.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hajoura
 */
public class AdminDAO {

/**
 *
 * @author Hajoura
 */
  

    public void updatePswAdmin(int id,String nv_psw){
        String requete = "update administrateur set Password=? where IdAdministrateur=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nv_psw);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
     public Admin findAdminByPsw(String Password){

        String requete = "select * from administrateur where Password =?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setString(1, Password);
        ResultSet resultat = ps.executeQuery();
        Admin ad = new Admin();
        if (resultat.next()){

            ad.setIdAdministrateur(resultat.getInt(1));
            ad.setLogin(resultat.getString(2));
            ad.setPassword(resultat.getString(3));           
          
        return ad;
        }
        else {return null;
        }
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
    public Admin findAdminByLoginPassword(String Login,String Password)
           {
              
               Statement stmt = null;
               Admin admin = new Admin();
               String requete ="select login,mot de passe from administrateur" + " where login ='" +Login +"' and mot de passe='" +Password +"'";
              /*String  sql = "SELECT id, first, last, age FROM Registration" +" WHERE id >= 1 ";*/
               System.out.println( "aaa" +requete);
               try {
                    stmt = MyConnection.getInstance().createStatement();
                  
            System.out.println("result");
           
           ResultSet result = stmt.executeQuery(requete);
                  System.out.println("resultsss");
             while(result.next()){
                
                  String first = result.getString("login");
                  String last = result.getString("mot de passe");
                 
              admin.setLogin(first);
              admin.setPassword(last);
             System.out.println("login : " +admin.getLogin() +"password" +Password);
            }
            
               }catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
               return admin;
    }  
    public void insertAdministrateur(Admin C){

        String requete = "insert into administrateur (login,mot de passe) values (?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, C.getLogin());
            ps.setString(2, C.getPassword());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
}   
