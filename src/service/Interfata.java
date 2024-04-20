
package service;

import java.awt.Toolkit;
import persoane.*;
import stocpiese.*;
import serviciiservice.*;
import Masina.*;
import java.io.*;
import java.util.ArrayList;

public class Interfata extends javax.swing.JFrame {

    public Interfata() {
        initComponents();
        SetIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton26 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jTextField20 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jButton34 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButton27 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jTextField21 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jButton32 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Service auto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N

        jPanel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 480, 190));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nume:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Prenume:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vârstă:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tip Persoană:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, 30));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton1.setText("Caută");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 80, 30));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton2.setText("Caută");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 80, 30));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton3.setText("Caută");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 80, 30));

        jButton4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton4.setText("Caută");
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 80, 30));

        jTextField1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField1.setToolTipText("String");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 150, 30));

        jTextField2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField2.setToolTipText("String");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 150, 30));

        jTextField3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField3.setToolTipText("Integer");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 150, 30));

        jTextField4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField4.setToolTipText("String");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 150, 30));

        jButton5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton5.setText("Afișează conținutul fișierului Persoane.txt");
        jButton5.setToolTipText("Daca se introduc date, se va efectua o cautare dupa acestea");
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 300, 40));

        jButton6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton6.setText("Adaugă obiect");
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 110, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/Garaj.jpg"))); // NOI18N
        jLabel9.setText("jLabel1");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        jTabbedPane1.addTab("Persoane", jPanel1);

        jPanel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nume:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 30));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 480, 190));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prenume:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Vârstă:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tip Persoană:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, 30));

        jTextField5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField5.setToolTipText("String");
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 150, 30));

        jTextField6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField6.setToolTipText("String");
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 150, 30));

        jTextField7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField7.setToolTipText("Integer");
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 150, 30));

        jTextField8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField8.setToolTipText("String");
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 150, 30));

        jButton7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton7.setText("Caută");
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 80, 30));

        jButton8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton8.setText("Caută");
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 80, 30));

        jButton9.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton9.setText("Caută");
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 80, 30));

        jButton10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton10.setText("Caută");
        jButton10.setFocusable(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 80, 30));

        jButton11.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton11.setText("Adaugă obiect");
        jButton11.setFocusable(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 110, 40));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Marcă Mașină:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 30));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Model Mașină:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 30));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("An Fabricație:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 30));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Serie Șasiu:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 30));

        jTextField9.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField9.setToolTipText("String");
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 150, 30));

        jTextField10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField10.setToolTipText("String");
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, 30));

        jTextField11.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField11.setToolTipText("Integer");
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 150, 30));

        jTextField12.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField12.setToolTipText("String");
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 150, 30));

        jButton12.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton12.setText("Caută");
        jButton12.setFocusable(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 80, 30));

        jButton13.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton13.setText("Caută");
        jButton13.setFocusable(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 80, 30));

        jButton14.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton14.setText("Caută");
        jButton14.setFocusable(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 80, 30));

        jButton15.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton15.setText("Caută");
        jButton15.setFocusable(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 80, 30));

        jButton16.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton16.setText("Citire din fișier");
        jButton16.setToolTipText("Daca se introduc date, se va efectua o cautare dupa acestea");
        jButton16.setFocusable(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 110, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/Garaj.jpg"))); // NOI18N
        jLabel16.setText("jLabel1");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        jTabbedPane1.addTab("Client", jPanel2);

        jPanel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Prenume:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nume:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 30));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setFocusable(false);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 480, 190));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Vârstă:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 30));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tip Persoană:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, 30));

        jTextField13.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField13.setToolTipText("String");
        jPanel3.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 150, 30));

        jTextField14.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField14.setToolTipText("Integer");
        jPanel3.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 150, 30));

        jTextField15.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField15.setToolTipText("String");
        jPanel3.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 150, 30));

        jTextField16.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField16.setToolTipText("String");
        jPanel3.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 150, 30));

        jButton17.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton17.setText("Caută");
        jButton17.setFocusable(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 80, 30));

        jButton18.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton18.setText("Caută");
        jButton18.setFocusable(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 80, 30));

        jButton19.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton19.setText("Caută");
        jButton19.setFocusable(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 80, 30));

        jButton20.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton20.setText("Caută");
        jButton20.setFocusable(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 80, 30));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Calificare:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 30));

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Salariu:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 30));

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("An Angajare:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 30));

        jButton21.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton21.setText("Caută");
        jButton21.setFocusable(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 80, 30));

        jButton22.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton22.setText("Caută");
        jButton22.setFocusable(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 80, 30));

        jButton23.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton23.setText("Caută");
        jButton23.setFocusable(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 80, 30));

        jTextField17.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField17.setToolTipText("String");
        jPanel3.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, 30));

        jTextField18.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField18.setToolTipText("Integer");
        jPanel3.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 150, 30));

        jTextField19.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField19.setToolTipText("Integer");
        jPanel3.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 150, 30));

        jButton24.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton24.setText("Adaugă obiect");
        jButton24.setFocusable(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 110, 40));

        jButton25.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton25.setText("Citire din fișier");
        jButton25.setToolTipText("Daca se introduc date, se va efectua o cautare dupa acestea");
        jButton25.setFocusable(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 110, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/Garaj.jpg"))); // NOI18N
        jLabel22.setText("jLabel1");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        jTabbedPane1.addTab("Angajat", jPanel3);

        jPanel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setFocusable(false);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 480, 190));

        jButton26.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton26.setText("Afișează conținutul fișierului Masina.txt");
        jButton26.setToolTipText("Daca se introduc date, se va efectua o cautare dupa acestea");
        jButton26.setFocusable(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 300, 40));

        jButton31.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton31.setText("Adaugă obiect");
        jButton31.setFocusable(false);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 110, 40));

        jTextField20.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField20.setToolTipText("String");
        jPanel4.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 150, 30));

        jTextField25.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField25.setToolTipText("Integer");
        jPanel4.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 150, 30));

        jTextField28.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField28.setToolTipText("String");
        jPanel4.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 150, 30));

        jTextField29.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField29.setToolTipText("String");
        jPanel4.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, 30));

        jTextField35.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField35.setToolTipText("String");
        jPanel4.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 150, 30));

        jButton34.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton34.setText("Caută");
        jButton34.setFocusable(false);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 80, 30));

        jButton37.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton37.setText("Caută");
        jButton37.setFocusable(false);
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 80, 30));

        jButton40.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton40.setText("Caută");
        jButton40.setFocusable(false);
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 80, 30));

        jButton43.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton43.setText("Caută");
        jButton43.setFocusable(false);
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 80, 30));

        jButton44.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton44.setText("Caută");
        jButton44.setFocusable(false);
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 80, 30));

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("An Fabricație:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 30));

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Serie Șasiu:");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, 30));

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Model Mașină:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 30));

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Marcă Mașină:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 30));

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Problema:");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, 30));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/Garaj.jpg"))); // NOI18N
        jLabel39.setText("jLabel1");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        jTabbedPane1.addTab("Mașină", jPanel4);

        jPanel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextArea6.setRows(5);
        jTextArea6.setFocusable(false);
        jScrollPane6.setViewportView(jTextArea6);

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 480, 190));

        jButton28.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton28.setText("Afișează conținutul fișierului StocPiese.txt");
        jButton28.setToolTipText("Daca se introduc date, se va efectua o cautare dupa acestea");
        jButton28.setFocusable(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 300, 40));

        jButton29.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton29.setText("Adaugă obiect");
        jButton29.setFocusable(false);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 110, 40));

        jTextField22.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField22.setToolTipText("Integer");
        jPanel6.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 150, 30));

        jTextField23.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField23.setToolTipText("Integer");
        jPanel6.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 150, 30));

        jTextField26.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField26.setToolTipText("Integer");
        jPanel6.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 150, 30));

        jTextField34.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField34.setToolTipText("String");
        jPanel6.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 150, 30));

        jButton33.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton33.setText("Caută");
        jButton33.setFocusable(false);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 80, 30));

        jButton36.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton36.setText("Caută");
        jButton36.setFocusable(false);
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 80, 30));

        jButton39.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton39.setText("Caută");
        jButton39.setFocusable(false);
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 80, 30));

        jButton42.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton42.setText("Caută");
        jButton42.setFocusable(false);
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 80, 30));

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Preț:");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 30));

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Cantitate Stoc:");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, 30));

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Nume Piesă:");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 30));

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Cod Piesă:");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, 30));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/Garaj.jpg"))); // NOI18N
        jLabel40.setText("jLabel1");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        jTabbedPane1.addTab("StocPiese", jPanel6);

        jPanel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setFocusable(false);
        jScrollPane5.setViewportView(jTextArea5);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 480, 190));

        jButton27.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton27.setText("Citire fișier");
        jButton27.setToolTipText("Daca se introduc date, se va efectua o cautare dupa acestea");
        jButton27.setFocusable(false);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 110, 40));

        jButton30.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton30.setText("Adaugă obiect");
        jButton30.setFocusable(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 110, 40));

        jTextField21.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField21.setToolTipText("String");
        jPanel5.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 150, 30));

        jTextField24.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField24.setToolTipText("Integer");
        jPanel5.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 150, 30));

        jTextField27.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField27.setToolTipText("String");
        jPanel5.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 150, 30));

        jTextField31.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField31.setToolTipText("Integer");
        jPanel5.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, 30));

        jTextField32.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField32.setToolTipText("String");
        jPanel5.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 150, 30));

        jTextField33.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTextField33.setToolTipText("Integer");
        jPanel5.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 150, 30));

        jButton32.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton32.setText("Caută");
        jButton32.setFocusable(false);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 80, 30));

        jButton35.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton35.setText("Caută");
        jButton35.setFocusable(false);
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 80, 30));

        jButton38.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton38.setText("Caută");
        jButton38.setFocusable(false);
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 80, 30));

        jButton41.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton41.setText("Caută");
        jButton41.setFocusable(false);
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 80, 30));

        jButton46.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton46.setText("Caută");
        jButton46.setFocusable(false);
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 80, 30));

        jButton47.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton47.setText("Caută");
        jButton47.setFocusable(false);
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 80, 30));

        jLabel33.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Cod Piesă:");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 30));

        jLabel34.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Piesă:");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, 30));

        jLabel35.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Durată:");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 30));

        jLabel36.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Preț:");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 30));

        jLabel37.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Denumire:");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 30));

        jLabel38.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Calificare:");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, 30));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/Garaj.jpg"))); // NOI18N
        jLabel41.setText("jLabel1");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        jTabbedPane1.addTab("ServiciiService", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 535));
        jTabbedPane1.getAccessibleContext().setAccessibleName("    Persoane                            ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         jTextArea1.setText("");           //butonul pentru a afisa continutul fisierului Persoane
                Interfata ob1 = new Interfata();                
                ArrayList<Object> objects1 = ob1.Citire("Persoane.txt");
          for (Object obj : objects1) {
              Persoane p = (Persoane) obj;
              boolean bool = true;
                    if (jTextField1.getText().length() != 0 && !p.getNume().equals(jTextField1.getText())) {
            bool=false;
        }
                    if (jTextField2.getText().length() != 0 && !p.getPrenume().equals(jTextField2.getText())) {
            bool=false;
        }
                     if (jTextField3.getText().length() != 0 && p.getvarsta()!=Integer.parseInt(jTextField3.getText())) {
            bool=false;
        }
            if (jTextField4.getText().length() != 0 && !p.gettip().equals(jTextField4.getText())) {
            bool=false;
        }
                  if (bool==true) {
                    jTextArea1.append(p.toString()+"\n");  
                  }    
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
         jTextArea2.setText("");           //butonul pentru a afisa continutul fisierului Client
                Interfata ob2 = new Interfata();
                ArrayList<Object> objects2 = ob2.Citire("Client.txt");
          for (Object obj : objects2) {
              Client c = (Client) obj;
              boolean bool = true;
              if (jTextField9.getText().length() != 0 && !c.getMarcaMasina().equals(jTextField9.getText())) {
                  bool=false;
              }
              if (jTextField10.getText().length() != 0 && !c.getModelMasina().equals(jTextField10.getText())) {
                  bool=false;
              }
              if (jTextField11.getText().length() != 0 && c.getAnMasina()!= Integer.parseInt(jTextField11.getText())) {
               bool=false;   
              }
              if (jTextField12.getText().length() != 0 && !c.getSerieSasiu().equals(jTextField12.getText())) {
                  bool=false;
              }
              if (jTextField5.getText().length() != 0 && !c.getNume().equals(jTextField5.getText())) {
                  bool=false;
              }
              if (jTextField6.getText().length() != 0 && !c.getPrenume().equals(jTextField6.getText())) {
              bool=false;
              }
              if (jTextField7.getText().length() != 0 && c.getvarsta() != Integer.parseInt(jTextField7.getText())) {
                  bool=false;
              }
              if (jTextField8.getText().length() != 0 && !c.gettip().equals(jTextField8.getText())) {
                  bool=false;
              }
              if (bool==true) {
                  jTextArea2.append(obj.toString()+"\n");
              }
            }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        jTextArea3.setText("");            //butonul pentru a afisa continutul fisierului Angajat
                Interfata ob3 = new Interfata();
                ArrayList<Object> objects3 = ob3.Citire("Angajat.txt");
          for (Object obj : objects3) {
              Angajat a = (Angajat) obj;
              boolean bool = true;
              if (jTextField17.getText().length() != 0 && !a.getcalificare().equals(jTextField17.getText())) {
                  bool=false;
              }
              if (jTextField18.getText().length() != 0 && a.getsalariu() != Integer.parseInt(jTextField18.getText())) {
                  bool=false;
              }
              if (jTextField19.getText().length() != 0 && a.getAnAngajare() != Integer.parseInt(jTextField19.getText())) {
                  bool=false;
              }
              if (jTextField16.getText().length() != 0 && !a.getNume().equals(jTextField16.getText())) {
                  bool=false;
              }
              if (jTextField15.getText().length() != 0 && !a.getPrenume().equals(jTextField15.getText())) {
                  bool=false;
              }
              if (jTextField14.getText().length() != 0 && a.getvarsta() != Integer.parseInt(jTextField14.getText())) {
                  bool=false;
              }
              if (jTextField13.getText().length() != 0 && !a.gettip().equals(jTextField13.getText())) {
              bool=false;
          }
              if (bool==true) {
                  jTextArea3.append(obj.toString()+"\n");
              }
            }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
         jTextArea4.setText("");           //butonul pentru a afisa continutul fisierului Masina
                Interfata ob4 = new Interfata();
                ArrayList<Object> objects4 = ob4.Citire("Masina.txt");
          for (Object obj : objects4) {
              Masina m = (Masina) obj;
              boolean bool = true;
              if (jTextField29.getText().length() != 0 && !m.getMarca().equals(jTextField29.getText())) {
                  bool=false;
              }
              if (jTextField35.getText().length() != 0 && !m.getModel().equals(jTextField35.getText())) {
              bool=false;
          }
              if (jTextField28.getText().length() != 0 && !m.getSerie().equals(jTextField28.getText())) {
                  bool=false;
              }
              if (jTextField25.getText().length() != 0 && m.getAn() != Integer.parseInt(jTextField25.getText())) {
                  bool=false;
              }
              if (jTextField20.getText().length() != 0 && !m.getProblema().equals(jTextField20.getText())) {
              bool=false;
          }
              if (bool==true) {
                jTextArea4.append(obj.toString()+"\n");
              }
            }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        jTextArea6.setText("");            //butonul pentru a afisa continutul fisierului StocPiese
                Interfata ob5 = new Interfata();
                ArrayList<Object> objects5 = ob5.Citire("StocPiese.txt");
          for (Object obj : objects5) {
              StocPiese sp = (StocPiese) obj;
              boolean bool = true;
              if (jTextField34.getText().length() != 0 && !sp.getNume().equals(jTextField34.getText())) {
                  bool=false;
              }
              if (jTextField26.getText().length() != 0 && sp.getCantitate() != Integer.parseInt(jTextField26.getText())) {
                  bool=false;
              }
              if (jTextField23.getText().length() != 0 && sp.getPret() != Integer.parseInt(jTextField23.getText())) {
                  bool=false;
              }
              if (jTextField22.getText().length() != 0 && sp.getCod() != Integer.parseInt(jTextField22.getText())) {
                  bool=false;
              }
              if (bool==true) {
                jTextArea6.append(obj.toString()+"\n");
              }
            }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        jTextArea5.setText("");            //butonul pentru a afisa continutul fisierului Servicii
                Interfata ob6 = new Interfata();
                ArrayList<Object> objects6 = ob6.Citire("Servicii.txt");
          for (Object obj : objects6) {
              ServiciiService ss = (ServiciiService) obj;
              boolean bool = true;
              if (jTextField32.getText().length() != 0 && !ss.getDenumire().equals(jTextField32.getText())) {
                  bool=false;
              }
              if (jTextField31.getText().length() != 0 && ss.getpret() != Integer.parseInt(jTextField31.getText())) {
                  bool=false;
              }
              if (jTextField33.getText().length() != 0 && ss.getdurata() != Integer.parseInt(jTextField33.getText())) {
                  bool=false;
              }
              if (jTextField27.getText().length() != 0 && !ss.getpiesa().equals(jTextField33.getText())) {
              bool=false;
          }
              if (jTextField24.getText().length() != 0 && ss.getCod() != Integer.parseInt(jTextField24.getText())) {
                  bool=false;
              }
              if (jTextField21.getText().length() != 0 && !ss.getCalificare().equals(jTextField21.getText())) {
                  bool=false;
              }
              if (bool==true) {
                jTextArea5.append(obj.toString()+"\n");
              }
            }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jTextArea1.getText().isEmpty()!=true) {
            jTextArea1.setText("");
        }
        Persoane p = new Persoane(); // obiectul de tip Persoane a fost creat. Butonul 6 adauga obiectul de tip Persoane in fisier. Se folosesc mai multe try
        try {                        //pentru citi toate informatiile si mai apaoi sunt scrise in fisier, daca sunt corecte. Restul de butoane de scriere sunt gandite exact la fel
            if (jTextField1.getText().isEmpty()) {
                jTextArea1.append("Numele nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                p.setNume(jTextField1.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        
        try {
            if (jTextField2.getText().isEmpty()) {
                jTextArea1.append("Prenumele nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                p.setPrenume(jTextField2.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        
        try {
            if (jTextField3.getText().isEmpty()) {
                jTextArea1.append("Varsta nu a fost introdusa sau a fost introdusa gresit!\n");
            }
            else {
                p.setvarsta(Integer.parseInt(jTextField3.getText()));
                throw new ExceptieInt("Nu a fost introdus un numar sau numarul nu reprezinta o varsta!\n");
            }                
        }
            catch (ExceptieInt e) {
                if(Integer.parseInt(jTextField3.getText())<1 || Integer.parseInt(jTextField3.getText())>100) {
                    jTextArea1.append(e.getMessage());
                    jTextField3.setText("");
                }
        }
         
        try {
            if (jTextField4.getText().isEmpty()) {
                jTextArea1.append("Tipul persoanei nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                p.settip(jTextField4.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
          if(jTextField1.getText().isEmpty()==false && jTextField2.getText().isEmpty()==false && jTextField3.getText().isEmpty()==false && jTextField4.getText().isEmpty()==false) {
              ScrierePersoane(p);
              jTextArea1.append(p.toString());
          }       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         if (jTextArea2.getText().isEmpty()!=true) {
            jTextArea2.setText("");
        }
         Client c = new Client();
        try {
            if (jTextField9.getText().isEmpty()) {
                jTextArea2.append("Marca masinii nu a fost introdusa sau a fost introdusa gresit!\n");
            }
            else {
                c.setMarcaMasina(jTextField9.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
         
        try {
            if (jTextField10.getText().isEmpty()) {
                jTextArea2.append("Modelul masinii nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                c.setModelMasina(jTextField10.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
         
        try {
            if (jTextField11.getText().isEmpty()) {
                jTextArea2.append("Anul de fabricatie nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                c.setAnMasina(Integer.parseInt(jTextField11.getText()));
                throw new ExceptieInt("Nu a fost introdus un numar sau numarul nu reprezinta un an corespunzator!\n");
            }                
        }
            catch (ExceptieInt e) {
                if(Integer.parseInt(jTextField11.getText())<1800 || Integer.parseInt(jTextField11.getText())>2023) {
                    jTextArea2.append(e.getMessage());
                    jTextField11.setText("");
                }
        }
         
        try {
            if (jTextField12.getText().isEmpty()) {
                jTextArea2.append("Seria nu a fost introdusa sau a fost introdusa gresit!\n");
            }
            else {
                c.setSerieSasiu(jTextField12.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
         
        try {
            if (jTextField5.getText().isEmpty()) {
                jTextArea2.append("Numele nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                c.setNume(jTextField5.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        
        try {
            if (jTextField6.getText().isEmpty()) {
                jTextArea2.append("Prenumele nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                c.setPrenume(jTextField6.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        
        try {
            if (jTextField7.getText().isEmpty()) {
                jTextArea2.append("Varsta nu a fost introdusa sau a fost introdusa gresit!\n");
            }
            else {
                c.setvarsta(Integer.parseInt(jTextField7.getText()));
                throw new ExceptieInt("Nu a fost introdus un numar sau numarul nu reprezinta o varsta!\n");
            }                
        }
            catch (ExceptieInt e) {
                if(Integer.parseInt(jTextField7.getText())<1 || Integer.parseInt(jTextField7.getText())>100) {
                    jTextArea2.append(e.getMessage());
                    jTextField7.setText("");
                }
        }
         
        try {
            if (jTextField8.getText().isEmpty()) {
                jTextArea2.append("Tipul persoanei nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                c.settip(jTextField8.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        if(jTextField5.getText().isEmpty()==false && jTextField6.getText().isEmpty()==false && jTextField7.getText().isEmpty()==false && jTextField8.getText().isEmpty()==false && jTextField9.getText().isEmpty()==false && jTextField10.getText().isEmpty()==false && jTextField11.getText().isEmpty()==false && jTextField12.getText().isEmpty()==false) {
              ScriereClient(c);
              jTextArea2.append(c.toString());
          }       
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        if (jTextArea3.getText().isEmpty()!=true) {
            jTextArea3.setText("");
        }
            Angajat a = new Angajat();
        try {
            if (jTextField17.getText().isEmpty()) {
                jTextArea3.append("Calificarea nu a fost introdusa sau a fost introdusa gresit!\n");
            }
            else {
                a.setcalificare(jTextField17.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        
        try {
            if (jTextField18.getText().isEmpty()) {
                jTextArea3.append("Salariul nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                a.setsalariu(Integer.parseInt(jTextField18.getText()));
                throw new ExceptieInt("Nu a fost introdus un numar sau numarul nu reprezinta un salariu adecvat!\n");
            }                
        }
            catch (ExceptieInt e) {
                if(Integer.parseInt(jTextField18.getText())<1 || Integer.parseInt(jTextField18.getText())>10000) {
                    jTextArea3.append(e.getMessage());
                    jTextField18.setText("");
                }
        }
        
        try {
            if (jTextField19.getText().isEmpty()) {
                jTextArea3.append("Anul de angajare nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                a.setAnAngajare(Integer.parseInt(jTextField19.getText()));
                throw new ExceptieInt("Nu a fost introdus un an sau anul nu este corect!\n");
            }                
        }
            catch (ExceptieInt e) {
                if(Integer.parseInt(jTextField19.getText())<1980 || Integer.parseInt(jTextField19.getText())>2023) {
                    jTextArea3.append(e.getMessage());
                    jTextField19.setText("");
                }
        }
            
        try {
            if (jTextField16.getText().isEmpty()) {
                jTextArea3.append("Numele nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                a.setNume(jTextField16.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        
        try {
            if (jTextField15.getText().isEmpty()) {
                jTextArea3.append("Prenumele nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                a.setPrenume(jTextField15.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        
        try {
            if (jTextField14.getText().isEmpty()) {
                jTextArea3.append("Varsta nu a fost introdusa sau a fost introdusa gresit!\n");
            }
            else {
                a.setvarsta(Integer.parseInt(jTextField14.getText()));
                throw new ExceptieInt("Nu a fost introdus un numar sau numarul nu reprezinta o varsta!\n");
            }                
        }
            catch (ExceptieInt e) {
                if(Integer.parseInt(jTextField14.getText())<1 || Integer.parseInt(jTextField14.getText())>100) {
                    jTextArea3.append(e.getMessage());
                    jTextField14.setText("");
                }
        }
         
        try {
            if (jTextField13.getText().isEmpty()) {
                jTextArea3.append("Tipul persoanei nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                a.settip(jTextField13.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
          if(jTextField16.getText().isEmpty()==false && jTextField15.getText().isEmpty()==false && jTextField14.getText().isEmpty()==false && jTextField13.getText().isEmpty()==false && jTextField17.getText().isEmpty()==false && jTextField18.getText().isEmpty()==false && jTextField19.getText().isEmpty()==false) {
              ScriereAngajat(a);
              jTextArea3.append(a.toString());
          }       
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        if (jTextArea4.getText().isEmpty()!=true) {
            jTextArea4.setText("");
        }
        Masina m = new Masina();
        try {
            if (jTextField29.getText().isEmpty()) {
                jTextArea4.append("Marca masinii nu a fost introdusa sau a fost introdusa gresit!\n");
            }
            else {
                m.setMarca(jTextField29.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        
        try {
            if (jTextField35.getText().isEmpty()) {
                jTextArea4.append("Modelul masinii nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                m.setModel(jTextField35.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        
        try {
            if (jTextField28.getText().isEmpty()) {
                jTextArea4.append("Seria de sasiu nu a fost introdusa sau a fost introdusa gresit!\n");
            }
            else {
                m.setSerie(jTextField28.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        
        try {
            if (jTextField25.getText().isEmpty()) {
                jTextArea4.append("Anul de fabricatie nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                m.setAn(Integer.parseInt(jTextField25.getText()));
                throw new ExceptieInt("Nu a fost introdus un numar sau numarul nu reprezinta un an valid!\n");
            }                
        }
            catch (ExceptieInt e) {
                if(Integer.parseInt(jTextField25.getText())<1800 || Integer.parseInt(jTextField25.getText())>2023) {
                    jTextArea4.append(e.getMessage());
                    jTextField25.setText("");
                }
        }
        
        try {
            if (jTextField20.getText().isEmpty()) {
                jTextArea4.append("Problema nu a fost introdusa sau a fost introdusa gresit!\n");
            }
            else {
                m.setProblema(jTextField20.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        if(jTextField29.getText().isEmpty()==false && jTextField35.getText().isEmpty()==false && jTextField28.getText().isEmpty()==false && jTextField25.getText().isEmpty()==false && jTextField20.getText().isEmpty()==false) {
              ScriereMasina(m);
              jTextArea4.append(m.toString());
          }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        if (jTextArea6.getText().isEmpty()!=true) {
            jTextArea6.setText("");
        }
        StocPiese sp = new StocPiese();
        try {
            if (jTextField34.getText().isEmpty()) {
                jTextArea6.append("Numele piesei nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                sp.setNume(jTextField34.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        
        try {
            if (jTextField26.getText().isEmpty()) {
                jTextArea6.append("Cantitatea nu a fost introdusa sau a fost introdusa gresit!\n");
            }
            else {
                sp.setCantitate(Integer.parseInt(jTextField26.getText()));
                throw new ExceptieInt("Nu a fost introdus un numar sau numarul nu reprezinta o cantitate valida!\n");
            }
        }
            catch (ExceptieInt e) {
                if(Integer.parseInt(jTextField26.getText())<1 || Integer.parseInt(jTextField26.getText())>1000) {
                    jTextArea6.append(e.getMessage());
                    jTextField26.setText("");
                }
        }
        
        try {
            if (jTextField23.getText().isEmpty()) {
                jTextArea6.append("Pretul nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                sp.setPret(Integer.parseInt(jTextField23.getText()));
                throw new ExceptieInt("Nu a fost introdus un numar sau numarul nu reprezinta un pret valid!\n");
            }                
        }
            catch (ExceptieInt e) {
                if(Integer.parseInt(jTextField23.getText())<1 || Integer.parseInt(jTextField23.getText())>10000) {
                    jTextArea6.append(e.getMessage());
                    jTextField23.setText("");
                }
        }
         
        try {
            if (jTextField22.getText().isEmpty()) {
                jTextArea6.append("Codul piesei nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                sp.setCod(Integer.parseInt(jTextField22.getText()));
                throw new ExceptieInt("Nu a fost introdus un numar sau numarul nu reprezinta un cod valid!\n");
            }                
        }
            catch (ExceptieInt e) {
                if(Integer.parseInt(jTextField22.getText())<1000 || Integer.parseInt(jTextField22.getText())>900000) {
                    jTextArea6.append(e.getMessage());
                    jTextField22.setText("");
                }
        }
          if(jTextField34.getText().isEmpty()==false && jTextField26.getText().isEmpty()==false && jTextField23.getText().isEmpty()==false && jTextField22.getText().isEmpty()==false) {
              ScriereStocPiese(sp);
              jTextArea6.append(sp.toString());
          }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        if (jTextArea5.getText().isEmpty()!=true) {
            jTextArea5.setText("");
        }
        ServiciiService ss = new ServiciiService();
        try {
            if (jTextField32.getText().isEmpty()) {
                jTextArea5.append("Denumirea serviciului nu a fost introdusa sau a fost introdusa gresit!\n");
            }
            else {
                ss.setDenumire(jTextField32.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        
        try {
            if (jTextField31.getText().isEmpty()) {
                jTextArea5.append("Pretul nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                ss.setpret(Integer.parseInt(jTextField31.getText()));
                throw new ExceptieInt("Nu a fost introdus un numar sau numarul nu reprezinta un pret valid!\n");
            }
        }
            catch (ExceptieInt e) {
                if(Integer.parseInt(jTextField31.getText())<1 || Integer.parseInt(jTextField31.getText())>10000) {
                    jTextArea5.append(e.getMessage());
                    jTextField31.setText("");
                }
        }
        
        try {
            if (jTextField33.getText().isEmpty()) {
                jTextArea5.append("Durata nu a fost introdusa sau a fost introdusa gresit!\n");
            }
            else {
                ss.setdurata(Integer.parseInt(jTextField33.getText()));
                throw new ExceptieInt("Nu a fost introdus un numar sau numarul nu reprezinta o durata valida!\n");
            }                
        }
            catch (ExceptieInt e) {
                if(Integer.parseInt(jTextField33.getText())<1 || Integer.parseInt(jTextField33.getText())>1000) {
                    jTextArea5.append(e.getMessage());
                    jTextField33.setText("");
                }
        }
        
        try {
            if (jTextField27.getText().isEmpty()) {
                jTextArea5.append("Numele piesei nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                ss.setpiesa(jTextField27.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        
        try {
            if (jTextField24.getText().isEmpty()) {
                jTextArea5.append("Codul piesei nu a fost introdus sau a fost introdus gresit!\n");
            }
            else {
                ss.setCod(Integer.parseInt(jTextField24.getText()));
                throw new ExceptieInt("Nu a fost introdus un numar sau numarul nu reprezinta un cod valid!\n");
            }
        }
            catch (ExceptieInt e) {
                if(Integer.parseInt(jTextField24.getText())<1 || Integer.parseInt(jTextField24.getText())>900000) {
                    jTextArea5.append(e.getMessage());
                    jTextField24.setText("");
                }
        }
        
        try {
            if (jTextField21.getText().isEmpty()) {
                jTextArea5.append("Calificarea mecanicului nu a fost introdusa sau a fost introdusa gresit!\n");
            }
            else {
                ss.setCalificare(jTextField21.getText());
            }                
        }
            catch (Exception e) {
                e.printStackTrace();
        }
        if(jTextField32.getText().isEmpty()==false && jTextField31.getText().isEmpty()==false && jTextField33.getText().isEmpty()==false && jTextField24.getText().isEmpty()==false && jTextField21.getText().isEmpty()==false) {
              ScriereServiciiService(ss);
              jTextArea5.append(ss.toString());
          }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        jTextArea4.setText("");           //butonul pentru a afisa continutul fisierului Masina in functie de Marca
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Masina.txt");
          for (Object obj : objects) {
              if (obj instanceof Masina) {
                  Masina m = (Masina) obj;
                  if (m.getMarca().equalsIgnoreCase(jTextField29.getText())) {
                    jTextArea4.append(m.toString()+"\n");  
                  }                 
              }                
            }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
         jTextArea4.setText("");           //butonul pentru a afisa continutul fisierului Masina in functie de Model
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Masina.txt");
          for (Object obj : objects) {
            if (obj instanceof Masina) {
                  Masina m = (Masina) obj;
                  if (m.getModel().equalsIgnoreCase(jTextField35.getText())) {
                    jTextArea4.append(m.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        jTextArea4.setText("");           //butonul pentru a afisa continutul fisierului Masina in functie de seria de sasiu
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Masina.txt");
          for (Object obj : objects) {
            if (obj instanceof Masina) {
                  Masina m = (Masina) obj;
                  if (m.getSerie().equalsIgnoreCase(jTextField28.getText())) {
                    jTextArea4.append(m.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        jTextArea4.setText("");           //butonul pentru a afisa continutul fisierului Masina in functie de anul de fabricatie
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Masina.txt");
          for (Object obj : objects) {
            if (obj instanceof Masina) {
                  Masina m = (Masina) obj;
                  if (m.getAn()==Integer.parseInt(jTextField25.getText())) {
                    jTextArea4.append(m.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        jTextArea4.setText("");           //butonul pentru a afisa continutul fisierului Masina in functie de problema
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Masina.txt");
          for (Object obj : objects) {
            if (obj instanceof Masina) {
                  Masina m = (Masina) obj;
                  if (m.getProblema().equalsIgnoreCase(jTextField20.getText())) {
                    jTextArea4.append(m.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextArea1.setText("");           //butonul pentru a afisa continutul fisierului Persoane in functie de nume
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Persoane.txt");
          for (Object obj : objects) {
            if (obj instanceof Persoane) {
                  Persoane p = (Persoane) obj;
                  if (p.getNume().equalsIgnoreCase(jTextField1.getText())) {
                    jTextArea1.append(p.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextArea1.setText("");           //butonul pentru a afisa continutul fisierului Persoane in functie de prenume
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Persoane.txt");
          for (Object obj : objects) {
            if (obj instanceof Persoane) {
                  Persoane p = (Persoane) obj;
                  if (p.getPrenume().equalsIgnoreCase(jTextField2.getText())) {
                    jTextArea1.append(p.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextArea1.setText("");           //butonul pentru a afisa continutul fisierului Persoane in functie de varsta
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Persoane.txt");
          for (Object obj : objects) {
            if (obj instanceof Persoane) {
                  Persoane p = (Persoane) obj;
                  if (p.getvarsta()==Integer.parseInt(jTextField3.getText())) {
                    jTextArea1.append(p.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextArea1.setText("");           //butonul pentru a afisa continutul fisierului Persoane in functie de tip
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Persoane.txt");
          for (Object obj : objects) {
            if (obj instanceof Persoane) {
                  Persoane p = (Persoane) obj;
                  if (p.gettip().equalsIgnoreCase(jTextField4.getText())) {
                    jTextArea1.append(p.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextArea2.setText("");           //butonul pentru a afisa continutul fisierului Client in functie de marca masinii
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Client.txt");
          for (Object obj : objects) {
            if (obj instanceof Client) {
                  Client c = (Client) obj;
                  if (c.getMarcaMasina().equalsIgnoreCase(jTextField9.getText())) {
                    jTextArea2.append(c.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jTextArea2.setText("");           //butonul pentru a afisa continutul fisierului Client in functie de modelul masinii
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Client.txt");
          for (Object obj : objects) {
            if (obj instanceof Client) {
                  Client c = (Client) obj;
                  if (c.getModelMasina().equalsIgnoreCase(jTextField10.getText())) {
                    jTextArea2.append(c.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jTextArea2.setText("");           //butonul pentru a afisa continutul fisierului Client in functie de anul de fabricatie al masinii
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Client.txt");
          for (Object obj : objects) {
            if (obj instanceof Client) {
                  Client c = (Client) obj;
                  if (c.getAnMasina()==Integer.parseInt(jTextField11.getText())) {
                    jTextArea2.append(c.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jTextArea2.setText("");           //butonul pentru a afisa continutul fisierului Client in functie de seria de sasiu a masinii
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Client.txt");
          for (Object obj : objects) {
            if (obj instanceof Client) {
                  Client c = (Client) obj;
                  if (c.getSerieSasiu().equalsIgnoreCase(jTextField12.getText())) {
                    jTextArea2.append(c.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jTextArea2.setText("");           //butonul pentru a afisa continutul fisierului Client in functie de numele clientului
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Client.txt");
          for (Object obj : objects) {
            if (obj instanceof Client) {
                  Client c = (Client) obj;
                  if (c.getNume().equalsIgnoreCase(jTextField5.getText())) {
                    jTextArea2.append(c.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTextArea2.setText("");           //butonul pentru a afisa continutul fisierului Client in functie de prenumele clientului
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Client.txt");
          for (Object obj : objects) {
            if (obj instanceof Client) {
                  Client c = (Client) obj;
                  if (c.getPrenume().equalsIgnoreCase(jTextField6.getText())) {
                    jTextArea2.append(c.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jTextArea2.setText("");           //butonul pentru a afisa continutul fisierului Client in functie de anul de varsta clientului
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Client.txt");
          for (Object obj : objects) {
            if (obj instanceof Client) {
                  Client c = (Client) obj;
                  if (c.getvarsta()==Integer.parseInt(jTextField7.getText())) {
                    jTextArea2.append(c.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jTextArea2.setText("");           //butonul pentru a afisa continutul fisierului Client in functie de tipul clientului(client)
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Client.txt");
          for (Object obj : objects) {
            if (obj instanceof Client) {
                  Client c = (Client) obj;
                  if (c.gettip().equalsIgnoreCase(jTextField8.getText())) {
                    jTextArea2.append(c.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        jTextArea3.setText("");           //butonul pentru a afisa continutul fisierului Angajat in functie de calificarea angajatului
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Angajat.txt");
          for (Object obj : objects) {
            if (obj instanceof Angajat) {
                  Angajat a = (Angajat) obj;
                  if (a.getcalificare().equalsIgnoreCase(jTextField17.getText())) {
                    jTextArea3.append(a.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jTextArea3.setText("");           //butonul pentru a afisa continutul fisierului Angajat in functie de salariul angajatului
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Angajat.txt");
          for (Object obj : objects) {
            if (obj instanceof Angajat) {
                  Angajat a = (Angajat) obj;
                  if (a.getsalariu()==Integer.parseInt(jTextField18.getText())) {
                    jTextArea3.append(a.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jTextArea3.setText("");           //butonul pentru a afisa continutul fisierului Angajat in functie de anul de angajare al angajatului
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Angajat.txt");
          for (Object obj : objects) {
            if (obj instanceof Angajat) {
                  Angajat a = (Angajat) obj;
                  if (a.getAnAngajare()==Integer.parseInt(jTextField19.getText())) {
                    jTextArea3.append(a.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jTextArea3.setText("");           //butonul pentru a afisa continutul fisierului Angajat in functie de numele angajatului
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Angajat.txt");
          for (Object obj : objects) {
            if (obj instanceof Angajat) {
                  Angajat a = (Angajat) obj;
                  if (a.getNume().equalsIgnoreCase(jTextField16.getText())) {
                    jTextArea3.append(a.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jTextArea3.setText("");           //butonul pentru a afisa continutul fisierului Angajat in functie de prenumele angajatului
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Angajat.txt");
          for (Object obj : objects) {
            if (obj instanceof Angajat) {
                  Angajat a = (Angajat) obj;
                  if (a.getPrenume().equals(jTextField15.getText())) {
                    jTextArea3.append(a.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jTextArea3.setText("");           //butonul pentru a afisa continutul fisierului Angajat in functie de varsta angajatului
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Angajat.txt");
          for (Object obj : objects) {
            if (obj instanceof Angajat) {
                  Angajat a = (Angajat) obj;
                  if (a.getvarsta()==Integer.parseInt(jTextField14.getText())) {
                    jTextArea3.append(a.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jTextArea3.setText("");           //butonul pentru a afisa continutul fisierului Angajat in functie de tipul angajatului(angajat)
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Angajat.txt");
          for (Object obj : objects) {
            if (obj instanceof Angajat) {
                  Angajat a = (Angajat) obj;
                  if (a.gettip().equals(jTextField13.getText())) {
                    jTextArea3.append(a.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton17ActionPerformed
//stocpieseee
    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        jTextArea6.setText("");           //butonul pentru a afisa continutul fisierului StocPiese in functie de numele piesei
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("StocPiese.txt");
          for (Object obj : objects) {
            if (obj instanceof StocPiese) {
                  StocPiese sp = (StocPiese) obj;
                  if (sp.getNume().equals(jTextField34.getText())) {
                    jTextArea6.append(sp.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        jTextArea6.setText("");           //butonul pentru a afisa continutul fisierului StocPiese in functie de cantitatea piesei
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("StocPiese.txt");
          for (Object obj : objects) {
            if (obj instanceof StocPiese) {
                  StocPiese sp = (StocPiese) obj;
                  if (sp.getCantitate()==Integer.parseInt(jTextField26.getText())) {
                    jTextArea6.append(sp.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        jTextArea6.setText("");           //butonul pentru a afisa continutul fisierului StocPiese in functie de pretul piesei
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("StocPiese.txt");
          for (Object obj : objects) {
            if (obj instanceof StocPiese) {
                  StocPiese sp = (StocPiese) obj;
                  if (sp.getPret()==Integer.parseInt(jTextField23.getText())) {
                    jTextArea6.append(sp.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        jTextArea6.setText("");           //butonul pentru a afisa continutul fisierului StocPiese in functie de codul piesei
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("StocPiese.txt");
          for (Object obj : objects) {
            if (obj instanceof StocPiese) {
                  StocPiese sp = (StocPiese) obj;
                  if (sp.getCod()==Integer.parseInt(jTextField22.getText())) {
                    jTextArea6.append(sp.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        jTextArea5.setText("");           //butonul pentru a afisa continutul fisierului Servicii in functie de numele reparatiei
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Servicii.txt");
          for (Object obj : objects) {
            if (obj instanceof ServiciiService) {
                  ServiciiService ss = (ServiciiService) obj;
                  if (ss.getDenumire().equals(jTextField32.getText())) {
                    jTextArea5.append(ss.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        jTextArea5.setText("");           //butonul pentru a afisa continutul fisierului Servicii in functie de pretul reparatiei
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Servicii.txt");
          for (Object obj : objects) {
            if (obj instanceof ServiciiService) {
                  ServiciiService ss = (ServiciiService) obj;
                  if (ss.getpret()==Integer.parseInt(jTextField31.getText())) {
                    jTextArea5.append(ss.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        jTextArea5.setText("");           //butonul pentru a afisa continutul fisierului Servicii in functie de durata reparatiei
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Servicii.txt");
          for (Object obj : objects) {
            if (obj instanceof ServiciiService) {
                  ServiciiService ss = (ServiciiService) obj;
                  if (ss.getdurata()==Integer.parseInt(jTextField33.getText())) {
                    jTextArea5.append(ss.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        jTextArea5.setText("");           //butonul pentru a afisa continutul fisierului Servicii in functie de numele piesei
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Servicii.txt");
          for (Object obj : objects) {
            if (obj instanceof ServiciiService) {
                  ServiciiService ss = (ServiciiService) obj;
                  if (ss.getpiesa().equals(jTextField27.getText())) {
                    jTextArea5.append(ss.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        jTextArea5.setText("");           //butonul pentru a afisa continutul fisierului Servicii in functie de codul piesei
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Servicii.txt");
          for (Object obj : objects) {
            if (obj instanceof ServiciiService) {
                  ServiciiService ss = (ServiciiService) obj;
                  if (ss.getCod()==Integer.parseInt(jTextField24.getText())) {
                    jTextArea5.append(ss.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
       jTextArea5.setText("");           //butonul pentru a afisa continutul fisierului Servicii in functie de calificarea mecanicului
                Interfata ob = new Interfata();
                ArrayList<Object> objects = ob.Citire("Servicii.txt");
          for (Object obj : objects) {
            if (obj instanceof ServiciiService) {
                  ServiciiService ss = (ServiciiService) obj;
                  if (ss.getCalificare().equals(jTextField21.getText())) {
                    jTextArea5.append(ss.toString()+"\n");  
                  }                 
              }
            }
    }//GEN-LAST:event_jButton32ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfata().setVisible(true);
            }
        });
    }
    
    private void SetIcon() { //metoda pentru a seta iconita aplicatiei
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.jpg")));
    }

    public static void ScrierePersoane(Persoane obj) { //metoda pentru a scrie obiecte ale clasei Persoane intr-un fisier
     try (final FileOutputStream fout = new FileOutputStream("Persoane.txt", true);
                final AppendingObjectOutputStream out = new AppendingObjectOutputStream(new BufferedOutputStream(fout))) {
               out.writeObject(obj);
               out.flush();
          } catch (IOException e) {
               e.printStackTrace();
          }
    }
    
    public static void ScriereClient(Client obj) { //metoda pentru a scrie obiecte ale clasei Client intr-un fisier
     try (final FileOutputStream fout = new FileOutputStream("Client.txt", true);
                final AppendingObjectOutputStream out = new AppendingObjectOutputStream(new BufferedOutputStream(fout))) {
               out.writeObject(obj);
               out.flush();
          } catch (IOException e) {
               e.printStackTrace();
          }
    }
     
    public static void ScriereAngajat(Angajat obj) { //metoda pentru a scrie obiecte ale clasei Angajat intr-un fisier
     try (final FileOutputStream fout = new FileOutputStream("Angajat.txt",true);
                final AppendingObjectOutputStream out = new AppendingObjectOutputStream(new BufferedOutputStream(fout))) {
               out.writeObject(obj);
               out.flush();
          } catch (IOException e) {
               e.printStackTrace();
          }
    }
      
    public static void ScriereServiciiService(ServiciiService obj) { //metoda pentru a scrie obiecte ale clasei ServiciiService intr-un fisier
     try (final FileOutputStream fout = new FileOutputStream("Servicii.txt", true);
                final AppendingObjectOutputStream out = new AppendingObjectOutputStream(new BufferedOutputStream(fout))) {
               out.writeObject(obj);
               out.flush();
          } catch (IOException e) {
               e.printStackTrace();
          }
    }
       
    public static void ScriereStocPiese(StocPiese obj) { //metoda pentru a scrie obiecte ale clasei StocPiese intr-un fisier
     try (final FileOutputStream fout = new FileOutputStream("StocPiese.txt", true);
                final AppendingObjectOutputStream out = new AppendingObjectOutputStream(new BufferedOutputStream(fout))) {
               out.writeObject(obj);
               out.flush();
          } catch (IOException e) {
               e.printStackTrace();
          }
    }
    
    public static void ScriereMasina(Masina obj) { //metoda pentru a scrie obiecte ale clasei Masina intr-un fisier
     try (final FileOutputStream fout = new FileOutputStream("Masina.txt", true);
                final AppendingObjectOutputStream out = new AppendingObjectOutputStream(new BufferedOutputStream(fout))) {
               out.writeObject(obj);
               out.flush(); //goleste buffer-ul
          } catch (IOException e) {
               e.printStackTrace();
          }
    }
   
    public ArrayList<Object> Citire(String filepath) { //metoda pentru a citi din fisiere
    ArrayList<Object> objects = new ArrayList<>();

    try (FileInputStream fileIn = new FileInputStream(filepath);
         ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
        while (true) {
            try {
                Object obj = objectIn.readObject();
                objects.add(obj);
            } catch (EOFException eof) {
                break;
            }
        }
    } catch (IOException | ClassNotFoundException ex) {
        ex.printStackTrace();
    }    
    return objects;
}
          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
