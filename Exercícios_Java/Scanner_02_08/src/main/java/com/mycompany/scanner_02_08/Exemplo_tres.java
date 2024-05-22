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

public class Exemplo_tres {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double dp,s1, s2, s3;
        
         System.out.println("Informe o valor do depósito: ");
         dp = input.nextDouble();
         System.out.println("O seu saldo inicial é de "+dp);
         s1 = dp + ((dp*1)/100);
         s2 = s1 + ((s1*1)/100);
         s3 = s2 + ((s2*1)/100);
         System.out.println("O seu saldo após 3 meses é de "+s3);
    }
    
}
