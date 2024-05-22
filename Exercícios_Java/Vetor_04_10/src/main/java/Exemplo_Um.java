
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia Guanaes Moreira
 */
public class Exemplo_Um {
    public static void main(String[] args) {
         String [] nomes = new  String[10];
         int i;
           
        for ( i = 0; i < 10; i++)
            nomes[i]=JOptionPane.showInputDialog("Digite o "+(i+1)+" ° nome:");             
     
        for ( i = 0; i < 10; i++)
            System.out.println((i+1)+" nome: " +nomes[i]);

    }
    
}
