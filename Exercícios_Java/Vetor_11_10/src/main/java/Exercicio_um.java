
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia Guanaes Moreira
 */
public class Exercicio_um {
    public static void main(String[] args) {
         int [] numeros = new  int[15];
         int i;
           
        for ( i = 0; i < 15; i++)
            numeros [i]= Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+" ° numero: ")); 
        
         for ( i = 0; i < 15; i++)
         {
             if (i % 2 == 0)
             {
            System.out.println("Indice "+i+" numero: " +numeros[i]);
             }
        }
    }
    
}
