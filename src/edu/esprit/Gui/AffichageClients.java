/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.Gui;

import edu.esprit.dao.ClientDAO;
import edu.esprit.entities.Client;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hajoura
 */
public class AffichageClients extends AbstractTableModel{
    

    List<Client> listeCl= new ArrayList<Client>();
    String[] headers = {"Id","Prénom","Login","Password","Num_tel","Pays","Email"};
    
    public AffichageClients() {
//      if (e.getSource()==GestionClient.BtRechercher)
//      {
//          ClientDAO stdao = new ClientDAO();
//          Client cltrouvé= new Client();
//          cltrouvé=stdao.findClientByNum(Integer.parseInt(GestionClient.jtxtcritère.getText()));
//      }
//       
//      else {
          ClientDAO stdao = new ClientDAO();
          listeCl=stdao.DisplayAllCLients();
       
//      }
    }
     public int getRowCount() {
       return listeCl.size();
    }
    public int getColumnCount() {
        return headers.length;
    }
    public String getColumnName(int column)
    {
        return headers[column];
    }
   
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0:
               return listeCl.get(rowIndex).getIdClient();
           case 1:
               return listeCl.get(rowIndex).getPrenom();
           case 2:
               return listeCl.get(rowIndex).getLogin();
           case 3:
               return listeCl.get(rowIndex).getPassword();
           case 4:
               return listeCl.get(rowIndex).getTelephone();
           case 5:
               return listeCl.get(rowIndex).getPays();
           case 6:
               return listeCl.get(rowIndex).getEmail();
           default:
               return null;
       }
    }
 
}

