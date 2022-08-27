/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

//Libraries
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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;



public class DatosEdit<T> extends javax.swing.JFrame {
    
    
    public DatosEdit() {
        initComponents();
        setImages();
        setDate();
        setActionCommands();
        fillFields();
    }
    
    
    private static String nombre="";
    private static String fecha="";
    private static String edad="";
    private static String sexo="";
    private static String telefono="";
    private static String correo="";
    private static String domicilio="";
    private static String motivo="";
    
    private void fillFields()
    {
        Connection con = SQLConnection.getSQLConnection();
        ResultSet rs;
        String datos[] = new String[8];
        TodosPacientes tP = new TodosPacientes();
        try{
        PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT * from datos WHERE Id = ?");
        ps.setString(1, tP.getID());
        rs = ps.executeQuery();
        while(rs.next()){        
             datos[0] = rs.getString("Nombre");
             datos[1] = rs.getString("Fecha");
             datos[2] = rs.getString("Edad");
             datos[3] = rs.getString("Sexo");
             datos[4] = rs.getString("Telefono");
             datos[5] = rs.getString("Correo");
             datos[6] = rs.getString("Domicilio");
             datos[7] = rs.getString("Motivo");
        }
        con.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        String anio="",mes="",dia="";
        int counter = 0;
        for(int i=0; i<datos[1].length() && datos[1].charAt(i) != '-'; i++)
        {
            anio = anio + datos[1].charAt(i);
            counter++;
        }
        counter++;
        for(int i=counter; i<datos[1].length() && datos[1].charAt(i) != '-'; i++)
        {
            mes = mes + datos[1].charAt(i);
            counter++;
        }
        counter++;
        for(int i=counter; i<datos[1].length(); i++)
        {
            dia = dia + datos[1].charAt(i);
        }
        anioCB.setSelectedItem(anio);
        if(mes.charAt(0) == '0');
        {
            mes = String.valueOf(mes.charAt(1));
        }
        if(dia.charAt(0) == '0')
        {
            dia = String.valueOf(dia.charAt(1));
        }
        mesCB.setSelectedIndex(Integer.parseInt(mes)-1);
        diaCB.setSelectedIndex(Integer.parseInt(dia)-1);
        nombreTF.setText(datos[0]);
        edadTF.setText(datos[2]);
        if("H".equals(datos[3])) { hombreRB.setSelected(true);}
        else { mujerRB.setSelected(true); }
        telefonoTF.setText(datos[4]);
        correoTF.setText(datos[5]);
        domicilioTF.setText(datos[6]);
        motivoTA.setText(datos[7]);
    }
    
    private void setImage(String url, JButton button)
    {

        ClassLoader classLoader = this.getClass().getClassLoader();
        ImageIcon image = new ImageIcon(classLoader.getResource(url));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_DEFAULT));
        button.setIcon(icon);
    }
    
    private void setImage(String url, JLabel label)
    {
        ClassLoader classLoader = this.getClass().getClassLoader();
        ImageIcon image = new ImageIcon(classLoader.getResource(url));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
    }

    //Background Images
    private void setImages()
    {
        setImage("Images/backImage2.png",regresarButton);
        setImage("Images/nextImage.png",siguienteButton);
        setImage("Images/white.jpg",backgroundLabel);
        /*ClassLoader classLoader = this.getClass().getClassLoader();
        ImageIcon image = new ImageIcon(classLoader.getResource("Images/backImage2.png"));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(regresarButton.getWidth(), regresarButton.getHeight(), Image.SCALE_DEFAULT));
        regresarButton.setIcon(icon);
        
        image = new ImageIcon(classLoader.getResource("Images/nextImage.png"));
        icon = new ImageIcon(image.getImage().getScaledInstance(siguienteButton.getWidth(), siguienteButton.getHeight(), Image.SCALE_DEFAULT));
        siguienteButton.setIcon(icon);
        
        image = new ImageIcon(classLoader.getResource("Images/white.jpg"));
        icon = new ImageIcon(image.getImage().getScaledInstance(backgroundLabel.getWidth(), backgroundLabel.getHeight(), Image.SCALE_DEFAULT));
        backgroundLabel.setIcon(icon);*/
    }
    
    
    
    
    //Setters
    public static void setNombre(String n) { nombre = n; }
    public static void setFecha(String f) { fecha = f; }
    public static void setEdad(String e) { edad = e; }
    public static void setSexo(String s) { sexo = s; }
    public static void setTelefono(String t) { telefono = t; }
    public static void setCorreo(String c) { correo = c; }
    public static void setDomicilio(String d) { domicilio = d; }
    public static void setMotivo(String m) { motivo = m; }

    //Getters
    public static String getNombre() { return nombre; }
    public static String getFecha() { return fecha; }
    public static String getEdad() { return edad; }
    public static String getSexo() { return sexo; }
    public static String getTelefono() { return telefono; }
    public static String getCorreo() { return correo; }
    public static String getDomicilio() { return domicilio; }
    public static String getMotivo() { return motivo; }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexoBG = new javax.swing.ButtonGroup();
        regresarButton = new javax.swing.JButton();
        siguienteButton = new javax.swing.JButton();
        nombreTF = new javax.swing.JTextField();
        edadTF = new javax.swing.JTextField();
        telefonoTF = new javax.swing.JTextField();
        correoTF = new javax.swing.JTextField();
        domicilioTF = new javax.swing.JTextField();
        diaCB = new javax.swing.JComboBox<>();
        mesCB = new javax.swing.JComboBox<>();
        anioCB = new javax.swing.JComboBox<>();
        datosLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        motivoTA = new javax.swing.JTextArea();
        hombreRB = new javax.swing.JRadioButton();
        mujerRB = new javax.swing.JRadioButton();
        nombreLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        edadLabel = new javax.swing.JLabel();
        sexoLabel = new javax.swing.JLabel();
        telefonoLabel = new javax.swing.JLabel();
        correoLabel = new javax.swing.JLabel();
        domicilioLabel = new javax.swing.JLabel();
        motivoLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regresarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backImage.png"))); // NOI18N
        regresarButton.setToolTipText("");
        regresarButton.setBorder(null);
        regresarButton.setBorderPainted(false);
        regresarButton.setContentAreaFilled(false);
        regresarButton.setFocusPainted(false);
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(regresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 60, 50));

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
        getContentPane().add(siguienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 72, 23));

        nombreTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTFActionPerformed(evt);
            }
        });
        nombreTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreTFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTFKeyTyped(evt);
            }
        });
        getContentPane().add(nombreTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 170, -1));

        edadTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edadTFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadTFKeyTyped(evt);
            }
        });
        getContentPane().add(edadTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 40, -1));

        telefonoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoTFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoTFKeyTyped(evt);
            }
        });
        getContentPane().add(telefonoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 170, -1));

        correoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                correoTFKeyReleased(evt);
            }
        });
        getContentPane().add(correoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 170, -1));

        domicilioTF.setNextFocusableComponent(motivoTA);
        domicilioTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                domicilioTFKeyReleased(evt);
            }
        });
        getContentPane().add(domicilioTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 170, -1));

        getContentPane().add(diaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        mesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" }));
        getContentPane().add(mesCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        getContentPane().add(anioCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        datosLabel.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        datosLabel.setText("Datos Generales");
        getContentPane().add(datosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 210, 50));

        motivoTA.setColumns(20);
        motivoTA.setRows(5);
        motivoTA.setNextFocusableComponent(siguienteButton);
        motivoTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                motivoTAKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(motivoTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 297, 177));

        sexoBG.add(hombreRB);
        hombreRB.setText("Hombre");
        hombreRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hombreRBMouseReleased(evt);
            }
        });
        getContentPane().add(hombreRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 20));

        sexoBG.add(mujerRB);
        mujerRB.setText("Mujer");
        mujerRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mujerRBMouseReleased(evt);
            }
        });
        getContentPane().add(mujerRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 60, 20));

        nombreLabel.setText("Nombre");
        getContentPane().add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 50, 20));

        fechaLabel.setText("Fecha");
        getContentPane().add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 40, 20));

        edadLabel.setText("Edad");
        getContentPane().add(edadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 40, 20));

        sexoLabel.setText("Sexo");
        getContentPane().add(sexoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 40, 20));

        telefonoLabel.setText("Teléfono");
        getContentPane().add(telefonoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 50, 20));

        correoLabel.setText("Correo");
        getContentPane().add(correoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 40, 20));

        domicilioLabel.setText("Domicilio");
        getContentPane().add(domicilioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 20));

        motivoLabel.setText("MOTIVO DE CONSULTA:");
        getContentPane().add(motivoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/white.jpg"))); // NOI18N
        backgroundLabel.setPreferredSize(new java.awt.Dimension(1532, 556));
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 

    private void setActionCommands()
    {
        hombreRB.setActionCommand("H");
        mujerRB.setActionCommand("M");
    }
    
    
    private void setGetters()
    {
        nombre = nombreTF.getText();
        sexo = sexoBG.getSelection().getActionCommand();
        fecha = saveDate(diaCB,mesCB,anioCB);
        edad = edadTF.getText();
        telefono = telefonoTF.getText();
        correo = correoTF.getText();
        domicilio = domicilioTF.getText();
        motivo = motivoTA.getText();
    }
    
    private void setDate()
    {
        for(int i=1; i<32; i++)
        {
            diaCB.addItem(String.valueOf(i));
        }
        for(int i=2019; i>1909; i--)
        {
            anioCB.addItem(String.valueOf(i));
        }
    }
    
    //Enables siguienteButton
    public static void enableSiguienteButton()
    {
        if(nombreTF.getText().length()>0 &&
                edadTF.getText().length()>0 &&
                (hombreRB.isSelected() || mujerRB.isSelected()) &&
                telefonoTF.getText().length()>0 &&
                correoTF.getText().length()>0 &&
                domicilioTF.getText().length()>0 &&
                motivoTA.getText().length()>0)
        {
            siguienteButton.setEnabled(true);
        }
        else
        {
            siguienteButton.setEnabled(false);
        }
    }
      
    
    
    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        Admin.openMenu();
        dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    
    //BOTÓN SIGUIENTE
    private void siguienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteButtonActionPerformed

        setGetters();
        Messages message = new Messages();
        String table = "datos";
        String[] values = new String[] {
            nombre,fecha,edad,sexo,telefono,correo,domicilio,motivo
        };
        SQLStatements statement = new SQLStatements();
        if(statement.update(table,values))
            message.informationMessage("Datos actualizados", "Datos actualizados con éxito");
        else
            message.errorMesage("Error", "Ha ocurrido un error al actualizar los datos");
        Admin.openDatosConsult();
        dispose();
    }//GEN-LAST:event_siguienteButtonActionPerformed

    private String saveDate(JComboBox dayCB, JComboBox monthCB, JComboBox yearCB)
    {
        String month;
        String day;
        
        //Para agregarle el 0 y que se pueda guardar en la base de datos
        if(monthCB.getSelectedIndex()+1<10){
            month = "0"+String.valueOf(monthCB.getSelectedIndex()+1);
        }
        else
        {
            month = String.valueOf(monthCB.getSelectedIndex()+1);
        }
        if(dayCB.getSelectedIndex()+1<10)
        {
            day = "0"+dayCB.getSelectedItem();
        }
        else
        {
            day = (String) dayCB.getSelectedItem();
        }
        return yearCB.getSelectedItem()+"-"+month+"-"+day;
    }
    
    
    
    private void nombreTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTFKeyReleased
        enableSiguienteButton();
    }//GEN-LAST:event_nombreTFKeyReleased

    private void edadTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadTFKeyReleased
        enableSiguienteButton();
    }//GEN-LAST:event_edadTFKeyReleased

    private void mujerRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mujerRBMouseReleased
        enableSiguienteButton();
    }//GEN-LAST:event_mujerRBMouseReleased

    private void hombreRBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hombreRBMouseReleased
        enableSiguienteButton();
    }//GEN-LAST:event_hombreRBMouseReleased

    private void telefonoTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoTFKeyReleased
        enableSiguienteButton();
    }//GEN-LAST:event_telefonoTFKeyReleased

    private void correoTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoTFKeyReleased
        enableSiguienteButton();
    }//GEN-LAST:event_correoTFKeyReleased

    private void domicilioTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_domicilioTFKeyReleased
        enableSiguienteButton();
    }//GEN-LAST:event_domicilioTFKeyReleased

    private void motivoTAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_motivoTAKeyReleased
        enableSiguienteButton();
    }//GEN-LAST:event_motivoTAKeyReleased

    
    
    
    private void nombreTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTFKeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nombreTFKeyTyped

    private void edadTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadTFKeyTyped
        char validar = evt.getKeyChar();
        
        if(!Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_edadTFKeyTyped

    private void telefonoTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoTFKeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_telefonoTFKeyTyped

    private void nombreTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTFActionPerformed

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
            java.util.logging.Logger.getLogger(DatosEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anioCB;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel correoLabel;
    private static javax.swing.JTextField correoTF;
    private javax.swing.JLabel datosLabel;
    private javax.swing.JComboBox<String> diaCB;
    private javax.swing.JLabel domicilioLabel;
    private static javax.swing.JTextField domicilioTF;
    private javax.swing.JLabel edadLabel;
    private static javax.swing.JTextField edadTF;
    private javax.swing.JLabel fechaLabel;
    private static javax.swing.JRadioButton hombreRB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mesCB;
    private javax.swing.JLabel motivoLabel;
    private static javax.swing.JTextArea motivoTA;
    private static javax.swing.JRadioButton mujerRB;
    private javax.swing.JLabel nombreLabel;
    private static javax.swing.JTextField nombreTF;
    private javax.swing.JButton regresarButton;
    private javax.swing.ButtonGroup sexoBG;
    private javax.swing.JLabel sexoLabel;
    private static javax.swing.JButton siguienteButton;
    private javax.swing.JLabel telefonoLabel;
    private static javax.swing.JTextField telefonoTF;
    // End of variables declaration//GEN-END:variables
    
    
}
