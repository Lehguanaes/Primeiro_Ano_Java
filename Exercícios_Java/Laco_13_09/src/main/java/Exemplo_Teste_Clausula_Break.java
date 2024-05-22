/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

public class Exemplo_Teste_Clausula_Break {
    public static void main(String[] args) {
        
        char letras []={'A', 'B', 'C', 'D', 'E'};
        int i;
        
        for(i=0;i<letras.length;i++)
         if (letras [i] =='D')   
         {
           break;
         }
        
         System.out.println("Ultimo indice: "+i);
        
    }
    
}
