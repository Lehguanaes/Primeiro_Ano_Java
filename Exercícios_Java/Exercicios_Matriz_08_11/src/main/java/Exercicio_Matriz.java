
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

public class Exercicio_Matriz {
    public static void main(String[] args) {
        int i,j;
        double media = 0,contador = 0,soma = 0;
        final int num_linha = 4, num_coluna = 4;
        int [][] mat = new int [num_linha][num_coluna];
        
        JOptionPane.showMessageDialog(null, "Cadastrando dados na Matrix!");
        
        for (i = 0; i < num_linha; i++)
        {
            for (j = 0; j < num_coluna; j++) 
            {
               mat [i] [j] = Integer.parseInt(JOptionPane.showInputDialog("Informe, Valor Linha "+(i+1)+", Coluna "+(j+1)+" : ")) ;
            }
        }
        
        for (i = 0; i < num_linha; i++)
        {
            for (j = 0; j < num_coluna; j++) 
            {
                if (mat [i][j] % 2 == 0)
                {
                soma = soma + mat [i][j]; 
                contador++;
                }
            }
        }
 
        media = soma/contador;
        
        JOptionPane.showMessageDialog(null, "A soma dos números pares é de "+soma);
        
        JOptionPane.showMessageDialog(null, "A média dos números pares é de "+media);
        
    }
}