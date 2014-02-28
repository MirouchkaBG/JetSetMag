/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.Gui;

import edu.esprit.dao.ClientDAO;
import edu.esprit.entities.Client;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hajoura
 */
public class AjoutCompteClient extends javax.swing.JFrame {


    /**
     * Creates new form AjoutCompteClient
     */
    public AjoutCompteClient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupHommeFemme = new javax.swing.ButtonGroup();
        BtSauvegarder = new javax.swing.JButton();
        BtQuitter = new javax.swing.JButton();
        LabelNom = new javax.swing.JLabel();
        jLogin = new javax.swing.JTextField();
        jNumTel = new javax.swing.JTextField();
        jPassword = new javax.swing.JTextField();
        jPasswordCon = new javax.swing.JTextField();
        jNom = new javax.swing.JTextField();
        jPrenom = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jSexe = new javax.swing.JLabel();
        jAdresseElectronique = new javax.swing.JTextField();
        LabelPays = new javax.swing.JLabel();
        jComboPays = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Tverif_mpV = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtSauvegarder.setText("Sauvegarder");
        BtSauvegarder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSauvegarderActionPerformed(evt);
            }
        });

        BtQuitter.setText("Quitter");

        LabelNom.setText("Nom");

        jPasswordCon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordConFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordConFocusLost(evt);
            }
        });

        buttonGroupHommeFemme.add(jRadioButton1);
        jRadioButton1.setText("Homme");

        buttonGroupHommeFemme.add(jRadioButton2);
        jRadioButton2.setText("Femme");

        jSexe.setText("Sexe");

        LabelPays.setText("Pays");

        jComboPays.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Algérie", "Allemagne", "Bélgique", "Canada", "France", "Italie", "Liban", "Syrie", "Suisse", "Tunisie", " " }));

        jLabel1.setText("Login");

        jLabel2.setText("Password");

        jLabel3.setText("Confirmer Password");

        jLabel4.setText("Age");

        jLabel5.setText("Numéro de téléphone");

        jLabel6.setText("Email");

        Tverif_mpV.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtSauvegarder)
                            .addGap(18, 18, 18)
                            .addComponent(BtQuitter))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSexe)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton1)
                                        .addComponent(LabelPays))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(58, 58, 58)
                                            .addComponent(jRadioButton2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(48, 48, 48)
                                            .addComponent(jComboPays, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addContainerGap(65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jAdresseElectronique, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jNumTel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelNom)
                                    .addGap(0, 93, Short.MAX_VALUE))
                                .addComponent(jPrenom))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jNom, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLogin, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPasswordCon, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(Tverif_mpV, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(LabelNom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jPasswordCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tverif_mpV, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(jNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jAdresseElectronique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jSexe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPays)
                    .addComponent(jComboPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtSauvegarder)
                    .addComponent(BtQuitter)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSauvegarderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSauvegarderActionPerformed
       
       String Prénom= jPrenom.getText();
       String Nom= jNom.getText();
       String Login= jLogin.getText();
       String Password= jPassword.getText();
       int Tel= Integer.parseInt(jNumTel.getText());
       String Email= jAdresseElectronique.getText();
       String Pays= (String) jComboPays.getSelectedItem();
       String sexe="";
        if (jRadioButton1.isSelected())
        {
             sexe = jRadioButton1.getText();
        }
        if (jRadioButton2.isSelected())
        {
            sexe = jRadioButton2.getText();
        }
       Client clt= new Client();
       clt.setNom(Nom);
       clt.setPrenom(Prénom);
       clt.setLogin(Login);
       clt.setPassword(Password);
       clt.setEmail(Email);
       clt.setTelephone(Tel);
       clt.setPays(Pays);
       clt.setSexe(sexe);
       if ((Prénom.equalsIgnoreCase(""))||(Nom.equalsIgnoreCase(""))||(Password.equalsIgnoreCase(""))||(jPasswordCon.getText().equalsIgnoreCase(""))||(Login.equalsIgnoreCase(""))||(Email.equalsIgnoreCase(""))||(Tel==0))
       {
           JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs !");

       }
       else {
           
            ClientDAO clt_dao= new ClientDAO();      
            clt_dao.insertClient(clt);
            JOptionPane.showMessageDialog(this, "Ajout effectué avec succès");
            }
    }//GEN-LAST:event_BtSauvegarderActionPerformed

    private void jPasswordConFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordConFocusLost
                      Tverif_mpV.setVisible(true);
        if((jPassword.getText().equals(jPasswordCon.getText()))&&(!jPassword.getText().equals(""))&&(!jPasswordCon.equals("")))
	  {
		Tverif_mpV.setForeground(new Color(0, 153, 0));
		Tverif_mpV.setText("Les deux mots de passe sont identiques !!");
	  }
       else if(!jPassword.getText().equals(jPasswordCon.getText())){
		Tverif_mpV.setForeground(Color.RED);
		Tverif_mpV.setText("Les deux mots de passe ne sont pas identiques !!");
	  }
    }//GEN-LAST:event_jPasswordConFocusLost

    private void jPasswordConFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordConFocusGained
                Tverif_mpV.setText("");
    }//GEN-LAST:event_jPasswordConFocusGained
      
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjoutCompteClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutCompteClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutCompteClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutCompteClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutCompteClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtQuitter;
    private javax.swing.JButton BtSauvegarder;
    private javax.swing.JLabel LabelNom;
    private javax.swing.JLabel LabelPays;
    private javax.swing.JLabel Tverif_mpV;
    private javax.swing.ButtonGroup buttonGroupHommeFemme;
    private javax.swing.JTextField jAdresseElectronique;
    private javax.swing.JComboBox jComboPays;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jLogin;
    private javax.swing.JTextField jNom;
    private javax.swing.JTextField jNumTel;
    private javax.swing.JTextField jPassword;
    private javax.swing.JTextField jPasswordCon;
    private javax.swing.JTextField jPrenom;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel jSexe;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
