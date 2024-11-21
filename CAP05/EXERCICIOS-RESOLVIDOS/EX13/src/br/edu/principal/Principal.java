package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para controle de crianças e dados relacionados
        int numeroCriancas, idadeMeses, totalMasculino, totalFeminino, totalMenosDe24Meses;
        float percentualMasculino, percentualFeminino, percentualMenosDe24Meses;
        char sexoCrianca;
        
        // Inicialização das variáveis
        totalMasculino = 0;
        totalFeminino = 0;
        totalMenosDe24Meses = 0;
        
        // Solicita o número de crianças nascidas no período
        System.out.println("Digite o número de crianças nascidas no período: ");
        numeroCriancas = scanner.nextInt();
        
        // Laço para percorrer as informações das crianças
        for (int i = 1; i <= numeroCriancas; i++) {
            System.out.println("Digite o sexo da " + i + "ª criança (M ou F): ");
            sexoCrianca = scanner.next().charAt(0);
            
            System.out.println("Digite o tempo de vida (em meses) da " + i + "ª criança: ");
            idadeMeses = scanner.nextInt();
            
            // Contabiliza as crianças de acordo com o sexo
            if (sexoCrianca == 'M') {
                totalMasculino++;
            } else if (sexoCrianca == 'F') {
                totalFeminino++;
            }
            
            // Conta as crianças com 24 meses ou menos
            if (idadeMeses <= 24) {
                totalMenosDe24Meses++;
            }
        }
        
        // Se não houver crianças digitadas
        if (numeroCriancas == 0) {
            System.out.println("Nenhuma criança digitada.");
        } else {
            // Calculando os percentuais
            percentualMasculino = (float) totalMasculino * 100 / numeroCriancas;
            percentualFeminino = (float) totalFeminino * 100 / numeroCriancas;
            percentualMenosDe24Meses = (float) totalMenosDe24Meses * 100 / numeroCriancas;
            
            // Exibindo os resultados
            System.out.println("Percentual de crianças do sexo masculino: " + percentualMasculino + "%");
            System.out.println("Percentual de crianças do sexo feminino: " + percentualFeminino + "%");
            System.out.println("Percentual de crianças com 24 meses ou menos: " + percentualMenosDe24Meses + "%");
        }
    }
}