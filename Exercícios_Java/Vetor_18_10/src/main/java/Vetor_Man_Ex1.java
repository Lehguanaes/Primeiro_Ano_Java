
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

public class Vetor_Man_Ex1 {
    public static void main(String[] args) {
        String [] nomes = new String [5];
        String nome_pesquisado;
        int marcador = 0;
        
        for (int i = 0; i < 5; i++) 
            nomes [i] = JOptionPane.showInputDialog("Insira o "+(i+1)+" ° nome:");
           
            nome_pesquisado = JOptionPane.showInputDialog("Insira o nome a ser pesquisado:");
        
        for (int i = 0; i < 5; i++) 
        {
            if (nomes [i].equals (nome_pesquisado))
            {
            JOptionPane.showMessageDialog( null, nome_pesquisado+" localizado na "+(i+1)+" ° posição;");
            
            marcador++;   
            }
        }
       
        if (marcador == 0)
         JOptionPane.showMessageDialog( null,  "O nome " +nome_pesquisado+"  não foi encontrado.");
        
        else
         JOptionPane.showMessageDialog( null, "O nome foi encontrado "+marcador+" vezes.");    
    
    }     
}
