
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Exercicio_Tres {
    public static void main(String[] args) {
        int i,j;
        String produto [] = new String [10];
        double preço [] = new double [10];
        double numero_pesquisado= 0;
        final int num_linha = 10;
        
        JOptionPane.showMessageDialog(null, "Seja bem-vindo!");
        
        for (i = 0; i < num_linha; i++)
        {
            produto [i] = JOptionPane.showInputDialog("Digite o nome do "+(1+i)+ "° produto: ");
            preço [i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do "+(1+i)+ "° produto: "));
        }
        
       numero_pesquisado = Integer.parseInt(JOptionPane.showInputDialog("Insira o número a ser pesquisado:"));  
        
        System.out.println("Os produtos disponiveis até esse valor são:");
      
       for (i = 0; i < num_linha; i++)
        {
            if (preço [i] <= numero_pesquisado)
            {
                System.out.println(produto[i]+" - "+preço[i]);
            }
        } 
    }   
}