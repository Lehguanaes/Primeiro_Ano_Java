/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia
 */


import javax.swing.JOptionPane;

public class Exercicio_Sete {
    public static void main(String[] args) {
        
       int dia_um = 0, mes_um = 0, ano_um = 0, dia_dois = 0, mes_dois = 0, ano_dois = 0;
         
       dia_um = Integer.parseInt(JOptionPane.showInputDialog ("Por favor, digite o dia da 1° data: "));
       mes_um = Integer.parseInt(JOptionPane.showInputDialog ("Por favor, digite o mês da 1° data: "));
       ano_um = Integer.parseInt(JOptionPane.showInputDialog ("Por favor, digite o ano da 1° data: "));
       dia_dois = Integer.parseInt(JOptionPane.showInputDialog ("Por favor, digite o dia da 2° data: "));
       mes_dois = Integer.parseInt(JOptionPane.showInputDialog ("Por favor, digite o mês da 2° data: "));
       ano_dois = Integer.parseInt(JOptionPane.showInputDialog ("Por favor, digite o ano da 2° data:"));
        
       if (ano_um>ano_dois)
       {
          JOptionPane.showMessageDialog(null, "Em ordem crescente: "+dia_dois+"/"+mes_dois+"/"+ano_dois+", "+dia_um+"/"+mes_um+"/"+ano_um);  
       }
       else if (ano_um<ano_dois)
       {
          JOptionPane.showMessageDialog(null, "Em ordem crescente: "+dia_um+"/"+mes_um+"/"+ano_um+", "+dia_dois+"/"+mes_dois+"/"+ano_dois);  
       }
       else if (mes_um>mes_dois)
       {
          JOptionPane.showMessageDialog(null, "Em ordem crescente: "+dia_dois+"/"+mes_dois+"/"+ano_dois+", "+dia_um+"/"+mes_um+"/"+ano_um);    
       }
       else if (mes_um<mes_dois)
       {
          JOptionPane.showMessageDialog(null, "Em ordem crescente: "+dia_um+"/"+mes_um+"/"+ano_um+", "+dia_dois+"/"+mes_dois+"/"+ano_dois);    
       }
       else if (dia_um>dia_dois)
       {
          JOptionPane.showMessageDialog(null, "Em ordem crescente: "+dia_dois+"/"+mes_dois+"/"+ano_dois+", "+dia_um+"/"+mes_um+"/"+ano_um);      
       }
       else if (dia_um<dia_dois)
       {
          JOptionPane.showMessageDialog(null, "Em ordem crescente: "+dia_um+"/"+mes_um+"/"+ano_um+", "+dia_dois+"/"+mes_dois+"/"+ano_dois);      
       }
       else
       {
        JOptionPane.showMessageDialog(null, "As datas são iguais");         
       }
    }
}