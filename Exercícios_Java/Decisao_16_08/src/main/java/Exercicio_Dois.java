/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

import javax.swing.JOptionPane;

public class Exercicio_Dois {
 
    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt (JOptionPane.showInputDialog ("Digite um número e lhe direi se é positivo ou negativo: "));
        
        if (numero>0)
        {
                JOptionPane.showMessageDialog(null, "O número "+numero+" é positivo");
        }
        
        if (numero<0)
        {
                JOptionPane.showMessageDialog(null, "O número "+numero+" é negativo");
        }
            
        if (numero==0)
        {
                JOptionPane.showMessageDialog(null, "O número 0 é neutro");
        }
            
            
    }
}
