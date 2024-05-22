/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

import javax.swing.JOptionPane;

public class Exemplo_Par_Impar {
    public static void main(String[] args) {
        
        int valor;
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe um número"));
        
        if ((valor%2)==0)
            JOptionPane.showMessageDialog(null, "Esse número é par");
        else
            JOptionPane.showMessageDialog(null, "Esse número é Impar");
        
    }
}
