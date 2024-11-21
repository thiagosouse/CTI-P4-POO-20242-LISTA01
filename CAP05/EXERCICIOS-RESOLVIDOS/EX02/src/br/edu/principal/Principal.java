package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero, valorE, contadorI, contadorJ, fatorial;

        System.out.println("\nFórmula: E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!");
        System.out.println("Digite um valor de N: ");
        numero = scanner.nextInt();

        valorE = 1;

        for (contadorI = 1; contadorI <= numero; contadorI++) {
            fatorial = 1;

            for (contadorJ = 1; contadorJ <= contadorI; contadorJ++) {
                fatorial *= contadorJ;
            }
            valorE += 1 / fatorial;
        }
        System.out.println("\nConforme a fórmula, o valor de E é " + valorE + "\n");

        scanner.close();
    }

}
