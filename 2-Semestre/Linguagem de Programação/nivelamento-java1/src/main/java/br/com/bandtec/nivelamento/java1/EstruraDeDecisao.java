package br.com.bandtec.nivelamento.java1;

public class EstruraDeDecisao {

    public static void main(String[] args) {

        Integer numeroTeste = 67;

        /*if (numeroTeste < 50) {
            System.out.println("É menor que 50");

        } else if (numeroTeste == 50) {
            System.out.println("É igual");
        } else {
            System.err.println("É maior");
        } */
 /*Boolean ligado = true;
        if (!ligado) {
            System.err.println("Está ligado");

        } else {
            System.out.println("Está desligado");
        }*/
 
        Integer num1 = 2;
        Integer num2 = 6;
 
        String nome = "Matheus";
        String nome2 = "matheus";

        if (nome.equalsIgnoreCase(nome2)) {
            System.err.println("É igual");
        } else {
            System.out.println("Não é igual");
        }

        if (num1.equals(2) || num2.equals(2)) {
            System.out.println("Deu certo");
        }
        else {
            System.out.println("Deu errado");
        }
    }
}
