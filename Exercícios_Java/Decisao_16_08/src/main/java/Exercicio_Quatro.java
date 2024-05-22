/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */


import javax.swing.JOptionPane;

public class Exercicio_Quatro {
    
    public static void main(String[] args) {
        
        double quilos_pescados, multa;
        
        quilos_pescados = Double.parseDouble (JOptionPane.showInputDialog ("Por favor, informe quantos quilos de peixe foram pescados: "));
        
        if (quilos_pescados>50)
        {
            multa = (quilos_pescados - 50)*4;
            
             JOptionPane.showMessageDialog(null, "Você pescou "+quilos_pescados+" quilos, sua multa é de R$ "+multa);
        }
        else
        {
          JOptionPane.showMessageDialog(null, "Você pescou "+quilos_pescados+" quilos, não excedeu o limite de 50 quilos por pessoa");      
        }
}
}