/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import app.Ant;
import app.AntEdit;
import app.Datos;
import app.Evo;
import app.ExaFis;
import app.ExaNeu;
import app.ExaNeu2;
import app.ExaNeu2Edit;
import app.ExaNeu3;
import app.TodosPacientes;
import com.mysql.jdbc.PreparedStatement;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class SQLStatements {
    
    //private static String datos[];
    

    public static boolean update(String table, String[] values)
    {
        TodosPacientes tP = new TodosPacientes();
        boolean works;
        Connection connection = SQLConnection.getSQLConnection();
        try {
            String sentence = "SELECT * FROM " + table; 
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sentence);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            String newColumn[] = new String[columnCount-1];
            for(int i=2; i<=columnCount; i++)
            {
                newColumn[i-2] = rsmd.getColumnName(i);
            }
            
            //Cambiar newColumn por columns
        sentence = "UPDATE " + table + " SET ";
        for(int i=0; i<newColumn.length; i++)
        {
            sentence = sentence + newColumn[i];
            sentence = sentence + "=?";
            if(i != newColumn.length-1)
            {
                sentence = sentence + ",";
            }
        }
        sentence = sentence + " WHERE " + rsmd.getColumnName(1) + " = " + tP.getID();
        System.out.println(sentence);
            
        ps = (PreparedStatement) connection.prepareStatement(sentence);
            for(int i=0; i<values.length; i++){
                ps.setString(i+1, values[i]);
                
            }  
            int res = ps.executeUpdate();
            if(res>0)
                works = true;
                //JOptionPane.showMessageDialog(null, "Datos actualizados con éxito", "Datos actualizados", JOptionPane.INFORMATION_MESSAGE);
            else
                //JOptionPane.showMessageDialog(null, "Ha ocurrido un error al actualizar los datos", "Error",JOptionPane.ERROR_MESSAGE);
                works = false;
            connection.close();
        } catch (SQLException ex) {
            //Logger.getLogger(SQLStatements.class.getName()).log(Level.SEVERE, null, ex);
            works = false;
        }
        return works;
    }
    
   
    
    public static void insert(String table,String columns,String values)
    {
        Connection connection = SQLConnection.getSQLConnection();
        String sentence = "INSERT INTO " + table + " (" + columns + ") VALUES (" + values + ")";
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sentence);
            int res = ps.executeUpdate();
            if(res>0)
                JOptionPane.showMessageDialog(null, "El paciente ha sido registrado con éxito", "Paciente guardado", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar el registrar al paciente", "Error",JOptionPane.ERROR_MESSAGE);
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLStatements.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public static PreparedStatement insertIntoDatos(Connection con) throws SQLException
    {
        Datos datos = new Datos();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO datos (Nombre,Fecha,Edad,Sexo,Telefono,Correo,Domicilio,Motivo) VALUES (?,?,?,?,?,?,?,?)");
        ps.setString(1, datos.getNombre());
        ps.setDate(2, Date.valueOf(datos.getFecha()));
        ps.setString(3, datos.getEdad());
        ps.setString(4, datos.getSexo());
        ps.setString(5, datos.getTelefono());
        ps.setString(6, datos.getCorreo());
        ps.setString(7, datos.getDomicilio());
        ps.setString(8, datos.getMotivo());
        return ps;
    }
    
    public static PreparedStatement insertIntoAntecedentes(Connection con) throws SQLException
    {
        Ant antecedentes = new Ant();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO antecedentes (Diabetes,Hipertension,Obesidad,Tabaquismo,Alcoholismo,Drogas,Otro) VALUES (?,?,?,?,?,?,?)");
        ps.setString(1, antecedentes.getDiabetes());
        ps.setString(2, antecedentes.getHipertension());
        ps.setString(3, antecedentes.getObesidad());
        ps.setString(4, antecedentes.getTabaquismo());
        ps.setString(5, antecedentes.getAlcoholismo());
        ps.setString(6, antecedentes.getDrogas());
        ps.setString(7, antecedentes.getOtro());
        return ps;
    }
    
    public static PreparedStatement insertIntoExamenFisico(Connection con) throws SQLException
    {
        ExaFis examenFisico = new ExaFis();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO examen_fisico (Cardiovascular,Respiratorio,Gastrointestinal,Genito_urinario,Musculo_esqueletico,Piel) VALUES (?,?,?,?,?,?)");
        ps.setString(1, examenFisico.getCardio());
        ps.setString(2, examenFisico.getRespiratorio());
        ps.setString(3, examenFisico.getGastrointestinal());
        ps.setString(4, examenFisico.getGenito());
        ps.setString(5, examenFisico.getMusculo());
        ps.setString(6, examenFisico.getPiel());
        return ps;
    }
    
    public static PreparedStatement insertIntoExamenNeurologico(Connection con) throws SQLException
    {
        ExaNeu examenNeurologico = new ExaNeu();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO examen_neurologico (Alerta,Atencion,Percepcion,Plan_Ejec,Lenguaje,Emocion) VALUES (?,?,?,?,?,?)");
        ps.setString(1, examenNeurologico.getAlerta());
        ps.setString(2, examenNeurologico.getAtencion());
        ps.setString(3, examenNeurologico.getPercepcion());
        ps.setString(4, examenNeurologico.getPlan());
        ps.setString(5, examenNeurologico.getLenguaje());
        ps.setString(6, examenNeurologico.getEmocion());
        return ps;
    }
    
    public static PreparedStatement insertIntoExNeTablas1(Connection con) throws SQLException
    {
        ExaNeu2 ex2 = new ExaNeu2();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO exnetablas1 (First,I,II,III,IV,V,VI,VII,VIII,IX,X,XI,XII) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
        for(int i=0; i<13; i++)
        {
            ps.setString(i+1,  ex2.getFirstTable()[i]);
        }
        return ps;
    }
    
    public static PreparedStatement updateTabla1(Connection con) throws SQLException
    {
        ExaNeu2Edit exaNeu2Edit = new ExaNeu2Edit();
        TodosPacientes tP = new TodosPacientes();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement("Update exnetablas1 SET First=?,I=?,II=?,III=?,IV=?,V=?,VI=?,VII=?,VIII=?,IX=?,X=?,XI=?,XII=? WHERE Id_Tabla1 = ?");
        for(int i=0; i<13; i++)
        {
            ps.setString(i+1,  exaNeu2Edit.getFirstTable()[i]);
        }
        ps.setString(14, tP.getID());
        return ps;
    }
    
    public static PreparedStatement updateExaNeu2(Connection con) throws SQLException
    {
        ExaNeu2Edit exaNeu2Edit = new ExaNeu2Edit();
        TodosPacientes tP = new TodosPacientes();
        String statement = "";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement("UPDATE exnetablas2 SET MTD=?,MTI=?,MPD=?,MPI=?,Atavicos=?,Marcha=?,Nistagmo=?,Dismetria=?,Disco=? where Id_Tabla2=?");
        for(int i = 0; i < 9; i++) 
        {
            for(int j=0; j<4; j++)
            { 
                if(j < 3)
                {
                    statement = statement + exaNeu2Edit.getSecondTable()[i][j] + ",";
                }
                else
                {
                    statement = statement + exaNeu2Edit.getSecondTable()[i][j];
                }
            }
            ps.setString(i+1, statement);
            statement = "";
        }
        ps.setString(10, tP.getID());
        return ps;
    }
    
    
    
    public static PreparedStatement insertIntoExNeTablas2(Connection con) throws SQLException
    {
        ExaNeu2 ex2 = new ExaNeu2();
        String statement = "";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO exnetablas2 (MTD,MTI,MPD,MPI,Atavicos,Marcha,Nistagmo,Dismetria,Disco) VALUES (?,?,?,?,?,?,?,?,?)");
        for(int i = 0; i < 9; i++) 
        {
            for(int j=0; j<4; j++)
            { 
                if(j < 3)
                {
                    statement = statement + ex2.getSecondTable()[i][j] + ",";
                }
                else
                {
                    statement = statement + ex2.getSecondTable()[i][j];
                }
            }
            ps.setString(i+1, statement);
            statement = "";
        }
        return ps;
    }
    
    public static PreparedStatement insertIntoMonitos(Connection con) throws SQLException
    {
        ExaNeu3 ex3 = new ExaNeu3();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO monitos (MuniecaIzquierda,MuniecaDerecha,CodoIzquierdo,CodoDerecho,"
                                                         +"RodillaIzquierda,RodillaDerecha,TobilloIzquierdo,TobilloDerecho) VALUES (?,?,?,?,?,?,?,?)");
        ps.setString(1, ex3.getMuniecaIzquierda());
        ps.setString(2, ex3.getMuniecaDerecha());
        ps.setString(3, ex3.getCodoIzquierdo());
        ps.setString(4, ex3.getCodoDerecho());
        ps.setString(5, ex3.getRodillaIzquierda());
        ps.setString(6, ex3.getRodillaDerecha());
        ps.setString(7, ex3.getTobilloIzquierdo());
        ps.setString(8, ex3.getTobilloDerecho());
        return ps;
    }
    
    public static PreparedStatement insertIntoEvolucion(Connection con) throws SQLException
    {
        Evo evolucion = new Evo();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO evolucion (MMSE,EDSS,IP,BICAMS,QHPT,BECK,RAO,AVC,MSQOL)"
                                                                       + "VALUES (?,?,?,?,?,?,?,?,?)");
        ps.setString(1, evolucion.getMmse());
        ps.setString(2, evolucion.getEdss());
        ps.setString(3, evolucion.getIp());
        ps.setString(4, evolucion.getBicams());
        ps.setString(5, evolucion.getQhpt());
        ps.setString(6, evolucion.getBeck());
        ps.setString(7, evolucion.getRao());
        ps.setString(8, evolucion.getAvc());
        ps.setString(9, evolucion.getMsqol());
        return ps;
    }
    
    
    public static PreparedStatement insertIntoEvolucionFecha(Connection con) throws SQLException
    {
        Evo evolucion = new Evo();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO evolucion_fecha (mmseFecha,edssFecha,ipFecha,bicamsFecha,qhptFecha,beckFecha,raoFecha,avcFecha,msqolFecha)"
                                                                       + "VALUES (?,?,?,?,?,?,?,?,?)");
        ps.setDate(1, Date.valueOf(evolucion.getMmseFecha()));
        ps.setDate(2, Date.valueOf(evolucion.getEdssFecha()));
        ps.setDate(3, Date.valueOf(evolucion.getIpFecha()));
        ps.setDate(4, Date.valueOf(evolucion.getBicamsFecha()));
        ps.setDate(5, Date.valueOf(evolucion.getQhptFecha()));
        ps.setDate(6, Date.valueOf(evolucion.getBeckFecha()));
        ps.setDate(7, Date.valueOf(evolucion.getRaoFecha()));
        ps.setDate(8, Date.valueOf(evolucion.getAvcFecha()));
        ps.setDate(9, Date.valueOf(evolucion.getMsqolFecha()));
        return ps;
    }
    
    
}
