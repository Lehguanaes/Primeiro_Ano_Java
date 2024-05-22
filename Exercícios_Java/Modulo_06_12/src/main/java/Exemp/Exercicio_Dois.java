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
public class Exercicio_Dois {
     public static void main(String[] args) 
    {
        double valor_um, valor_dois;
        
        valor_um = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° valor:"));
        valor_dois = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° valor:"));
        diferenca(valor_um,valor_dois);
    }
  
    static void diferenca(double valor_um, double valor_dois)
    {
        if (valor_um>valor_dois)
        {
            double result;
            result = valor_um - valor_dois;
            JOptionPane.showMessageDialog(null,"O primeiro valor é maior do que o segundo valor. \n a diferença entre os valores é de: "+result);
        }
        else if(valor_dois>valor_um)
        {    
            double result;
            result = valor_um - valor_dois;
            JOptionPane.showMessageDialog(null,"O primeiro valor é menor do que o segundo valor. \n a diferença entre os valores é de: "+result);
        }
        else
            JOptionPane.showMessageDialog(null, "Os valores são iguais.");
    }
}
