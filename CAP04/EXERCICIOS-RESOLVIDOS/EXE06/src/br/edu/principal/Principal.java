package br.edu.principal;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		int num, resto;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		num = entrada.nextInt();

		resto = num % 2;

		if (resto == 0)
			System.out.println("O número é par");
		if (resto != 0)
			System.out.println("O número é ímpar");


	}

}
