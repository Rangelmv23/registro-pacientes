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

/**
 *
 * @author hp
 */
public class ExaNeuEdit extends javax.swing.JFrame {

    //Attributes
    private static String alerta="";
    private static String atencion="";
    private static String percep="";
    private static String plan="";
    private static String lenguaje="";
    private static String emocion="";
    private static String texto="";
    
    // Creates new form examenNeurologico
    public ExaNeuEdit() {
        initComponents();
        setImages();
        setActionCommands();
        fillRadioButtons();
        this.repaint();
        this.setLocationRelativeTo(null);
    }

     private void setActionCommands()
    {
        alertaSiRB.setActionCommand("Si");
        alertaNoRB.setActionCommand("No");
        atencionSiRB.setActionCommand("Si");
        atencionNoRB.setActionCommand("No");
        percepSiRB.setActionCommand("Si");
        percepNoRB.setActionCommand("No");
        planSiRB.setActionCommand("Si");
        planNoRB.setActionCommand("No");
        lenguajeSiRB.setActionCommand("Si");
        lenguajeNoRB.setActionCommand("No");
        emocionSiRB.setActionCommand("Si");
        emocionNoRB.setActionCommand("No");
    }
     
    private void setGetters()
    {
        alerta = alertaBG.getSelection().getActionCommand();
        atencion = atencionBG.getSelection().getActionCommand();
        percep = percepBG.getSelection().getActionCommand();
        plan = planBG.getSelection().getActionCommand();
        lenguaje = lenguajeBG.getSelection().getActionCommand();
        emocion = emocionBG.getSelection().getActionCommand();
    }
    
    private void setImages()
    {
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
    
    
    //Setters
    public static void setAlerta(String a) { alerta = a; }
    public static void setAtencion(String a) { atencion = a; }
    public static void setPercepcion(String p) { percep = p; }
    public static void setPlan(String p) { plan = p; }
    public static void setLenguaje(String l) { lenguaje = l; }
    public static void setEmocion(String e) { emocion = e; }
    public static void setTexto(String t) { texto = t; }
    
    //Getters
    public static String getAlerta() { return alerta; }
    public static String getAtencion() { return atencion; }
    public static String getPercepcion() { return percep; }
    public static String getPlan() { return plan; }
    public static String getLenguaje() { return lenguaje; }
    public static String getEmocion() { return emocion; }
    public static String getTexto() { return texto; }
        
    
    public static void fillRadioButtons()
    {
        Connection con = SQLConnection.getSQLConnection();
        ResultSet rs;
        String datos[] = new String[6];
        TodosPacientes tP = new TodosPacientes();
        try{
        PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT * from examen_neurologico WHERE Id_exNe = ?");
        ps.setString(1, tP.getID());
        rs = ps.executeQuery();
        while(rs.next()){         
             datos[0]=rs.getString("Alerta");
             datos[1]=rs.getString("Atencion");
             datos[2]=rs.getString("Percepcion");
             datos[3]=rs.getString("Plan_Ejec");
             datos[4]=rs.getString("Lenguaje");
             datos[5]=rs.getString("Emocion");
        }
        con.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        if("Si".equals(datos[0]))
        {
            alertaSiRB.setSelected(true);
        }
        else
        {
            alertaNoRB.setSelected(true);
        }
        if("Si".equals(datos[1]))
        {
            atencionSiRB.setSelected(true);
        }
        else
        {
            atencionNoRB.setSelected(true);
        }
        if("Si".equals(datos[2]))
        {
            percepSiRB.setSelected(true);
        }
        else
        {
            percepNoRB.setSelected(true);
        }
        if("Si".equals(datos[3]))
        {
            planSiRB.setSelected(true);
        }
        else
        {
            planNoRB.setSelected(true);
        }
        if("Si".equals(datos[4]))
        {
            lenguajeSiRB.setSelected(true);
        }
        else
        {
            lenguajeNoRB.setSelected(true);
        }
        if("Si".equals(datos[5]))
        {
            emocionSiRB.setSelected(true);
        }
        else
        {
            emocionNoRB.setSelected(true);
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

        alertaBG = new javax.swing.ButtonGroup();
        atencionBG = new javax.swing.ButtonGroup();
        percepBG = new javax.swing.ButtonGroup();
        planBG = new javax.swing.ButtonGroup();
        lenguajeBG = new javax.swing.ButtonGroup();
        emocionBG = new javax.swing.ButtonGroup();
        planLabel = new javax.swing.JLabel();
        lenguajeLabel = new javax.swing.JLabel();
        emocionLabel = new javax.swing.JLabel();
        planSiRB = new javax.swing.JRadioButton();
        alertaSiRB = new javax.swing.JRadioButton();
        atencionSiRB = new javax.swing.JRadioButton();
        percepSiRB = new javax.swing.JRadioButton();
        lenguajeSiRB = new javax.swing.JRadioButton();
        emocionSiRB = new javax.swing.JRadioButton();
        alertaNoRB = new javax.swing.JRadioButton();
        atencionNoRB = new javax.swing.JRadioButton();
        percepNoRB = new javax.swing.JRadioButton();
        planNoRB = new javax.swing.JRadioButton();
        lenguajeNoRB = new javax.swing.JRadioButton();
        emocionNoRB = new javax.swing.JRadioButton();
        textoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoTA = new javax.swing.JTextArea();
        siguienteButton = new javax.swing.JButton();
        regresarButton = new javax.swing.JButton();
        examenLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        planLabel1 = new javax.swing.JLabel();
        planLabel3 = new javax.swing.JLabel();
        planLabel2 = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        planLabel.setText("Alerta:");
        getContentPane().add(planLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 20));

        lenguajeLabel.setText("Lenguaje:");
        getContentPane().add(lenguajeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        emocionLabel.setText("Emoción:");
        getContentPane().add(emocionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        planBG.add(planSiRB);
        planSiRB.setText("Sí");
        planSiRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                planSiRBMouseReleased(evt);
            }
        });
        planSiRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planSiRBActionPerformed(evt);
            }
        });
        getContentPane().add(planSiRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        alertaBG.add(alertaSiRB);
        alertaSiRB.setText("Sí");
        alertaSiRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                alertaSiRBMouseReleased(evt);
            }
        });
        getContentPane().add(alertaSiRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        atencionBG.add(atencionSiRB);
        atencionSiRB.setText("Sí");
        atencionSiRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                atencionSiRBMouseReleased(evt);
            }
        });
        getContentPane().add(atencionSiRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        percepBG.add(percepSiRB);
        percepSiRB.setText("Sí");
        percepSiRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                percepSiRBMouseReleased(evt);
            }
        });
        percepSiRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percepSiRBActionPerformed(evt);
            }
        });
        getContentPane().add(percepSiRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        lenguajeBG.add(lenguajeSiRB);
        lenguajeSiRB.setText("Sí");
        lenguajeSiRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lenguajeSiRBMouseReleased(evt);
            }
        });
        lenguajeSiRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lenguajeSiRBActionPerformed(evt);
            }
        });
        getContentPane().add(lenguajeSiRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        emocionBG.add(emocionSiRB);
        emocionSiRB.setText("Sí");
        emocionSiRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                emocionSiRBMouseReleased(evt);
            }
        });
        emocionSiRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emocionSiRBActionPerformed(evt);
            }
        });
        getContentPane().add(emocionSiRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        alertaBG.add(alertaNoRB);
        alertaNoRB.setText("No");
        alertaNoRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                alertaNoRBMouseReleased(evt);
            }
        });
        alertaNoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertaNoRBActionPerformed(evt);
            }
        });
        getContentPane().add(alertaNoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        atencionBG.add(atencionNoRB);
        atencionNoRB.setText("No");
        atencionNoRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                atencionNoRBMouseReleased(evt);
            }
        });
        atencionNoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atencionNoRBActionPerformed(evt);
            }
        });
        getContentPane().add(atencionNoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        percepBG.add(percepNoRB);
        percepNoRB.setText("No");
        percepNoRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                percepNoRBMouseReleased(evt);
            }
        });
        percepNoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percepNoRBActionPerformed(evt);
            }
        });
        getContentPane().add(percepNoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        planBG.add(planNoRB);
        planNoRB.setText("No");
        planNoRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                planNoRBMouseReleased(evt);
            }
        });
        planNoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planNoRBActionPerformed(evt);
            }
        });
        getContentPane().add(planNoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        lenguajeBG.add(lenguajeNoRB);
        lenguajeNoRB.setText("No");
        lenguajeNoRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lenguajeNoRBMouseReleased(evt);
            }
        });
        lenguajeNoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lenguajeNoRBActionPerformed(evt);
            }
        });
        getContentPane().add(lenguajeNoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        emocionBG.add(emocionNoRB);
        emocionNoRB.setText("No");
        emocionNoRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                emocionNoRBMouseReleased(evt);
            }
        });
        emocionNoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emocionNoRBActionPerformed(evt);
            }
        });
        getContentPane().add(emocionNoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        textoLabel.setText("Texto");
        getContentPane().add(textoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        textoTA.setColumns(20);
        textoTA.setRows(5);
        jScrollPane1.setViewportView(textoTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 160, 140));

        siguienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nextImage.png"))); // NOI18N
        siguienteButton.setBorder(null);
        siguienteButton.setBorderPainted(false);
        siguienteButton.setContentAreaFilled(false);
        siguienteButton.setEnabled(false);
        siguienteButton.setFocusPainted(false);
        siguienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(siguienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 100, 30));

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
        getContentPane().add(regresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 100, 30));

        examenLabel.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        examenLabel.setText("Examen neurológico");
        getContentPane().add(examenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 240, 50));

        jLabel6.setText("(Normal)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 50, 20));

        jLabel7.setText("(Normal)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 50, 20));

        jLabel8.setText("(Normal)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 50, 20));

        jLabel9.setText("(Normal)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 50, 20));

        jLabel10.setText("(Normal)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 50, 20));

        jLabel11.setText("(Normal)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 50, 20));

        planLabel1.setText("Planeación/Ejecución:");
        getContentPane().add(planLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 20));

        planLabel3.setText("Atención:");
        getContentPane().add(planLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 20));

        planLabel2.setText("Percepción:");
        getContentPane().add(planLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 20));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/white.jpg"))); // NOI18N
        backgroundImage.setText("jLabel7");
        getContentPane().add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //Clean all
    public static void clean()
    {
        alerta = null;
        atencion = null;
        percep = null;
        plan = null;
        lenguaje = null;
        emocion = null;
        texto = null;
    }
    
    public static void enableSiguienteB()
    {
        if((alertaSiRB.isSelected() || alertaNoRB.isSelected()) &&
                (atencionSiRB.isSelected() || atencionNoRB.isSelected()) &&
                (percepSiRB.isSelected() || percepNoRB.isSelected()) &&
                (planSiRB.isSelected() || planNoRB.isSelected()) &&
                (lenguajeSiRB.isSelected() || lenguajeNoRB.isSelected()) &&
                (emocionSiRB.isSelected() || emocionNoRB.isSelected()))
        {
            siguienteButton.setEnabled(true);
        }
        else
        {
            siguienteButton.setEnabled(false);
        }
    }
    
    //regresarButton
    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        Admin.returnExamenFisico();
        dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    
    //BOTÓN PARA IR A ExNeTABLAS
    private void siguienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteButtonActionPerformed
        setGetters();
        Messages message = new Messages();
        String table = "examen_neurologico";
        String[] values = new String[] {
            alerta,atencion,percep,plan,lenguaje,emocion
        };
        SQLStatements statement = new SQLStatements();
        if(statement.update(table,values))
            message.informationMessage("Datos actualizados", "Datos actualizados con éxito");
        else
            message.errorMesage("Error", "Ha ocurrido un error al actualizar los datos");
        Admin.openConsuExaNe();
        dispose();
    }//GEN-LAST:event_siguienteButtonActionPerformed

    private void alertaNoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertaNoRBActionPerformed
        alerta = "No";
    }//GEN-LAST:event_alertaNoRBActionPerformed

    private void atencionNoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atencionNoRBActionPerformed
        atencion = "No";
    }//GEN-LAST:event_atencionNoRBActionPerformed

    private void percepSiRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percepSiRBActionPerformed
        percep = "Si";
    }//GEN-LAST:event_percepSiRBActionPerformed

    private void percepNoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percepNoRBActionPerformed
        percep = "No";
    }//GEN-LAST:event_percepNoRBActionPerformed

    private void planSiRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planSiRBActionPerformed
        plan = "Si";
    }//GEN-LAST:event_planSiRBActionPerformed

    private void planNoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planNoRBActionPerformed
        plan = "No";
    }//GEN-LAST:event_planNoRBActionPerformed

    private void lenguajeSiRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lenguajeSiRBActionPerformed
        lenguaje = "Si";
    }//GEN-LAST:event_lenguajeSiRBActionPerformed

    private void lenguajeNoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lenguajeNoRBActionPerformed
        lenguaje = "No";
    }//GEN-LAST:event_lenguajeNoRBActionPerformed

    private void emocionSiRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emocionSiRBActionPerformed
        emocion = "Si";
    }//GEN-LAST:event_emocionSiRBActionPerformed

    private void emocionNoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emocionNoRBActionPerformed
        emocion = "No";
    }//GEN-LAST:event_emocionNoRBActionPerformed

    private void alertaSiRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alertaSiRBMouseReleased
        enableSiguienteB();
    }//GEN-LAST:event_alertaSiRBMouseReleased

    private void alertaNoRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alertaNoRBMouseReleased
        enableSiguienteB();
    }//GEN-LAST:event_alertaNoRBMouseReleased

    private void atencionSiRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atencionSiRBMouseReleased
        enableSiguienteB();
    }//GEN-LAST:event_atencionSiRBMouseReleased

    private void atencionNoRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atencionNoRBMouseReleased
        enableSiguienteB();
    }//GEN-LAST:event_atencionNoRBMouseReleased

    private void percepSiRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_percepSiRBMouseReleased
        enableSiguienteB();
    }//GEN-LAST:event_percepSiRBMouseReleased

    private void percepNoRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_percepNoRBMouseReleased
        enableSiguienteB();
    }//GEN-LAST:event_percepNoRBMouseReleased

    private void planSiRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planSiRBMouseReleased
        enableSiguienteB();
    }//GEN-LAST:event_planSiRBMouseReleased

    private void planNoRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planNoRBMouseReleased
        enableSiguienteB();
    }//GEN-LAST:event_planNoRBMouseReleased

    private void lenguajeSiRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lenguajeSiRBMouseReleased
        enableSiguienteB();
    }//GEN-LAST:event_lenguajeSiRBMouseReleased

    private void lenguajeNoRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lenguajeNoRBMouseReleased
        enableSiguienteB();
    }//GEN-LAST:event_lenguajeNoRBMouseReleased

    private void emocionSiRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emocionSiRBMouseReleased
        enableSiguienteB();
    }//GEN-LAST:event_emocionSiRBMouseReleased

    private void emocionNoRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emocionNoRBMouseReleased
        enableSiguienteB();
    }//GEN-LAST:event_emocionNoRBMouseReleased

    
    
    
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
            java.util.logging.Logger.getLogger(ExaNeuEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExaNeuEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExaNeuEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExaNeuEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExaNeuEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup alertaBG;
    private static javax.swing.JRadioButton alertaNoRB;
    private static javax.swing.JRadioButton alertaSiRB;
    private javax.swing.ButtonGroup atencionBG;
    private static javax.swing.JRadioButton atencionNoRB;
    private static javax.swing.JRadioButton atencionSiRB;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.ButtonGroup emocionBG;
    private javax.swing.JLabel emocionLabel;
    private static javax.swing.JRadioButton emocionNoRB;
    private static javax.swing.JRadioButton emocionSiRB;
    private javax.swing.JLabel examenLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup lenguajeBG;
    private javax.swing.JLabel lenguajeLabel;
    private static javax.swing.JRadioButton lenguajeNoRB;
    private static javax.swing.JRadioButton lenguajeSiRB;
    private javax.swing.ButtonGroup percepBG;
    private static javax.swing.JRadioButton percepNoRB;
    private static javax.swing.JRadioButton percepSiRB;
    private javax.swing.ButtonGroup planBG;
    private javax.swing.JLabel planLabel;
    private javax.swing.JLabel planLabel1;
    private javax.swing.JLabel planLabel2;
    private javax.swing.JLabel planLabel3;
    private static javax.swing.JRadioButton planNoRB;
    private static javax.swing.JRadioButton planSiRB;
    private javax.swing.JButton regresarButton;
    private static javax.swing.JButton siguienteButton;
    private javax.swing.JLabel textoLabel;
    private static javax.swing.JTextArea textoTA;
    // End of variables declaration//GEN-END:variables
}
