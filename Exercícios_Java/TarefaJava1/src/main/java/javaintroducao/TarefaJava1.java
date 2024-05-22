/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaintroducao;

/**
 *
 * @author Leticia
 */
public class TarefaJava1 {
    
    public static void main(String[] args) {
        
        // Calculando média anual do aluno
        
        int NumeroAluno=10;
        double NotaUm,NotaDois, NotaTres, NotaQuatro;
        NotaUm=10;
        NotaDois=7.8;
        NotaTres=5;
        NotaQuatro=8;
        
        System.out.println("O número do aluno é " +NumeroAluno+".");
        System.out.println("O aluno teve as notas " +NotaUm+ ", "+NotaDois+", "+NotaTres+", "+NotaQuatro+".");
        System.out.println("A média anual do aluno é " +((NotaUm+NotaDois+NotaTres+NotaQuatro)/4)+".");
        
    }
    
}