
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Exercicio_Dois {
    public static void main(String[] args) {
        int i,j;
        int soma [] = new int [3];
        final int num_linha = 3, num_coluna = 5;
        int [][] mat = new int [num_linha][num_coluna];
        
        JOptionPane.showMessageDialog(null, "Cadastrando dados na Matrix!");
        
        for (i = 0; i < num_linha; i++)
        {
            for (j = 0; j < num_coluna; j++) 
            {
               mat [i] [j] = Integer.parseInt(JOptionPane.showInputDialog("Informe, Valor Linha "+(i+1)+", Coluna "+(j+1)+" : ")) ;
               soma[i]=soma[i]+mat[i][j];
            }
        }
        
        for (i = 0; i < num_linha; i++)
            {
             JOptionPane.showMessageDialog(null, "A soma da "+(1+i)+"° linha é de "+soma[i]);
            }
    }   
}
