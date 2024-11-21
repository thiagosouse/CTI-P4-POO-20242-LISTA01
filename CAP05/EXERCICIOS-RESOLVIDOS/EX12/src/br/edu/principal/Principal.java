package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para controle de operários, peças e salários
        int numeroOperario, totalPecasOperario, numeroMaiorSalario, contadorHomens, contadorMulheres, totalPecas, contador;
        float mediaHomens, mediaMulheres, salarioOperario, salarioMaior, totalFolha;
        char sexoOperario;
        
        // Inicialização das variáveis
        totalFolha = 0;
        totalPecas = 0;
        mediaHomens = 0;
        mediaMulheres = 0;
        contadorHomens = 0;
        contadorMulheres = 0;
        salarioOperario = 0;
        salarioMaior = 0;
        numeroMaiorSalario = 0;
        
        // Laço para percorrer os 15 operários
        for (contador = 1; contador <= 15; contador++) {
            System.out.println("Digite o número do " + contador + "º operário:");
            numeroOperario = scanner.nextInt();
            
            System.out.println("Digite o sexo do operário (M ou F):");
            sexoOperario = scanner.next().charAt(0);
            
            System.out.println("Digite o total de peças fabricadas pelo " + contador + "º operário:");
            totalPecasOperario = scanner.nextInt();
            
            // Cálculo do salário baseado nas peças fabricadas
            if (totalPecasOperario <= 30) {
                salarioOperario = 450;
            } else if (totalPecasOperario > 30 && totalPecasOperario <= 35) {
                salarioOperario = 450 + ((totalPecasOperario - 30) * 3 / 100 * 450);
            } else if (totalPecasOperario > 35) {
                salarioOperario = 450 + ((totalPecasOperario - 35) * 5 / 100 * 450);
            }
            
            System.out.println("O operário de número " + numeroOperario + " recebe salário = " + salarioOperario);
            
            // Acumulando valores totais
            totalFolha += salarioOperario;
            totalPecas += totalPecasOperario;
            
            // Calculando as médias de peças fabricadas por homens e mulheres
            if (sexoOperario == 'M') {
                mediaHomens += totalPecasOperario;
                contadorHomens++;
            } else {
                mediaMulheres += totalPecasOperario;
                contadorMulheres++;
            }
            
            // Identificando o operário com maior salário
            if (contador == 1) {
                salarioMaior = salarioOperario;
                numeroMaiorSalario = numeroOperario;
            } else {
                if (salarioOperario > salarioMaior) {
                    salarioMaior = salarioOperario;
                    numeroMaiorSalario = numeroOperario;
                }
            }
        }
        
        // Exibindo os resultados finais
        System.out.println("Total da folha de pagamento = " + totalFolha);
        System.out.println("Total de peças fabricadas no mês = " + totalPecas);
        
        // Média de peças fabricadas por homens
        if (contadorHomens == 0) {
            System.out.println("Nenhum homem");
        } else {
            mediaHomens = mediaHomens / contadorHomens;
            System.out.println("Média de peças fabricadas por homens = " + mediaHomens);
        }
        
        // Média de peças fabricadas por mulheres
        if (contadorMulheres == 0) {
            System.out.println("Nenhuma mulher");
        } else {
            mediaMulheres = mediaMulheres / contadorMulheres;
            System.out.println("Média de peças fabricadas por mulheres = " + mediaMulheres);
        }
        
        // Número do operário com o maior salário
        System.out.println("O número do operário com maior salário é " + numeroMaiorSalario);
    }
}