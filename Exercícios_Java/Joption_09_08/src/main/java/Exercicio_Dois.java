
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */


public class Exercicio_Dois {
    
    public static void main(String[] args) {
        
        double media_um, media_dois, soma_medias, media_medias;
        
        media_um = (8 + 9 + 7)/3;
        media_dois = (4 + 5 + 6)/3;
        soma_medias = media_um + media_dois;
        media_medias = soma_medias/2;
        
        JOptionPane.showMessageDialog (null,"A média de 7,8 e 9 é: " +media_um );
        JOptionPane.showMessageDialog (null,"A média de 4, 5 e 6 é: " +media_dois );
        JOptionPane.showMessageDialog (null,"A  soma das médias  é: " +soma_medias );
        JOptionPane.showMessageDialog (null,"A  média das médias é: " +media_medias);
        

    }
    
}
