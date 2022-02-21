/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.ConnexionBdd;
import Entity.FonctionsMetier;
import Model.ModelSecteur;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Dan
 */
public class frmBDDSecteur extends javax.swing.JFrame {

    FonctionsMetier fm;
    /**
     * Creates new form frmBDDSecteur
     */
    public frmBDDSecteur() {
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
        jLabel3 = new javax.swing.JLabel();
        btnVisiteur = new javax.swing.JButton();
        btnRegion = new javax.swing.JButton();
        btnSecteur = new javax.swing.JButton();
        btnRetour = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBddSec = new javax.swing.JTable();
        lblImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSecteur = new javax.swing.JTextField();
        btnModifier = new javax.swing.JButton();
        lblValidate = new javax.swing.JLabel();
        lblDenied = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(237, 240, 250));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Base de données");

        btnVisiteur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVisiteur.setForeground(new java.awt.Color(51, 102, 255));
        btnVisiteur.setText("VISITEUR");
        btnVisiteur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisiteurMouseClicked(evt);
            }
        });

        btnRegion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegion.setForeground(new java.awt.Color(51, 102, 255));
        btnRegion.setText("REGION");
        btnRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegionMouseClicked(evt);
            }
        });

        btnSecteur.setBackground(new java.awt.Color(255, 255, 255));
        btnSecteur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSecteur.setForeground(new java.awt.Color(51, 102, 255));
        btnSecteur.setText("SECTEUR");

        btnRetour.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRetour.setText("<");
        btnRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetourMouseClicked(evt);
            }
        });

        tblBddSec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblBddSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBddSecMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBddSec);

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/battement-de-coeur (1).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cliquez pour modifier un secteur");

        btnModifier.setBackground(new java.awt.Color(255, 255, 255));
        btnModifier.setForeground(new java.awt.Color(51, 102, 255));
        btnModifier.setText("MODIFIER");
        btnModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifierMouseClicked(evt);
            }
        });

        lblValidate.setForeground(new java.awt.Color(0, 204, 0));

        lblDenied.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btnVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(btnRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addComponent(btnSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRetour)
                                .addGap(359, 359, 359)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblDenied, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                                    .addComponent(lblValidate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(176, 176, 176)
                                        .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(128, 128, 128)
                                        .addComponent(txtSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetour)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addGap(25, 25, 25)
                        .addComponent(lblValidate)
                        .addGap(18, 18, 18)
                        .addComponent(lblDenied)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * au chargement du formulaire on actualise le tableau 
 * @param evt 
 */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ActualisationTableau();
        
    }//GEN-LAST:event_formWindowOpened
    /**
     * lorsqu'on clique sur le bouton Visiteur on est redirigé sur les visiteurs
     * @param evt 
     */
    private void btnVisiteurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisiteurMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        frmBDDVisiteur frmBddVis = new frmBDDVisiteur();
        frmBddVis.setVisible(true);
    }//GEN-LAST:event_btnVisiteurMouseClicked
/**
 * lorsqu'on clique sur le bouton Region on est redirigé sur les régions
 * @param evt 
 */
    private void btnRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegionMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        frmBDDRegion frmBddReg = new frmBDDRegion();
        frmBddReg.setVisible(true);
    }//GEN-LAST:event_btnRegionMouseClicked

    private void btnRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetourMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        frmTDBVisRegSec frmTdbVRS = new frmTDBVisRegSec();
        frmTdbVRS.setVisible(true);
    }//GEN-LAST:event_btnRetourMouseClicked
/**
 * lors d'un clique sur le tableau, on affiche le nom du secteur sélectionner
 * @param evt 
 */
    private void tblBddSecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBddSecMouseClicked
        String nomSecteur=tblBddSec.getValueAt(tblBddSec.getSelectedRow(),1).toString();
        txtSecteur.setText(nomSecteur);
    }//GEN-LAST:event_tblBddSecMouseClicked
/**
 * Lors d'un clique sur le bouton Modifier on effectue différentes vérifications
 * @param evt 
 */
    private void btnModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierMouseClicked

        if (tblBddSec.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(this, "Veuillez selectionner une ligne à modifier");
        }
        else if(txtSecteur.getText().matches( "^[^0-9]+$" ))
        {
            int idSecteur=Integer.parseInt(tblBddSec.getValueAt(tblBddSec.getSelectedRow(),0).toString());
            String nomSecteur=txtSecteur.getText();
            ConnexionBdd cnx= new ConnexionBdd();
            fm= new FonctionsMetier();
            fm.modifierSecteur(idSecteur,nomSecteur);
            ActualisationTableau();
            txtSecteur.setText(""); 
            lblValidate.setText("Le secteur a bien été modifié");
            lblDenied.setText("");
            lblValidate.setForeground(Color.white);
        }
        else
        {
            lblValidate.setText("");
            lblDenied.setText("Veuillez ne mettre que des lettres svp");
            lblDenied.setForeground(Color.white);
        }
         /**
          * Méthode permettant d'actualiser le tableau
          */
    }//GEN-LAST:event_btnModifierMouseClicked
     private void ActualisationTableau(){
        ConnexionBdd cnx = new ConnexionBdd();
        fm= new FonctionsMetier();
        ModelSecteur mdlSecteur = new ModelSecteur();
        mdlSecteur.LoadDats2Colonnes(fm.getAllSecteur());
        tblBddSec.setModel(mdlSecteur);
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
            java.util.logging.Logger.getLogger(frmBDDSecteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBDDSecteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBDDSecteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBDDSecteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBDDSecteur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnRegion;
    private javax.swing.JButton btnRetour;
    private javax.swing.JButton btnSecteur;
    private javax.swing.JButton btnVisiteur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDenied;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblValidate;
    private javax.swing.JTable tblBddSec;
    private javax.swing.JTextField txtSecteur;
    // End of variables declaration//GEN-END:variables
}
