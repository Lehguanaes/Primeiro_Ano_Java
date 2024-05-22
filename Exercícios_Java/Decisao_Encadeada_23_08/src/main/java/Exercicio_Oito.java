/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia
 */


import javax.swing.JOptionPane;

public class Exercicio_Oito {
    public static void main(String[] args) {
        
        double a = 0, b = 0, c = 0;
        
        a = Double.parseDouble(JOptionPane.showInputDialog ("Por favor, informe o 1° número: ")); 
        b = Double.parseDouble(JOptionPane.showInputDialog ("Por favor, informe o 2° número: ")); 
        c = Double.parseDouble(JOptionPane.showInputDialog ("Por favor, informe o 3° número: ")); 
        
        if (a==b)
        {
            if ((a==c) && (a+b>c))
            {
            JOptionPane.showMessageDialog(null, "Este triângulo é equilatero");
            }
            else if (a+b>c)
            {
               JOptionPane.showMessageDialog(null, "Este triângulo é isósceles"); 
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Estes números não compõem um triângulo");
            }
        }
        else if ((a==c)&&(a+b>c))
        {
            JOptionPane.showMessageDialog(null, "Este triângulo é isósceles");
        }
        else if ((b==c)&&(a+b>c))
       {
            JOptionPane.showMessageDialog(null, "Este triângulo é isósceles"); 
       }
        else if (a+b>c)
        {
            JOptionPane.showMessageDialog(null, "Este triângulo é escaleno");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Estes números não compõem um triângulo");
        }
    }
}
