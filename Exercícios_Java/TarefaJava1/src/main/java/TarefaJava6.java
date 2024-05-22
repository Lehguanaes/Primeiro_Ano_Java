/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia
 */
public class TarefaJava6 {
    public static void main(String[] args) {
        
        double Saldo1, Saldo2, Saldo3,Deposito=500, Juros=0.01;
        Saldo1=Deposito+(Deposito*Juros);
        Saldo2=Saldo1+(Saldo1*Juros);
        Saldo3=Saldo2+(Saldo2*Juros);
        
        System.out.println("O seu saldo atual é de "+Deposito);
        System.out.println("O seu saldo em um mês será de  "+Saldo1);
        System.out.println("O seu saldo em dois meses será de  "+Saldo2);
        System.out.println("O seu saldo em três meses será de  "+Saldo3);  
    }
    
}
