
package br.com.bandtec.exerciosaula;
    
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;


public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
      
        
     String nome;   
     Double nota1;
     Double nota2;
     Double media;
       
        System.out.println("Qual seu nome?");
        nome = leitura.nextLine();
        
        System.out.println("Qual sua primeira nota?");
       nota1 = leitura.nextDouble();
        
        System.out.println("Qual sua segunda nota?");
        nota2 = leitura.nextDouble();
        
        media =  (nota1 + nota2) / 2;
        
        System.out.println(String.format(" Olá %s ua média foi de: %.1f ", nome, media));
    }
}

/*
Crie uma nova classe (Class) no projeto e:
a) Ela deve ser executável
b) Solicite o nome e duas notas ao usuário. As notas são números reais. 
c) Calcule a média entre as notas (Dica: é da mesma forma como se faz em JavaScript)
d) Exiba uma frase como esta: "Olá, NOME. Sua média foi de MEDIA" 
e) Use Interpolação com 1 casa 
*/