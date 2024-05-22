/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia
 */

import javax.swing.JOptionPane;

public class Exercicio_Tres {
    public static void main(String[] args) {
        
        int vezes = 0;
        
         for(int numero=100; numero<=125; numero++)
        {
           if ((numero%5)==0)
            vezes++;    
        }
        JOptionPane.showMessageDialog(null,vezes+" números são divisiveis por 5 neste intervalo");    
    }
}
