package br.com.bandtec.exerciosaula;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Double salario;
        Double porcentagem;
        Double resultado;
        
        System.out.println("Informe seu salario:");
        salario = leitura.nextDouble();
        
        System.out.println("Informe a porcetagem:");
        porcentagem = leitura.nextDouble();
        
        resultado =  salario - ((porcentagem / 100) * salario) ;
        
        System.err.println(String.format("Seu salario bruto é: %.1f com descontos será: %.1f ", salario, resultado));
        

    }
}

/*
Crie uma classe chamada “CalculadoraSalario” Java que:
A. Seja executável.
B. Solicite que o usuário digite o seu salário. 
C. Solicite a porcentagem de imposto que o usuário deverá pagar. 
D. Exiba o valor do salário líquido. 

Por exemplo:
Se o salário for 1000,00, e o imposto for de 20%, o salário líquido será 800,00.
*/
