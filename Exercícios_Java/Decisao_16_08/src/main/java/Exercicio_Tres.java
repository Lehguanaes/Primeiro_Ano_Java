/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */


import javax.swing.JOptionPane;

public class Exercicio_Tres {
    
    public static void main(String[] args) {
        
        int numero_um, numero_dois, calculo;
        
        numero_um = Integer.parseInt (JOptionPane.showInputDialog ("Digite o 1° número: "));
        numero_dois = Integer.parseInt (JOptionPane.showInputDialog ("Digite o 2° número: "));
        
        calculo = numero_um + numero_dois;
        
        if (calculo>25)
        {
            JOptionPane.showMessageDialog(null, "A soma é maior que 25.");
        }
        
    }
   
}
