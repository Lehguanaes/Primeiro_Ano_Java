
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sala toda
 */

public class Vetor_Manipulacao {
    public static void main(String[] args) {
        int [] numeros = new int [5];
        int numero_pesquisado;
        int marcador = 0;
        
        for (int i = 0; i < 5; i++) 
            numeros [i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o "+(i+1)+" ° número:"));
           
            numero_pesquisado = Integer.parseInt(JOptionPane.showInputDialog("Insira o número a ser pesquisado:"));
        
        for (int i = 0; i < 5; i++) 
        {
            if (numeros [i] == numero_pesquisado)
            {
            JOptionPane.showMessageDialog( null, numero_pesquisado+" localizado na "+(i+1)+" ° posição");
            
            marcador++;
            }
        }
       
        if (marcador == 0)
         JOptionPane.showMessageDialog( null, "O valor não foi encontrado");
        
        else
         JOptionPane.showMessageDialog( null, "O valor foi encontrado "+marcador+" vezes");    
    }
}
