/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia
 */


import javax.swing.JOptionPane;

public class Exercicio_Tres {
    public static void main(String[] args) {
        
        int lanche = 0;
        
        lanche = Integer.parseInt(JOptionPane.showInputDialog ("Digite o número do lanche escolhido: 1.BigMac 2.Quarteirão 3.MacChicken 4.CheddarMacMelt 5.MacMax "));
        
         switch (lanche) {
            
            case 1:               
                JOptionPane.showMessageDialog(null,"Você escolheu o BigMac");                   
            break;
         case 2:               
                JOptionPane.showMessageDialog(null,"Você escolheu o Quarteirão");                   
            break;
             case 3:               
                JOptionPane.showMessageDialog(null,"Você escolheu o MacChicken");                   
            break;
             case 4:               
                JOptionPane.showMessageDialog(null,"Você escolheu o CheddarMacMelt");                   
            break;
             case 5:               
                JOptionPane.showMessageDialog(null,"Você escolheu o MacMax");                   
            break;
             default:              
                JOptionPane.showMessageDialog(null,"Opção invalida!");                   
            break;
         }
    } 
}
