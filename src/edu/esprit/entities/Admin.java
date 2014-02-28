/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author Hajoura
 */
public class Admin {
    public int IdAdministrateur;
    public String Login;
     public String Password;

    public int getIdAdministrateur() {
        return IdAdministrateur;
    }

    public void setIdAdministrateur(int IdAdministrateur) {
        this.IdAdministrateur = IdAdministrateur;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
     
    
}
