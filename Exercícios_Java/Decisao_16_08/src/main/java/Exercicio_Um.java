/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

import javax.swing.JOptionPane;

public class Exercicio_Um {
    
    public static void main(String[] args) {
        
        double altura = 0, calculo_feminino, calculo_masculino;      
        int sexo = 0;
        
        sexo = Integer.parseInt (JOptionPane.showInputDialog ("Digite 1 se o sexo for Feminino ou 2 para Masculino: "));
        altura = Double.parseDouble (JOptionPane.showInputDialog ("Digite sua altura: "));
        
        if (sexo==1)
        {
            calculo_feminino = (62.1*altura)-44.7;
            
            JOptionPane.showMessageDialog(null, "O seu peso ideal seria: "+calculo_feminino);
            
        }    
        
        if (sexo==2)
        {
            calculo_masculino = (72.7*altura)-58;
            
            JOptionPane.showMessageDialog(null, "O seu peso ideal seria: "+calculo_masculino);
            
        }    
                
        if (sexo>=3)
        {
            JOptionPane.showMessageDialog(null, "A opção digitada esta incorreta: sexo invalido.");
        }     
         
    }
}
