/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Management.Admin;
import Management.SQLConnection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author hp
 */
public class ExaNeu3Consult extends javax.swing.JFrame {

    
    
    //Creates new form ConExaNeu3
    public ExaNeu3Consult() {
        initComponents();
        setImages();
        showTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rodillaIzquierdaLabel = new javax.swing.JLabel();
        tobilloDerechoLabel = new javax.swing.JLabel();
        codoDerechoLabel = new javax.swing.JLabel();
        rodillaDerechaLabel = new javax.swing.JLabel();
        muniecaIzquierdaLabel = new javax.swing.JLabel();
        tobilloIzquierdoLabel = new javax.swing.JLabel();
        muniecaDerechaLabel = new javax.swing.JLabel();
        codoIzquierdoLabel = new javax.swing.JLabel();
        editarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        regresarButton = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rodillaIzquierdaLabel.setBackground(new java.awt.Color(255, 255, 255));
        rodillaIzquierdaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(rodillaIzquierdaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 60, 20));

        tobilloDerechoLabel.setBackground(new java.awt.Color(255, 255, 255));
        tobilloDerechoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(tobilloDerechoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 50, 20));

        codoDerechoLabel.setBackground(new java.awt.Color(255, 255, 255));
        codoDerechoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(codoDerechoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 50, 20));

        rodillaDerechaLabel.setBackground(new java.awt.Color(255, 255, 255));
        rodillaDerechaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(rodillaDerechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 60, 20));

        muniecaIzquierdaLabel.setBackground(new java.awt.Color(255, 255, 255));
        muniecaIzquierdaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(muniecaIzquierdaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 50, 20));

        tobilloIzquierdoLabel.setBackground(new java.awt.Color(255, 255, 255));
        tobilloIzquierdoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(tobilloIzquierdoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 50, 20));

        muniecaDerechaLabel.setBackground(new java.awt.Color(255, 255, 255));
        muniecaDerechaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(muniecaDerechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 50, 20));

        codoIzquierdoLabel.setBackground(new java.awt.Color(204, 204, 204));
        codoIzquierdoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(codoIzquierdoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 50, 20));

        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stickman2Image.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 230, 290));

        regresarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backImage.png"))); // NOI18N
        regresarButton.setBorder(null);
        regresarButton.setBorderPainted(false);
        regresarButton.setContentAreaFilled(false);
        regresarButton.setFocusPainted(false);
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(regresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 30));
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        Admin.openConExaNeu2();
        dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        Admin.openExaNeu3Edit();
        dispose();
    }//GEN-LAST:event_editarButtonActionPerformed


    
    private void setImages()
    {
        ClassLoader classLoader = this.getClass().getClassLoader();
        
        ImageIcon image = new ImageIcon(classLoader.getResource("Images/stickman2Image.png"));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        jLabel2.setIcon(icon);
        
        image = new ImageIcon(classLoader.getResource("Images/white.jpg"));
        icon = new ImageIcon(image.getImage().getScaledInstance(backgroundLabel.getWidth(), backgroundLabel.getHeight(), Image.SCALE_DEFAULT));
        backgroundLabel.setIcon(icon);
        
        image = new ImageIcon(classLoader.getResource("Images/backImage.png"));
        icon = new ImageIcon(image.getImage().getScaledInstance(regresarButton.getWidth(), regresarButton.getHeight(), Image.SCALE_DEFAULT));
        regresarButton.setIcon(icon);
    }
    
    
    private void showTable()
    {
        TodosPacientes tP = new TodosPacientes();
        Connection con = null;
        ResultSet rs;

        try{
            con = SQLConnection.getSQLConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT monitos.* from datos INNER JOIN monitos ON monitos.Id_monitos = datos.Id WHERE datos.Id = ?");
            ps.setString(1, tP.getID());
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                muniecaIzquierdaLabel.setText(textToArrow(rs.getString("MuniecaIzquierda")));
                muniecaDerechaLabel.setText(textToArrow(rs.getString("MuniecaDerecha")));
                codoIzquierdoLabel.setText(textToArrow(rs.getString("CodoIzquierdo")));
                codoDerechoLabel.setText(textToArrow(rs.getString("CodoDerecho")));
                rodillaIzquierdaLabel.setText(textToArrow(rs.getString("RodillaIzquierda")));
                rodillaDerechaLabel.setText(textToArrow(rs.getString("RodillaDerecha")));
                tobilloIzquierdoLabel.setText(textToArrow(rs.getString("TobilloIzquierdo")));
                tobilloDerechoLabel.setText(textToArrow(rs.getString("TobilloDerecho")));
            }
            
            muniecaIzquierdaLabel.setHorizontalAlignment(muniecaIzquierdaLabel.CENTER);
            muniecaDerechaLabel.setHorizontalAlignment(muniecaDerechaLabel.CENTER);
            codoIzquierdoLabel.setHorizontalAlignment(codoIzquierdoLabel.CENTER);
            codoDerechoLabel.setHorizontalAlignment(codoDerechoLabel.CENTER);
            rodillaIzquierdaLabel.setHorizontalAlignment(rodillaIzquierdaLabel.CENTER);
            rodillaDerechaLabel.setHorizontalAlignment(rodillaDerechaLabel.CENTER);
            tobilloIzquierdoLabel.setHorizontalAlignment(tobilloIzquierdoLabel.CENTER);
            tobilloDerechoLabel.setHorizontalAlignment(tobilloDerechoLabel.CENTER);
            
            muniecaIzquierdaLabel.setBorder(null);
            muniecaDerechaLabel.setBorder(null);
            codoIzquierdoLabel.setBorder(null);
            codoDerechoLabel.setBorder(null);
            rodillaIzquierdaLabel.setBorder(null);
            rodillaDerechaLabel.setBorder(null);
            tobilloIzquierdoLabel.setBorder(null);
            tobilloDerechoLabel.setBorder(null);
            
            con.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    private String textToArrow(String text)
    {
        if(text.equals("Up"))
        {
            return "???";
        }
        else
        {
            return "???";
        }
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
            java.util.logging.Logger.getLogger(ExaNeu3Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExaNeu3Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExaNeu3Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExaNeu3Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExaNeu3Consult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel codoDerechoLabel;
    private javax.swing.JLabel codoIzquierdoLabel;
    private javax.swing.JButton editarButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel muniecaDerechaLabel;
    private javax.swing.JLabel muniecaIzquierdaLabel;
    private javax.swing.JButton regresarButton;
    private javax.swing.JLabel rodillaDerechaLabel;
    private javax.swing.JLabel rodillaIzquierdaLabel;
    private javax.swing.JLabel tobilloDerechoLabel;
    private javax.swing.JLabel tobilloIzquierdoLabel;
    // End of variables declaration//GEN-END:variables
}
