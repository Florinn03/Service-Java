
package service;

import java.awt.Toolkit;
import persoane.*;
import stocpiese.*;
import serviciiservice.*;
import Masina.*;
import java.io.*;
import java.util.ArrayList;

public class Gui extends javax.swing.JFrame {

  
    public Gui() {
        initComponents();
        SetIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Service Auto");
        setIconImage(getIconImage());
        setName("Frame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 268, 246, 25));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Obiect:");
        jLabel3.setFocusable(false);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 268, 50, 25));

        jTextField3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 237, 331, 25));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton1.setText("Adauga");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 268, -1, 25));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton2.setText("Afisare");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 237, 74, 25));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nume clasa:");
        jLabel4.setFocusable(false);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 237, -1, 25));

        jTextField4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 206, 96, 25));

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clasa", "Persoane", "Client", "Angajat", "Masina", "ServiciiService", "StocPiese" }));
        jComboBox1.setFocusable(false);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 268, 100, 25));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cautati lista de reparatie dupa Seria de sasiu:");
        jLabel5.setFocusable(false);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 175, -1, 25));

        jComboBox2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clasa", "Persoane", "Client", "Angajat", "Masina", "ServiciiService", "StocPiese" }));
        jComboBox2.setFocusable(false);
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 206, 100, 25));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Atribut:");
        jLabel6.setFocusable(false);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 206, 48, 25));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton3.setText("?");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 206, 59, 25));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Completati in calitate de:");
        jLabel7.setFocusable(false);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 144, -1, 25));

        jRadioButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Client");
        jRadioButton1.setFocusable(false);
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 144, -1, 25));

        jRadioButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Angajat");
        jRadioButton2.setFocusable(false);
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 144, -1, 25));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valoare cautata:");
        jLabel8.setFocusable(false);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 206, -1, 25));

        jTextField5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 206, 64, 25));

        jTextField6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 175, 114, 25));

        jButton4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton4.setText("Cauta");
        jButton4.setFocusable(false);
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 175, 129, 25));

        jTextField1.setColumns(20);
        jTextField1.setRows(5);
        jScrollPane1.setViewportView(jTextField1);
        jTextField1.getAccessibleContext().setAccessibleName("jTextField1");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 296, 490, 200));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service/Garaj.jpg"))); // NOI18N
        jLabel9.setText("jLabel1");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String jcb1= jComboBox1.getSelectedItem().toString();                          //metoda pentru butonul "Adauga", adauga obiectul introdus in jTextField2 daca
        if (jRadioButton1.isSelected()==true) { //jRadioButton1(Client) este apasat, poate adauga doar Client, Masina.
        switch (jcb1) {                                                             // al2lea swtich este pentru jRadioButton2(Angajat) si poate adauga Persoane, Angajat, ServiciiService si StocPiese
            case "Client":
            String[] Str1 = jTextField2.getText().split(", ", 15);   //vector care va stoca textul de tip String din textField2, textul e impartit cu split in cuvinte
            Client c = new Client(); //obiect nou de tipul clasei, este creat la fiecare scriere
            //c.Nume = Str1[0]; // se initializeaza fiecare atributa a clasei cu valoarea din vectorul obtinu anterior
           // c.Prenume = Str1[1];
           // c.varsta = Integer.parseInt(Str1[2].trim());
           // c.tipPersoana = Str1[3];
         //   c.MarcaMasina = Str1[4];
        //    c.ModelMasina = Str1[5];
        //    c.AnMasina = Integer.parseInt(Str1[6].trim());
         //   c.SerieSasiu = Str1[7];
         //   ScriereClient(c); //se scrie obiectul intr-un fisier text cu ajutorul metodei definita mai jos
                break;
            case "Masina":
            String[] Str2 = jTextField2.getText().split(", ", 9);
            Masina m = new Masina();
          //  m.Marca = Str2[0];
         //   m.Model = Str2[1];
          //  m.SerieSasiu = Str2[2];
          //  m.AnFab = Integer.parseInt(Str2[3].trim());
          //  m.Problema = Str2[4];
            ScriereMasina(m);
                break;
            case "Clasa":
                jTextField1.setText("Ati uitat sa selectati clasa!");
                break;
        }
        }
        if (jRadioButton2.isSelected()==true) { //la fel ca swtich-ul anterior
        switch (jcb1) {
            case "Persoane":
                String[] Str3 = jTextField2.getText().split(", ", 7);
                Persoane p = new Persoane();
               // p.Nume = Str3[0];
              //  p.Prenume = Str3[1];
              //  p.varsta = Integer.parseInt(Str3[2].trim());
              //  p.tipPersoana = Str3[3];
                ScrierePersoane(p);
                break;
            case "Angajat":
                String[] Str4 = jTextField2.getText().split(", ", 13);
                Angajat a = new Angajat();
              //  a.Nume = Str4[0];
              //  a.Prenume = Str4[1];
              //  a.varsta = Integer.parseInt(Str4[2].trim());
              //  a.tipPersoana = Str4[3];
           //     a.calificare = Str4[4];
          //      a.AnAngajare = Integer.parseInt(Str4[6].trim());
          //      ScriereAngajat(a);
                break;
            case "ServiciiService":
                String[] Str5 = jTextField2.getText().split(", ", 11);
                ServiciiService ss = new ServiciiService();
                ss.setDenumire(Str5[0]);
            //    ss.pret = Integer.parseInt(Str5[1].trim());
            //    ss.durata = Integer.parseInt(Str5[2].trim());
           //     ss.piesa = Str5[3];
           //     ss.CodPiesa = Integer.parseInt(Str5[4].trim());
            //    ss.CalificareMecanic = Str5[5];
                ScriereServiciiService(ss);
                break;
            case "StocPiese":
                String[] Str6 = jTextField2.getText().split(", ", 7);
                StocPiese sp = new StocPiese();
            //    sp.NumePiesa = Str6[0];
            //    sp.CantitateStoc = Integer.parseInt(Str6[1].trim());
             //   sp.Pret = Integer.parseInt(Str6[2].trim());
             //   sp.Cod = Integer.parseInt(Str6[3].trim());
            //    ScriereStocPiese(sp);
                break;
            case "Clasa":
                jTextField1.setText("Ati uitat sa selectati clasa!");
                break;
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // btn pt afisare clasa din fisier
        String tf3 = jTextField3.getText();
        switch (tf3) {
            case "Persoane":
                jTextField1.setText(" ");
                Gui ob1 = new Gui();
                ArrayList<Object> objects1 = ob1.Citire("Persoane.txt");
          for (Object obj : objects1) {
                jTextField1.append(obj.toString()+"\n");
            }
                break;
            case "Client":
                jTextField1.setText(" ");
                Gui ob2 = new Gui();
                ArrayList<Object> objects2 = ob2.Citire("Client.txt");
          for (Object obj : objects2) {
                jTextField1.append(obj.toString()+"\n");
            }
                break;
            case "Angajat":
                jTextField1.setText(" ");
                Gui ob3 = new Gui();
                ArrayList<Object> objects3 = ob3.Citire("Angajat.txt");
          for (Object obj : objects3) {
                jTextField1.append(obj.toString()+"\n");
            }
                break;
            case "Masina":
                jTextField1.setText(" ");
                Gui ob4 = new Gui();
                ArrayList<Object> objects4 = ob4.Citire("Masina.txt");
          for (Object obj : objects4) {
                jTextField1.append(obj.toString()+"\n");
            }
                break;
            case "ServiciiService":
                jTextField1.setText(" ");
                Gui ob5 = new Gui();
                ArrayList<Object> objects5 = ob5.Citire("Servicii.txt");
          for (Object obj : objects5) {
                jTextField1.append(obj.toString()+"\n");
            }
                break;
            case "StocPiese":
                jTextField1.setText(" ");
                Gui ob6 = new Gui();
                ArrayList<Object> objects6 = ob6.Citire("StocPiese.txt");
          for (Object obj : objects6) {
                jTextField1.append(obj.toString()+"\n");
            }
                break;
            default:
                jTextField1.setText("Ati introdus o clasa inexistenta. Clasele sunt: Persoane, Client, Angajat, Masina, ServiciiService, StocPiese, sau nu ati selectat Client/Angajat dupa caz");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String jc2 = jComboBox2.getSelectedItem().toString();
        switch (jc2) {
            case "Persoane":
               
                break;
            case "Client":
                
                break;
            case "Angajat":
                
                break;
            case "Masina":
                
                break;
            case "ServiciiService":
                
                break;
            case "StocPiese":
                
                break;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
               
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
               out.flush();
               out.reset();
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
