package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaPrimeiroTrimestre, notaSegundoTrimestre, notaTerceiroTrimestre, mediaFinal, notaExameNecessaria;

       
        System.out.print("Digite a nota do primeiro trimestre: ");
        notaPrimeiroTrimestre = scanner.nextDouble();

        System.out.print("Digite a nota do segundo trimestre: ");
        notaSegundoTrimestre = scanner.nextDouble();

        System.out.print("Digite a nota do terceiro trimestre: ");
        notaTerceiroTrimestre = scanner.nextDouble();

        
        mediaFinal = (notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre) / 3;

        
        if (mediaFinal >= 0 && mediaFinal < 3) {
            System.out.println("Reprovado");
        } else if (mediaFinal >= 3 && mediaFinal < 7) {
            System.out.println("Exame");
            
            notaExameNecessaria = 10 - mediaFinal;
            System.out.println("Você precisa tirar " + notaExameNecessaria + " no exame para ser aprovado.");
        } else if (mediaFinal >= 7 && mediaFinal <= 10) {
            System.out.println("Aprovado");
        }

        scanner.close();
    }
}
