/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.*;

import persistance.ManipulationFichier;
import utils.ComboBoxFiller;
import utils.Utilitaire;

/**
 *
 * @author 1795511
 */
public class GuiPrincipal extends javax.swing.JFrame {
    private ArrayList<Hangar> mesHangars;
    private ArrayList<Baux> mesBaux;
    private ArrayList<Avion> mesAvions;
    private ArrayList<ModeleAvion> mesModeleAvion;
    private ArrayList<Client>mesClients;
    /**
     * Creates new form GuiPrincipal
     */
    public GuiPrincipal(ArrayList<Hangar> mesHangars, ArrayList<Baux> mesBaux, ArrayList<Avion> mesAvions, ArrayList<ModeleAvion> mesModeleAvion,ArrayList<Client>mesClients) {
        initComponents();
        this.mesHangars = mesHangars;
        this.mesBaux = mesBaux;
        this.mesAvions = mesAvions;
        this.mesModeleAvion = mesModeleAvion;
        this.mesClients=mesClients;
        comboBoxClient.setRenderer(new ClientRenderer());
        comboBoxModeleAvion.setRenderer(new ModeleAvionRenderer());
        comboBoxHangar1.setRenderer(new HangarRenderer());
        comboBoxHangar2.setRenderer(new HangarRenderer());
        comboBoxChoixHangar.setRenderer(new HangarRenderer());
        ComboBoxFiller.comboBoxFiller(comboBoxClient, mesClients);
        ComboBoxFiller.comboBoxFiller(comboBoxModeleAvion, mesModeleAvion);
        ComboBoxFiller.comboBoxFiller(comboBoxHangar1, mesHangars);
        ComboBoxFiller.comboBoxFiller(comboBoxHangar2, mesHangars);
        ComboBoxFiller.comboBoxFiller(comboBoxChoixHangar, mesHangars);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblHangar1 = new javax.swing.JLabel();
        lblNbAvion1 = new javax.swing.JLabel();
        txtNbAvion1 = new javax.swing.JTextField();
        lblTotalLoc1 = new javax.swing.JLabel();
        txtTotalLocation1 = new javax.swing.JTextField();
        btnListeAvion1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSuperficieDispo1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblHangar2 = new javax.swing.JLabel();
        lblNbAvion2 = new javax.swing.JLabel();
        txtNbAvion2 = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();
        txtTotalLocation2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtSuperficieDispo2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblBail = new javax.swing.JLabel();
        lblImmatriculation = new javax.swing.JLabel();
        txtImmatriculation = new javax.swing.JTextField();
        comboBoxModeleAvion = new javax.swing.JComboBox<>();
        lblDureeContrat = new javax.swing.JLabel();
        txtDureeContrat = new javax.swing.JTextField();
        btnAnnulerBail = new javax.swing.JButton();
        btnConfirmer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboBoxClient = new javax.swing.JComboBox<>();
        comboBoxChoixHangar = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboBoxHangar1 = new javax.swing.JComboBox<>();
        comboBoxHangar2 = new javax.swing.JComboBox<>();
        btnNouveauClient = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHangar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHangar1.setText("Hangar 1 (Small Cabin)");
        lblHangar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNbAvion1.setText("nombre avion:");
        lblNbAvion1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNbAvion1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNbAvion1.setEnabled(false);

        lblTotalLoc1.setText("Total location:");
        lblTotalLoc1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtTotalLocation1.setEnabled(false);

        btnListeAvion1.setText("Liste d'avion");
        btnListeAvion1.setActionCommand("Liste d'avion ");
        btnListeAvion1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnListeAvion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListeAvion1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Superficie disponible:");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtSuperficieDispo1.setEnabled(false);

        jLabel6.setText("pi2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotalLoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalLocation1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(3, 3, 3)
                                .addComponent(txtSuperficieDispo1))
                            .addComponent(btnListeAvion1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNbAvion1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNbAvion1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblHangar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHangar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSuperficieDispo1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNbAvion1)
                    .addComponent(txtNbAvion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalLoc1)
                    .addComponent(txtTotalLocation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnListeAvion1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHangar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHangar2.setText("Hangar 2 (Large Cabin)");
        lblHangar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNbAvion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNbAvion2.setText("Nombre avion:");
        lblNbAvion2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNbAvion2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNbAvion2.setEnabled(false);

        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl.setText("Total location:");
        lbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtTotalLocation2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalLocation2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Liste d'avion");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Superficie disponible:");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtSuperficieDispo2.setEnabled(false);

        jLabel8.setText("pi2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblNbAvion2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNbAvion2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblHangar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalLocation2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSuperficieDispo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHangar2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSuperficieDispo2)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNbAvion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNbAvion2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl)
                    .addComponent(txtTotalLocation2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblBail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBail.setText("Nouveau Contrat");
        lblBail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblImmatriculation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImmatriculation.setText("Immatriculation");
        lblImmatriculation.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtImmatriculation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        comboBoxModeleAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblDureeContrat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDureeContrat.setText("Durée du contrat");
        lblDureeContrat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtDureeContrat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDureeContratKeyTyped(evt);
            }
        });

        btnAnnulerBail.setText("Annuler");
        btnAnnulerBail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAnnulerBail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerBailActionPerformed(evt);
            }
        });

        btnConfirmer.setText("Confirmer");
        btnConfirmer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnConfirmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmerActionPerformed(evt);
            }
        });

        jLabel3.setText("jour(s)");

        comboBoxClient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboBoxChoixHangar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxModeleAvion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAnnulerBail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConfirmer, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblDureeContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDureeContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblImmatriculation, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtImmatriculation, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBoxClient, 0, 248, Short.MAX_VALUE))
                        .addGap(1, 1, 1))
                    .addComponent(comboBoxChoixHangar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImmatriculation)
                    .addComponent(txtImmatriculation, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(comboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboBoxModeleAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboBoxChoixHangar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDureeContrat)
                    .addComponent(txtDureeContrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnnulerBail)
                    .addComponent(btnConfirmer))
                .addGap(33, 33, 33))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EXECUTIVE FLIGTH SERVICES");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comboBoxHangar1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxHangar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxHangar1ActionPerformed(evt);
            }
        });

        comboBoxHangar2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnNouveauClient.setText("Nouveau client");
        btnNouveauClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNouveauClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxHangar1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxHangar2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNouveauClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxHangar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxHangar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNouveauClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNouveauClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNouveauClientActionPerformed
        GuiNouveauClient newClient = new GuiNouveauClient(mesClients);
        newClient.setVisible(true);
    }//GEN-LAST:event_btnNouveauClientActionPerformed

    private void btnAnnulerBailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerBailActionPerformed
        txtDureeContrat.setText("");
        txtImmatriculation.setText("");
        comboBoxModeleAvion.setSelectedIndex(0);
        comboBoxClient.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnAnnulerBailActionPerformed

    private void btnConfirmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmerActionPerformed
        String champs = "Veuillez remplir les choix suivants: ";
        boolean plein = true;
        if("".equals(txtImmatriculation.getText()) || txtImmatriculation.getText() == null){
            plein = false;
            champs = champs + "\nImmatriculation";
        }
        
        if(comboBoxClient.getSelectedIndex() == 0){
            plein = false;
            champs = champs + "\nClient";
        }

        if(comboBoxModeleAvion.getSelectedIndex() == 0){
            plein = false;
            champs = champs + "\nModèle d'avion";
        }
        
        if(comboBoxChoixHangar.getSelectedIndex() == 0){
            plein = false;
            champs = champs + "\nHangar";
        }
        
        if("".equals(txtDureeContrat.getText()) || txtDureeContrat.getText() == null){           
            plein = false;
            champs = champs + "\nDurée de contrat";
        }
        
        if(plein == false){
            JOptionPane.showMessageDialog(null, champs);
            return;
        }
        //int nouveauID = mesBaux.size() + 1;
        //String leModele = Utilitaire.ligneSplitPremierMot((String)comboBoxModeleAvion.getSelectedItem());
        //int leClient = Integer.parseInt(Utilitaire.ligneSplitMotPositionX((String)comboBoxClient.getSelectedItem(),3));
        //System.out.println(leModele);
        //System.out.println(Utilitaire.trouverModeleAvion(leModele, mesModeleAvion));
        Hangar hangar = (Hangar) comboBoxChoixHangar.getSelectedItem();
        Avion avion = new Avion(mesAvions.size() + 1, (ModeleAvion) comboBoxModeleAvion.getSelectedItem(), (Client) comboBoxClient.getSelectedItem(), (Hangar) comboBoxChoixHangar.getSelectedItem());
        Client leClient = (Client) comboBoxClient.getSelectedItem();
        
//        String messageSauvegarde = "Veuillez valider les informations et cliquer sur OK pour sauvegarder." + "\nImmatriculation : " + txtImmatriculation.getText()
//                                    + "\nClient : " + leClient.getNom() + " " + leClient.getPrenom()
//                                    + "\nModele d'avion : " + avion.getModele().getModele()
//                                    + "\nHangar : " + hangar.getIdHangar()
//                                    + "\nDurée du bail : " + txtDureeContrat.getText() + " jour(s)";
//        int input = JOptionPane.showConfirmDialog(null, messageSauvegarde, "Nouveau bail",
//				JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
//        if(input == 2){
//            return;
//        }
 
        mesAvions.add(avion);
        hangar.ajouterAvion(avion);
        mesBaux.add(new Baux(mesBaux.size() + 1, Integer.parseInt(txtDureeContrat.getText()), (Client) comboBoxClient.getSelectedItem(), avion));
//        JOptionPane.showMessageDialog(null,"Bail enregistré");
        //System.out.println(hangar);
//        try {
//            ManipulationFichier.sauvegardeListeObjet("Baux.dat", mesBaux);
//            ManipulationFichier.sauvegardeListeObjet("Avion.dat", mesAvions);
//        } catch (IOException ex) {
//            System.out.println("Erreur de sauvegarde");
//        }
    }//GEN-LAST:event_btnConfirmerActionPerformed

    private void btnListeAvion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListeAvion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListeAvion1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboBoxHangar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxHangar1ActionPerformed
        if(comboBoxHangar1.getSelectedItem() != "" && comboBoxHangar1.getSelectedItem() != null && comboBoxHangar1.getSelectedIndex() != 0){
            System.out.println(comboBoxHangar1.getSelectedItem());
            txtTotalLocation1.setText("999");          
            txtSuperficieDispo1.setText(String.valueOf(mesHangars.get(comboBoxHangar1.getSelectedIndex()-1).calculerSuperficieRestante()));
            txtNbAvion1.setText(String.valueOf(mesHangars.get(comboBoxHangar1.getSelectedIndex()-1).getMesAvions().size()));
        }else if(comboBoxHangar1.getSelectedItem() == "" || comboBoxHangar1.getSelectedIndex() == 0){
            txtNbAvion1.setText("");
            txtTotalLocation1.setText("");
            txtSuperficieDispo1.setText("");
        }
    }//GEN-LAST:event_comboBoxHangar1ActionPerformed

    private void txtDureeContratKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDureeContratKeyTyped
        char vChar = evt.getKeyChar();
        if(!(Character.isDigit(vChar))
                ||(vChar ==  KeyEvent.VK_BACK_SPACE)
                ||(vChar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtDureeContratKeyTyped



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnulerBail;
    private javax.swing.JButton btnConfirmer;
    private javax.swing.JButton btnListeAvion1;
    private javax.swing.JButton btnNouveauClient;
    private javax.swing.JComboBox<String> comboBoxChoixHangar;
    private javax.swing.JComboBox<String> comboBoxClient;
    private javax.swing.JComboBox<String> comboBoxHangar1;
    private javax.swing.JComboBox<String> comboBoxHangar2;
    private javax.swing.JComboBox<String> comboBoxModeleAvion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblBail;
    private javax.swing.JLabel lblDureeContrat;
    private javax.swing.JLabel lblHangar1;
    private javax.swing.JLabel lblHangar2;
    private javax.swing.JLabel lblImmatriculation;
    private javax.swing.JLabel lblNbAvion1;
    private javax.swing.JLabel lblNbAvion2;
    private javax.swing.JLabel lblTotalLoc1;
    private javax.swing.JTextField txtDureeContrat;
    private javax.swing.JTextField txtImmatriculation;
    private javax.swing.JTextField txtNbAvion1;
    private javax.swing.JTextField txtNbAvion2;
    private javax.swing.JTextField txtSuperficieDispo1;
    private javax.swing.JTextField txtSuperficieDispo2;
    private javax.swing.JTextField txtTotalLocation1;
    private javax.swing.JTextField txtTotalLocation2;
    // End of variables declaration//GEN-END:variables
}
