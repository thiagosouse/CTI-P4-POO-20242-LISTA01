package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int potencia, contadorTermo, baseX, contadorFatorial, limiteFatorial, numeroTermos, ajusteDenominador, valorDenominador;
        double resultadoS, fatorialAtual;

        System.out.println("Digite o número de termos da sequência: ");
        numeroTermos = scanner.nextInt();
        System.out.println("Digite o valor de X: ");
        baseX = scanner.nextInt();
        
        resultadoS = 0;
        ajusteDenominador = 0;
        valorDenominador = 1;

        for (contadorTermo = 1; contadorTermo <= numeroTermos; contadorTermo++) {
            limiteFatorial = valorDenominador;
            fatorialAtual = 1;

            for (contadorFatorial = 1; contadorFatorial <= limiteFatorial; contadorFatorial++) {
                fatorialAtual *= contadorFatorial;
            }

            potencia = contadorTermo + 1;

            if (potencia % 2 == 0) {
                resultadoS -= (Math.pow(baseX, potencia) / fatorialAtual);
            } else {
                resultadoS += (Math.pow(baseX, potencia) / fatorialAtual);
            }

            if (valorDenominador == 4) {
                ajusteDenominador = -1;
            }
            if (valorDenominador == 1) {
                ajusteDenominador = 1;
            }
            if (ajusteDenominador == 1) {
                valorDenominador++;
            } else {
                valorDenominador--;
            }
        }

        System.out.println("Valor de S: " + resultadoS);
    }
}