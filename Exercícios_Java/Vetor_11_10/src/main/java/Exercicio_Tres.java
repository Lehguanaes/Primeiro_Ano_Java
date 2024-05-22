
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia Guanaes Moreira
 */

public class Exercicio_Tres {
    public static void main(String[] args) {
        String [] nomes = new  String [8];
        double [] medias = new  double[8];
        double nota_um = 0;
        double nota_dois = 0;
        int i;
        
        for ( i = 0; i < 8; i++)
           nomes [i] = JOptionPane.showInputDialog("Digite o nome do "+(i+1)+" ° aluno (a): ");    
        
        for ( i = 0; i < 8; i++) 
        {
            nota_um = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota do aluno (a) "+(nomes[i])+" :"));    
            nota_dois = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota do aluno (a) "+(nomes[i])+" :")); 
            
            medias [i] = ((nota_um + nota_dois)/2);
        }
        
        for ( i = 0; i < 8; i++) 
            System.out.println("O aluno (a) "+(nomes[i])+" tem média de "+medias[i]);
    }  
}
