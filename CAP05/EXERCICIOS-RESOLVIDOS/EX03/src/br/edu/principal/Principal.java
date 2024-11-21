package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeNumeros, numero, indiceExterno, indiceInterno, fatorial;

        System.out.print("Digite a quantidade de números que serão lidos: ");
        quantidadeDeNumeros = scanner.nextInt();

        for (indiceExterno = 1; indiceExterno <= quantidadeDeNumeros; indiceExterno++) {
            System.out.println("\nDigite o " + indiceExterno + "º número ");
            numero = scanner.nextInt();
            fatorial = 1;

            for (indiceInterno = 1; indiceInterno <= numero; indiceInterno++) {
                fatorial *= indiceInterno;
            }

            System.out.println("Fatorial de " + numero + " = " + fatorial);
        }

        scanner.close();
    }
}
