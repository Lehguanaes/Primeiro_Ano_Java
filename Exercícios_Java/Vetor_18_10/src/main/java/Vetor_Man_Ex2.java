
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Vetor_Man_Ex2 {
    public static void main(String[] args) {
        String [] nomes = new String [5];
        String aux = " ";

            for (int i = 0; i < 5; i++)
            {
            nomes [i] = JOptionPane.showInputDialog("Insira o "+(i+1)+" ° nome:");
            }
            
            System.out.println("Ordenação Alfabética");
            
            for (int i = 0; i < 4; i++) 
            {
                for (int j = i+1; j < 5; j++) 
                {
                    if (nomes[i].compareTo(nomes[j])>0) 
                    {
                       aux = nomes [i];
                       nomes [i] =  nomes [j];
                       nomes [j] = aux;
                    }
                }
            }
            
            for (int i = 0; i < 5; i++) 
            System.out.println((i+1)+"° nome - "+nomes[i]);  
    }
}
