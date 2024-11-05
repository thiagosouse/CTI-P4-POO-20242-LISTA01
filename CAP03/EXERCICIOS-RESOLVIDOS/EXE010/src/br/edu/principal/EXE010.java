package br.edu.principal;

import java.util.Scanner;

public class EXE010 {

	public static void main(String[] args) {
		double areaCirculo, raioCirculo;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o raio: ");

		raioCirculo = entrada.nextDouble();

		areaCirculo = 3.1415 * raioCirculo * raioCirculo;

		System.out.println("Área do círculo = " + areaCirculo);
	}

}