/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemp;

/**
 *
 * @author Leticia Guanaes Moreira
 */

import javax.swing.JOptionPane;

public class Exercicio_Quatroo {
    public static void main(String[] args) {
      int numeros;
        while(true){
        numeros = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Soma\n2- Subtração\n3- Divisão\n4- Multiplicação\n5- Resto da Divisão\n6- Dobro\n7-"
            + " Quadrado\n8- Cubo\n9- Raiz Quadrada\n0- Sair\n\n  Digite um número para realizar a operação desejada: "));
        if(numeros == 0)
        {
            JOptionPane.showMessageDialog(null,"Encerrado");
            break;
        }  
         calculos(numeros);
        }
    }
       static void calculos(int calc)
    {
        double result = 0;
        double num_um = 0, num_dois=0;
        num_um = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: "));
        if(calc<6)
           num_dois= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: "));
        
    }
       switch(calc)
    {
        case 1:
        result= num_um + num_dois;
        JOptionPane.showMessageDialog(null,"A soma é " +result);
        break;
        case 2:
        result= num_um - num_dois;
        JOptionPane.showMessageDialog(null,"A subtração é " +result);
        break;
        case 3:
        result= num_um / num_dois;
        JOptionPane.showMessageDialog(null,"A divisão é " +result);
        break;
        case 4:
        result= num_um * num_dois;
        JOptionPane.showMessageDialog(null,"A multiplicação é " +result);
        break;
        case 5:
        result= num_um %num_dois;
        JOptionPane.showMessageDialog(null,"O resto da divisão é " +result);
        break;
        case 6:
        result= num_um * 2;
        JOptionPane.showMessageDialog(null,"O dobro é " +result);
        break;
        case 7:
        result= num_um * num_um;
        JOptionPane.showMessageDialog(null,"O quadrado é " +result);
        break;
        case 8:
        result= num_um * num_um * num_um;
        JOptionPane.showMessageDialog(null,"O cubo é " +result);
        break;
        case 9:
        result=  Math.sqrt(num_um);
        JOptionPane.showMessageDialog(null,"A raiz quadrada é " +result);
        break;
    }    
}