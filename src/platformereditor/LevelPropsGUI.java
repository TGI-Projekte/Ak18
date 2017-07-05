/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platformereditor;

import java.awt.Color;
import javax.swing.JTextField;
import static platformereditor.PropsGUI.isNumber;

/**
 *
 * @author Julian Blazek
 */
public class LevelPropsGUI extends javax.swing.JFrame {

    private Editor editorobj;
    boolean error = false;
    
    /**
     * Erstellt das Level-Eigenschaften Fenster
     * @param editor
     */
    public LevelPropsGUI(Editor editor) {
        this.editorobj = editor;
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Breite = new javax.swing.JLabel();
        txtWidth = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        lblHeight = new javax.swing.JLabel();
        lblGravity = new javax.swing.JLabel();
        txtGravitation = new javax.swing.JTextField();
        txtJump = new javax.swing.JTextField();
        lblJump = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Level Einstellungen");
        setType(java.awt.Window.Type.UTILITY);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 20, 0};
        layout.rowHeights = new int[] {0, 1, 0, 1, 0, 1, 0, 1, 0};
        getContentPane().setLayout(layout);

        Breite.setText("Breite");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 0, 0);
        getContentPane().add(Breite, gridBagConstraints);

        txtWidth.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtWidth.setText("800");
        txtWidth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 4);
        getContentPane().add(txtWidth, gridBagConstraints);

        txtHeight.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtHeight.setText("600");
        txtHeight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        getContentPane().add(txtHeight, gridBagConstraints);

        lblHeight.setText("Höhe");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        getContentPane().add(lblHeight, gridBagConstraints);

        lblGravity.setText("Gravitation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        getContentPane().add(lblGravity, gridBagConstraints);

        txtGravitation.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtGravitation.setText("6");
        txtGravitation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        getContentPane().add(txtGravitation, gridBagConstraints);

        txtJump.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtJump.setText("-35");
        txtJump.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        getContentPane().add(txtJump, gridBagConstraints);

        lblJump.setText("Sprungstärke");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        getContentPane().add(lblJump, gridBagConstraints);

        btnUpdate.setText("Aktualisiere Level");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 4);
        getContentPane().add(btnUpdate, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        editorobj.updateLevel();
    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * Prüft bei verlorenem Fokus ob das jeweilige Textfeld keine Nummer enthält.
     * @param evt 
     */
    private void txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFocusLost
        JTextField txtf;
        txtf = (JTextField) evt.getSource();
        if (isNumber(txtf.getText())) {
            txtf.setBackground(Color.white);
            error = false;
        } else {
            txtf.setBackground(Color.red);
            error = true;
        }
    }//GEN-LAST:event_txtFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Breite;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblGravity;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblJump;
    private javax.swing.JTextField txtGravitation;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtJump;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables

    int getWidthProp() {
        return Integer.valueOf(txtWidth.getText());
    }

    int getHeightProp() {
        return Integer.valueOf(txtHeight.getText());
    }

    int getGravity() {
        return Integer.valueOf(txtGravitation.getText());
    }

    int getJump() {
        return Integer.valueOf(txtJump.getText());
    }

    void setHeightProp(int height) {
        txtHeight.setText(""+height);
    }

    void setWidthProp(int width) {
        txtWidth.setText(""+width);
    }

    void setJumpProp(int jump) {
        txtJump.setText(""+jump);
    }

    void setGravityProp(int gravity) {
        txtJump.setText(""+gravity);
    }
}