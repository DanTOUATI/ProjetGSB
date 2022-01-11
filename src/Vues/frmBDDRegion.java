/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.ConnexionBdd;
import Entity.FonctionsMetier;
import Model.ModelRegion;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author ilan_
 */
public class frmBDDRegion extends javax.swing.JFrame {

    FonctionsMetier fm;
    ModelRegion mdlReg;
    /**
     * Creates new form frmBDDRegion
     */
    public frmBDDRegion() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBddRegion = new javax.swing.JTable();
        btnVisiteur = new javax.swing.JButton();
        btnRegion = new javax.swing.JButton();
        btnSecteur = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        btnRetour = new javax.swing.JButton();
        txtRegion = new javax.swing.JTextField();
        BtnModifier = new javax.swing.JButton();
        lblValidate = new javax.swing.JLabel();
        lblDenied = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        tblBddRegion.setBackground(new java.awt.Color(240, 240, 240));
        tblBddRegion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblBddRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBddRegionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBddRegion);

        btnVisiteur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVisiteur.setForeground(new java.awt.Color(51, 102, 255));
        btnVisiteur.setText("VISITEUR");
        btnVisiteur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisiteurMouseClicked(evt);
            }
        });

        btnRegion.setBackground(new java.awt.Color(255, 255, 255));
        btnRegion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegion.setForeground(new java.awt.Color(51, 102, 255));
        btnRegion.setText("REGION");

        btnSecteur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSecteur.setForeground(new java.awt.Color(51, 102, 255));
        btnSecteur.setText("SECTEUR");
        btnSecteur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSecteurMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Base de données");

        lblImg.setBackground(new java.awt.Color(51, 102, 255));
        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/battement-de-coeur (1).png"))); // NOI18N

        btnRetour.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRetour.setText("<");
        btnRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetourMouseClicked(evt);
            }
        });

        BtnModifier.setBackground(new java.awt.Color(255, 255, 255));
        BtnModifier.setForeground(new java.awt.Color(51, 102, 255));
        BtnModifier.setText("MODIFIER");
        BtnModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnModifierMouseClicked(evt);
            }
        });

        lblValidate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValidate.setForeground(new java.awt.Color(0, 153, 0));

        lblDenied.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDenied.setForeground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cliquez pour modifier une région ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229)
                .addComponent(btnSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRetour)
                        .addGap(356, 356, 356)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(BtnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDenied, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRetour))
                .addGap(27, 27, 27)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(BtnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addComponent(lblValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDenied, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       ActualisationTableau();
    }//GEN-LAST:event_formWindowOpened

    private void btnRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetourMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        frmTDBVisRegSec frmTdbVRS = new frmTDBVisRegSec();
        frmTdbVRS.setVisible(true);
    }//GEN-LAST:event_btnRetourMouseClicked

    private void btnSecteurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSecteurMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        frmBDDSecteur frmBddSec = new frmBDDSecteur();
        frmBddSec.setVisible(true);
    }//GEN-LAST:event_btnSecteurMouseClicked

    private void btnVisiteurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisiteurMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        frmBDDVisiteur frmBddVis = new frmBDDVisiteur();
        frmBddVis.setVisible(true);
    }//GEN-LAST:event_btnVisiteurMouseClicked

    private void tblBddRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBddRegionMouseClicked

        String nomRegion=tblBddRegion.getValueAt(tblBddRegion.getSelectedRow(),2).toString();
        txtRegion.setText(nomRegion);
    }//GEN-LAST:event_tblBddRegionMouseClicked

    private void BtnModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModifierMouseClicked
       
        if (tblBddRegion.getSelectedRow()<0 )
        {
            JOptionPane.showMessageDialog(this,"Veuillez selectionner une ligne à modifier");
        }
        else if(txtRegion.getText().matches( "[a-zA-Z-]*"))
        {
            int idRegion=Integer.parseInt(tblBddRegion.getValueAt(tblBddRegion.getSelectedRow(),0).toString());
            String nomRegion=txtRegion.getText();
            ConnexionBdd cnx= new ConnexionBdd();
            fm= new FonctionsMetier();
            fm.modifierRegion(idRegion, nomRegion);
            ActualisationTableau();
            txtRegion.setText("");
            lblValidate.setText("La region a bien été modifiée");
            lblDenied.setText("");
            lblValidate.setForeground(Color.white);
        }
        else
        {
            lblValidate.setText("");
            lblDenied.setText("Veuillez ne mettre que des lettres svp");
            
        }
    }//GEN-LAST:event_BtnModifierMouseClicked
    private void ActualisationTableau(){
        ConnexionBdd cnx = new ConnexionBdd();
        FonctionsMetier fm= new FonctionsMetier();
        ModelRegion mdlReg = new ModelRegion();
        mdlReg.LoadDats3Colonnes(fm.getAllRegions());
        tblBddRegion.setModel(mdlReg);
        
    }
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
            java.util.logging.Logger.getLogger(frmBDDRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBDDRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBDDRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBDDRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBDDRegion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnModifier;
    private javax.swing.JButton btnRegion;
    private javax.swing.JButton btnRetour;
    private javax.swing.JButton btnSecteur;
    private javax.swing.JButton btnVisiteur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDenied;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblValidate;
    private javax.swing.JTable tblBddRegion;
    private javax.swing.JTextField txtRegion;
    // End of variables declaration//GEN-END:variables
}
