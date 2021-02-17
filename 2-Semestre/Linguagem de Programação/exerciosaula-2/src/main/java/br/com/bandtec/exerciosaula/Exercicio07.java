
package br.com.bandtec.exerciosaula;

import java.util.Scanner;


public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);
        
        String log;
        String senha;
        Integer quantidade;
        
        
        System.out.println("Informe seu login:");
        log = leitura.nextLine();
        
        System.out.println("Informe sua senha:");
        senha = leitura.nextLine();
        
        
        
        System.out.println(String.format("Seu login é %s e sua senha é %s. Você tem 3 tentativas antes de ser bloqueado",log, senha ));
        
        
    }
 
}

/*
Crie uma classe Java que:
a) Seja executável
b) Solicite o login do cliente
c) Solicite a senha do cliente
d) Solicite a quantidade de vezes que o usuário aceita errar a senha antes do bloqueio
e) Exiba uma frase como esta: "Seu login é L e sua senha é S. Você tem T tentativas antes de ser bloqueado" Use interpolação
*/