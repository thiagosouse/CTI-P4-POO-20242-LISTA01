package br.edu.principal;

import java.util.Scanner;

public class EXE08 {

	public static void main(String[] args) {
		double deposito, juros, rendimento, saldoFinal;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do depósito: ");

		deposito = entrada.nextDouble();

		System.out.print("Digite a taxa de juros: ");

		juros = entrada.nextDouble();

		rendimento = deposito * juros / 100;

		saldoFinal = deposito + rendimento;

		System.out.println("Rendimento = " + rendimento);

		System.out.println("Total = " + saldoFinal);
	}

}