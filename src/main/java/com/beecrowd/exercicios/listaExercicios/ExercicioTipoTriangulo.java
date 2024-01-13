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

        if( A>B && A>C && B > C){
            maior = A;
            meio = B;
            menor = C;
        } else if( A>B && A>C && C > B){
            maior = A;
            meio = C;
            menor = B;
        }
        else if (B > A && B > C && A > C) {
            maior = B;
            meio = A;
            menor = C;
        } else if (B > A && B > C && C > A) {
            maior = B;
            meio = C;
            menor = A;
        }
        else if (C > B && C>A && B>A) {
            maior = C;
            meio = B;
            menor = A;
        }
        else if (C > B && C>A && A>B) {
            maior = C;
            meio = A;
            menor = B;
        } else if (A == B && B== C && A == C) {
            maior = A;
            meio = B;
            menor = C;
        } else if (A == B && B!= C && B > C) {
            maior = A;
            meio = B;
            menor = C;
        } else if (A == B && B!= C && C > B) {
            maior = C;
            meio = A;
            menor = B;
        } else if (B == C && C!= A && C > A) {
            maior = C;
            meio = B;
            menor = A;
        } else if (B == C && C!= A && C < A) {
        } else if (B == C && C!= A && C < A) {
            maior = A;
            meio = B;
            menor = C;
        } else if (B>A && A==C && C==A){
            maior = B;
            meio = A;
            menor = C;
        } else if(A == C && C != B && C>B){
            maior = A;
            meio = C;
            menor = B;
        }

        A = maior;
        B = meio;
        C = menor;

            if (A >= B + C){
                System.out.println("NAO FORMA TRIANGULO");
            } else if (A*A == B*B + C*C){
                System.out.println("TRIANGULO RETANGULO");
                if(A == B && B == C && C ==A ){
                    System.out.println("TRIANGULO EQUILATERO");
                } else if (A == B && B != C || A == C && B!=A || B == C && C!=A) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
            } else if (A*A > B*B + C*C) {
                System.out.println("TRIANGULO OBTUSANGULO");
                if(A == B && B == C && C ==A ){
                    System.out.println("TRIANGULO EQUILATERO");
                } else if (A == B && B != C || A == C && B!=A || B == C && C!=A) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }else if (A*A < B*B + C*C) {
                System.out.println("TRIANGULO ACUTANGULO");
                if(A == B && B == C && C ==A ){
                    System.out.println("TRIANGULO EQUILATERO");
                } else if (A == B && B != C || A == C && B!=A || B == C && C!=A) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }

        }

}
