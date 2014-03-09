/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.Gui;


import edu.esprit.dao.ElementCulturelDAO;
import edu.esprit.entities.ElementCulturel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author draemplus
 */
public class AffichageElements extends AbstractTableModel{
    
    private final String[] Infos = { "Id", "Titre", "Datepublication","Contenu"};
    private List<ElementCulturel> elements = new ArrayList<ElementCulturel>();
    public AffichageElements() {
    ElementCulturelDAO eldao = new ElementCulturelDAO();
    ElementCulturel el=new ElementCulturel();
     elements=eldao.DisplayAllElements();   
    }


 
    @Override
    public int getColumnCount() {
        return Infos.length;
    }
 
    @Override
    public int getRowCount() {
        return elements.size();
    }
 
    @Override
    public String getColumnName(int column) {
        return Infos[column];
    }
 
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            
            case 0 :
                return elements.get(row).getId();
            case 1:
                   return elements.get(row).getTitre();
            case 2:
                   return elements.get(row).getDatepublication();
            case 3: 
                   return elements.get(row).getContenu();
            default: return null;
                
          
        }}
        
           
       
    }
    

