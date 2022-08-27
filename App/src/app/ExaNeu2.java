/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


import Management.Admin;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class ExaNeu2 extends javax.swing.JFrame {

    private static String[] firstTableData = new String[13];
    private static String[][] secondTableData = new String[9][4];

    /**
     * Creates new form exNeTablas
     */
    public ExaNeu2() {
        initComponents();
        JComboBox cB = new JComboBox();
        setImages();
        DefaultTableModel model;
        ResultSet rs;

        //Método para asignar a la tabla model todo lo que tiene exNeTablas2
        String[] columnas = new String[secondTable.getColumnCount()];
        String[][] datos = new String[secondTable.getRowCount()][secondTable.getColumnCount()];
        for (int i = 0; i < secondTable.getRowCount(); i++) {
            for (int j = 0; j < secondTable.getColumnCount(); j++) {
                if (secondTable.getValueAt(i, j) == null || secondTable.getValueAt(i, j).toString() == "") {
                    datos[i][j] = null;
                } else {
                    datos[i][j] = secondTable.getValueAt(i, j).toString();
                }
                columnas[j] = secondTable.getColumnName(j);
            }
        }

        /*Sobreescribimos la función de isCellEditable para solo
          hacer editables celdas específicas*/
        model = new DefaultTableModel(datos, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || (row > 3 && column < 4) || (row < 4 && column > 3)) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };
        secondTable.setModel(model);
        JLabel myLabel = new JLabel();
        myLabel.setBackground(Color.red);
        cB.addItem(myLabel);
        //B.addItem("→");
        //cB.addItem("↓");
        //cB.addItem("↑");
        
        for(int i=1; i<4; i++)
        {
            secondTable.getColumnModel().getColumn(i).setCellEditor(new DefaultCellEditor(cB));
            //exNeTablas2.getColumnModel().getColumn(i).setCellRenderer(new Renderer());
        }
        firstTable.getTableHeader().setUI(null);
        firstTable.setShowGrid(true);
        secondTable.setShowGrid(true);
        this.repaint();
    }
    
    class Renderer extends DefaultTableCellRenderer {
  JLabel lbl = new JLabel();

 public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
  boolean hasFocus, int row, int column) {
     Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//lbl.setText("hello");
/*if(row>3)
{
    lbl.setOpaque(true);
}
lbl.setBackground(Color.GRAY);*/
//lbl.setIcon(icon);
if(row>3)
{
    c.setBackground(Color.gray);
}

return c;
//return lbl;
}
}

    private void setImages() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        ImageIcon image = new ImageIcon(classLoader.getResource("Images/white.jpg"));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(backgroundImage.getWidth(), backgroundImage.getHeight(), Image.SCALE_DEFAULT));
        backgroundImage.setIcon(icon);

        image = new ImageIcon(classLoader.getResource("Images/backImage.png"));
        icon = new ImageIcon(image.getImage().getScaledInstance(regresarButton.getWidth(), regresarButton.getHeight(), Image.SCALE_DEFAULT));
        regresarButton.setIcon(icon);
        
        image = new ImageIcon(classLoader.getResource("Images/nextImage.png"));
        icon = new ImageIcon(image.getImage().getScaledInstance(siguienteButton.getWidth(), siguienteButton.getHeight(), Image.SCALE_DEFAULT));
        siguienteButton.setIcon(icon);   
    }

    public void enableGuardarButton() {
        boolean firstTableFull = true;
        boolean secondTableFull = true;
        for (int i = 0; i < 13; i++) {
            if (firstTable.getValueAt(i, 1) == null
                    || firstTable.getValueAt(i, 1).toString().length() == 0) {
                firstTableFull = false;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (secondTable.getValueAt(i, j) == null || secondTable.getValueAt(i, j).toString().length() == 0) {
                    secondTableFull = false;
                }
            }
        }
        if (firstTableFull && secondTableFull) {
            siguienteButton.setEnabled(true);
        } else {
            siguienteButton.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        secondTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        firstTable = new javax.swing.JTable();
        regresarButton = new javax.swing.JButton();
        siguienteButton = new javax.swing.JButton();
        examenLabel = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        secondTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        secondTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"MTD", null, null, null, null},
                {"MTI", null, null, null, null},
                {"MPD", null, null, null, null},
                {"MPI", null, null, null, null},
                {"Atávicos", null, null, null, null},
                {"Marcha", null, null, null, null},
                {"Nistagmo", null, null, null, null},
                {"Dismetria", null, null, null, null},
                {"Disco", null, null, null, null}
            },
            new String [] {
                "", "Fuerza", "Tono", "Trofismo", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        secondTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                secondTableMouseReleased(evt);
            }
        });
        secondTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                secondTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(secondTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 400, 180));

        firstTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {":", null},
                {"I", null},
                {"II", null},
                {"III", null},
                {"IV", null},
                {"V", null},
                {"VI", null},
                {"VII", null},
                {"VIII", null},
                {"IX", null},
                {"X", null},
                {"XI", null},
                {"XII", null}
            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        firstTable.getTableHeader().setReorderingAllowed(false);
        firstTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstTableKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(firstTable);
        if (firstTable.getColumnModel().getColumnCount() > 0) {
            firstTable.getColumnModel().getColumn(0).setResizable(false);
            firstTable.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 27, 155, 234));

        regresarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backImage.png"))); // NOI18N
        regresarButton.setBorderPainted(false);
        regresarButton.setContentAreaFilled(false);
        regresarButton.setFocusPainted(false);
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(regresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 70, 30));

        siguienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nextImage.png"))); // NOI18N
        siguienteButton.setBorder(null);
        siguienteButton.setBorderPainted(false);
        siguienteButton.setContentAreaFilled(false);
        siguienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(siguienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 80, 30));

        examenLabel.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        examenLabel.setText("Examen neurológico");
        getContentPane().add(examenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 240, 50));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/white.jpg"))); // NOI18N
        getContentPane().add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //BOTÓN PARA IR A EXAMEN NEUROLÓGICO
    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        Admin.returnExamenNeurologico();
        dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    public static String[] getFirstTable() { return firstTableData; }
    public static String[][] getSecondTable() { return secondTableData; }
    
    
    private void secondTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secondTableKeyReleased
        enableGuardarButton();
    }//GEN-LAST:event_secondTableKeyReleased

    private void firstTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstTableKeyReleased
        enableGuardarButton();
    }//GEN-LAST:event_firstTableKeyReleased

    private void secondTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondTableMouseClicked
        enableGuardarButton();
    }//GEN-LAST:event_secondTableMouseClicked

    private void secondTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondTableMouseReleased
        enableGuardarButton();
    }//GEN-LAST:event_secondTableMouseReleased

    private String comboBoxToString(String cell)
    {
        switch (cell) {
            case "↑":
                return "Up";
            case "→":
                return "Right";
            case "↓":
                return "Down";
            default:
                return cell;
        }
    }
    
    private void siguienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteButtonActionPerformed
        for(int i=0; i<13; i++)
        {
            if(firstTable.getValueAt(i, 1) == null)
            {
                firstTableData[i] = "null";
            }
            else
            {
                firstTableData[i] = firstTable.getValueAt(i,1).toString();
            }
        }
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<4; j++)
            {
                if(secondTable.getValueAt(i, j+1) == null)
                {
                    secondTableData[i][j] = "null";
                }
                else
                {
                    secondTableData[i][j] = comboBoxToString(secondTable.getValueAt(i, j+1).toString());
                }
            }
        }
        Admin.openExamenNeurologico3();
        dispose();
    }//GEN-LAST:event_siguienteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ExaNeu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExaNeu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExaNeu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExaNeu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExaNeu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel examenLabel;
    private static javax.swing.JTable firstTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton regresarButton;
    private static javax.swing.JTable secondTable;
    private javax.swing.JButton siguienteButton;
    // End of variables declaration//GEN-END:variables
}
