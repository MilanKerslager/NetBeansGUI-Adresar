/*
 * Vstupní formulář pro zadávání seznamu e-mailových adres
 */
package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AdresářHlavníOkno extends javax.swing.JFrame {

    // vytvoříme objekt jednoduchého listu
    DefaultListModel seznamEmail = new DefaultListModel();
    int nahrazuji = -1;
    Formular formular = new Formular();
    int counter=0;
    
    public AdresářHlavníOkno() {
        initComponents();
        // nastavíme list widget na jednoduchý model "DefaultListModel"
        jListEmail.setModel(seznamEmail);
        for (String i: formular.getStavy(true))
            jComboBoxStav.addItem(i);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPohlavi = new javax.swing.ButtonGroup();
        jPanelSpodní = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonPridat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEmail = new javax.swing.JList();
        jButtonZmenit = new javax.swing.JButton();
        jButtonSmazat = new javax.swing.JButton();
        jPanelVrchní = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextJmeno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxStav = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jTextRodne = new javax.swing.JTextField();
        jRadioButtonMuz = new javax.swing.JRadioButton();
        jRadioButtonZena = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanelFotka = new javax.swing.JPanel();
        jLabelCounter = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSpodní.setBorder(javax.swing.BorderFactory.createTitledBorder("E-mail"));
        jPanelSpodní.setToolTipText("");

        jLabel1.setText("E-mail:");

        jButtonPridat.setText("Přidat");
        jButtonPridat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPridatActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListEmail);

        jButtonZmenit.setText("Změnit");
        jButtonZmenit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZmenitActionPerformed(evt);
            }
        });

        jButtonSmazat.setText("Smazat");
        jButtonSmazat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSmazatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSpodníLayout = new javax.swing.GroupLayout(jPanelSpodní);
        jPanelSpodní.setLayout(jPanelSpodníLayout);
        jPanelSpodníLayout.setHorizontalGroup(
            jPanelSpodníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSpodníLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSpodníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(jPanelSpodníLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldEmail)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSpodníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPridat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonZmenit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSmazat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSpodníLayout.setVerticalGroup(
            jPanelSpodníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSpodníLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSpodníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPridat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSpodníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSpodníLayout.createSequentialGroup()
                        .addComponent(jButtonZmenit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSmazat)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jPanelVrchní.setBorder(javax.swing.BorderFactory.createTitledBorder("Jméno, příjmení"));

        jLabel2.setText("Jméno:");

        jLabel4.setText("Příjmení:");

        jLabel5.setText("Rodné:");

        jLabel6.setText("Stav:");

        jTextRodne.setEnabled(false);

        buttonGroupPohlavi.add(jRadioButtonMuz);
        jRadioButtonMuz.setSelected(true);
        jRadioButtonMuz.setText("muž");
        jRadioButtonMuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMuzActionPerformed(evt);
            }
        });

        buttonGroupPohlavi.add(jRadioButtonZena);
        jRadioButtonZena.setText("žena");
        jRadioButtonZena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonZenaActionPerformed(evt);
            }
        });

        jLabel3.setText("Fotka:");

        jPanelFotka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelFotkaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelFotkaLayout = new javax.swing.GroupLayout(jPanelFotka);
        jPanelFotka.setLayout(jPanelFotkaLayout);
        jPanelFotkaLayout.setHorizontalGroup(
            jPanelFotkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanelFotkaLayout.setVerticalGroup(
            jPanelFotkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        jLabelCounter.setText("Počitadlo");

        javax.swing.GroupLayout jPanelVrchníLayout = new javax.swing.GroupLayout(jPanelVrchní);
        jPanelVrchní.setLayout(jPanelVrchníLayout);
        jPanelVrchníLayout.setHorizontalGroup(
            jPanelVrchníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVrchníLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelVrchníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanelVrchníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVrchníLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13))
                    .addGroup(jPanelVrchníLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelVrchníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCounter)
                            .addGroup(jPanelVrchníLayout.createSequentialGroup()
                                .addGroup(jPanelVrchníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelVrchníLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonMuz)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonZena))
                                    .addComponent(jTextJmeno)
                                    .addComponent(jComboBoxStav, 0, 179, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelVrchníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelVrchníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3)
                    .addComponent(jTextRodne)
                    .addGroup(jPanelVrchníLayout.createSequentialGroup()
                        .addComponent(jPanelFotka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 109, Short.MAX_VALUE))))
        );
        jPanelVrchníLayout.setVerticalGroup(
            jPanelVrchníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVrchníLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVrchníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextJmeno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelVrchníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVrchníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextRodne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonMuz)
                    .addComponent(jRadioButtonZena))
                .addGap(11, 11, 11)
                .addGroup(jPanelVrchníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFotka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelVrchníLayout.createSequentialGroup()
                        .addGroup(jPanelVrchníLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxStav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addComponent(jLabelCounter)))
                .addContainerGap())
        );

        jButton2.setText("Konec");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSpodní, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelVrchní, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVrchní, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSpodní, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPridatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPridatActionPerformed
        // odstranění mezer kolem vstupujícího řetězce
        String vstup = jTextFieldEmail.getText().trim();
        jTextFieldEmail.setText(vstup);
        // kontrola adresy podle regulárního výrazu
        Pattern p = Pattern.compile(
                "^[_a-zA-Z0-9-]+(.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(.[a-zA-Z0-9-]+)+$");
        Matcher m = p.matcher(vstup);
        if (! m.find()) {
            // není shoda s požadovaným formátem
            JOptionPane.showMessageDialog(this,
                "E-mailová adresa není ve správném formátu.",
                "Chyba vstupu",
                JOptionPane.ERROR_MESSAGE);
        } else {
            // byla shoda s regulárním výrazem -> asi je to emailová adresa
            if (! vstup.isEmpty()) {
                if (nahrazuji != -1) {
                    // pokud je zapamatována pozice, opravujeme -> prvek nahradíme
                    seznamEmail.setElementAt(vstup, nahrazuji);
                } else {
                    // přidání prvku na konec seznamu
                    seznamEmail.addElement(vstup);
                }
                jTextFieldEmail.setText("");
            }
        }
        jTextFieldEmail.requestFocus(); // kurzor do vstupního pole
        nahrazuji = -1;                 // nahrazování dokončeno -> zrušíme ho
    }//GEN-LAST:event_jButtonPridatActionPerformed

    private void jButtonSmazatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSmazatActionPerformed
        // pokud bylo máčknuto Změnit a pak Smazat, zrušíme Změnu
        if (nahrazuji != -1) {
            nahrazuji = -1;
            jTextFieldEmail.setText("");
        }
        // dokud je nějaký prvek označen, budeme ho likvidovat
        while (! jListEmail.isSelectionEmpty()) {
                seznamEmail.removeElementAt(jListEmail.getSelectedIndex());
        }
    }//GEN-LAST:event_jButtonSmazatActionPerformed

    private void jButtonZmenitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZmenitActionPerformed
        // při změně přesuneme obsah do editačního pole a zapamatujeme si pozici
        String retezec = seznamEmail.getElementAt(
                jListEmail.getSelectedIndex()).toString();
        jTextFieldEmail.setText(retezec);
        nahrazuji = jListEmail.getSelectedIndex();
    }//GEN-LAST:event_jButtonZmenitActionPerformed

    private void jRadioButtonZenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonZenaActionPerformed
        jTextRodne.setEnabled(true);
        jComboBoxStav.removeAllItems();
        for (String i: formular.getStavy(false))
            jComboBoxStav.addItem(i);
    }//GEN-LAST:event_jRadioButtonZenaActionPerformed

    private void jRadioButtonMuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMuzActionPerformed
        counter++;
        jLabelCounter.setText(Integer.toString(counter));
        jTextRodne.setText("");
        jTextRodne.setEnabled(false);
        jComboBoxStav.removeAllItems();
        for (String i: formular.getStavy(true))
            jComboBoxStav.addItem(i);
    }//GEN-LAST:event_jRadioButtonMuzActionPerformed

    private void jPanelFotkaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFotkaMouseClicked
        //ImagePanel x = new ImagePanel("fotka.jpg");
    }//GEN-LAST:event_jPanelFotkaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdresářHlavníOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdresářHlavníOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdresářHlavníOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdresářHlavníOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdresářHlavníOkno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPohlavi;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonPridat;
    private javax.swing.JButton jButtonSmazat;
    private javax.swing.JButton jButtonZmenit;
    private javax.swing.JComboBox jComboBoxStav;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCounter;
    private javax.swing.JList jListEmail;
    private javax.swing.JPanel jPanelFotka;
    private javax.swing.JPanel jPanelSpodní;
    private javax.swing.JPanel jPanelVrchní;
    private javax.swing.JRadioButton jRadioButtonMuz;
    private javax.swing.JRadioButton jRadioButtonZena;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextJmeno;
    private javax.swing.JTextField jTextRodne;
    // End of variables declaration//GEN-END:variables
}
