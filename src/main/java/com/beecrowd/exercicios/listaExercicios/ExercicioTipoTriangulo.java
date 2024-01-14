package com.beecrowd.exercicios.listaExercicios;

import java.util.Scanner;

public class ExercicioTipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double maior = 0;
        double meio = 0;
        double menor = 0;

        if (A > B && A > C && B > C || A == B && B == C && A == C || A == B && B != C && B > C ||B == C && C != A && C < A) {
            maior = A;
            meio = B;
            menor = C;
        } else if (A > B && A > C && C > B || A == C && C != B && C > B) {
            maior = A;
            meio = C;
            menor = B;
        } else if (B > A && B > C && A > C || B > A && A == C && C == A) {
            maior = B;
            meio = A;
            menor = C;
        } else if (B > A && B > C && C > A) {
            maior = B;
            meio = C;
            menor = A;
        } else if (C > B && C > A && B > A || B == C && C != A && C > A) {
            maior = C;
            meio = B;
            menor = A;
        } else if (C > B && C > A && A > B || A == B && B != C && C > B) {
            maior = C;
            meio = A;
            menor = B;
        }

         A = maior;
         B = meio;
         C  = menor;

        classificaTipoTriangulo(A, B, C);

    }

    public static void classificaTipoTriangulo(double A, double B, double C) {
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (A * A == B * B + C * C) {
            System.out.println("TRIANGULO RETANGULO");
            tipoMedidaLado(A, B, C);
        } else if (A * A > B * B + C * C) {
            System.out.println("TRIANGULO OBTUSANGULO");
            tipoMedidaLado(A, B, C);
        } else if (A * A < B * B + C * C) {

            System.out.println("TRIANGULO ACUTANGULO");
            tipoMedidaLado(A, B, C);
        }
    }
    public static void tipoMedidaLado(double A, double B, double C) {
        if (A == B && B == C && C == A) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A == B && B != C || A == C && B != A || B == C && C != A) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }

}
