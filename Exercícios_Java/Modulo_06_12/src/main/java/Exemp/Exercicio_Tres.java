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
public class Exercicio_Tres {
     public static void main(String[] args) 
    {
        String sexo;
        double altura, peso;
        
        sexo = JOptionPane.showInputDialog("Digite o seu sexo (Masculino ou Feminino), por favor: ");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite, em metros, a sua altura:"));
        peso = CalcularPesoIdeal(altura, sexo);
        
        JOptionPane.showMessageDialog(null, "O seu peso ideal é: "+peso+"kg.");
    }
     
    static double CalcularPesoIdeal(double altura, String sexo)
    {
        double peso = 0;
        if(sexo.equals("Masculino"))
                peso = (72.7*altura)-58;
 
        else if(sexo.equals("Feminino"))
            peso = (62.1*altura)-44.7;
        
        else
             JOptionPane.showMessageDialog(null, "Informações inválidas. Coloque-as corretamente.");
        
        return peso;
    }   
}
