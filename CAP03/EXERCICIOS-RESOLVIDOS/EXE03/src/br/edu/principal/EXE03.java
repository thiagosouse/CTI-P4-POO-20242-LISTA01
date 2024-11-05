package br.edu.principal;

import java.util.Scanner;

public class EXE03 {

    public static void main(String[] args) {
        double nota1, nota2, nota3, peso1, peso2, peso3, media;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota:");
        nota1 = entrada.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        nota2 = entrada.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        nota3 = entrada.nextDouble();
        
        System.out.println("Digite o peso da primeira nota:");
        peso1 = entrada.nextDouble();
        
        System.out.println("Digite o peso da segunda nota:");
        peso2 = entrada.nextDouble();
        
        System.out.println("Digite o peso da terceira nota:");
        peso3 = entrada.nextDouble();

        media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        
        System.out.printf("A média ponderada é: %.2f%n", media);
        
        entrada.close();
    }
}
