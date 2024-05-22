/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia
 */

import javax.swing.JOptionPane;

public class Exercicio_Cinco {
    public static void main(String[] args) {
        
        int numero_inicial = 0, numero_final = 0;
        
        numero_inicial = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o número inicial"));
        numero_final= Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o número final"));
        
        while(numero_final>=numero_inicial)
        {
            if ((numero_final%2)==0)
            {
            System.out.println(""+numero_final);
            numero_final--;
            }  
            else 
            numero_final--;
        } 
    }
}
