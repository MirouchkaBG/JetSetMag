/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.Gui;

import edu.esprit.dao.ClientDAO;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Hajoura
 */
public class InterfaceGlobale extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtGestionClients = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BtGénérationStat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanelprincipal = new javax.swing.JPanel();
        gestionClient1 = new edu.esprit.Gui.GestionClient();
        ajoutDeNotification2 = new edu.esprit.Gui.AjoutDeNotification();
        gestion21 = new edu.esprit.Gui.Gestion2();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtSupprimer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblHeure = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Bookman Old Style", 2, 10)); // NOI18N
        setForeground(new java.awt.Color(255, 51, 51));

        BtGestionClients.setText("Gestion des clients");
        BtGestionClients.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtGestionClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtGestionClientsActionPerformed(evt);
            }
        });

        jButton3.setText("Gestion des rubriques");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Gestion des élémens culturels");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setText("Envoi de notification");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BtGénérationStat.setText("Génération des statistiques");
        BtGénérationStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtGénérationStatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtGestionClients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtGénérationStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(BtGestionClients, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtGénérationStat, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Ajouter client");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanelprincipal.setBackground(new java.awt.Color(153, 255, 255));
        jPanelprincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jPanelprincipal.setForeground(new java.awt.Color(204, 204, 255));
        jPanelprincipal.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanelprincipal.setLayout(new java.awt.CardLayout());
        jPanelprincipal.add(gestionClient1, "gestionClient");
        jPanelprincipal.add(ajoutDeNotification2, "AjoutNotif");
        jPanelprincipal.add(gestion21, "gestion2");

        jLabel1.setText("Modifier Mot de Passe");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/esprit/img/changepassword.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        BtSupprimer.setText("Supprimer client");
        BtSupprimer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(lblHeure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHeure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public InterfaceGlobale() throws IOException {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 480);
        //setBackground(Color.yellow);
        Date maDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        lblDate.setText(dateFormat.format(maDate));
//                final String nom_fichier_image = "/edu/esprit/img/background.jpg";
//		 JPanel panneau = new JPanel()
//       {
//           protected void paintComponent(Graphics g) 
//           {
//               super.paintComponent(g);
//               ImageIcon m = new ImageIcon(nom_fichier_image);
//               Image monImage = m.getImage();
//               g.drawImage(monImage, 0, 0,this);
//           }
//       };
//         getContentPane().add(panneau);
        initComponents();
    }

    public void goGestionclient() {
        CardLayout card = (CardLayout) jPanelprincipal.getLayout();
        card.show(jPanelprincipal, "gestionClient");
    }

    public void goGestion2() {
        CardLayout card = (CardLayout) jPanelprincipal.getLayout();
        card.show(jPanelprincipal, "gestion2");
    }

    public void goEnvoiNotif() {
        CardLayout card = (CardLayout) jPanelprincipal.getLayout();
        card.show(jPanelprincipal, "AjoutNotif");
    }
    private void BtGestionClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtGestionClientsActionPerformed
        GestionClient.jTable2.setModel(new AffichageClients());
        goGestionclient();
    }//GEN-LAST:event_BtGestionClientsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        goGestion2();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new ModifierMotDePasse().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new AjoutCompteClient().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSupprimerActionPerformed
        if (GestionClient.jTable2.getSelectedRow() != -1) {
            int res = JOptionPane.showConfirmDialog(null, "voulez-vous vraiment supprimer cet utilisateur ?", "supprimer", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.NO_OPTION) {
                System.out.println("NO_OPTION");
            } else {
                AffichageClients aff = new AffichageClients();
                int x = (int) aff.getValueAt(GestionClient.jTable2.getSelectedRow(), 0);
                ClientDAO clt = new ClientDAO();
                clt.deleteClient(x);
                JOptionPane.showMessageDialog(this, "suppression effectuée avec succès !! :D");
                GestionClient.jTable2.setModel(new AffichageClients());
            }
        } else {
            JOptionPane.showMessageDialog(this, "aucune ligne n'est selectionnée");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtSupprimerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        goEnvoiNotif();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BtGénérationStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtGénérationStatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtGénérationStatActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceGlobale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGlobale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGlobale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGlobale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    new InterfaceGlobale().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InterfaceGlobale.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtGestionClients;
    private javax.swing.JButton BtGénérationStat;
    private javax.swing.JButton BtSupprimer;
    private edu.esprit.Gui.AjoutDeNotification ajoutDeNotification2;
    private edu.esprit.Gui.Gestion2 gestion21;
    private edu.esprit.Gui.GestionClient gestionClient1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelprincipal;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHeure;
    // End of variables declaration//GEN-END:variables
}
