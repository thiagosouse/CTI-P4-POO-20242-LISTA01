package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Contadores de status dos alunos
        int contador, alunosReprovados, alunosExame, alunosAprovados;
        
        // Variáveis para as notas dos alunos e as médias
        float nota1, nota2, mediaAluno, mediaTurma, somaNotasTurma;
        
        // Inicializa os contadores e somatório de notas
        somaNotasTurma = 0;
        alunosReprovados = 0;
        alunosExame = 0;
        alunosAprovados = 0;
        
        // Laço para ler as notas de 6 alunos
        for (contador = 1; contador <= 6; contador++) {
            System.out.println("Digite as duas notas do " + contador + "º aluno:");
            nota1 = scanner.nextFloat();
            nota2 = scanner.nextFloat();
            
            // Calculando a média do aluno
            mediaAluno = (nota1 + nota2) / 2;
            System.out.println("Média do " + contador + "º aluno = " + mediaAluno);
            
            // Verificando a situação do aluno
            if (mediaAluno <= 3) {
                alunosReprovados++;
                System.out.println("Reprovado");
            } else if (mediaAluno > 3 && mediaAluno < 7) {
                alunosExame++;
                System.out.println("Exame");
            } else {
                alunosAprovados++;
                System.out.println("Aprovado");
            }
            
            // Acumulando a média para calcular a média da turma
            somaNotasTurma += mediaAluno;
        }
        
        // Exibindo os resultados finais
        System.out.println("Total de reprovados = " + alunosReprovados);
        System.out.println("Total de alunos em exame = " + alunosExame);
        System.out.println("Total de aprovados = " + alunosAprovados);
        
        // Calculando a média da turma
        mediaTurma = somaNotasTurma / 6;
        System.out.println("Média da turma = " + mediaTurma);
    }
}