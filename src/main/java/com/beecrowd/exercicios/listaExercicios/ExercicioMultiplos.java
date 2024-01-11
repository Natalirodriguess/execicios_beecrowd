package com.beecrowd.exercicios.listaExercicios;

import java.util.Scanner;

public class ExercicioMultiplos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        boolean multiplo = false;

       for (int i = 0; i <= 100; i++){
           if(A*i == B || B*i == A){
               multiplo = true;
               break;
           } else {
               i = i + 1;
               multiplo = false;
           }
       }
        if(multiplo){
            System.out.println("Sao Multiplos");
        } else {System.out.println("Nao sao Multiplos");
        }
    }
}
