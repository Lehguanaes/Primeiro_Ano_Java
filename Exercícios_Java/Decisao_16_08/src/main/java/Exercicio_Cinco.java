/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */



import javax.swing.JOptionPane;

public class Exercicio_Cinco {
    
    public static void main(String[] args) {
        
        String senha;
        
        senha = JOptionPane.showInputDialog("Por favor, informe sua senha: ");
       
        if (senha.equals("123"))
        {
             JOptionPane.showMessageDialog(null, "Senha válida! ");
        }
       
       else
       {
             JOptionPane.showMessageDialog(null, "A senha: "+senha+", está inválida!");
       }
    }
    
}
