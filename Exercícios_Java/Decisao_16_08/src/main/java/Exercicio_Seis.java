/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

import javax.swing.JOptionPane;

public class Exercicio_Seis {
    public static void main(String[] args) {
        
        int ano_nascimento, calculo;
                
        ano_nascimento = Integer.parseInt (JOptionPane.showInputDialog ("Digite o seu ano de nascimento: "));
        
        calculo = 2023 - ano_nascimento;
        
        if (calculo>=18)
        {
             JOptionPane.showMessageDialog(null, "Como você nasceu em "+ano_nascimento+",  já atingiu a maior idade");      
        }
        
        else
        {
             JOptionPane.showMessageDialog(null, "Como você nasceu em "+ano_nascimento+",  ainda não atingiu a maior idade");      
        }
        
    }
    
}
