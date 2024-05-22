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
        
        double saldo, calculo;
        
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Por favor, em reais, informe o seu saldo: "));
        
        calculo = (saldo/100) + saldo;
        
        JOptionPane.showMessageDialog (null,"O resultado após 1% de juros, em reais, é : " +calculo );
        
    }
}
