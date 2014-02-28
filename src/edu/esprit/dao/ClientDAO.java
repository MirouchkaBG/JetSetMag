/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

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
public class ClientDAO {
    
    public void insertClient(Client st){

         String requete = "insert into client (Nom,Prenom,Login,Password,DateNaissance,Sexe,Email,Pays,Telephone,EtatClient) values (?,?,?,?,23,?,?,?,?,'ban')";
        try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, st.getNom());
            ps.setString(2, st.getPrenom());
            ps.setString(3,st.getLogin());
            ps.setString(4,st.getPassword());
            ps.setString(5,st.getSexe());
            ps.setString(6, st.getEmail());
            ps.setString(7, st.getPays());
            ps.setInt(8, st.getTelephone());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

//    public void updateStock(Client st){
//        String requete = "update client set Nom=?, Prenom=?, Login=?, Password=?, Sexe=?, Email=?, Pays=?, Telephone=? where IdClient=?";
//        try {
//            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
//            ps.setString(1, st.getNom());
//            ps.setString(2, st.getPrenom());
//            ps.setString(3,st.getLogin());
//            ps.setString(4,st.getPassword());
//            ps.setString(5,st.getSexe());
//            ps.setString(6, st.getEmail());
//            ps.setString(7, st.getPays());
//            ps.setInt(8, st.getTelephone());
//            ps.executeUpdate();
//            System.out.println("Mise à jour effectuée avec succès");
//        } catch (SQLException ex) {
//           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
//        }
//
//    }

     public void deleteClient(int Id){

          String requete = "delete from client where IdClient=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, Id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


      public Client findStockByNum(int id){

        String requete = "select * from client where IdClient=?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setInt(1, id);
        ResultSet resultat = ps.executeQuery();
        Client cl = new Client();
        while (resultat.next()){

            cl.setIdClient(resultat.getInt(1));
            cl.setNom(resultat.getString(2));
            cl.setPrenom(resultat.getString(3));
            cl.setLogin(resultat.getString(4));
            cl.setPassword(resultat.getString(5));           
            cl.setEmail(resultat.getString(8));
            cl.setPays(resultat.getString(9));
            cl.setTelephone(resultat.getInt(10));

        }
        return cl;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }

       public List<Client> DisplayAllCLients (){


        List<Client> listeClients = new ArrayList<Client>();

        String requete = "select * from client";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Client cl =new Client();
            cl.setIdClient(resultat.getInt(1));
            cl.setPrenom(resultat.getString(3));
            cl.setLogin(resultat.getString(4));
            cl.setPassword(resultat.getString(5));           
            cl.setEmail(resultat.getString(8));
            cl.setPays(resultat.getString(9));
            cl.setTelephone(resultat.getInt(10));

                listeClients.add(cl);
            }
            return listeClients;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }

}
