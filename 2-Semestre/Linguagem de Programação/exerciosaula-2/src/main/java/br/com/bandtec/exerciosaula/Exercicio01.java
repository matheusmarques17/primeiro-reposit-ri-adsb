
package br.com.bandtec.exerciosaula;

import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      
      
        Double numero1;
        Double numero2;
        Double soma;
        Double subtracao;
        Double divisão;
        Double multiplicaçao;
        
      
        System.out.println("Digite um numero");
        numero1 = leitor.nextDouble();
        
        System.out.println("Digite outro numero");
        numero2 = leitor.nextDouble();
        
        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        divisão = numero1 / numero2;
        multiplicaçao = numero1 * numero2;
        
        System.out.println(String.format("A some é %.1f", soma));
        System.out.println(String.format("A subtracão é  %.1f", subtracao));
        System.out.println(String.format("A divisão é  %.1f", divisão));
        System.out.println(String.format("A multiplicação é  %.1f", multiplicaçao));
         
      
    }
}