/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemp;
/**
 *
 * @author Leticia Guanaes Moreira
 */

import javax.swing.JOptionPane;
public class Exercicio_Um {
     public static void main(String[] args) 
    {
        String aluno;
        double nota_um, nota_dois, media;
        
        aluno = JOptionPane.showInputDialog("Digite o nome do(a) aluno(a): ");
        nota_um = lerNotas("Digite a 1° nota do(a) "+aluno+": ");
        nota_dois = lerNotas("Digite a 2° nota do(a) "+aluno+": ");
        
        media = calcularMedia(nota_um,nota_dois);
        
        if(media<7)
            JOptionPane.showMessageDialog(null,"A média do(a) aluno(a) "+aluno+" é: "+media+"\n O aluno foi reprovado.");
        else
            JOptionPane.showMessageDialog(null, "A média do(a) aluno(a) "+aluno+" é: "+media+"\n O aluno foi aprovado!");
    }
    
    static double lerNotas(String ler)
    {
        return Double.parseDouble(JOptionPane.showInputDialog(ler));
    }
    
    static double calcularMedia(double nota1, double nota2)
    {
        return (nota1+nota2)/2;
    }
}
