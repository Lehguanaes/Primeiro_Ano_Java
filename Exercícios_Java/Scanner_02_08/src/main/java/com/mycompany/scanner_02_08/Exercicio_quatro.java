/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scanner_02_08;

/**
 *
 * @author Leticia Guanaes Moreira
 */

import java.util.Scanner;

public class Exercicio_quatro {
    
    public static void main(String[] args) {
      
        Scanner input = new Scanner (System.in);
        
        double altura_degrau, altura_desejada, calculo;
        
        System.out.println("Por favor, em metros, informe a altura do degrau: ");
        altura_degrau = input.nextDouble();
        
        System.out.println("Por favor, em metros, informe a altura que deseja alcançar: ");
        altura_desejada = input.nextDouble();
        
        calculo = altura_desejada/altura_degrau;
        
       System.out.println("Para alcançar "+altura_desejada+" metros, você deverá subir "+calculo+" degraus.");
        
        
    }
}
