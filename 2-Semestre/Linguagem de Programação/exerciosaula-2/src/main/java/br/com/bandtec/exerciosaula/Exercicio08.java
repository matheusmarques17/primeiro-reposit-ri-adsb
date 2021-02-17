package br.com.bandtec.exerciosaula;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Integer filhoPequeno;
        Integer filhoMedio;
        Integer filhoGrande;
        Double bolsa1;
        Double bolsa2;
        Double bolsa3;
        Double resultado;
        Integer resultado2;
        Double resultado3;

        System.err.println("Quantos filhos de 0 a 3 anos?");
        filhoPequeno = leitura.nextInt();

        System.err.println("Quantos filhos de 4 a 16 anos?");
        filhoMedio = leitura.nextInt();

        System.err.println("Quantos filhos de 17 a 18 anos?");
        filhoGrande = leitura.nextInt();

        resultado2 = (filhoPequeno + filhoMedio + filhoGrande);
        bolsa1 = filhoPequeno * 25.12;
        bolsa2 = filhoMedio * 15.88;
        bolsa3 = filhoGrande * 12.44;
        resultado3 = (bolsa1 + bolsa2 + bolsa3);
                
        System.err.println(String.format("Você tem um total de %d filhos e vai receber %.1f de bolsa \n"
                + "Use interpolação com 2 casas decimais para o valor da bolsa", resultado2, resultado3 ));

    }

}

/*
No país “Quisito” existe um benefício social chamado "Bolsa Filhos". Crie uma classe
Java que:
a) Solicite ao usuário quantos filhos de 0 a 3 anos possui. 
b) Solicite ao usuário quantos filhos de 4 a 16 anos possui.
c) Solicite ao usuário quantos filhos de 17 a 18 anos possui. 
d) Calcule o valor da Bolsa, sendo que o governo paga: * R$25,12 por filhos com menos de 4 anos
* R$15,88 por filhos entre 4 e 16 anos
* R$12,44 por filhos entre 17 e 18 anos

e) Exiba uma frase como esta: "Você tem um total de T filhos e vai receber R$B de bolsa" Use interpolação com 2 casas decimais para o valor da bolsa

 */
