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

public class Exercicio_cinco {
    
    public static void main(String[] args) {

      Scanner input = new Scanner (System.in);
      
      double custo_espetaculo, custo_ingresso, calculo;
      
      System.out.println("Por favor,informe o custo total para o espetáculo: ");
      custo_espetaculo= input.nextDouble();

      System.out.println("Por favor,informe o valor para o ingresso do espetáculo: ");
      custo_ingresso= input.nextDouble();
    
      calculo = custo_espetaculo/custo_ingresso;
      
        System.out.println("O para cobrir o custo total dos gastos, você deverá vender "+calculo+
                " ingressos para o espetaculo.");
    

    }
    
}
