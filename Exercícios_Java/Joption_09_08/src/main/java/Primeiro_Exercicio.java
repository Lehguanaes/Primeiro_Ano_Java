/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia Guanaes Moreira
 */

import javax.swing.JOptionPane;

public class Primeiro_Exercicio {
    
    public static void main(String[] args) {
        
        double dias, anos, meses, calculo;
        
         anos = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite sua idade em anos, excluindo dias e meses."));         
         
         meses = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite sua idade em meses, excluindo dias e anos."));
         
         dias = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite sua idade em dias, excluindo anos e meses."));
         
         calculo = (anos * 365) + (meses * 30) + dias;
         
         
       JOptionPane.showMessageDialog (null,"Sua idade em dias é: " +calculo);
    }
    
}
