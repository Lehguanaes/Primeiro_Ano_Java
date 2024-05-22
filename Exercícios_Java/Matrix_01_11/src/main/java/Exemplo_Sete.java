/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sala Toda
 */

import javax.swing.JOptionPane;

public class Exemplo_Sete {
    public static void main(String[] args) {
        int i,j;
        final int num_linha = 4, num_coluna = 4;
        int [][] mat = new int [num_linha][num_coluna];
        
        JOptionPane.showMessageDialog(null, "Cadastrando dados na Matriz!");
        
        //atribuição dos valores na matriz
        
        for (i = 0; i < num_linha; i++)
        {
            for (j = 0; j < num_coluna; j++) 
            {
               mat [i] [j] = Integer.parseInt(JOptionPane.showInputDialog("Informe, Valor Linha "+(i+1)+", Coluna "+(j+1)+" : ")) ;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Exibindo os dados na matriz");
        
         for (i = 0; i < num_linha; i++)
        {
            for (j = 0; j< num_coluna; j++) 
            {
                System.out.print(mat [i] [j]+" ");
            }
                System.out.print("\n");
        }
    }  
}
