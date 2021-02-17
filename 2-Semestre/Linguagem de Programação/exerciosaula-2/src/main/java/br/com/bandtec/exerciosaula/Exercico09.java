package br.com.bandtec.exerciosaula;

import java.util.Scanner;

public class Exercico09 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        Double salarioBruto;
        Double descontoINSS;

        Double descontoIR;
        Double conducaoDiariaIda;
        Double salarioLiquido;
        Double totalDescontos;

        System.out.println("Digite seu salário bruto: ");
        salarioBruto = leitura.nextDouble();

        System.out.println("Digite o valor de sua condução diaria: ");
        conducaoDiariaIda = leitura.nextDouble();

        descontoINSS = salarioBruto * 10 / 100;
        descontoIR = salarioBruto * 20 / 100;
        totalDescontos = descontoINSS + descontoIR;
        conducaoDiariaIda = (conducaoDiariaIda * 2) * 22;
        salarioLiquido = salarioBruto - descontoINSS - descontoIR - conducaoDiariaIda;

        System.out.println(String.format("Seu bruto é R$%.1f, tem um total de R$%.1f \n"
                + "em descontos e receberá um líquido de R$%.2f", salarioBruto, totalDescontos, salarioLiquido));

    }
}

/*
a) A classe deve ser executável
b) O programa solicita o salário bruto
c) O programa calcula o desconto do INSS, que é sempre de 10% sobre o bruto
d) O programa calcula o desconto de IR, que é sempre de 20% sobre o bruto
e) O programa pergunta quanto custa a condução diária só de ida da casa para o trabalho. O desconto de VT é sempre o que o usuário gasta. Assim, calcula-se assim: Valor de
condução ida x 2 x 22.
f) Calcule o salário líquido, que é o bruto menos os descontos de INSS, IR e VT
g) Exibam, usando interpolação e com os valores numéricos com 2 casas decimais, uma
frase como esta: "Seu bruto é R$A, tem um total de R$B em descontos e receberá um líquido de R$C"
 */
