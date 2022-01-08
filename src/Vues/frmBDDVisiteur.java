/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.ConnexionBdd;
import Entity.FonctionsMetier;
import Entity.Labo;
import Entity.Regions;
import Entity.Secteurs;
import Entity.Visiteurs;
import Model.ModelUser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmBDDVisiteur extends javax.swing.JFrame {

    FonctionsMetier fm= new FonctionsMetier();
    public frmBDDVisiteur() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBDDVisiteurs = new javax.swing.JTable();
        btnRetour = new javax.swing.JButton();
        btnSecteur = new javax.swing.JButton();
        btnRegion = new javax.swing.JButton();
        btnVisiteur = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblValidate = new javax.swing.JLabel();
        lblDenied = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        txtAdresse = new javax.swing.JTextField();
        txtCodePostal = new javax.swing.JTextField();
        txtVille = new javax.swing.JTextField();
        CalendarDateEmbauche = new com.toedter.calendar.JDateChooser();
        CBSecteur = new javax.swing.JComboBox<>();
        CBLabo = new javax.swing.JComboBox<>();
        btnModifier = new javax.swing.JButton();
        cbRegion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(237, 240, 250));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Base de données");

        tblBDDVisiteurs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblBDDVisiteurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBDDVisiteursMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBDDVisiteurs);

        btnRetour.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRetour.setText("<");
        btnRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetourMouseClicked(evt);
            }
        });

        btnSecteur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSecteur.setForeground(new java.awt.Color(51, 0, 153));
        btnSecteur.setText("SECTEUR");
        btnSecteur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSecteurMouseClicked(evt);
            }
        });

        btnRegion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegion.setForeground(new java.awt.Color(51, 0, 153));
        btnRegion.setText("REGION");
        btnRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegionMouseClicked(evt);
            }
        });

        btnVisiteur.setBackground(new java.awt.Color(51, 0, 153));
        btnVisiteur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVisiteur.setForeground(new java.awt.Color(255, 255, 255));
        btnVisiteur.setText("VISITEUR");

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/battement-de-coeur (1).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Cliquer pour modifier un visiteur");

        lblValidate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValidate.setForeground(new java.awt.Color(0, 204, 0));

        lblDenied.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDenied.setForeground(new java.awt.Color(255, 0, 0));

        txtNom.setText("Nom");

        txtPrenom.setText("Prenom");

        txtAdresse.setText("Adresse");
        txtAdresse.setToolTipText("");

        txtCodePostal.setText("Code Postal");

        txtVille.setText("Ville");

        btnModifier.setBackground(new java.awt.Color(0, 153, 255));
        btnModifier.setText("MODIFIER");
        btnModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifierMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRetour)
                        .addGap(389, 389, 389)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 300, Short.MAX_VALUE)
                        .addComponent(btnVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(btnSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblDenied, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValidate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtVille, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(txtCodePostal, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(txtAdresse, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(CalendarDateEmbauche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CBSecteur, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CBLabo, 0, 240, Short.MAX_VALUE)
                                .addComponent(cbRegion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetour)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CalendarDateEmbauche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBLabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModifier))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(lblValidate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDenied)
                .addContainerGap(80, Short.MAX_VALUE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ActualisationTableau();
        
        for (Secteurs s : fm.getAllSecteur())
        {
            CBSecteur.addItem(s.getLibelleSecteur());
        }
        
        for (Labo lab : fm.getAllLabo())
        {            
            CBLabo.addItem(lab.getNomLabo());
        }
        
        for (Regions reg:fm.getAllRegions())
        {
            cbRegion.addItem(reg.getNomRegion());
        }
                                  
        
    }//GEN-LAST:event_formWindowOpened

    private void btnRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegionMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        frmBDDRegion frmBddReg = new frmBDDRegion();
        frmBddReg.setVisible(true);
    }//GEN-LAST:event_btnRegionMouseClicked

    private void btnSecteurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSecteurMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        frmBDDSecteur frmBddSec = new frmBDDSecteur();
        frmBddSec.setVisible(true);
    }//GEN-LAST:event_btnSecteurMouseClicked

    private void btnRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetourMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        frmTDBVisRegSec frmTdbVRS = new frmTDBVisRegSec();
        frmTdbVRS.setVisible(true);
    }//GEN-LAST:event_btnRetourMouseClicked

    private void tblBDDVisiteursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBDDVisiteursMouseClicked
        String nomVisiteur=tblBDDVisiteurs.getValueAt(tblBDDVisiteurs.getSelectedRow(),1).toString();
        txtNom.setText(nomVisiteur);
        String prenomVisiteur=tblBDDVisiteurs.getValueAt(tblBDDVisiteurs.getSelectedRow(),2).toString();
        txtPrenom.setText(prenomVisiteur);
        String adresseVisiteur=tblBDDVisiteurs.getValueAt(tblBDDVisiteurs.getSelectedRow(),3).toString();
        txtAdresse.setText(adresseVisiteur);
        String codePostalVisiteur=tblBDDVisiteurs.getValueAt(tblBDDVisiteurs.getSelectedRow(),4).toString();
        txtCodePostal.setText(codePostalVisiteur);
        String villeVisiteur=tblBDDVisiteurs.getValueAt(tblBDDVisiteurs.getSelectedRow(),5).toString();
        txtVille.setText(villeVisiteur);
        String nomLabo=tblBDDVisiteurs.getValueAt(tblBDDVisiteurs.getSelectedRow(),8).toString();
        CBLabo.setSelectedItem(nomLabo);
        String libelleSecteur=tblBDDVisiteurs.getValueAt(tblBDDVisiteurs.getSelectedRow(),7).toString();
        CBSecteur.setSelectedItem(libelleSecteur);
        String nomRegion = tblBDDVisiteurs.getValueAt(tblBDDVisiteurs.getSelectedRow(), 9).toString();
        cbRegion.setSelectedItem(nomRegion);
        
        
        try {           
            Date dateVisiteur = new SimpleDateFormat("yyyy-MM-dd").parse(tblBDDVisiteurs.getValueAt(tblBDDVisiteurs.getSelectedRow(),6).toString());
            CalendarDateEmbauche.setDate(dateVisiteur);
        } catch (ParseException ex) {
            Logger.getLogger(frmBDDVisiteur.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_tblBDDVisiteursMouseClicked

    private void btnModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierMouseClicked
         if (tblBDDVisiteurs.getSelectedRow()<0)
         {
             JOptionPane.showMessageDialog(this, "Veuillez choisir une ligne à modifier");
         }
         else
         {
            int idVisiteur=Integer.parseInt(tblBDDVisiteurs.getValueAt(tblBDDVisiteurs.getSelectedRow(),0).toString());
                    
            ConnexionBdd cnx= new ConnexionBdd();
            fm= new FonctionsMetier();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(CalendarDateEmbauche.getDate());
            fm.ModifierVisiteur(idVisiteur, txtNom.getText(),txtPrenom.getText(),txtAdresse.getText(),Integer.parseInt(txtCodePostal.getText()),txtVille.getText(),date,CBSecteur.getSelectedItem().toString(),CBLabo.getSelectedItem().toString(),cbRegion.getSelectedItem().toString());
            ActualisationTableau();
         }
        
      

    }//GEN-LAST:event_btnModifierMouseClicked
     private void ActualisationTableau(){
        ConnexionBdd cnx = new ConnexionBdd();
        ModelUser mdlUser = new ModelUser();
        mdlUser.LoadDats10Colonnes(fm.getAllVisiteurs());
        tblBDDVisiteurs.setModel(mdlUser);
        
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
            java.util.logging.Logger.getLogger(frmBDDVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBDDVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBDDVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBDDVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBDDVisiteur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBLabo;
    private javax.swing.JComboBox<String> CBSecteur;
    private com.toedter.calendar.JDateChooser CalendarDateEmbauche;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnRegion;
    private javax.swing.JButton btnRetour;
    private javax.swing.JButton btnSecteur;
    private javax.swing.JButton btnVisiteur;
    private javax.swing.JComboBox<String> cbRegion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDenied;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblValidate;
    private javax.swing.JTable tblBDDVisiteurs;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtCodePostal;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
