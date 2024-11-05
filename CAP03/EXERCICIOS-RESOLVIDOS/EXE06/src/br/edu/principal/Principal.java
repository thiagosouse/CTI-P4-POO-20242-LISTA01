package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salarioBruto, salarioLiquido, gratificacao, imposto;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o salário do funcionário: ");

		salarioBruto = entrada.nextDouble();

		gratificacao = salarioBruto * 5 / 100;

		imposto = salarioBruto * 7 / 100;

		salarioLiquido = salarioBruto + gratificacao - imposto;

		System.out.println("Novo salário = " + salarioLiquido);
	}

}