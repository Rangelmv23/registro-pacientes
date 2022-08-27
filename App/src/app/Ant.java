/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Management.Admin;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author hp
 */
public class Ant extends javax.swing.JFrame {
    
    // Creates new form antecedentes
    public Ant() {
        initComponents();
        setImages();
        setActionCommands();
        Datos datos = new Datos();
        System.out.println("Nombre: "+datos.getNombre());
        this.repaint();
        enableBtnSiguiente();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hiperBG = new javax.swing.ButtonGroup();
        diabetesBG = new javax.swing.ButtonGroup();
        obesidadBG = new javax.swing.ButtonGroup();
        tabaquismoBG = new javax.swing.ButtonGroup();
        alcoholismoBG = new javax.swing.ButtonGroup();
        drogasBG = new javax.swing.ButtonGroup();
        lblDiabetes = new javax.swing.JLabel();
        lblHiper = new javax.swing.JLabel();
        lblObesidad = new javax.swing.JLabel();
        lblTaba = new javax.swing.JLabel();
        lblAlco = new javax.swing.JLabel();
        lblDroga = new javax.swing.JLabel();
        diabetesSiRB = new javax.swing.JRadioButton();
        diabetesNoRB = new javax.swing.JRadioButton();
        hiperSiRB = new javax.swing.JRadioButton();
        hiperNoRB = new javax.swing.JRadioButton();
        obesidadSiRB = new javax.swing.JRadioButton();
        obesidadNoRB = new javax.swing.JRadioButton();
        tabaquismoSiRB = new javax.swing.JRadioButton();
        tabaquismoNoRB = new javax.swing.JRadioButton();
        alcoholismoSiRB = new javax.swing.JRadioButton();
        alcoholismoNoRB = new javax.swing.JRadioButton();
        drogasSiRB = new javax.swing.JRadioButton();
        drogasNoRB = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        otroTF = new javax.swing.JTextField();
        antecedentesLabel = new javax.swing.JLabel();
        siguienteButton = new javax.swing.JButton();
        regresarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        gTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        aTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cTF = new javax.swing.JTextField();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDiabetes.setText("Diabetes");
        getContentPane().add(lblDiabetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 91, -1, -1));

        lblHiper.setText("Hipertensión");
        getContentPane().add(lblHiper, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 136, -1, -1));

        lblObesidad.setText("Obesidad");
        getContentPane().add(lblObesidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 186, -1, -1));

        lblTaba.setText("Tabaquismo");
        getContentPane().add(lblTaba, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 240, -1, -1));

        lblAlco.setText("Alcoholismo");
        getContentPane().add(lblAlco, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 290, -1, -1));

        lblDroga.setText("Drogas");
        getContentPane().add(lblDroga, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 341, -1, -1));

        diabetesBG.add(diabetesSiRB);
        diabetesSiRB.setText("Sí");
        diabetesSiRB.setNextFocusableComponent(diabetesNoRB);
        diabetesSiRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                diabetesSiRBMouseReleased(evt);
            }
        });
        getContentPane().add(diabetesSiRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 87, -1, -1));

        diabetesBG.add(diabetesNoRB);
        diabetesNoRB.setText("No");
        diabetesNoRB.setNextFocusableComponent(hiperSiRB);
        diabetesNoRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                diabetesNoRBMouseReleased(evt);
            }
        });
        getContentPane().add(diabetesNoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 87, -1, -1));

        hiperBG.add(hiperSiRB);
        hiperSiRB.setText("Sí");
        hiperSiRB.setNextFocusableComponent(hiperNoRB);
        hiperSiRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hiperSiRBMouseReleased(evt);
            }
        });
        getContentPane().add(hiperSiRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 132, -1, -1));

        hiperBG.add(hiperNoRB);
        hiperNoRB.setText("No");
        hiperNoRB.setNextFocusableComponent(obesidadSiRB);
        hiperNoRB.setOpaque(false);
        hiperNoRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hiperNoRBMouseReleased(evt);
            }
        });
        getContentPane().add(hiperNoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 132, -1, -1));

        obesidadBG.add(obesidadSiRB);
        obesidadSiRB.setText("Sí");
        obesidadSiRB.setNextFocusableComponent(obesidadNoRB);
        obesidadSiRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                obesidadSiRBMouseReleased(evt);
            }
        });
        getContentPane().add(obesidadSiRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 182, -1, -1));

        obesidadBG.add(obesidadNoRB);
        obesidadNoRB.setText("No");
        obesidadNoRB.setNextFocusableComponent(tabaquismoSiRB);
        obesidadNoRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                obesidadNoRBMouseReleased(evt);
            }
        });
        getContentPane().add(obesidadNoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 182, -1, -1));

        tabaquismoBG.add(tabaquismoSiRB);
        tabaquismoSiRB.setText("Sí");
        tabaquismoSiRB.setNextFocusableComponent(tabaquismoNoRB);
        tabaquismoSiRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabaquismoSiRBMouseReleased(evt);
            }
        });
        getContentPane().add(tabaquismoSiRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 236, -1, -1));

        tabaquismoBG.add(tabaquismoNoRB);
        tabaquismoNoRB.setText("No");
        tabaquismoNoRB.setNextFocusableComponent(alcoholismoSiRB);
        tabaquismoNoRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabaquismoNoRBMouseReleased(evt);
            }
        });
        getContentPane().add(tabaquismoNoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 236, -1, -1));

        alcoholismoBG.add(alcoholismoSiRB);
        alcoholismoSiRB.setText("Sí");
        alcoholismoSiRB.setNextFocusableComponent(alcoholismoNoRB);
        alcoholismoSiRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                alcoholismoSiRBMouseReleased(evt);
            }
        });
        getContentPane().add(alcoholismoSiRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 286, -1, -1));

        alcoholismoBG.add(alcoholismoNoRB);
        alcoholismoNoRB.setText("No");
        alcoholismoNoRB.setNextFocusableComponent(drogasSiRB);
        alcoholismoNoRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                alcoholismoNoRBMouseReleased(evt);
            }
        });
        getContentPane().add(alcoholismoNoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 286, -1, -1));

        drogasBG.add(drogasSiRB);
        drogasSiRB.setText("Sí");
        drogasSiRB.setNextFocusableComponent(drogasNoRB);
        drogasSiRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                drogasSiRBMouseReleased(evt);
            }
        });
        getContentPane().add(drogasSiRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 337, -1, -1));

        drogasBG.add(drogasNoRB);
        drogasNoRB.setText("No");
        drogasNoRB.setNextFocusableComponent(otroTF);
        drogasNoRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                drogasNoRBMouseReleased(evt);
            }
        });
        getContentPane().add(drogasNoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 337, -1, -1));

        jLabel7.setText("Otro");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 405, -1, -1));

        otroTF.setToolTipText("");
        otroTF.setNextFocusableComponent(gTF);
        getContentPane().add(otroTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 402, 134, -1));

        antecedentesLabel.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        antecedentesLabel.setText("Antecedentes");
        getContentPane().add(antecedentesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 160, 50));

        siguienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nextImage.png"))); // NOI18N
        siguienteButton.setBorder(null);
        siguienteButton.setBorderPainted(false);
        siguienteButton.setContentAreaFilled(false);
        siguienteButton.setFocusPainted(false);
        siguienteButton.setNextFocusableComponent(regresarButton);
        siguienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(siguienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 90, 30));

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
        getContentPane().add(regresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 80, 30));

        jLabel1.setText("G");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 10, 30));

        gTF.setNextFocusableComponent(pTF);
        getContentPane().add(gTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 30, -1));

        jLabel2.setText("P");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 10, 30));

        pTF.setNextFocusableComponent(aTF);
        getContentPane().add(pTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 30, -1));

        jLabel3.setText("A");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 10, 30));

        aTF.setNextFocusableComponent(cTF);
        getContentPane().add(aTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 30, -1));

        jLabel4.setText("c");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 10, 30));

        cTF.setNextFocusableComponent(siguienteButton);
        getContentPane().add(cTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 30, -1));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/white.jpg"))); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Attributes
    private static String diabetes="";
    private static String hiper="";
    private static String obesidad="";
    private static String tabaquismo="";
    private static String alcoholismo="";
    private static String drogas="";
    private static String otro="";
    private static ArrayList<String> all;
    
        private void setActionCommands()
    {
        diabetesSiRB.setActionCommand("Si");
        diabetesNoRB.setActionCommand("No");
        hiperSiRB.setActionCommand("Si");
        hiperNoRB.setActionCommand("No");
        obesidadSiRB.setActionCommand("Si");
        obesidadNoRB.setActionCommand("No");
        tabaquismoSiRB.setActionCommand("Si");
        tabaquismoNoRB.setActionCommand("No");
        alcoholismoSiRB.setActionCommand("Si");
        alcoholismoNoRB.setActionCommand("No");
        drogasSiRB.setActionCommand("Si");
        drogasNoRB.setActionCommand("No");
    }
    
    private void setImages()
    {
        ClassLoader classLoader = this.getClass().getClassLoader();
        
        ImageIcon image = new ImageIcon(classLoader.getResource("Images/white.jpg"));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(backgroundLabel.getWidth(), backgroundLabel.getHeight(), Image.SCALE_DEFAULT));
        backgroundLabel.setIcon(icon);
        
        image = new ImageIcon(classLoader.getResource("Images/nextImage.png"));
        icon = new ImageIcon(image.getImage().getScaledInstance(siguienteButton.getWidth(), siguienteButton.getHeight(), Image.SCALE_DEFAULT));
        siguienteButton.setIcon(icon);
        
        image = new ImageIcon(classLoader.getResource("Images/backImage.png"));
        icon = new ImageIcon(image.getImage().getScaledInstance(regresarButton.getWidth(), regresarButton.getHeight(), Image.SCALE_DEFAULT));
        regresarButton.setIcon(icon);
    }
    
    //Setters
    public static void setDiabetes(String d) { diabetes = d; }
    public static void setHipertension(String h) { hiper = h; }
    public static void setObesidad(String o) { obesidad = o; }
    public static void setTabaquismo(String t) { tabaquismo = t; }
    public static void setAlcoholismo(String a) { alcoholismo = a; }
    public static void setDrogas(String d) { drogas = d; }
    public static void setOtro(String o) { otro = o; }
    public static void setAll(ArrayList<String> a) { all = a; }
    
    //Getters
    public static String getDiabetes() { return diabetes; }
    public static String getHipertension() { return hiper; }   
    public static String getObesidad() { return obesidad; }
    public static String getTabaquismo() { return tabaquismo; }
    public static String getAlcoholismo() { return alcoholismo; }
    public static String getDrogas() { return drogas; }
    public static String getOtro() { return otro; }
    public static ArrayList<String> getAll() { return all; }
    
    //Clean all
    public static void clean()
    {
        diabetes = null;
        hiper = null;
        obesidad = null;
        tabaquismo = null;
        alcoholismo = null;
        drogas = null;
        otro = null;
    }
   
    public static void fillRadioButtons()
    {
        if("Si".equals(diabetes))
        {
            diabetesSiRB.setSelected(true);
        }
        else
        {
            diabetesNoRB.setSelected(true);
        }
        if("Si".equals(hiper))
        {
            hiperSiRB.setSelected(true);
        }
        else
        {
            hiperNoRB.setSelected(true);
        }
        if("Si".equals(obesidad))
        {
            obesidadSiRB.setSelected(true);
        }
        else
        {
            obesidadNoRB.setSelected(true);
        }
        if("Si".equals(tabaquismo))
        {
            tabaquismoSiRB.setSelected(true);
        }
        else
        {
            tabaquismoNoRB.setSelected(true);
        }
        if("Si".equals(alcoholismo))
        {
            alcoholismoSiRB.setSelected(true);
        }
        else
        {
            alcoholismoNoRB.setSelected(true);
        }
        if("Si".equals(drogas))
        {
            drogasSiRB.setSelected(true);
        }
        else
        {
            drogasNoRB.setSelected(true);
        }
        if(!"".equals(otro))
        {
            otroTF.setText(otro);
        }
    }
    
    public static void enableBtnSiguiente()
    {
        if((diabetesSiRB.isSelected() || diabetesNoRB.isSelected()) &&
                (hiperSiRB.isSelected() || hiperNoRB.isSelected()) &&
                (obesidadSiRB.isSelected() || obesidadNoRB.isSelected()) &&
                (tabaquismoSiRB.isSelected() || tabaquismoNoRB.isSelected()) &&
                (alcoholismoSiRB.isSelected() || alcoholismoNoRB.isSelected()) &&
                (drogasSiRB.isSelected() || drogasNoRB.isSelected()))
        {
            siguienteButton.setEnabled(true);
        }
        else
        {
            siguienteButton.setEnabled(false);
        }
    }
    
    
    private void setGetters()
    {
        diabetes = diabetesBG.getSelection().getActionCommand();
        hiper = hiperBG.getSelection().getActionCommand();
        obesidad = obesidadBG.getSelection().getActionCommand();
        tabaquismo = tabaquismoBG.getSelection().getActionCommand();
        alcoholismo = alcoholismoBG.getSelection().getActionCommand();
        drogas = drogasBG.getSelection().getActionCommand();
        otro = otroTF.getText();
    }
    
    //BOTÓN PARA IR AL EXÁMEN FÍSICO
    private void siguienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteButtonActionPerformed
        setGetters();
        Admin.openExamenFisico();
        dispose();
    }//GEN-LAST:event_siguienteButtonActionPerformed

    //regresarButton
    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        Admin.returnDatos();
        dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void diabetesSiRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diabetesSiRBMouseReleased
        enableBtnSiguiente();
    }//GEN-LAST:event_diabetesSiRBMouseReleased

    private void diabetesNoRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diabetesNoRBMouseReleased
        enableBtnSiguiente();
    }//GEN-LAST:event_diabetesNoRBMouseReleased

    private void hiperSiRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hiperSiRBMouseReleased
        enableBtnSiguiente();
    }//GEN-LAST:event_hiperSiRBMouseReleased

    private void hiperNoRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hiperNoRBMouseReleased
        enableBtnSiguiente();
    }//GEN-LAST:event_hiperNoRBMouseReleased

    private void obesidadSiRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obesidadSiRBMouseReleased
        enableBtnSiguiente();
    }//GEN-LAST:event_obesidadSiRBMouseReleased

    private void obesidadNoRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obesidadNoRBMouseReleased
        enableBtnSiguiente();
    }//GEN-LAST:event_obesidadNoRBMouseReleased

    private void tabaquismoSiRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabaquismoSiRBMouseReleased
        enableBtnSiguiente();
    }//GEN-LAST:event_tabaquismoSiRBMouseReleased

    private void tabaquismoNoRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabaquismoNoRBMouseReleased
        enableBtnSiguiente();
    }//GEN-LAST:event_tabaquismoNoRBMouseReleased

    private void alcoholismoSiRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alcoholismoSiRBMouseReleased
        enableBtnSiguiente();
    }//GEN-LAST:event_alcoholismoSiRBMouseReleased

    private void alcoholismoNoRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alcoholismoNoRBMouseReleased
        enableBtnSiguiente();
    }//GEN-LAST:event_alcoholismoNoRBMouseReleased

    private void drogasSiRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drogasSiRBMouseReleased
        enableBtnSiguiente();
    }//GEN-LAST:event_drogasSiRBMouseReleased

    private void drogasNoRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drogasNoRBMouseReleased
        enableBtnSiguiente();
    }//GEN-LAST:event_drogasNoRBMouseReleased

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Ant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aTF;
    private javax.swing.ButtonGroup alcoholismoBG;
    private static javax.swing.JRadioButton alcoholismoNoRB;
    private static javax.swing.JRadioButton alcoholismoSiRB;
    private javax.swing.JLabel antecedentesLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JTextField cTF;
    private javax.swing.ButtonGroup diabetesBG;
    private static javax.swing.JRadioButton diabetesNoRB;
    private static javax.swing.JRadioButton diabetesSiRB;
    private javax.swing.ButtonGroup drogasBG;
    private static javax.swing.JRadioButton drogasNoRB;
    private static javax.swing.JRadioButton drogasSiRB;
    private javax.swing.JTextField gTF;
    private javax.swing.ButtonGroup hiperBG;
    private static javax.swing.JRadioButton hiperNoRB;
    private static javax.swing.JRadioButton hiperSiRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAlco;
    private javax.swing.JLabel lblDiabetes;
    private javax.swing.JLabel lblDroga;
    private javax.swing.JLabel lblHiper;
    private javax.swing.JLabel lblObesidad;
    private javax.swing.JLabel lblTaba;
    private javax.swing.ButtonGroup obesidadBG;
    private static javax.swing.JRadioButton obesidadNoRB;
    private static javax.swing.JRadioButton obesidadSiRB;
    private static javax.swing.JTextField otroTF;
    private javax.swing.JTextField pTF;
    private javax.swing.JButton regresarButton;
    private static javax.swing.JButton siguienteButton;
    private javax.swing.ButtonGroup tabaquismoBG;
    private static javax.swing.JRadioButton tabaquismoNoRB;
    private static javax.swing.JRadioButton tabaquismoSiRB;
    // End of variables declaration//GEN-END:variables
}
