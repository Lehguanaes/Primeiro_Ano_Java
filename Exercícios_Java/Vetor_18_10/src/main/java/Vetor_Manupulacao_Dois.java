
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

public class Vetor_Manupulacao_Dois {
    public static void main(String[] args) {
        int [] numeros = new int [5];
        int auxiliar = 0;
        
            for (int i = 0; i < 5; i++) 
            numeros [i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o "+(i+1)+" ° número:"));
        
            System.out.println("Ordenação de Números");
            
            for (int i = 0; i < 4; i++) 
            {
                
                for (int j = i+i; j < 5; j++) 
                {
                    
                    if (numeros [i]>numeros[j])
                    {
                       auxiliar = numeros [i];
                       numeros [i] = numeros [j];
                       numeros [j] = auxiliar;     
                    }
 
                } 
           } 
       
            for (int i = 0; i < 10; i++) 
            System.out.println(i+1+"° número - "+numeros[i]);  
    }
}
