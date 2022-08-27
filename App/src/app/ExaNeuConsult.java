/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


import Management.SQLConnection;
import Management.Admin;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class ExaNeuConsult extends javax.swing.JFrame {

    /**
     * Creates new form consuExaNe
     */
    public ExaNeuConsult() {
        initComponents();
        setImages();
        this.setLocationRelativeTo(null);
        neuroTable.getTableHeader().setUI(null);
        neuroTable.setShowVerticalLines(true);
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

        editarButton = new javax.swing.JButton();
        regresarB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        neuroTable = new javax.swing.JTable();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        regresarB.setText("Regresar");
        regresarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBActionPerformed(evt);
            }
        });
        getContentPane().add(regresarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        neuroTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Nombre", null},
                {"Alerta", null},
                {"Atencion", null},
                {"Percepcion", null},
                {"Plan_Ejec", null},
                {"Lenguaje", null},
                {"Emocion", null}
            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        neuroTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(neuroTable);
        if (neuroTable.getColumnModel().getColumnCount() > 0) {
            neuroTable.getColumnModel().getColumn(0).setResizable(false);
            neuroTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            neuroTable.getColumnModel().getColumn(0).setHeaderValue(null);
            neuroTable.getColumnModel().getColumn(1).setResizable(false);
            neuroTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            neuroTable.getColumnModel().getColumn(1).setHeaderValue(null);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 370, 140));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/white.jpg"))); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void setImages()
    {
        ClassLoader classLoader = this.getClass().getClassLoader();
        ImageIcon image = new ImageIcon(classLoader.getResource("Images/white.jpg"));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(backgroundLabel.getWidth(), backgroundLabel.getHeight(), Image.SCALE_DEFAULT));
        backgroundLabel.setIcon(icon);
    }
    
    public void showTable()
    {
        Connection con = null;
        TodosPacientes tP = new TodosPacientes();
        DefaultTableModel model;
        ResultSet rs;
        try{
            String[] titulos = {"Nombre","Alerta","Atencion","Percepcion","Plan_Ejec","Lenguaje","Emocion"};
            model = new DefaultTableModel(null, titulos);
            String datos[] = new String[7];
            con = SQLConnection.getSQLConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT datos.Nombre,examen_neurologico.* from datos INNER JOIN examen_neurologico ON examen_neurologico.Id_exNe = datos.Id WHERE datos.Id = ?");
            ps.setString(1, tP.getID());
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                neuroTable.setValueAt(rs.getString("Nombre"),0,1);
                datos[0]=rs.getString("Nombre");
                neuroTable.setValueAt(rs.getString("Alerta"),1,1);
                datos[1]=rs.getString("Alerta");
                neuroTable.setValueAt(rs.getString("Atencion"),2,1);
                datos[2]=rs.getString("Atencion");
                neuroTable.setValueAt(rs.getString("Percepcion"),3,1);
                datos[3]=rs.getString("Percepcion");
                neuroTable.setValueAt(rs.getString("Plan_Ejec"),4,1);
                datos[4]=rs.getString("Plan_Ejec");
                neuroTable.setValueAt(rs.getString("Lenguaje"),5,1);
                datos[5]=rs.getString("Lenguaje");
                neuroTable.setValueAt(rs.getString("Emocion"),6,1);
                datos[6]=rs.getString("Emocion");
                
                model.addRow(datos);
                
            }
            //exNeTbl.setModel(model);
            //exNeTbl.setDefaultEditor(Object.class, null);

            
            con.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    private void regresarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBActionPerformed
        Admin.returnTodosPacientes();
        dispose();
    }//GEN-LAST:event_regresarBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Admin.openConExaNeu2();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        Admin.openExaNeuEdit();
        dispose();
    }//GEN-LAST:event_editarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ExaNeuConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExaNeuConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExaNeuConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExaNeuConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExaNeuConsult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable neuroTable;
    private javax.swing.JButton regresarB;
    // End of variables declaration//GEN-END:variables
}
