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

public class Exercicio_dois {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double reais, dolares, marco_alemao,libra;
        
        System.out.println("Por favor, informe o valor de dinheiro em reais: ");
         reais = input.nextDouble();
         
         dolares = reais/1.80;
         System.out.println("O valor de "+reais+" reais, convertido em dólares é de "+dolares+" dólares");
         
         marco_alemao = reais/2.00;
         System.out.println("O valor de "+reais+" reais, convertido em marco alemão é de "+marco_alemao+ " marco alemão");
         
         libra = reais/1.57;
         System.out.println("O valor de "+reais+" reais, convertido em libras é de "+libra+ " libras");
    }
    
}
