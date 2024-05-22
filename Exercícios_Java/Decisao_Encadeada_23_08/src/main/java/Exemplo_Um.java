/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

import javax.swing.JOptionPane;

public class Exemplo_Um {
    public static void main(String[] args) {
        
        String pais = " ", estado = " ", cidade = " ", bairro = " ";
        
        pais = JOptionPane.showInputDialog ("Informe o país: ");
        estado = JOptionPane.showInputDialog ("Informe o estado: ");
        cidade = JOptionPane.showInputDialog ("Informe o cidade: ");
        bairro = JOptionPane.showInputDialog ("Informe o bairro: ");
        
        if (pais.equals("Brazil"))
        {
            if (estado.equals("Bahia"))
            {
                if (cidade.equals("Salvador"))
                {
                    if (bairro.equals("Nhocuné"))
                    {
                        JOptionPane.showMessageDialog(null, "Este bairro possui 5.000 habitantes");
                    }
                }
                    
                
            }
        }
    }
    
}