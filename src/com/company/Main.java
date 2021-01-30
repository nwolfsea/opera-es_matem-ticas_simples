package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      String nome;
        Scanner capitura = new Scanner(System.in);

        System.out.println("Digite seu nome");
        nome = capitura.nextLine();
        System.out.println(nome);

        int numero;
        System.out.println("Digite um número");
        numero = capitura.nextInt();
        System.out.println("Digite mais um número");
        int segundoNumero = capitura.nextInt();

        int total = numero + segundoNumero;
        System.out.println(total);

        int totaldois = numero * segundoNumero;
        System.out.println(totaldois);

        int totaltres = numero / segundoNumero;
        System.out.println(totaltres);


    }
}
