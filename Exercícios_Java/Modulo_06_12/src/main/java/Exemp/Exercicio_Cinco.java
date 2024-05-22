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
public class Exercicio_Cinco {
    public static void main(String[] args) 
    {
        double altura, base, hipotenusa;
        base = Double.parseDouble(JOptionPane.showInputDialog("Determine o valor da base do triângulo:")); 
        altura = Double.parseDouble(JOptionPane.showInputDialog("Determine o valor da altura do triângulo:")); 
        hipotenusa = calcHipotenusa(base, altura);
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: "+hipotenusa);
    }
    static double calcHipotenusa(double base, double altura)
    {
        double result = Math.sqrt((base*base)+ (altura*altura));
        return result;
    }            
}
