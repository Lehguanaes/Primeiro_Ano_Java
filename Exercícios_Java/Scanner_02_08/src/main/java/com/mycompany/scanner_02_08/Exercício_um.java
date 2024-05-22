/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scanner_02_08;

/**
 *
 * @author Letícia Guanaes Moreira
 */

import java.util.Scanner;

public class Exercício_um {
    public static void main(String[] args) {
        
         Scanner input = new Scanner (System.in);
         
         double base_maior, base_menor,altura, calculo;
         
         System.out.println("Por favor, informe o valor da base maior do "
                 + "trapézio em centímetros: ");
         base_maior = input.nextDouble();
         
         System.out.println("Por favor, informe o valor da base menor do "
                 + "trapézio em centímetros: ");
         base_menor = input.nextDouble();
         
         System.out.println("Por favor, informe o valor da altura do "
                 + "trapézio em centímetros: ");
         altura = input.nextDouble();
         
         calculo = ((base_maior + base_menor)*altura)/2;
                 
          System.out.println("A área do trapézio é de "+calculo+" centímetros quadrados");
         
    }
    
}
