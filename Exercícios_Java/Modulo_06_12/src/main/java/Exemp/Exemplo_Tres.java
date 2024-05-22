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
public class Exemplo_Tres {
    public static void main(String[] args) {
    int idade_um, idade_dois;
    String nome_um, nome_dois;
    
    nome_um = JOptionPane.showInputDialog("Digite o nome da 1° pessoa:");
    idade_um = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1° pessoa: "));
    
    nome_dois = JOptionPane.showInputDialog("Digite o nome da 2° pessoa:");
    idade_dois = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2° pessoa: "));
    
    String texto = pessoaMaisVelha(nome_um, idade_um, nome_dois, idade_dois);
    JOptionPane.showMessageDialog(null, texto);
     }
      static String pessoaMaisVelha(String n1, int id1, String n2, int id2)
    {
       if (id1>id2)
           return n1 +" é a pessoa mais velha";
       else
           if (id1<id2)
           return n2 +" é a pessoa mais velha";
       else
            return n1+ " e " +n2+ " tem a mesma idade";
    }
}