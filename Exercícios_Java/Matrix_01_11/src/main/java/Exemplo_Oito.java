/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

import javax.swing.JOptionPane;
public class Exemplo_Oito {
    public static void main(String[] args) {
        int x,y;
        double [][] mat = {{4.5,5.2},{4.2,1}};
        
         JOptionPane.showMessageDialog(null, "Imprimindo Matriz!");
         
         //Exibindo valores
         
         for (x = 0; x < 2; x++) 
         {
           for (y = 0; y < 2; y++) 
         {
             System.out.println("mat["+x+"]["+y+"] = "+mat [x][y]+" ");
         } 
         } 
    }
}
