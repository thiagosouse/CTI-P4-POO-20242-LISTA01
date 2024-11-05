package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double largura, altura, areaTriangulo;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a base do triângulo: ");

		largura = entrada.nextDouble();

		System.out.print("Digite a altura do triângulo: ");

		altura = entrada.nextDouble();

		areaTriangulo = (largura * altura) / 2;

		System.out.println("Área do triângulo = " + areaTriangulo);
	}

}