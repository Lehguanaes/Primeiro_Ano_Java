
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

public class Exemplo_Nove {
    public static void main(String[] args) {
        int x,y; 
        int [][] mat = {{1,42,23,14,51},{22,32,55,54,12}};
        
        JOptionPane.showMessageDialog(null, "Imprimindo números pares da Matriz!");
        
        for (x = 0; x < 2; x++) 
         {
           for (y = 0; y < 5; y++) 
           {
             if (mat [x][y] % 2 == 0)
             {
                 System.out.print( mat [x] [y] + " ");
             }
             else
                 System.out.print(" - ");
         } 
         
        System.out.print("\n");
        
       }
    }  
}
