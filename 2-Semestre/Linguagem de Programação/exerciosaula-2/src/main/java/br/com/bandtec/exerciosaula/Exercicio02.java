/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.exerciosaula;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exercicio02 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual é seu nome:");

        String nome = leitura.nextLine();

        System.out.println(String.format("Olá %s ", nome + " Qual seu ano de nascimento? "));
        Integer anod = leitura.nextInt();

        int ano = 2021;
        int cal = ano - anod;

        System.out.println(ano - anod);

        System.out.println("Em 2030 voce terá " + (cal + 9));

    }
}
