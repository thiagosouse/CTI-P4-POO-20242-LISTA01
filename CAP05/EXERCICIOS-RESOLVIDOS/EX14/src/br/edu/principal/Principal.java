package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para controle do valor da dívida, juros, parcelas e total
        float valorDividaInicial, taxaJuros, valorParcela, totalDivida, valorJurosCalculado;
        int quantidadeParcelas, contador;
        
        // Solicita o valor inicial da dívida
        System.out.println("Digite o valor inicial da dívida: ");
        valorDividaInicial = scanner.nextFloat();
        
        // Cabeçalho da tabela
        System.out.println("Valor da dívida     Valor dos juros    Quantidade de parcelas    Valor da parcela");
        
        // Inicializa as variáveis
        taxaJuros = 0;
        quantidadeParcelas = 1;
        totalDivida = valorDividaInicial;
        valorParcela = valorDividaInicial;
        
        // Exibe a primeira linha da tabela
        System.out.println(String.format("  %.2f              %.2f               %d                    %.2f", totalDivida, taxaJuros, quantidadeParcelas, valorParcela));
        
        // Atualiza os juros e a quantidade de parcelas para o próximo cálculo
        taxaJuros += 10;
        quantidadeParcelas += 2;
        
        // Laço para calcular e exibir os dados para 4 iterações
        for (contador = 1; contador <= 4; contador++) {
            // Calcula o valor dos juros e o total da dívida
            valorJurosCalculado = valorDividaInicial * taxaJuros / 100;
            totalDivida = valorDividaInicial + valorJurosCalculado;
            
            // Calcula o valor da parcela
            valorParcela = totalDivida / quantidadeParcelas;
            
            // Exibe os resultados para a iteração
            System.out.println(String.format("  %.2f              %.2f               %d                    %.2f", totalDivida, taxaJuros, quantidadeParcelas, valorParcela));
            
            // Atualiza os juros e a quantidade de parcelas para a próxima iteração
            taxaJuros += 5;
            quantidadeParcelas += 3;
        }
    }
}