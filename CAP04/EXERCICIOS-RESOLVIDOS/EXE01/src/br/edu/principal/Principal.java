package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double notaTrabalhoLaboratorio;
        double notaAvaliacoesSemestrais;
        double notaExameFinal;
        double mediaFinal;

       
        System.out.print("Digite a nota do trabalho de laboratório (0 a 10): ");
        notaTrabalhoLaboratorio = scanner.nextDouble();
        if (notaTrabalhoLaboratorio < 0 || notaTrabalhoLaboratorio > 10) {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
            return;
        }

        System.out.print("Digite a nota da avaliação semestral (0 a 10): ");
        notaAvaliacoesSemestrais = scanner.nextDouble();
        if (notaAvaliacoesSemestrais < 0 || notaAvaliacoesSemestrais > 10) {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
            return;
        }

        System.out.print("Digite a nota do exame final (0 a 10): ");
        notaExameFinal = scanner.nextDouble();
        if (notaExameFinal < 0 || notaExameFinal > 10) {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
            return;
        }

       
        mediaFinal = (notaTrabalhoLaboratorio * 2 + notaAvaliacoesSemestrais * 3 + notaExameFinal * 5) / (2 + 3 + 5);

        
        if (mediaFinal >= 8.0 && mediaFinal <= 10) {
            System.out.println("Conceito A");
        } else if (mediaFinal >= 7.0 && mediaFinal < 8.0) {
            System.out.println("Conceito B");
        } else if (mediaFinal >= 6.0 && mediaFinal < 7.0) {
            System.out.println("Conceito C");
        } else if (mediaFinal >= 5.0 && mediaFinal < 6.0) {
            System.out.println("Conceito D");
        } else if (mediaFinal >= 0.0 && mediaFinal < 5.0) {
            System.out.println("Conceito E");
        }

        
        scanner.close();
    }
}
