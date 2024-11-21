package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorFuncionario, codigoFuncionario;
        float horasTrabalhadas, valorHora, salarioMinimo, salarioInicial, auxilioComida, salarioFinal;
        char turnoTrabalho, categoriaFuncionario;
        salarioMinimo = 450;

        for (contadorFuncionario = 1; contadorFuncionario <= 10; contadorFuncionario++) {
            System.out.println("Digite o código do " + contadorFuncionario + "º funcionário: ");
            codigoFuncionario = scanner.nextInt();
            System.out.println("Digite o número de horas trabalhadas do " + contadorFuncionario + "º funcionário: ");
            horasTrabalhadas = scanner.nextInt();
            System.out.println("Digite o turno de trabalho do " + contadorFuncionario + "º funcionário (M, V ou N): ");
            turnoTrabalho = Character.toUpperCase(scanner.next().charAt(0));

            while (turnoTrabalho != 'M' && turnoTrabalho != 'V' && turnoTrabalho != 'N') {
                System.out.println("Turno inválido, digite novamente ");
                turnoTrabalho = scanner.next().charAt(0);
            }

            System.out.println("Digite a categoria do " + contadorFuncionario + "º funcionário (G ou O): ");
            categoriaFuncionario = Character.toUpperCase(scanner.next().charAt(0));

            while (categoriaFuncionario != 'G' && categoriaFuncionario != 'O') {
                System.out.println("Categoria inválida, digite novamente ");
                categoriaFuncionario = scanner.next().charAt(0);
            }

            if (categoriaFuncionario == 'G') {
                if (turnoTrabalho == 'N') {
                    valorHora = salarioMinimo * 18 / 100;
                } else {
                    valorHora = salarioMinimo * 15 / 100;
                }
            } else {
                if (turnoTrabalho == 'N') {
                    valorHora = salarioMinimo * 13 / 100;
                } else {
                    valorHora = salarioMinimo * 10 / 100;
                }
            }

            salarioInicial = horasTrabalhadas * valorHora;

            if (salarioInicial <= 300) {
                auxilioComida = salarioInicial * 20 / 100;
            } else if (salarioInicial < 600) {
                auxilioComida = salarioInicial * 15 / 100;
            } else {
                auxilioComida = salarioInicial * 5 / 100;
            }

            salarioFinal = salarioInicial + auxilioComida;

            System.out.println("Código = " + codigoFuncionario);
            System.out.println("Número de horas trabalhadas = " + horasTrabalhadas);
            System.out.println("Valor do hora trabalhada = " + valorHora);
            System.out.println("Salário inicial = " + salarioInicial);
            System.out.println("Auxílio comida = " + auxilioComida);
            System.out.println("Salário Final = " + salarioFinal);
        }
    }
}