
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia Guanaes Moreira
 */
public class Exercicio_Dois {
    public static void main(String[] args) {
         int [] Vetor_Um = new  int[10];
         int [] Vetor_Dois = new  int[10];
         int i;
           
        for ( i = 0; i < 10; i++)
             Vetor_Um [i]= Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+" ° numero: ")); 
          
        for ( i = 0; i < 10; i++)
             Vetor_Dois [9-i] = Vetor_Um [i];
            
         System.out.println("Vetor Um:");
         
         for ( i = 0; i < 10; i++)
            System.out.println("Indice "+i+" numero: " +Vetor_Um[i]);
          
         System.out.println("Vetor Dois:");
         
         for ( i = 0; i < 10; i++)
            System.out.println("Indice "+i+" numero: " +Vetor_Dois[i]);
        
    }
}
