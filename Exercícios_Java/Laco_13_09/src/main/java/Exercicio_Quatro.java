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
        
        int numero_inicial = 0, numero_final = 0, numeros_impares = 0;
           
        numero_inicial = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o número inicial"));
        numero_final= Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o número final"));
        
        while (numero_inicial<=numero_final)
        {
            if ((numero_inicial%2)!=0)
            {
            numeros_impares+=numero_inicial;
            numero_inicial++;  
            }
            else 
            numero_inicial++;
        }
        
         JOptionPane.showMessageDialog(null,"A soma dos números impares desse intervalo é de "+(numeros_impares));    
   
    }
    
}
