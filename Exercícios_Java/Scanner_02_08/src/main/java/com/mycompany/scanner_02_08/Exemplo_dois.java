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


public class Exemplo_dois {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double sl, sb, vh, ht, nd, bn;
        
        bn = 300;
        System.out.println("Informe o valor por hora trabalhada: ");
        vh = input.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        ht = input.nextDouble();
        System.out.println("Informe a quantidade de dependentes: ");
        nd = input.nextDouble();
        sb = vh*ht;
        sl = sb+bn*nd;
        System.out.println("O valor do seu salário bruto é de : "+sb);
        System.out.println("O valor do seu salário líquido é de : "+sl);
    }
    
}
