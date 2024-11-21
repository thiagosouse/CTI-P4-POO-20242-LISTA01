package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Contadores e variáveis para armazenar dados dos jogadores e times
        int contadorTime, contadorJogador, idadeJogador, quantidadeMenor18, totalAcima80;
        float pesoJogador, alturaJogador, mediaAltura, percentualAcima80, mediaIdade, somaAlturas;
        
        // Inicializa as variáveis
        quantidadeMenor18 = 0;
        totalAcima80 = 0;
        mediaAltura = 0;
        somaAlturas = 0;
        
        // Laço para os 5 times
        for (contadorTime = 1; contadorTime <= 5; contadorTime++) {
            mediaIdade = 0; // Reseta a média de idade a cada time
            System.out.println("Dados do " + contadorTime + "º time:");
            
            // Laço para os 11 jogadores de cada time
            for (contadorJogador = 1; contadorJogador <= 11; contadorJogador++) {
                System.out.println("Digite a idade do " + contadorJogador + "º jogador:");
                idadeJogador = scanner.nextInt();
                
                System.out.println("Digite o peso do " + contadorJogador + "º jogador (em kg):");
                pesoJogador = scanner.nextFloat();
                
                System.out.println("Digite a altura do " + contadorJogador + "º jogador (em metros):");
                alturaJogador = scanner.nextFloat();
                
                // Contabiliza jogadores com idade abaixo de 18
                if (idadeJogador < 18) {
                    quantidadeMenor18++;
                }
                
                // Soma as idades e as alturas para médias posteriores
                mediaIdade += idadeJogador;
                somaAlturas += alturaJogador;
                
                // Contabiliza jogadores com peso acima de 80 kg
                if (pesoJogador > 80) {
                    totalAcima80++;
                }
            }
            
            // Calculando e exibindo a média de idade do time
            mediaIdade /= 11; // Média por time (11 jogadores)
            System.out.println("Média das idades do " + contadorTime + "º time = " + mediaIdade);
        }
        
        // Exibindo os resultados gerais após os 5 times
        System.out.println("Quantidade de jogadores com idade inferior a 18 anos = " + quantidadeMenor18);
        
        // Calculando a média das alturas de todos os jogadores
        mediaAltura = somaAlturas / 55; // 55 jogadores no total (5 times x 11 jogadores)
        System.out.println("Média das alturas de todos os jogadores = " + mediaAltura);
        
        // Calculando a porcentagem de jogadores com peso superior a 80 kg
        percentualAcima80 = (totalAcima80 * 100.0f) / 55;
        System.out.println("Porcentagem de jogadores com peso superior a 80 kg = " + percentualAcima80 + "%");
    }
}