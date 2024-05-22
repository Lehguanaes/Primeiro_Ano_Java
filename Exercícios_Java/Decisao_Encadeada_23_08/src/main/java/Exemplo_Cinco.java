/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

import javax.swing.JOptionPane;

public class Exemplo_Cinco {
    public static void main(String[] args) {
        
        int a = 0, b = 0, c = 0;
        
        a = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 1° número: "));       
        b = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 2° número: "));
        c = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 3° número: "));
     
        if ((a<b) && (a<c))
        {
            if (b<c)
            {
                JOptionPane.showMessageDialog(null, "A sequencia é: " +a+ " - "+b+" - "+c);
            }   
            else 
            {
                JOptionPane.showMessageDialog(null, "A sequencia é: " +a+ " - "+c+" - "+b);
            }
        }    
        
        else if ((b<a) && (b<c))
         {
            if (a<c)
            {
                JOptionPane.showMessageDialog(null, "A sequencia é: " +b+ " - "+a+" - "+c);
            }   
            else 
            {
                JOptionPane.showMessageDialog(null, "A sequencia é: " +b+ " - "+c+" - "+a);
            }
        }    
        else 
        {
            if (a<b)
            {
                JOptionPane.showMessageDialog(null, "A sequencia é: " +c+ " - "+a+" - "+b);
            }   
            else 
            {
                JOptionPane.showMessageDialog(null, "A sequencia é: " +c+ " - "+b+" - "+a);
            }
        }
    }
}
