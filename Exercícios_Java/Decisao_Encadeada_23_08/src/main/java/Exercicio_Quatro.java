/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia
 */


import javax.swing.JOptionPane;

public class Exercicio_Quatro {
    public static void main(String[] args) {
          
        int mes = 0;
        
       mes = Integer.parseInt(JOptionPane.showInputDialog ("Por favor, digite o número do mês: "));
        
         switch (mes) {
            
            case 1:               
                JOptionPane.showMessageDialog(null,"Esse é o mês de Janeiro");                   
            break;
         case 2:               
                JOptionPane.showMessageDialog(null,"Esse é o mês de Fevereiro");                   
            break;
             case 3:               
                JOptionPane.showMessageDialog(null,"Esse é o mês de Março");                   
            break;
             case 4:               
                JOptionPane.showMessageDialog(null,"Esse é o mês de Abril");                   
            break;
             case 5:               
                JOptionPane.showMessageDialog(null,"Esse é o mês de Maio");                   
            break;
            case 6:               
                JOptionPane.showMessageDialog(null,"Esse é o mês de Junho");                   
            break;
            case 7:               
                JOptionPane.showMessageDialog(null,"Esse é o mês de Julho");                   
            break;
            case 8:               
                JOptionPane.showMessageDialog(null,"Esse é o mês de Agosto");                   
            break;
            case 9:               
                JOptionPane.showMessageDialog(null,"Esse é o mês de Setembro");                   
            break;
            case 10:               
                JOptionPane.showMessageDialog(null,"Esse é o mês de Outubro");                   
            break;
            case 11:               
                JOptionPane.showMessageDialog(null,"Esse é o mês de Novembro");                   
            break;
            case 12:               
                JOptionPane.showMessageDialog(null,"Esse é o mês de Dezembro");                   
            break;
             default:              
                JOptionPane.showMessageDialog(null,"Existem apenas doze meses");                   
            break;
         }
    } 
}
