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
public class Exemplo_Quatro {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));
        if (RestoPorDois(num) == 0)
            JOptionPane.showMessageDialog(null,"O número é par.");
        else
            JOptionPane.showMessageDialog(null,"O número é ímpar.");
    }
    static int RestoPorDois (int a)
    {
        return a % 2;
    }   
}
