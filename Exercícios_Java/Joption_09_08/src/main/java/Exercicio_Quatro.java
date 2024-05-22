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
        
        Double ipi, valor1,valor2, cod1, cod2, quant1, quant2, calculo;
        
        cod1 = Double.parseDouble(JOptionPane.showInputDialog("Por favor, informe o código da 1°peça: "));
        quant1 = Double.parseDouble(JOptionPane.showInputDialog("Por favor, informe a quantidade escolhida da 1°peça: "));
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Por favor, informe o valor unitario da 1°peça: "));
        
        cod2 = Double.parseDouble(JOptionPane.showInputDialog("Por favor, informe o código da 2°peça: "));       
        quant2 = Double.parseDouble(JOptionPane.showInputDialog("Por favor, informe a quantidade escolhida da 2°peça: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Por favor, informe o valor unitario da 2°peça: "));
        
        ipi = Double.parseDouble(JOptionPane.showInputDialog("Por favor, informe a porcentagem do ipi "));
        
       calculo = (valor1 * quant1)+(valor2*quant2)*(ipi/100+1);
       
       JOptionPane.showMessageDialog (null,"Valor total a ser pago é: " +calculo);
       
       
    }
}
