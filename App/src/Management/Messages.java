/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import javax.swing.JOptionPane;


public class Messages {
    
    public void warningMessage(String title, String text)
    {
        ;
    }
    
    public void informationMessage(String title, String text)
    {
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void errorMesage(String title, String text)
    {
        JOptionPane.showMessageDialog(null, text, title,JOptionPane.ERROR_MESSAGE);
    }
    
    
}
