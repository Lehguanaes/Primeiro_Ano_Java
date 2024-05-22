

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

import javax.swing.JOptionPane;

public class Exemplo_Dois {
    public static void main(String[] args) {
      
        String pais = " ", estado = " ", cidade = " ", bairro = " ";
        
        pais = JOptionPane.showInputDialog ("Informe o país: ");
        estado = JOptionPane.showInputDialog ("Informe o estado: ");
        cidade = JOptionPane.showInputDialog ("Informe o cidade: ");
        bairro = JOptionPane.showInputDialog ("Informe o bairro: ");
        
        if (!pais.equals("Brazil"))
        {
           JOptionPane.showMessageDialog(null, "País errado!");
        }
        else
        {
            if (!estado.equals("Bahia"))
            { 
                JOptionPane.showMessageDialog(null, "Estado errado!");
            }
            else {
                
                if (!cidade.equals("Salvador"))
                {
                    JOptionPane.showMessageDialog(null, "Cidade errado!");
                }
                else {
                    
                    if (!bairro.equals("Nhocuné"))
                    {
                       JOptionPane.showMessageDialog(null, "Bairro errado!");
                     }
                    else { 
                        JOptionPane.showMessageDialog(null, "Este bairro possui 5.000 habitantes");
                   
                    }
                    
                
                 }
            }
        }
    
    }
}