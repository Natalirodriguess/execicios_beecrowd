package com.beecrowd.exercicios.listaExercicios;

import java.util.Scanner;

public class ExercicioHorasMinutosEmJogo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int horaInicial = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();

        double horasTotais;
        double horasTotaisDouble;
        double minutosTotaisDecimais;
        int horasTotaisEmInt = 0;
        int minutosTotaisEmInt = 0;

        if(horaInicial < horaFinal){
            int minutosTotaisInicial = (horaInicial*60) + minutoInicial;
            int minutosTotaisFinal = (horaFinal*60) + minutoFinal;
            horasTotais = (minutosTotaisFinal - minutosTotaisInicial)/60.0;
            horasTotaisEmInt = (int) horasTotais;
            minutosTotaisDecimais = (horasTotais - horasTotaisEmInt)*60;
            minutosTotaisEmInt = (int) Math.round(minutosTotaisDecimais);

        }
        else if(horaInicial >= horaFinal){
            int minutosTotaisInicial = (horaInicial*60) + minutoInicial;
            int minutosTotaisFinal = (horaFinal*60) + minutoFinal + 24*60;
            horasTotais = (minutosTotaisFinal - minutosTotaisInicial);
            horasTotaisDouble = (horasTotais/60.0);
            horasTotaisEmInt = (int) horasTotaisDouble;
            minutosTotaisDecimais = ((horasTotaisDouble - horasTotaisEmInt)*60);
            minutosTotaisEmInt = (int) Math.round(minutosTotaisDecimais);
        }
       System.out.println("O JOGO DUROU "+ horasTotaisEmInt + " HORA(S) E "+ minutosTotaisEmInt+" MINUTO(S)");

    }
}
