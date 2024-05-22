/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */

import javax.swing.JOptionPane;

public class Desafio_Urna {
    public static void main(String[] args) {
       
        int resposta = 0, votos = 0, candidato_um = 0, candidato_dois = 0, candidato_tres = 0, candidato_quatro = 0;
     
        
        while (resposta != 3){
            
            votos = Integer.parseInt(JOptionPane.showInputDialog ("Para votar, digite o número da opção conforme abaixo: \n"+
            " \n"+
            "Digite 1 - Candidado Um \n"+
            "Digite 2 - Candidado Dois \n"+
            "Digite 3 - Candidado Três \n"+
            "Digite 4 - Candidado Quatro "));
            
            if (votos == 1)
            {
                resposta = Integer.parseInt(JOptionPane.showInputDialog ( "Você votou no candidato um. Confirma seu voto?\n"+
                "Se sim digite 1, se não digite 2 para cancelar."));  
            
                if (resposta == 1 )
                {
                JOptionPane.showMessageDialog(null, "Voto confirmado, Obrigado!");
                candidato_um++;
                resposta--;
                resposta = Integer.parseInt(JOptionPane.showInputDialog ( "Tem um novo eleitor para votar?\n"+
                        "Se sim digite 1, se não digite 2 para encerrar as votações."));
                 
                if (resposta == 2)
                   {
                    resposta = Integer.parseInt(JOptionPane.showInputDialog ( "Tem certeza que deseja encerrar as votações?\n"+
                        "Se sim digite 3, se não digite 2"));             
                  }
                }
                else 
               
                 JOptionPane.showMessageDialog(null, "Voto cancelado, vote novamente");
            }
            
            else if (votos == 2)
            {
                resposta = Integer.parseInt(JOptionPane.showInputDialog ( "Você votou no candidato dois. Confirma seu voto?\n"+
                "Se sim digite 1, se não digite 2 para cancelar."));  
            
                if (resposta == 1 )
                {
                JOptionPane.showMessageDialog(null, "Voto confirmado, Obrigado!");
                candidato_dois++;
                resposta--;
                resposta = Integer.parseInt(JOptionPane.showInputDialog ( "Tem um novo eleitor para votar?\n"+
                        "Se sim digite 1, se não digite 2 para encerrar as votações."));
                  if (resposta == 2)
                  {
                    resposta = Integer.parseInt(JOptionPane.showInputDialog ( "Tem certeza que deseja encerrar as votações?\n"+
                    "Se sim digite 3, se não digite 2"));             
                  }
                }
                else 
                JOptionPane.showMessageDialog(null, "Voto cancelado, vote novamente"); 
            }
             
             else if (votos == 3)
            {
                resposta = Integer.parseInt(JOptionPane.showInputDialog ( "Você votou no candidato três. Confirma seu voto?\n"+
                "Se sim digite 1, se não digite 2 para cancelar."));  
            
                if (resposta == 1 )
                {
                JOptionPane.showMessageDialog(null, "Voto confirmado, Obrigado!");
                candidato_tres++;
                resposta--;
                resposta = Integer.parseInt(JOptionPane.showInputDialog ( "Tem um novo eleitor para votar?\n"+
                        "Se sim digite 1, se não digite 2 para encerrar as votações."));
                 if (resposta == 2)
                 {
                    resposta = Integer.parseInt(JOptionPane.showInputDialog ( "Tem certeza que deseja encerrar as votações?\n"+
                        "Se sim digite 3, se não digite 2"));                
                 }
                } 
                else 
                JOptionPane.showMessageDialog(null, "Voto cancelado, vote novamente"); 
            }
              
             else if (votos == 4)
            {
                resposta = Integer.parseInt(JOptionPane.showInputDialog ( "Você votou no candidato quatro. Confirma seu voto?\n"+
                "Se sim digite 1, se não digite 2 para cancelar."));  
            
                if (resposta == 1 )
                {
                JOptionPane.showMessageDialog(null, "Voto confirmado, Obrigado!");
                candidato_quatro++;
                resposta--;
                resposta = Integer.parseInt(JOptionPane.showInputDialog ( "Tem um novo eleitor para votar?\n"+
                        "Se sim digite 1, se não digite 2 para encerrar as votações."));
                 if (resposta == 2)
                 {
                    resposta = Integer.parseInt(JOptionPane.showInputDialog ( "Tem certeza que deseja encerrar as votações?\n"+
                        "Se sim digite 3, se não digite 2"));
                 }
                }
                else 
                JOptionPane.showMessageDialog(null, "Voto cancelado, vote novamente"); 
            }                
        }
        
        //aqui encerramos o laço e comparamos os votos dos candidatos
        
        if (candidato_um>candidato_dois)
        {
             if (candidato_um>candidato_tres)
             {
                if (candidato_um>candidato_quatro)  
                {
                   JOptionPane.showMessageDialog(null, "O candidato vencedor é o Candidato um, com "+candidato_um+" votos.");
                }
               
            }
        }
        
        else if (candidato_dois>candidato_um)
        {
           if (candidato_dois>candidato_tres)
            {
                if (candidato_dois>candidato_quatro)  
                {
                   JOptionPane.showMessageDialog(null, "O candidato vencedor é o Candidato dois, com "+candidato_dois+" votos.");
                }
            }
        }
        
        else if (candidato_tres>candidato_um)
        {
           if (candidato_tres>candidato_dois)
            {
                if (candidato_tres>candidato_quatro)  
                {
                   JOptionPane.showMessageDialog(null, "O candidato vencedor é o Candidato tres, com "+candidato_tres+" votos.");
                }
            }
        }
        
        else if (candidato_quatro>candidato_um)
        {
           if (candidato_quatro>candidato_dois)
            {
                if (candidato_quatro>candidato_tres)  
                {
                   JOptionPane.showMessageDialog(null, "O candidato vencedor é o Candidato quatro, com "+candidato_quatro+" votos.");
                }
            }
        }
        
        // para vermos se houve empate entre os candidatos
        
         if ((candidato_um==candidato_dois) && (candidato_dois==candidato_tres) && (candidato_tres==candidato_quatro))
         {
           JOptionPane.showMessageDialog(null, "Houve um empate entre os quatro candidatos, com "+candidato_um+" votos");
         }
         else if ((candidato_um==candidato_dois) && (candidato_dois==candidato_tres) && (candidato_tres!=candidato_quatro))
         {
           JOptionPane.showMessageDialog(null, "Houve um empate entre os candidatos um, dois e três, com "+candidato_um+" votos");
         }
         else if ((candidato_um==candidato_dois) && (candidato_dois==candidato_quatro) && (candidato_quatro!=candidato_tres))
         {
           JOptionPane.showMessageDialog(null, "Houve um empate entre os candidatos um, dois e quatro, com "+candidato_um+" votos");
         }
         
         else if ((candidato_um==candidato_tres) && (candidato_quatro==candidato_tres) && (candidato_tres!=candidato_dois))
         {
            JOptionPane.showMessageDialog(null, "Houve um empate entre os candidatos um, três e quatro com "+candidato_um+" votos");
         }
         
         else if ((candidato_um!=candidato_dois) && (candidato_dois==candidato_tres) && (candidato_tres==candidato_quatro))
         {
           JOptionPane.showMessageDialog(null, "Houve um empate entre os candidatos dois, três e quatro com "+candidato_dois+" votos");
         }
         
         else if ((candidato_um==candidato_dois) && (candidato_dois!=candidato_tres) && (candidato_dois!=candidato_quatro))
         {
            JOptionPane.showMessageDialog(null, "Houve um empate entre os candidatos um e dois, com "+candidato_um+" votos");
         }
         else if ((candidato_um==candidato_tres) && (candidato_um!=candidato_dois) && (candidato_tres!=candidato_quatro))
         {
            JOptionPane.showMessageDialog(null, "Houve um empate entre os candidatos um e três, com "+candidato_um+" votos");
         }
         else if ((candidato_um!=candidato_dois) && (candidato_um==candidato_quatro) && (candidato_tres!=candidato_quatro))
         {
            JOptionPane.showMessageDialog(null, "Houve um empate entre os candidatos um e quatro com "+candidato_um+" votos");
         }
         else if ((candidato_dois==candidato_tres) && (candidato_dois!=candidato_quatro) && (candidato_dois!=candidato_um))
         {
            JOptionPane.showMessageDialog(null, "Houve um empate entre os candidatos dois e três, com "+candidato_dois+" votos");
         }
         
         else if ((candidato_dois==candidato_quatro) && (candidato_dois!=candidato_tres) && (candidato_quatro!=candidato_um))
               {
                JOptionPane.showMessageDialog(null, "Houve um empate entre os candidatos dois e quatro, com "+candidato_dois+" votos");
               }
         
         else  JOptionPane.showMessageDialog(null, "Houve um empate entre os candidatos três e quatro "+candidato_tres+" votos");
      
    }
    
}