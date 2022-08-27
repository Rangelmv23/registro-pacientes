/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import app.Ant;
import app.ExaNeu2Consult;
import app.ExaNeu3Consult;
import app.DatosConsult;
import app.EvoConsult;
import app.Datos;
import app.Evo;
import app.ExaFis;
import app.ExaNeu;
import app.ExaNeu2;
import app.ExaNeu3;
import app.Laboratorio;
import app.Menu;
import app.TodosPacientes;
import app.ExaFisConsult;
import app.ExaNeuConsult;
import app.AntConsult;
import app.AntEdit;
import app.DatosEdit;
import app.EvoEdit;
import app.ExaFisEdit;
import app.ExaNeu2Edit;
import app.ExaNeu3Edit;
import app.ExaNeuEdit;
import javax.swing.JFrame;


/**
 *
 * @author hp
 */
public class Admin {
    
    //Registro
    private static Menu menu;
    private static Datos datos;
    private static Ant antecedentes;
    private static ExaFis examenFisico;
    private static ExaNeu examenNeurologico;
    private static ExaNeu2 examenNeurologico2;
    private static Laboratorio laboratorio;
    private static ExaNeu3 examenNeurologico3;
    private static Evo evolucion;
    
    //Consult
    private static TodosPacientes todosPacientes;
    private static AntConsult antConsult;
    private static ExaFisConsult conFis;
    private static ExaNeuConsult conNeu;
    private static ExaNeu2Consult conNeu2;
    private static DatosConsult datosConsult;
    private static ExaNeu3Consult conExaNeu3;
    private static EvoConsult consuEvolucion;
    
    //Edit
    private static AntEdit antEdit;
    private static DatosEdit datosEdit;
    private static ExaFisEdit exaFisEdit;
    private static ExaNeuEdit exaNeuEdit;
    private static ExaNeu2Edit exaNeu2Edit;
    private static ExaNeu3Edit exaNeu3Edit;
    private static EvoEdit evoEdit;
    
    //Methods
    
    
    public static void openEvoEdit()
    {
        evoEdit = new EvoEdit();
        evoEdit.setVisible(true);
    }
    
    public static void openExaNeu3Edit()
    {
        exaNeu3Edit = new ExaNeu3Edit();
        exaNeu3Edit.setVisible(true);
    }
    
    public static void openExaNeu2Edit()
    {
        exaNeu2Edit = new ExaNeu2Edit();
        exaNeu2Edit.setVisible(true);
    }
    
    public static void openExaNeuEdit()
    {
        exaNeuEdit = new ExaNeuEdit();
        exaNeuEdit.setVisible(true);
    }
    
    public static void openExaFisEdit()
    {
        exaFisEdit = new ExaFisEdit();
        exaFisEdit.setVisible(true);
    }
    
    public static void openDatosEdit()
    {
        datosEdit = new DatosEdit();
        datosEdit.setVisible(true);
    }
    
    public static void returnDatosConsult()
    {
        datosConsult.setVisible(true);
    }
    
    public static void openAntEdit()
    {
        antEdit = new AntEdit();
        antEdit.setVisible(true);
    }
    
    public static void returnAntConsult()
    {
        antConsult.setVisible(true);
    }
    
    public static void openMenu()
    {
        menu = new Menu();
        menu.setVisible(true);
    }
    
    public static void openDatos()
    {
        datos = new Datos();
        datos.setVisible(true);
    }
    
    public static void returnDatos()
    {
        datos.setVisible(true);
    }
    
    public static void openAntecedentes()
    {
        antecedentes = new Ant();
        antecedentes.setVisible(true);
    }
    
    public static void returnAntecedentes()
    {
        antecedentes.setVisible(true);
    }
    
    public static void openExamenFisico()
    {
        examenFisico = new ExaFis();
        examenFisico.setVisible(true);
    }
    
    public static void returnExamenFisico()
    {
        examenFisico.setVisible(true);
    }
    
    public static void openExamenNeurologico()
    {
        examenNeurologico = new ExaNeu();
        examenNeurologico.setVisible(true);
    }
    
    public static void returnExamenNeurologico()
    {
        examenNeurologico.setVisible(true);
    }
    
    public static void openExamenNeurologico2()
    {
        examenNeurologico2 = new ExaNeu2();
        examenNeurologico2.setVisible(true);
    }
    
    public static void openLaboratorio()
    {
        laboratorio = new Laboratorio();
        laboratorio.setVisible(true);
    }
    
    public static void openTodosPacientes()
    {
        todosPacientes = new TodosPacientes();
        todosPacientes.setVisible(true);
    }
    
    public static void returnTodosPacientes()
    {
        todosPacientes.setVisible(true);
    }
    
    public static void openConsultAntecedentes()
    {
        antConsult = new AntConsult();
        antConsult.setVisible(true);
    }
    
    public static void openConsuExaFi()
    {
        conFis = new ExaFisConsult();
        conFis.setVisible(true);
    }
    
    public static void openConsuExaNe()
    {
        conNeu = new ExaNeuConsult();
        conNeu.setVisible(true);
    }
    
    public static void openConExaNeu2()
    {
        conNeu2 = new ExaNeu2Consult();
        conNeu2.setVisible(true);
    }
    
    public static void openDatosConsult()
    {
        datosConsult = new DatosConsult();
        datosConsult.setVisible(true);
    }
    
    public static void returnExamenNeurologico2()
    {
        examenNeurologico2.setVisible(true);
    }
    
    public static void openExamenNeurologico3()
    {
        examenNeurologico3 = new ExaNeu3();
        examenNeurologico3.setVisible(true);
    }
    
    public static void returnExamenNeurologico3()
    {
        examenNeurologico3.setVisible(true);
    }
    
    public static void openEvolucion()
    {
        evolucion = new Evo();
        evolucion.setVisible(true);
    }
    
    public static void openConExaNeu3()
    {
        conExaNeu3 = new ExaNeu3Consult();
        conExaNeu3.setVisible(true);
    }
    
    public static void openEvoConsult()
    {
        consuEvolucion = new EvoConsult();
        consuEvolucion.setVisible(true);
    }
    
}

