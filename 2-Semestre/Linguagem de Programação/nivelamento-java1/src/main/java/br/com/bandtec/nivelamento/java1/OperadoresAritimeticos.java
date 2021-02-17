
package br.com.bandtec.nivelamento.java1;


public class OperadoresAritimeticos {
    public static void main(String[] args) {
        
        
         /*
        Os operadfores aritimeticos, são os mesmos
        utilizados no 1-Semestre
        + Adição
        - Subtração
        * Multiplicação
        / Divisão
    
        Também Funcionam:
        ++ incremento (vareiavel = variavel + 1)
        -- decremento (variavel =  variavel - 10
        +=
        -=
        *=
        /=
    */
    
    //Considerando o preço fixo de 4.40
    String nome = "Chicó";
    Double saldo = 200.0;
    
    Double totalPassagem = saldo / 4.40; 
    
    Integer totalPassagensInteiro = totalPassagem.intValue();
     
     System.out.println("Passagens considerando o uso de 4 passagens por dia " 
             + (totalPassagensInteiro / 4));
     
     saldo++;
     System.out.println(saldo);
        
    }
        
}


