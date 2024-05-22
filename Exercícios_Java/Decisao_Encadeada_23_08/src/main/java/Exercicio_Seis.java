

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia
 */


import javax.swing.JOptionPane;

public class Exercicio_Seis {
    public static void main(String[] args) {
        
       int idade = 0;
        
       idade = Integer.parseInt(JOptionPane.showInputDialog ("Por favor, digite sua idade: "));
       
        if ((idade>=5)&&(idade<7))
                {
                  JOptionPane.showMessageDialog(null, "O nadador está na categoria Infantil A");  
                }
        else if ((idade>=8)&&(idade<10))
                {
                  JOptionPane.showMessageDialog(null, "O nadador está na categoria Infantil B");  
                }
        else if ((idade>=11)&&(idade<13))
                {
                  JOptionPane.showMessageDialog(null, "O nadador está na categoria Juvenil A");  
                }
        else if ((idade>=14)&&(idade<17))
                {
                  JOptionPane.showMessageDialog(null, "O nadador está na categoria Juvenil B");  
                }
        else if (idade>=18)
                {
                  JOptionPane.showMessageDialog(null, "O nadador está na categoria Senior");  
                }
    }
    
}
