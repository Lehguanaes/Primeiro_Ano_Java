
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 
 * @author Letícia Guanaes Moreira
 */

public class Desafio {
    public static void main(String[] args) {
        int i,j;
        String nomes [] = new String [10];
        double media [] = new double [10];
        double soma [] = new double [10];
        final int num_linha = 5, num_coluna = 3;
        double [][] notas = new double [num_linha][num_coluna];
        
        for (i = 0; i < num_linha; i++)
        {
            nomes [i] = JOptionPane.showInputDialog("Informe o nome do "+(1+i)+ "° aluno: ");
        }
        
        for (i = 0; i < num_linha; i++)
        {
            for (j = 0; j < num_coluna; j++) 
            {
               notas [i] [j] = Integer.parseInt(JOptionPane.showInputDialog("Informe a "+(j+1)+"° nota de "+nomes[i]+ " :")) ;
               soma [i] = soma [i] + notas [i][j];   
            } 
            media [i] = (soma[i]/3);
        }       
 
        System.out.println("ALUNO \t\t\t NOTAS  \t\t\t MÉDIA ");
        
        for (i = 0; i < num_linha; i++)
        {
           
             System.out.print(nomes [i]+"\t\t");
            for (j = 0; j < num_coluna; j++) 
            {
                System.out.print(notas[i][j]+"\t");
            }
            if (media[i]<7)
            System.out.println("\t"+media[i]+"*");
            else
            System.out.println("\t"+media[i]);
        }
    }
}
