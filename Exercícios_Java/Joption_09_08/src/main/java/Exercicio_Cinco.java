/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia  Guanaes Moreira
 */

import javax.swing.JOptionPane; 

public class Exercicio_Cinco {
    
    public static void main(String[] args) {
        
        double salario_minimo = 1000,salario_usuario, calculo;
        
        salario_usuario = Double.parseDouble(JOptionPane.showInputDialog("Por favor, informe o seu salário: "));
        
        calculo = salario_usuario/salario_minimo;
        
         JOptionPane.showMessageDialog (null,"Esse valor equivale a : " +calculo+" salários mínimos. ");
        
    }
    
}
