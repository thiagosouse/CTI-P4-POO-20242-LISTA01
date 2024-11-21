package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para controle do número e contagem dos divisores
        int contador, numero, quantidadeDivisores;
        
        // Solicitar ao usuário que digite um número
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();
        
        // Inicializar contador de divisores
        quantidadeDivisores = 0;
        
        // Laço para contar quantos divisores o número tem
        for (contador = 1; contador <= numero; contador++) {
            if (numero % contador == 0) {
                quantidadeDivisores++;
            }
        }
        
        // Se o número tem mais de dois divisores, não é primo
        if (quantidadeDivisores > 2) {
            System.out.println("Número não primo");
        } else {
            System.out.println("Número primo");
        }
    }
}