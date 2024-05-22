/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemp;

/**
 *
 * @author Leticia Guanaes Moreira
 */

import javax.swing.JOptionPane;
public class Exemplo_Dois {
    public static void main(String[] args) {
        int t ;
        String p;
        p = digite();
        t = tamanho(p);
        JOptionPane.showMessageDialog(null, p+" Possui "+t+" caracteres");
    }
     static String digite()
    {
        return JOptionPane.showInputDialog("Digite uma palavra ");
    }
      static int tamanho(String x)
    {
       return x.length();            
    }  
}
