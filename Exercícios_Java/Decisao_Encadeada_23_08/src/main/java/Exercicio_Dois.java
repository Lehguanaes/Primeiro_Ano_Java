/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Guanaes Moreira
 */


import javax.swing.JOptionPane;

public class Exercicio_Dois {
    public static void main(String[] args) {
        
        double peso = 0, altura = 0, imc = 0;
        
        peso = Double.parseDouble(JOptionPane.showInputDialog ("Por favor, em quilos, informe o seu peso: ")); 
        altura = Double.parseDouble(JOptionPane.showInputDialog ("Por favor, em metros, informe o sua altura: ")); 
        
        imc = peso / (altura * altura);
        
        if (imc<18)
        {
            JOptionPane.showMessageDialog(null, "Seu imc é de "+imc+ ", sua classificação é Magreza.");
        }
        
        else if ((imc>=18)&&(imc<=24.9))
                {
                  JOptionPane.showMessageDialog(null, "Seu imc é de "+imc+ ", sua classificação é Saudável.");  
                }
        
        else if ((imc>=25)&&(imc<=29.9))
                {
                  JOptionPane.showMessageDialog(null, "Seu imc é de "+imc+ ", sua classificação é Sobrepeso.");  
                }
        
        else if (imc>=30)
                {
                  JOptionPane.showMessageDialog(null, "Seu imc é de "+imc+ ", sua classificação é Obesidade.");  
                }
        
    }
}
