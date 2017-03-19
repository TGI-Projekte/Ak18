/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platformer.core;

import javax.swing.JFrame;

/**
 *
 * @author Florian Rost
 */
public class NewGUIPause extends javax.swing.JFrame {

    /**
     * Creates new form NewGUIPause
     */
    public NewGUIPause() {
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

        jbtnWeiterspielen = new javax.swing.JButton();
        jbtnEinstellungenMenü = new javax.swing.JButton();
        jbtnNeustarten = new javax.swing.JButton();
        jbtnMenü = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnWeiterspielen.setText("Weiterspielen");
        jbtnWeiterspielen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnWeiterspielenActionPerformed(evt);
            }
        });

        jbtnEinstellungenMenü.setText("Einstellungen");
        jbtnEinstellungenMenü.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEinstellungenMenüActionPerformed(evt);
            }
        });

        jbtnNeustarten.setText("Neu starten");
        jbtnNeustarten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNeustartenActionPerformed(evt);
            }
        });

        jbtnMenü.setText("Menü");
        jbtnMenü.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMenüActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnWeiterspielen)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbtnMenü, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnNeustarten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnEinstellungenMenü, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jbtnWeiterspielen)
                .addGap(18, 18, 18)
                .addComponent(jbtnEinstellungenMenü)
                .addGap(18, 18, 18)
                .addComponent(jbtnNeustarten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jbtnMenü)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNeustartenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNeustartenActionPerformed

        //Var.jf1 = new JFrame();
        //Var.jf1.setVisible(false);
        //this.setVisible(false);
    }//GEN-LAST:event_jbtnNeustartenActionPerformed

    private void jbtnEinstellungenMenüActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEinstellungenMenüActionPerformed
        //öffne EInstellungsfenster
        new NewGUIEinstellungen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnEinstellungenMenüActionPerformed

    private void jbtnWeiterspielenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnWeiterspielenActionPerformed
        this.setVisible(false);
        //Spiel ansich muss noch pausiert werden

    }//GEN-LAST:event_jbtnWeiterspielenActionPerformed

    private void jbtnMenüActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMenüActionPerformed
        new NewGUISicherheitsabfrage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnMenüActionPerformed

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
            java.util.logging.Logger.getLogger(NewGUIPause.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewGUIPause.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewGUIPause.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewGUIPause.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewGUIPause().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnEinstellungenMenü;
    private javax.swing.JButton jbtnMenü;
    private javax.swing.JButton jbtnNeustarten;
    private javax.swing.JButton jbtnWeiterspielen;
    // End of variables declaration//GEN-END:variables

}
