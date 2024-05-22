/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

import javax.swing.JOptionPane;

public class Exercicio_Dois {
    public static void main(String[] args) {
        
       int numero = 0, vezes = 0; 
        
       numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o número "));
       
       for (vezes=0; vezes<=10; vezes++)
       {     
           System.out.println(numero+"*"+vezes+"="+numero*vezes);
       }
             
    }
}
