/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


import Management.Admin;
import Management.Messages;
import Management.SQLConnection;
import Management.SQLStatements;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;


/**
 *
 * @author hp
 */
public class ExaNeu3Edit extends javax.swing.JFrame {

    // Attributes
    private static String muniecaIzquierda;
    private static String muniecaDerecha;
    private static String codoIzquierdo;
    private static String codoDerecho;
    private static String rodillaIzquierda;
    private static String rodillaDerecha;
    private static String tobilloIzquierdo;
    private static String tobilloDerecho;
    
    // Creates new form ExamenNeurologico3
    public ExaNeu3Edit() {
        initComponents();
        setImages();
        ExaNeu2 ex2 = new ExaNeu2();
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

        codoDerechoCB = new javax.swing.JComboBox<>();
        muniecaIzquierdaCB = new javax.swing.JComboBox<>();
        muniecaDerechaCB = new javax.swing.JComboBox<>();
        rodillaIzquierdaCB = new javax.swing.JComboBox<>();
        rodillaDerechaCB = new javax.swing.JComboBox<>();
        tobilloIzquierdoCB = new javax.swing.JComboBox<>();
        tobilloDerechoCB = new javax.swing.JComboBox<>();
        codoIzquierdoCB = new javax.swing.JComboBox<>();
        regresarButton = new javax.swing.JButton();
        siguienteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codoDerechoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↑", "↓" }));
        codoDerechoCB.setMinimumSize(new java.awt.Dimension(26, 14));
        codoDerechoCB.setPreferredSize(new java.awt.Dimension(26, 14));
        getContentPane().add(codoDerechoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 50, 20));

        muniecaIzquierdaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↑", "↓" }));
        muniecaIzquierdaCB.setMinimumSize(new java.awt.Dimension(26, 14));
        muniecaIzquierdaCB.setPreferredSize(new java.awt.Dimension(26, 14));
        getContentPane().add(muniecaIzquierdaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 50, 20));

        muniecaDerechaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↑", "↓" }));
        muniecaDerechaCB.setMinimumSize(new java.awt.Dimension(26, 14));
        muniecaDerechaCB.setPreferredSize(new java.awt.Dimension(26, 14));
        getContentPane().add(muniecaDerechaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 50, 20));

        rodillaIzquierdaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↑", "↓" }));
        rodillaIzquierdaCB.setMinimumSize(new java.awt.Dimension(26, 14));
        rodillaIzquierdaCB.setPreferredSize(new java.awt.Dimension(26, 14));
        getContentPane().add(rodillaIzquierdaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 60, 20));

        rodillaDerechaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↑", "↓" }));
        rodillaDerechaCB.setMinimumSize(new java.awt.Dimension(26, 14));
        rodillaDerechaCB.setPreferredSize(new java.awt.Dimension(26, 14));
        getContentPane().add(rodillaDerechaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 60, 20));

        tobilloIzquierdoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↑", "↓" }));
        tobilloIzquierdoCB.setMinimumSize(new java.awt.Dimension(26, 14));
        tobilloIzquierdoCB.setPreferredSize(new java.awt.Dimension(26, 14));
        getContentPane().add(tobilloIzquierdoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 50, 20));

        tobilloDerechoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↑", "↓" }));
        tobilloDerechoCB.setMinimumSize(new java.awt.Dimension(26, 14));
        tobilloDerechoCB.setPreferredSize(new java.awt.Dimension(26, 14));
        getContentPane().add(tobilloDerechoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 50, 20));

        codoIzquierdoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↑", "↓" }));
        codoIzquierdoCB.setMinimumSize(new java.awt.Dimension(26, 14));
        codoIzquierdoCB.setPreferredSize(new java.awt.Dimension(26, 14));
        getContentPane().add(codoIzquierdoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 50, 20));

        regresarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backImage.png"))); // NOI18N
        regresarButton.setBorderPainted(false);
        regresarButton.setContentAreaFilled(false);
        regresarButton.setFocusPainted(false);
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(regresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 70, 30));

        siguienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nextImage.png"))); // NOI18N
        siguienteButton.setContentAreaFilled(false);
        siguienteButton.setFocusPainted(false);
        siguienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(siguienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stickman2Image.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 230, 290));

        backgroundLabel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundLabel.setOpaque(true);
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void selectItem(JComboBox comboBox, String data)
    {
        if(data.equals("Up"))
            comboBox.setSelectedIndex(0);
        else
            comboBox.setSelectedIndex(1);
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
                selectItem(muniecaIzquierdaCB,rs.getString("MuniecaIzquierda"));
                selectItem(muniecaDerechaCB,rs.getString("MuniecaDerecha"));
                selectItem(codoIzquierdoCB,rs.getString("CodoIzquierdo"));
                selectItem(codoDerechoCB,rs.getString("CodoDerecho"));
                selectItem(rodillaIzquierdaCB,rs.getString("RodillaIzquierda"));
                selectItem(rodillaDerechaCB,rs.getString("RodillaDerecha"));
                selectItem(tobilloIzquierdoCB,rs.getString("TobilloIzquierdo"));
                selectItem(tobilloDerechoCB,rs.getString("TobilloDerecho"));
            }
            
            
            con.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
           
    private void setGetters()
    {
        muniecaIzquierda = comboBoxToString(muniecaIzquierdaCB);
        muniecaDerecha = comboBoxToString(muniecaDerechaCB);
        codoIzquierdo = comboBoxToString(codoIzquierdoCB);
        codoDerecho = comboBoxToString(codoDerechoCB);
        rodillaIzquierda = comboBoxToString(rodillaIzquierdaCB);
        rodillaDerecha = comboBoxToString(rodillaDerechaCB);
        tobilloIzquierdo = comboBoxToString(tobilloIzquierdoCB);
        tobilloDerecho = comboBoxToString(tobilloDerechoCB);
    }
    
    
    public static String getMuniecaIzquierda() { return muniecaIzquierda; }
    public static String getMuniecaDerecha() { return muniecaDerecha; }
    
    public static String getCodoIzquierdo() { return codoIzquierdo; }
    public static String getCodoDerecho() { return codoDerecho; }
    
    public static String getRodillaIzquierda() { return rodillaIzquierda; }
    public static String getRodillaDerecha() { return rodillaDerecha; }
    
    public static String getTobilloIzquierdo() { return tobilloIzquierdo; }
    public static String getTobilloDerecho() { return tobilloDerecho; }
    
    
    private String comboBoxToString(JComboBox comboBox)
    {
        if(comboBox.getSelectedItem().equals("↑"))
        {
            return "Up";
        }
        else
        {
            return "Down";
        }
    }
    
    private void siguienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteButtonActionPerformed
        setGetters();
        Messages message = new Messages();
        String table = "monitos";
        String[] values = new String[] {
            muniecaIzquierda,muniecaDerecha,codoIzquierdo,codoDerecho,rodillaIzquierda,rodillaDerecha,tobilloIzquierdo,tobilloDerecho
        };
        SQLStatements statement = new SQLStatements();
        if(statement.update(table,values))
            message.informationMessage("Datos actualizados", "Datos actualizados con éxito");
        else
            message.errorMesage("Error", "Ha ocurrido un error al actualizar los datos");
        Admin.openConExaNeu3();
        dispose();
    }//GEN-LAST:event_siguienteButtonActionPerformed

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        Admin.openConExaNeu3();
        dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

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
        
        image = new ImageIcon(classLoader.getResource("Images/nextImage.png"));
        icon = new ImageIcon(image.getImage().getScaledInstance(siguienteButton.getWidth(), siguienteButton.getHeight(), Image.SCALE_DEFAULT));
        siguienteButton.setIcon(icon);   
        
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
            java.util.logging.Logger.getLogger(ExaNeu3Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExaNeu3Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExaNeu3Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExaNeu3Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExaNeu3Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JComboBox<String> codoDerechoCB;
    private javax.swing.JComboBox<String> codoIzquierdoCB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> muniecaDerechaCB;
    private javax.swing.JComboBox<String> muniecaIzquierdaCB;
    private javax.swing.JButton regresarButton;
    private javax.swing.JComboBox<String> rodillaDerechaCB;
    private javax.swing.JComboBox<String> rodillaIzquierdaCB;
    private javax.swing.JButton siguienteButton;
    private javax.swing.JComboBox<String> tobilloDerechoCB;
    private javax.swing.JComboBox<String> tobilloIzquierdoCB;
    // End of variables declaration//GEN-END:variables
}
