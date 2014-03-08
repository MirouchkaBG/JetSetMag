/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.Gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Hajoura
 */
public class AjoutDeNotification extends javax.swing.JPanel {
       public static int compteur=0;

    /**
     * Creates new form AjoutDeNotification
     */
    public AjoutDeNotification() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jtxtLieuEvent = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtHeureEvent = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jtxtDateEvent = new com.toedter.calendar.JDateChooser();
        jBtEnvoiMail = new javax.swing.JButton();
        jBtEnvoiViaCompte = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Date de début");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 107, 23));

        jLabel2.setText("Lieu");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 68, -1));

        jLabel3.setText("Détails");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 210, -1));
        jPanel1.add(jtxtLieuEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 210, -1));

        jLabel5.setText("Nom");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 60, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 210, -1));

        jLabel4.setText("Créer un evénement");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        jLabel6.setText("Heure");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, -1));
        jPanel1.add(jTxtHeureEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 210, -1));

        jCheckBox1.setText("Les invités peuvent convier des amis");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
        jPanel1.add(jtxtDateEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 210, -1));

        jBtEnvoiMail.setText("Envoyer via mail");
        jBtEnvoiMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEnvoiMailActionPerformed(evt);
            }
        });

        jBtEnvoiViaCompte.setText("Envoyer via compte");
        jBtEnvoiViaCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEnvoiViaCompteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtEnvoiMail, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jBtEnvoiViaCompte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtEnvoiMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtEnvoiViaCompte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtEnvoiMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEnvoiMailActionPerformed
        new EnvoiParMail().setVisible(true);
    }//GEN-LAST:event_jBtEnvoiMailActionPerformed

    private void jBtEnvoiViaCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEnvoiViaCompteActionPerformed
        compteur++;
        JOptionPane.showMessageDialog(this, "Message envoyé!");
        System.out.println(compteur);
        new testCompteur().setVisible(true);
    }//GEN-LAST:event_jBtEnvoiViaCompteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtEnvoiMail;
    private javax.swing.JButton jBtEnvoiViaCompte;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTxtHeureEvent;
    private com.toedter.calendar.JDateChooser jtxtDateEvent;
    private javax.swing.JTextField jtxtLieuEvent;
    // End of variables declaration//GEN-END:variables
}
