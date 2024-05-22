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
public class Exemplo_Um {
public static void main(String[] args) {

       int a;

       digite();

       a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

       dobro(a);

    }

    static void digite()

    {

        JOptionPane.showMessageDialog(null, "Digite um número ");

    }

     static void dobro(int n)

    {

        int d = n * 2;

        JOptionPane.showMessageDialog(null, "Dobro de "+n+" é "+d);

    }

}    

