
package br.com.bandtec.nivelamento.java1;

import java.util.Scanner;

public class LeituraConsole {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
           Scanner leitorNumero = new Scanner(System.in);
        
        System.err.println("Escreve seu nome:");
        
        String nome = leitor.nextLine();
        
        System.err.println(String.format("Olá %s", nome));
        
        System.out.println("Escreva sua idade");
        Integer idade = leitorNumero.nextInt();
        
        System.out.println("Você nasceu em " + (2021-idade));
              
        System.out.println("Digite sua idade:");
        
    }
}
