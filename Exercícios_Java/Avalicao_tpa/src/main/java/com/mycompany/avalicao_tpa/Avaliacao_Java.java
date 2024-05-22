/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avalicao_tpa;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel e Letícia
 */

//Avaliação realizada em dupla!

public class Avaliacao_Java {
    public static void main(String[] args) {
        String senha = "12345", senha_entrada = "";
        double saldo = 0, valor = 0;
        int rept = 0, menu = 0;
        
        saldo = 10000;
        do{
        senha_entrada = JOptionPane.showInputDialog("Qual a senha?");
            if(senha_entrada.equals("12345")){
                rept=1;
            }
            else{
                JOptionPane.showMessageDialog(null, "Senha incorreta. Por favor digite novamente.");
            }
        }
        while (rept==0);
        
        rept=0;
        
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao Banco \n\n Digite 1 para ver seu Saldo \n\n Digite 2 para Sacar. \n\n Digite 3 para Depositar. \n\n Digite 4 para fazer um Empréstimo. \n\n Digite 5 para Finalizar."));
            switch (menu){
                
                case 1:
                    JOptionPane.showMessageDialog(null, "Seu saldo é R$"+saldo);
                    break;
                    
                case 2:
                      
                       while(rept==0){
                       valor = Double.parseDouble(JOptionPane.showInputDialog("Quanto você deseja sacar?"));
                       if (valor<=saldo)
                       {
                           saldo = saldo - valor;
                           JOptionPane.showMessageDialog(null, "Seu saldo é de R$"+saldo);
                           rept =1;
                       }
                       else{
                           JOptionPane.showMessageDialog(null, "Seu saldo é de R$"+saldo+" por isso, você não pode realizar esse saque");
                           rept= Integer.parseInt(JOptionPane.showInputDialog("Caso não queira sacar digite 1 \n Caso queira informar outro valor para sacar digite 0"));
                       }
                       }
                    break;
                    
                      
                case 3:
                       valor = Double.parseDouble(JOptionPane.showInputDialog("Quanto você deseja depositar?")); 
                           saldo = saldo + valor;
                           JOptionPane.showMessageDialog(null, "Seu saldo é de R$"+saldo);
                       break;   
                
                case 4:
                     valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do emprestimo desejado? \n Lembrete: ao realizarmos um emprestimo você receberá 5% a menos")); 
                     
                     valor= valor - (valor*0.05);
                     saldo = saldo + valor;
                     JOptionPane.showMessageDialog(null, "Você recebeu R$"+valor+" de emprestimo \n Seu saldo atual é R$"+saldo);
                    break;
                case 5:
                    break;
                
                    default:
                       JOptionPane.showMessageDialog(null, "Opção invalida");  
            }
            rept = 0;
        }
        while (menu != 5);
    }
}