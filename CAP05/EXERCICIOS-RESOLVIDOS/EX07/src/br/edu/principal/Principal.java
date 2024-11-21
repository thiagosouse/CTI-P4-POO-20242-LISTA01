package br.edu.principal;

public class Principal {

    public static void main(String[] args) {
        int termoAnterior = 0, termoAtual = 1, proximoTermo;

        System.out.print(termoAnterior + " - " + termoAtual);

        for (int contador = 3; contador <= 8; contador++) {
            proximoTermo = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;

            System.out.print(" - " + proximoTermo);
        }

        System.out.println("");
    }
}