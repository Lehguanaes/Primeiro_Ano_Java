/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

import javax.swing.JOptionPane;

public class Exercicio_Um {
    public static void main(String[] args) {
        
        double hora_turno = 0;
        
        hora_turno = Double.parseDouble(JOptionPane.showInputDialog ("Digite o horário de inicio do seu turno: ")); 
        
       if ((hora_turno>=5)&&(hora_turno<=12.59))
        {
            JOptionPane.showMessageDialog(null, "O seu turno é o da manhã");
        }
        
       else if ((hora_turno>=13)&&(hora_turno<=20.59))
        {
            JOptionPane.showMessageDialog(null, "O seu turno é o da Tarde");
        }
       
       else if ((hora_turno>=21)&&(hora_turno<=4.59))
        {
            JOptionPane.showMessageDialog(null, "O seu turno é o da Noite");
        }
        
    }
}
    

