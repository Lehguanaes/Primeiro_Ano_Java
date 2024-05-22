/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia Guanaes Moreira
 */

import javax.swing.JOptionPane;
 
public class Exercicio_Seis {
    
    public static void main(String[] args) {
        
        int numero;
        
         numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
         
         -- numero;
         
         JOptionPane.showMessageDialog (null,"O antecessor a esse numero é "+numero);
          
         ++ numero;
         ++ numero;
        
          JOptionPane.showMessageDialog (null,"O sucessor a esse numero é " +numero);
    }
}
