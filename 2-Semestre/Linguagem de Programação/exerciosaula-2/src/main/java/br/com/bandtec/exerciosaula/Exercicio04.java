package br.com.bandtec.exerciosaula;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Double valorUnitario;
        Double quantidade;
        Double valorPago;
        Double resultado;

        System.out.println("Qual valor do produto?");
        valorUnitario = leitura.nextDouble();

        System.out.println("Qual quantidade de vendas?");
        quantidade = leitura.nextDouble();

        System.out.println("Qual valor pago pelo cliente?");
        valorPago = leitura.nextDouble();

        resultado = valorPago - (valorUnitario * quantidade) ;

        System.err.println(String.format("Seu troco será de R$ %.1f", resultado));

    }
}

 /*
Crie uma classe chamada “CalculadoraTroco” Java que:
A. Seja executável. 
B. Solicite o valor unitário de um produto. 
C. Solicite a quantidade vendida.
D. Solicite o valor pago pelo cliente. 
E. Calcule e exiba o troco com a seguinte frase. "Seu troco será de R$ X"
*/
