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

public class Exercicio_tres {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String nome_funcionario;
        double salario_inicial, vendas, calculo_comissao, salario_final;
      
        System.out.println("Por favor, informe o nome do funcionário: ");
        nome_funcionario = input.nextLine();
        
        System.out.println("Por favor, informe o salário fixo do funcionário: ");
        salario_inicial = input.nextDouble();
        
        System.out.println("Por favor, informe o valor das vendas do funcionário: ");
        vendas = input.nextDouble();
        
        calculo_comissao = vendas * 0.04;
        salario_final = salario_inicial + calculo_comissao;
        
        System.out.println(nome_funcionario +" teve "+vendas+" reais em vendas, ficando com "+calculo_comissao +""
                + " reais de comissão;");
        
        System.out.println("Resultando em "+salario_final+" reais de salário final.");
 }   
}
