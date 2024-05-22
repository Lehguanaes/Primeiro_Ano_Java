
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Exercicio_Um {
    public static void main(String[] args) {
        int i,j;
        double contador_par = 0, soma_par = 0, media_par = 0, contador_impar = 0, soma_impar = 0, media_impar = 0;
        final int num_linha = 4, num_coluna = 5;
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
                soma_par = soma_par + mat [i][j]; 
                contador_par++;
                }
                else
                {
                soma_impar = soma_impar + mat [i][j]; 
                contador_impar++;
                }
            }
        }
 
        media_par = soma_par/contador_par;
        media_impar = soma_impar/contador_impar;
        
        JOptionPane.showMessageDialog(null,"A quantidade de números pares é de "+contador_par+"\n A soma dos números pares é de "+soma_par+"\n A média dos números pares é de "+media_par);
        JOptionPane.showMessageDialog(null,"A quantidade de números ímpares é de "+contador_impar+"\n A soma dos números ímpares é de "+soma_impar+"\n A média dos números ímpares é de "+media_impar);
    }
}
