package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatadorDecimal = new DecimalFormat("0.00");
        int anoAtual;
        float salarioInicial = 1000, salarioAtualizado, taxaPercentual;

        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();

        taxaPercentual = 1.5F / 100;
        salarioAtualizado = salarioInicial + taxaPercentual * salarioInicial;

        for (int ano = 2007; ano <= anoAtual; ano++) {
            salarioAtualizado *= 2f;
        }

        System.out.println("O novo salário do funcionário é: R$ " + formatadorDecimal.format(salarioAtualizado));

        scanner.close();
    }

}