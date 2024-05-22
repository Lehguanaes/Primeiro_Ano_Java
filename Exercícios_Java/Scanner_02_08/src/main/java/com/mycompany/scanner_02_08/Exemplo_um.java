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

public class Exemplo_um {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double bs, al,ar;
        
        System.out.println("Digite a base do retângulo: ");
       bs = input.nextDouble();
        System.out.println("Digite a altura do retângulo: ");  
        al = input.nextDouble();
        ar = bs*al;
        System.out.println("A área do retângulo é: "+ar);
        
    }
           
          
          
           
          
    
}
