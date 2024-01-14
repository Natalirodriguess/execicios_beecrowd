package com.beecrowd.exercicios.listaExercicios;

import java.util.Scanner;

public class ExercicioHorasEmJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        int horasDepoisDasZero = 0;
        int horasAteZeroHoras = 0;
        int horasDepoisDasZeroHoras = 0;

        int soma = 0;

        for (int i = 1; i <= 24; i++) {
            soma = horaInicial + i;
            horasAteZeroHoras = i;
            if (soma == 24) {
                soma = 0;
                break;
            }
        }
        if (soma == 0) {
            for (int i = 0; i <= 24; i++) {
                soma = horasDepoisDasZero + i;
                horasDepoisDasZeroHoras = i;
                if (soma == horaFinal) {
                    break;
                }
            }
        }
        int totalHorasJogadas = horasAteZeroHoras + horasDepoisDasZeroHoras;

        if (totalHorasJogadas > 24) {
            totalHorasJogadas = horaFinal - horaInicial;
        }

        System.out.println("O JOGO DUROU " + totalHorasJogadas + " HORA(S)");

    }

}
