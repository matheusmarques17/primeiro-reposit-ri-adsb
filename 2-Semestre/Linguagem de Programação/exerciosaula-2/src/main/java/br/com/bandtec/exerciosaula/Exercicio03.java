
package br.com.bandtec.exerciosaula;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        Integer limitePeso;
        Integer limitesPeso1;
        Integer limitesPeso2;
        Integer limitesPeso3;
        Integer limitePessoas;
        Integer somaPesos;
        
        System.out.println("Qual seu peso?");
        limitePeso = leitura.nextInt();
        
        System.out.println("Qual limite de pessoas?");
        limitePessoas = leitura.nextInt();
        
         System.out.println("Qual seu pesso?");
        limitesPeso1 = leitura.nextInt();
        
         System.out.println("Qual seu peso?");
        limitesPeso2 = leitura.nextInt();
        
          System.out.println("Qual seu peso?");
        limitesPeso3 = leitura.nextInt();
        
        somaPesos = limitesPeso1 + limitesPeso2 + limitesPeso3;
        
        
        System.err.println(String.format("Entraram 3 pessoas no elevador, no qual cabem %d pessoas. \n "
                + "O peso total no elevador é %d", limitePessoas, somaPesos));
        
    }
 
}

/*
A. Seja executável. 
B. Solicite ao usuário o limite de peso de um elevador (número real). 
C. Solicite ao usuário o limite de pessoas em um elevador (número inteiro). 
D. Solicite ao usuário o peso da 1ª pessoa que entrou no elevador (número real). 
E. Solicite ao usuário o peso da 2ª pessoa que entrou no elevador (número real).
F. Solicite ao usuário o peso da 3ª pessoa que entrou no elevador (número real). 
Ao final, exiba uma frase assim: "Entraram 3 pessoas no elevador, no qual cabem X pessoas. O peso total no elevador é
de Y, sendo que ele suporta Z". (onde X é o 2º valor lido no programa, 
Z o 1º e Y é a soma dos pesos das 3 pesso
*/