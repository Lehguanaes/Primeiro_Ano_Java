/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
*
* @author Leticia Guanaes Moreira
*/
import javax.swing.JOptionPane;

public class AvaliacaoAva {
     public static void main(String[] args) {
         
        double emprestimo = 0, saque = 0, deposito = 0, saldo = 10000;
        int op = 0;
        
        double senha = Double.parseDouble(JOptionPane.showInputDialog("Digite a senha:"));
        
        if(senha==12345){
            
            while(op!=5){
                op = Integer.parseInt(JOptionPane.showInputDialog("1-Saldo \n "+"2-Saque\n "+"3-Deposito\n "+"4-Emprestimo\n "+"5-finalizar"));

                switch(op){
                    case 1:
                        JOptionPane.showMessageDialog(null, "Seu saldo é : "+saldo);
                        break;

                    case 2:
                     saque= Double.parseDouble( JOptionPane.showInputDialog(null, "Quanto você quer sacar?"));
                     if(saldo>=saque){
                         saldo=saldo-saque;
                           JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso");
                     }
                     else{JOptionPane.showMessageDialog(null, "Saldo insuficiente");}
                     break;

                    case 3:
                        deposito= Double.parseDouble( JOptionPane.showInputDialog(null, "Quanto você deseja depositar"));
                        saldo=saldo+deposito;
                        JOptionPane.showMessageDialog(null, "Deposito efetuado com sucesso");
                        break;

                    case 4:
                        emprestimo= Double.parseDouble( JOptionPane.showInputDialog(null, "Digite o valor do emprestimo"));
                        saldo=saldo+(emprestimo -(emprestimo*0.05));
                         JOptionPane.showMessageDialog(null, "Emprestimo efetuado com sucesso com taxação de 5%");
                        break;

                    case 5:
                         JOptionPane.showMessageDialog(null, "Operação finalizadas");
                        break;

                    default: JOptionPane.showMessageDialog(null, "Valor invalido");
                }
            }
        }
        
        else
        JOptionPane.showMessageDialog(null, "Senha Invalida");
    }
}