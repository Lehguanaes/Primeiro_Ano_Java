

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia Guanaes Moreira
 */

import javax.swing.JOptionPane;

public class Exercicio_Cinco {
    public static void main(String[] args) {
        
        double nota_um = 0, nota_dois = 0, nota_tres = 0, nota_quatro = 0, media;
        
        nota_um = Double.parseDouble(JOptionPane.showInputDialog ("Por favor, informe a 1° nota do aluno: ")); 
        nota_dois = Double.parseDouble(JOptionPane.showInputDialog ("Por favor, informe a 2° nota do aluno: ")); 
        nota_tres = Double.parseDouble(JOptionPane.showInputDialog ("Por favor, informe a 3° nota do aluno: ")); 
        nota_quatro = Double.parseDouble(JOptionPane.showInputDialog ("Por favor, informe a 4° nota do aluno: ")); 
        
        media = (nota_um+nota_dois+nota_tres+nota_quatro)/4;
        
        if (media>=9)
        {
            JOptionPane.showMessageDialog(null, "O aluno está aprovado com média "+media);
        }
        
        else if ((media>=7)&&(media<9))
                {
                  JOptionPane.showMessageDialog(null, "O aluno está aprovado com média "+media);  
                }
        
        else if ((media>=5)&&(media<7))
                {
                  JOptionPane.showMessageDialog(null, "O aluno está aprovado com média "+media);  
                }
        
       else if ((media>=2.5)&&(media<5))
                {
                  JOptionPane.showMessageDialog(null, "O aluno está reprovado com média "+media);  
                }
        else if (media<2.5)
                {
                  JOptionPane.showMessageDialog(null, "O aluno está reprovado com média "+media);  
                }
    }
}
