package br.com.bandtec.exerciosaula;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Double aquecimento;
        Double calAq;
        Double aerobico;
        Double calAer;
        Double musculacao;
        Double calMusc;
        Double total;
        Double total2;
        String nome;

        System.out.println("Informe seu nome para saber o qaunto perdeu de calorias em determinado tempo:");
        nome = leitura.nextLine();

        System.out.println("Quanto tempo você se aqueceu?");
        aquecimento = leitura.nextDouble();

        calAq = aquecimento * 12;

        System.out.println("Quanto tempo você fez aerobico?");
        aerobico = leitura.nextDouble();

        calAer = aerobico * 20;

        System.out.println("Quanto tempo você fez musculação?");
        musculacao = leitura.nextDouble();

        calMusc = aerobico * 25;

        total = aquecimento + aerobico + musculacao;

        total2 = calAq + calAer + calMusc;

        System.out.println(String.format("Olá %s, você fez um total de %.2f minutos de exercicios e perdeu %.2f calorias.", nome, total, total2));

    }
}

/*
xercícios. Crie uma classe Java que:
a) Seja executável
b) Solicite ao usuário o tempo, em minutos (valor inteiro) que ele passou se aquecendo
c) Solicite ao usuário o tempo em minutos (valor inteiro) que ele fez exercícios aeróbicos
(correr, andar, pedalar etc)
d) Solicite ao usuário o tempo em minutos (valor inteiro) que ele fez exercícios de
musculação
e) Calcule quantas calorias o Jorge perdeu, sendo que: * cada minuto de aquecimento faz perder 12 calorias
* cada minuto de ex aeróbico faz perder 20 calorias
* cada minuto de musculação faz perder 25 calorias
f) Exiba, usando interpolação e apenas valores numéricos inteiros,
uma frase como esta: "Olá, Jorge. Você fez um total de X minutos de exercícios e perdeu cerca de Y calorias".
 */
